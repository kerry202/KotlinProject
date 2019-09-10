package com.example.demo.test.印章类

fun main(args: Array<String>) {


    var obj1 = Obj.lvzi()

    var obj2 = Obj.xiaoma()


    obj1.sayHello()


    var list = listOf<Obj>(obj1,obj2)

    for (obj in list) {


        if (obj is Obj.xiaoma) {
            println("  xiaoma")
        }else println("  xiaolv ")

    }
}