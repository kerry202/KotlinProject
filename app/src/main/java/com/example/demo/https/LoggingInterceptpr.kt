package com.example.demo.https

import okhttp3.Interceptor
import okhttp3.Response

class LoggingInterceptpr : Interceptor {

    val byteCount :Long =1024*1024

    override fun intercept(chain: Interceptor.Chain): Response {

        val request = chain.request()
        val response = chain.proceed(request)
        val body = response.peekBody(byteCount)

        println("  login1 报文 "+body.string())
        return response

    }

}
