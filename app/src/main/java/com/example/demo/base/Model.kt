package com.example.demo.base


import com.example.demo.https.RetrofitManager
import com.example.demo.https.SchedulerUtils
import com.example.demo.model.Info
import io.reactivex.Observable

class Model {


    fun requestRelatedData(phone:String):Observable<Info>{
        var  map =HashMap<String,String>()
        map["pageNo"]="1"
        map["pageSize"]="10"
        println(" login requestrelateddate ")
        return RetrofitManager.service.getDate(map).compose(SchedulerUtils.ioToMain())
    }
}