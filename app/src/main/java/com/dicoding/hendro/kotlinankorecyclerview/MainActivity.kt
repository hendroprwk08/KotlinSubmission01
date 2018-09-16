package com.dicoding.hendro.kotlinankorecyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.singleTop
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var mList: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //anko extention
        rv_main.layoutManager = LinearLayoutManager(this)
        rv_main.adapter = RecyclerViewAdapter(this, populate()){
            //anko common
            startActivity(intentFor<DetailActivity>("logo" to it.logo, "name"  to it.name, "description" to it.description).singleTop())
        }

        /*
        mList = findViewById(R.id.rv_main)
        mList.layoutManager = LinearLayoutManager(this)
        mList.adapter = RecyclerViewAdapter(this, populate()){
            //anko common
            startActivity(intentFor<DetailActivity>("logo" to it.logo, "name"  to it.name, "description" to it.description).singleTop())
        }
        */
    }

    fun populate(): List<Team>{
        var teams: MutableList<Team> = ArrayList()

        teams.add(Team(R.drawable.img_barca, "Barcelona FC", "Barcelona FC Descrption"))
        teams.add(Team(R.drawable.img_madrid, "Real Madrid FC", "Real Madrid FC Descrption"))
        teams.add(Team(R.drawable.img_bayern, "Bayern Munchen FC", "Bayern Munchen FC Descrption"))
        teams.add(Team(R.drawable.img_city, "Manchester City FC", "Manchester City FC Descrption"))
        teams.add(Team(R.drawable.img_mu, "Manchester United FC", "Manchester United FC Descrption"))
        teams.add(Team(R.drawable.img_chelsea, "Chelsea FC", "Chelsea FC Descrption"))
        teams.add(Team(R.drawable.img_acm, "AC Milan FC", "AC Milan FC Descrption"))
        teams.add(Team(R.drawable.img_arsenal, "Arsenal FC", "Arsenal FC Descrption"))

        return teams
    }
}