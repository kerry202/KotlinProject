package com.example.demo.test.kotlin




val PI =3.1415926f


//默认参数和具名参数
fun main(args: Array<String>) {



    //字符串数字切换
    var a="13"
    var b=13

    a=b.toString()

    b=a.toInt()

    var c="a3"

    b=c.toInt()



    println(get2(banjin = 3.2f))




}


fun get2(pi: Float=PI,banjin: Float):Float{


    return pi*banjin*banjin*4
}

fun get1(pi:Float = PI, banjin: Float, gao:Float):Float{
    return pi*banjin*banjin*gao

}

fun getYuan(pi:Float= PI, banjin:Float) :Float{

    return  2*pi*banjin
}


fun get(chang:Float,kuan:Float):Float{

    return chang*kuan
}