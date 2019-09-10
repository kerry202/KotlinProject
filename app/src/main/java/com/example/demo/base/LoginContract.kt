package com.example.demo.base

interface LoginContract {

    interface View : IBaseView{

        /**
         * 发短信
         * */
        fun sendSms(phone: String)
        /**
         * 登陆
         * */
        fun sendLogin(phone:String,code:String)


        fun setErrorMsg(errorMsg:String)


    }

    interface Presenter : IPresenter<View>{

        fun getSmsInfo(sms:SmsModel)

        fun getLogin(login:LoginModel)

    }
}