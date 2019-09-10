package com.example.demo.extendsAndDuoTai

class Man(name:String) : Person(name) {


    override fun peet() {


        println("${name}站着，，，，")

    }

    override fun action() {

        println(" 赚钱养家 ")
    }

    override fun eat() {
        println("  大口吃饭 ")

    }
}