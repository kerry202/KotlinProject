package com.example.demo.https

import com.google.gson.JsonParseException
import org.json.JSONException
import java.net.ConnectException
import java.net.SocketTimeoutException
import java.text.ParseException

class ExceptionHandle {


    companion object{

        var errorCode =ErrorStatus.UnknownError
        var errorMsg ="请求失败，请稍后重试"

        fun handleException(e:Exception):String{
            e.printStackTrace()
            if (e is SocketTimeoutException){
                //网络超时
                errorMsg="网络连接异常"
                errorCode=ErrorStatus.NetworkError

            }else if (e is ConnectException){
                errorCode=ErrorStatus.NetworkError
                errorMsg="网络连接异常"
            }else if (e is JsonParseException || e is JSONException || e is ParseException){
                errorMsg="数据解析异常"
                errorCode=ErrorStatus.ApiError
            }


            return errorMsg
        }

    }
}