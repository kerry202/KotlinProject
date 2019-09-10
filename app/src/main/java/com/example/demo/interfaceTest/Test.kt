package com.example.demo.interfaceTest

fun main(args: Array<String>) {




    var  man =Man()

    man.laoer()


    var  woman=WoMan()
    woman.b()

    var lists= listOf<WoMan>(woman)

    lists.indexOf(WoMan())


    var lista =ArrayList<WoMan>()

        lista.add(WoMan())


    println(lista.size)
}