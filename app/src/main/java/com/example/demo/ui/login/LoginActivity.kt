package com.example.demo.ui.login

import com.example.demo.R
import com.example.demo.base.BaseActivity
import com.example.demo.model.Info


class LoginActivity : BaseActivity(), LoginContract.View {


    override fun sendSms(info: Info) {

    }

    override fun sendLogin(info: Info) {

    }


    private val mPresenter by lazy { LoginPersenter() }



    override fun show() {


    }

    override fun hide() {


    }

    override fun getLayout(): Int = R.layout.login_layout

    override fun initView() {


    }

    override fun initDate() {


        mPresenter.attachView(this)

        mPresenter.sendSms("15010090621")

        mPresenter.sendLogin("15010090621","666666")


    }
}