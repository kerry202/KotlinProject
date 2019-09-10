package com.example.demo.base

import com.example.demo.R
import com.example.demo.https.ApiConfig
import okhttp3.*
import java.io.IOException


class LoginActivity : BaseActivity(),LoginContract.View {

    val  mPresenter by lazy { LoginPersenter() }

    override fun setErrorMsg(errorMsg: String) {

        println("   login  error  ")
    }


    override fun sendSms(phone: String) {
        println("   login  sms  "+phone)

    }

    override fun sendLogin(phone: String, code: String) {
    }

    override fun show() {

        println("   login  show  ")
    }

    override fun hide() {
        println("   login  hide  ")
    }

    override fun getLayout(): Int = R.layout.login_layout

    override fun initView() {
        println("   login  view  ")



    }

    override fun initDate() {

        mPresenter.attachView(this)

//
//        var okHttpClient =OkHttpClient()
//
//        val  formBody=FormBody.Builder().apply { add("pageNo","1")
//        add("pageSize","10")}.build()
//
//        val build =
//            okhttp3.Request.Builder().url(ApiConfig.BaseUrl+ApiConfig.Recommentds).post(formBody).build()
//
//        val newCall = okHttpClient.newCall(build)
//        newCall.enqueue(object : Callback{
//            override fun onFailure(call: Call, e: IOException) {
//                 println("   login  failure  "+e.message)
//
//            }
//
//            override fun onResponse(call: Call, response: Response) {
//
//            println("   login  chengg  "+response.body().toString())
//            }
//        })



        println("   login1  data  ")
        mPresenter.requestRelatedData("15010090621")



    }

    override fun startNet() {

    }
}