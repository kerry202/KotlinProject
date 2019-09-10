package com.example.demo.extendsAndDuoTai


//抽象的人类
abstract class Person(name: String) {

    var name: String = name

    abstract fun eat()

    abstract fun action()

    abstract fun peet()
}