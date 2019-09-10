package com.example.demo.ui.login


import com.example.demo.base.BasePresenter

class LoginPersenter : BasePresenter<LoginContract.View>(), LoginContract.Presenter {

    override fun sendSms(phone: String) {

        chechViewAttached()

        mMap.clear()
        mMap["phone"] = phone
        mView?.show()
        addSubscription(loginModel.sendSms(mMap).subscribe({

                issue ->
            mView?.apply {
                hide()
                sendSms(issue)

            }
        }, { t ->
            mView?.apply {
                hide()
            }
        }))

    }

    override fun sendLogin(phone: String, code: String) {
        mView?.show()
        mMap.clear()
        mMap["pageNo"] = "1"
        mMap["pageSize"] = "10"
        addSubscription(
            loginModel.sendLogin(mMap)
                .subscribe({ issue ->
                    mView?.apply {
                        hide()
                        sendLogin(issue)

                    }
                }
                    , { t ->
                        mView?.apply {
                            hide()
                        }
                    })
        )
    }


    private val loginModel: Model by lazy {

        Model()

    }

}