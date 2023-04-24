package com.example.mid_customlistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(var mycntx:Context,var resources:Int,var items:List<models>):ArrayAdapter<models>(mycntx,resources) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup) {
        val layoutInflater: LayoutInflater = LayoutInflater.from(mycntx)
        val view: View = layoutInflater.inflate(resources, null)
        val imageView: ImageView = view.findViewById(R.id.image)
        val Tv_titttle: TextView = view.findViewById(R.id.Tv_maintext)
        val Tv_descrition: TextView = view.findViewById(R.id.Tv_subtext)

        var myitems: models = items[position]
        imageView.setImageDrawable(mycntx.resources.getDrawable(myitems.img))
        Tv_titttle.text = myitems.title
        Tv_descrition.text = myitems.description
    }
}

