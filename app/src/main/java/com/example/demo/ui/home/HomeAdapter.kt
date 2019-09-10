package com.example.demo.ui.home

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.demo.R


class HomeAdapter(var activity: Activity?, var list: List<String>) :
    RecyclerView.Adapter<HomeAdapter.ViewHolder>() {

    var count = 0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(LayoutInflater.from(activity).inflate(R.layout.home_recycler_layout, parent, false))


    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if (count == position) {

            holder.title.text = "aaaa"
        } else {
            holder.title.text = "a"

        }


    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var title: TextView = view.findViewById(R.id.title)

        var line: View = view.findViewById(R.id.line)


    }
    fun count(count: Int) {
        this.count=count
        notifyDataSetChanged()
    }

}