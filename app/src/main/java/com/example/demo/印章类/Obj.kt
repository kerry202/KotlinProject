package com.example.demo.印章类

/**
 *
 * 印章类，只能创建指定类型，
 * 母驴，公驴，公马，，只能生 骡子 或者 小驴
 * sealed
 * */
sealed class Obj {

    fun sayHello(){

        println("大家好")
    }


    class lvzi():Obj()
    class xiaoma():Obj()


}