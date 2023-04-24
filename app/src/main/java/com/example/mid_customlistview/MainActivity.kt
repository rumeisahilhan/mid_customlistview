package com.example.mid_customlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       var listview=findViewById<ListView>(R.id.ListView)
        var list= mutableListOf<models>()

        //adding images
        list.add(models("black","this is a black car",R.drawable.car1))
         listview.adapter=MyAdapter(this,R.layout.row,list)

        list.add(models("black","this is a black car",R.drawable.car2))
        listview.adapter=MyAdapter(this,R.layout.row,list)

        list.add(models("blue","this is a blue car",R.drawable.car3))
        listview.adapter=MyAdapter(this,R.layout.row,list)

        list.add(models("grey","this is a grey car",R.drawable.car4))
        listview.adapter=MyAdapter(this,R.layout.row,list)

        list.add(models("black","this is a black car",R.drawable.car5))
        listview.adapter=MyAdapter(this,R.layout.row,list)
    }
}