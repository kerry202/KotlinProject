package com.example.demo.kotlin

fun main() {

    // 函数时编程
    var a ={a:Int,b:Int ->a+b}


    val a1 = a(4, 1)

    println("result ${a1}")


    //函数第二种写法

    var jj:(Int,Int) ->Int ={x,y ->x+y}

    val jj1 = jj(11, 22)

    println("result${jj1}")


}

//
fun add(a:Int,b:Int):Int? =a+b