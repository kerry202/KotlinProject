package com.example.demo.daili


//  爸爸实现洗碗接口，让儿子去实现洗碗操作  by关键字  接口代理
class BaBa : IXiwan by Erzi {


    override fun xiwan() {

        println("代理前。。。")
        //多次实例化
        Erzi.xiwan()
        println("委托后，，，")
    }
}