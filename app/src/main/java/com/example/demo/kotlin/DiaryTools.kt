package com.example.demo.kotlin

fun diary(name:String):String{

    var type="tajiao${name}"

    // ${}  占位符

    return type

}


fun  main(args:Array<String>){

    println(diary("zhangsan"))

}