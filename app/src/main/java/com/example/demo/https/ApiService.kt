package com.example.demo.https


import com.example.demo.model.Info
import io.reactivex.Observable
import retrofit2.http.*

interface ApiService {

    @FormUrlEncoded
    @POST(ApiConfig.Recommentds)
    fun getDate(@FieldMap fields :Map<String,String>): Observable<Info>

    @GET(ApiConfig.Recommentds)
    fun get(@Query("phone")num:String):Observable<Info>
}