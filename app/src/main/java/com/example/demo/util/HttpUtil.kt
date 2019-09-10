package com.example.demo.util

import okhttp3.*
import java.io.IOException


object HttpUtil{



    fun initOkhttp(){


        val okHttpClient =OkHttpClient()

        val body = FormBody.Builder().add("key", "value").build()

        val build = okhttp3.Request.Builder().url("http://www.yb.com").post(body).build()


        okHttpClient.newCall(build).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {

            }

            override fun onResponse(call: Call, response: Response) {

            }

        })

    }

}