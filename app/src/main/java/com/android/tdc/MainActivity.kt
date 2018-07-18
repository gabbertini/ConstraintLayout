package com.android.tdc

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        see_description.setOnClickListener { description_group.visibility = View.VISIBLE }
        description_background.setOnClickListener { description_group.visibility = View.GONE }
    }
}
