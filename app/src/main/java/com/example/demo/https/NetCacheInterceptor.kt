package com.example.demo.https

import okhttp3.Interceptor
import okhttp3.Response

class NetCacheInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {

        val request = chain.request()
        val response = chain.proceed(request)
        var onlineCacheTime=60

        return response.newBuilder().header("Cahce-Control","public,max-age="+onlineCacheTime)
            .removeHeader("Pragma")
            .build()
    }


}
