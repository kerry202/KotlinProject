package com.example.demo.ui.home

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import com.example.demo.R
import kotlinx.android.synthetic.main.home_pager_layout.view.*

class HomePagerAdapter(var activity: Activity?, var list: List<String>) : PagerAdapter() {

    override fun isViewFromObject(view: View, `object`: Any): Boolean = view == `object`


    override fun getCount(): Int = list.size

    override fun destroyItem(container: ViewGroup, position: Int, p1: Any) = container.removeView(p1 as View?)

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val inflate = LayoutInflater.from(activity).inflate(R.layout.home_pager_layout, container, false)
        inflate.ll
        inflate.tv.text=position.toString()
        container.addView(inflate.ll)
        return inflate.ll
    }


}