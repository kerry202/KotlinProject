package com.example.demo.kotlin


//递归
//最常用的场景  阶乘   如5的 阶乘  5*4*3*2*1
fun main(args: Array<String>) {


    var count =10000000

//    println(fact(count))


    println(ollAdd(count,0))

}



fun fact(num:Int):Int{

    if (num==1) return 1
    else {

       return num* fact(num-1)
    }

}

//违递归优化
//累加操作 5的累加   5+4+3+2+1
// tailrec  违递归优化
tailrec fun ollAdd(nun:Int,result: Int):Int{
    if (nun==1) return 1
    else {

        return ollAdd(nun-1,result+nun)

    }



}