package com.example.demo.base

interface IPresenter<in V : IBaseView> {

    fun attachView(mView: V)

    fun detachView()

}