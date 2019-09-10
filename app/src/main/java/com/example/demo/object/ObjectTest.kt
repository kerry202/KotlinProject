package com.example.demo.`object`

class Rect(var chang: Int, var kuan: Int)


class Girl(var sex: String, var name: String, var age: Int,var voice:String){



    fun smaile(){

        println("  哈哈哈哈  ")

    }


    fun cry(){
        println("呜呜呜呜欧")

    }

}

fun main(args: Array<String>) {

    var girl = Girl("女","阳阳",21,"甜美")

    var rect = Rect(10, 20)

    println("  宽度 ${rect.kuan} + 长度 ${rect.chang}")


    girl.cry()
    girl.smaile()

}

