package com.example.demo.kotlin

fun main(){


    //  循环和区间

    //包含。。后
    var numss=1 until 100  //【】闭区间  开区间() [) 前闭后开

    for (numss in numss) {
        println(",${numss}")
    }

    //需求 1+到100；

    //声明一个1-100的数
    var num =1..100

    var result=0
    for (i in num) {
        result=result+i

    }
    println("结果${result}")



}