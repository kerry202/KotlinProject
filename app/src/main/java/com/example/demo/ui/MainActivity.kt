package com.example.demo.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.demo.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() ,View.OnClickListener{

    val homeFragment =HomeFragment()
    val myFragment =MyFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val bt = supportFragmentManager.beginTransaction()

        bt.add(R.id.fl,homeFragment)
        bt.add(R.id.fl,myFragment)

        bt.show(homeFragment)
            .hide(myFragment)
            .commit()

        rb1.setOnClickListener(this)
        rb2.setOnClickListener(this)


    }
    override fun onClick(p0: View?) {

        when(p0?.id){

            R.id.rb1-> supportFragmentManager.beginTransaction().show(homeFragment).hide(myFragment).commit()

            R.id.rb2->supportFragmentManager.beginTransaction().show(myFragment).hide(homeFragment).commit()
        }

    }
}
