package com.example.demo.https

import com.example.demo.https.*
import okhttp3.*
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

import java.io.File
import java.util.concurrent.TimeUnit

object RetrofitManager {


    val service:ApiService by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {

        getRetrofit().create(ApiService::class.java)
    }


    fun getRetrofit():Retrofit{

        return Retrofit.Builder()
            .baseUrl(ApiConfig.BaseUrl)
            .client(getOkhttpClient())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }

    private fun getOkhttpClient(): OkHttpClient {


        val httpLoggingInterceptpr =LoggingInterceptpr()
        val logging =HttpLoggingInterceptor()

        val cacheFile =File(DirConfig.HttpCache)
        val cache =Cache(cacheFile,1024*1025*8)
        return OkHttpClient.Builder()
            .addInterceptor(HeaderInterceptor())
            .addInterceptor(httpLoggingInterceptpr)
            .addInterceptor(NetCacheInterceptor())
            .cache(cache)
            .connectTimeout(10L,TimeUnit.SECONDS)
            .readTimeout(10L,TimeUnit.SECONDS)
            .writeTimeout(10L,TimeUnit.SECONDS)
            .build()

    }

}