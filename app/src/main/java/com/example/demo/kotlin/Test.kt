package com.example.demo.kotlin

import java.lang.Exception

fun main(args: Array<String>) {

    while (true){

        println("请输入第一个数")

        val readLine = readLine()

        println("请输入第二个数")

        val readLine1 = readLine()


        try {
        val toInt = readLine!!.toInt()

        val toInt1 = readLine1!!.toInt()

        println(" ${toInt}+${toInt1} =${toInt+toInt1} ")

        }catch (e:Exception){

            println("输入有误！")

        }
    }

}