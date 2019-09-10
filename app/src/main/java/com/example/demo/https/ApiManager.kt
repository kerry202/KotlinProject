package com.example.demo.https

import okhttp3.Cache
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.io.File
import java.util.concurrent.TimeUnit

object ApiManager {
    var mApiManager = ApiManager

    var mApiService: ApiService?=null


    var mOkHttpClient = OkHttpClient()

    val timeOut: Long = 10000

    private fun ApiManager() {

        initOkhttp()
        initRetrofit()

    }

    @Synchronized
    fun getApiService(): ApiService? {

        if (mApiManager == null) {
            mApiManager = ApiManager
        }
        return mApiService
    }

    fun initRetrofit() {


        var retrofit = Retrofit.Builder()
            .baseUrl(ApiConfig.BaseUrl)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .client(mOkHttpClient)
            .build()

        mApiService = retrofit.create(ApiService::class.java)

    }

    fun initOkhttp() {
        var builder = OkHttpClient.Builder()
            .connectTimeout(timeOut, TimeUnit.SECONDS)
            .readTimeout(timeOut, TimeUnit.SECONDS)
            .writeTimeout(timeOut, TimeUnit.SECONDS)
            .retryOnConnectionFailure(true)
            .addInterceptor(HeaderInterceptor())
            .addInterceptor(NetCacheInterceptor())

        addLogIntercepter(builder)
        setCacheFile(builder)
        mOkHttpClient = builder.build()

    }

    fun setCacheFile(builder: OkHttpClient.Builder) {
        val cacheFile = File(DirConfig.HttpCache)
        var caCheSize: Long = 10 * 1024 * 1024
        var cache = Cache(cacheFile, caCheSize)
        builder.cache(cache)

    }

    fun addLogIntercepter(builder: OkHttpClient.Builder) {

        builder.addInterceptor(LoggingInterceptpr())


    }
}

