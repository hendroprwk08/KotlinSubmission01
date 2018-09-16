package com.dicoding.hendro.kotlinankorecyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val logo: Int =  intent.getIntExtra("logo", 0)
        val name: String = intent.getStringExtra("name")
        val desc: String = intent.getStringExtra("description")

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        DetailActivityUI(logo, name, desc).setContentView(this)
    }
}
