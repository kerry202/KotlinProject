package com.example.demo.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity :AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(getLayout())

        initView()

        initDate()

        startNet()
    }

    abstract fun getLayout(): Int

    abstract fun initView()

    abstract fun initDate()

    abstract fun startNet()
}