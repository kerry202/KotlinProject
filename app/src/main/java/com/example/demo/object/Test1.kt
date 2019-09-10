package com.example.demo.`object`

class Test1(var pinpai: String, var size: Int) {

    var isOpen =false


    fun open(){
        isOpen=true
        println("打开")
    }

    fun close(){
        isOpen=false
        println("关闭")
    }

    fun start(){

        if (isOpen) {

        println("开始")
        }else println(" 门还没开 ")

    }

    fun pause(){

        println("暂停")

    }

    fun selectMode(mode:Int){

        when(mode){
            1-> println("一档")
            2-> println("二档")
            else -> println(" 默认档 ")


        }

    }

    // 封装

   private fun setMotorSpeed(speed:Int){
        println(" sss  ")


    }











}