package com.example.demo.base

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import java.lang.RuntimeException

open class BasePresenter<T : IBaseView> : IPresenter<T> {

    var mView: T? = null
    protected var mMap =HashMap<String,String>()
    private var compositeDisposable = CompositeDisposable()

    val isViewAttached: Boolean get() = mView != null


    override fun attachView(mView: T) {
        this.mView = mView


    }

    override fun detachView() {

        mView = null

        if (!compositeDisposable.isDisposed) {
            compositeDisposable.clear()
        }

    }

    fun chechViewAttached() {

        if (!isViewAttached) {
            throw MvpViewNotAttachedException()
        }

    }

    fun addSubscription(disposable: Disposable) {
        compositeDisposable.add(disposable)

    }


    private class MvpViewNotAttachedException internal constructor() :
        RuntimeException("please call IPresenter.attachView(IBaseView) before" + "requesting data to the IPresenter")


}