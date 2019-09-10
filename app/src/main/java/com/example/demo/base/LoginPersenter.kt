package com.example.demo.base

import android.icu.text.IDNA
import com.example.demo.https.ExceptionHandle
import com.example.demo.model.Info

class LoginPersenter : BasePresenter<LoginContract.View>(), LoginContract.Presenter {


    private val loginModel: Model by lazy {

        Model()

    }

    override fun getSmsInfo(sms: SmsModel) {
        mView?.sendSms("15010090621")


    }

    override fun getLogin(login: LoginModel) {

        mView?.sendLogin("15010090621", "666666")

    }



    fun requestRelatedData(phone: String) {

        chechViewAttached()

        mView?.show()

        val subscribe = loginModel.requestRelatedData(phone)
            .subscribe(
                {
                        issue ->
                mView?.apply {
                    hide()
                    sendSms(issue.ak)
                    println("login1  chengg  ")
                }
            }, {

                    t ->
                mView?.apply {
                    hide()
                    setErrorMsg(ExceptionHandle.errorMsg)

                    println(" login1   shibai")

                }
            })

        addSubscription(subscribe)


    }

}