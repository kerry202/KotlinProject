package com.example.demo.ui.home


import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager.widget.ViewPager
import com.example.demo.R
import com.example.demo.base.BaseFragment
import kotlinx.android.synthetic.main.home_layout.*

class HomeFragment : BaseFragment() {

    var list = listOf<String>("", "", "", "", "")

    var homeAdapter:HomeAdapter?=null
    var homePagerAdapter :HomePagerAdapter?=null

    override fun getLayoutId(): View {

        return View.inflate(activity, R.layout.home_layout, null)
    }

    private val llm by lazy { LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false) }

    override fun initView() {

        homeAdapter = HomeAdapter(activity, list)

        homeRecycler.layoutManager = llm

        homeRecycler.adapter = homeAdapter

        homePagerAdapter= HomePagerAdapter(activity,list)

        homePager.adapter=homePagerAdapter

        homePager.addOnPageChangeListener(object :ViewPager.OnPageChangeListener{
            override fun onPageScrollStateChanged(state: Int) {

            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

               homeRecycler.scrollToPosition(position)
               homeAdapter?.count(position)


            }

            override fun onPageSelected(position: Int) {

            }

        })
    }

    override fun initDate() {




//        tv.setOnClickListener{startActivity(Intent(activity,LoginActivity::class.java))}
    }


}