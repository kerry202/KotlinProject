package com.example.demo.https

import okhttp3.Interceptor
import okhttp3.Response

class HeaderInterceptor : Interceptor{

    override fun intercept(chain: Interceptor.Chain): Response {
        val builder = chain.request().newBuilder()
        val request = chain.request()
        builder.addHeader("token","token").method(request.method(),request.body())
        return chain.proceed(builder.build())

    }


}