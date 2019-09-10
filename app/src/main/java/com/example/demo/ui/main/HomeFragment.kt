package com.example.demo.ui.main



import android.content.Intent
import android.view.View
import com.example.demo.R
import com.example.demo.base.BaseFragment
import com.example.demo.ui.login.LoginActivity
import kotlinx.android.synthetic.main.home_layout.*

class HomeFragment : BaseFragment() {
    override fun getLayoutId(): View {

        return View.inflate(activity, R.layout.home_layout, null)
    }

    override fun initView() {

    }

    override fun initDate() {

        tv.text = "xsxss"

        tv.setOnClickListener{startActivity(Intent(activity,LoginActivity::class.java))}
    }


}