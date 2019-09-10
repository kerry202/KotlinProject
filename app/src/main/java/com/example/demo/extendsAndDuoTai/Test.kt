package com.example.demo.extendsAndDuoTai

fun main(args: Array<String>) {


    var man=Man("张三")

    var person1=Man("aa")

    var person2=Woman("xx")

    var person3=Woman("ww")

    var lists= listOf<Person>(man,person1,person2,person3)

    for (list in lists) {

        list.peet()
    }



}