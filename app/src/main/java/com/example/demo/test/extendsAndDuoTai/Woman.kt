package com.example.demo.test.extendsAndDuoTai

class Woman(name:String) :Person(name) {
    override fun peet() {

        println("${name}蹲着")

    }

    override fun action() {

        println("  貌美如花 ")
    }

    override fun eat() {
        println("小口吃饭")
    }
}