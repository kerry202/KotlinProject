package com.example.demo.ui.login


import com.example.demo.https.RetrofitManager
import com.example.demo.https.SchedulerUtils
import com.example.demo.model.Info
import io.reactivex.Observable

class Model {


    fun sendLogin(map: Map<String, String>):Observable<Info>{
        return RetrofitManager.service.getDate(map).compose(SchedulerUtils.ioToMain())
    }





    fun sendSms(map: Map<String,String>):Observable<Info>{
        return RetrofitManager.service.sendSmd(map).compose(SchedulerUtils.ioToMain())
    }

}