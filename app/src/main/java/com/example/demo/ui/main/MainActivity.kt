package com.example.demo.ui.main



import android.view.View
import com.example.demo.R
import com.example.demo.base.BaseActivity
import com.example.demo.ui.home.HomeFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() ,View.OnClickListener{


    val homeFragment = HomeFragment()
    val myFragment = MyFragment()

    override fun getLayout(): Int =R.layout.activity_main

    override fun initView() {

        val bt = supportFragmentManager.beginTransaction()

        bt.add(R.id.fl,homeFragment)
        bt.add(R.id.fl,myFragment)

        bt.show(homeFragment)
            .hide(myFragment)
            .commit()

        rb1.setOnClickListener(this)
        rb2.setOnClickListener(this)

    }

    override fun initDate() {


    }

    override fun onClick(p0: View?) {

        when(p0?.id){

            R.id.rb1-> supportFragmentManager.beginTransaction().show(homeFragment).hide(myFragment).commit()

            R.id.rb2->supportFragmentManager.beginTransaction().show(myFragment).hide(homeFragment).commit()
        }

    }
}
