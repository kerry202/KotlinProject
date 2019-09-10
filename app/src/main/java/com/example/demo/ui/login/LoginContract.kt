package com.example.demo.ui.login


import com.example.demo.base.IBaseView
import com.example.demo.base.IPresenter
import com.example.demo.model.Info

interface LoginContract {


    interface View : IBaseView {


        fun sendSms(info: Info)

        fun sendLogin(info:Info)


    }



    interface Presenter : IPresenter<View> {

        fun sendSms(phone: String)

        fun sendLogin(phone: String,code:String)

    }
}