package com.dicoding.hendro.kotlinankorecyclerview

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.item_view.*

class RecyclerViewAdapter (private val context: Context,
                           private val teams: List<Team>,
                           private val listener: (Team) -> Unit):
        RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view, parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(teams[position], listener)
    }

    override fun getItemCount(): Int = teams.size

    class ViewHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView),
            LayoutContainer {

        fun bindItem(teams: Team, listener: (Team) -> Unit) {
            name.text = teams.name
            description.text = teams.description
            Glide.with(itemView.context).load(teams.logo).into(logo)

            itemView.setOnClickListener {
                listener(teams)
            }
        }
    }
    /*
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        //private val logo = view.findViewById<ImageView>(R.id.logo)
        //private val name = view.findViewById<TextView>(R.id.name)
        //private val description = view.findViewById<TextView>(R.id.description)

        fun bindItem(teams: Team, listener: (Team) -> Unit) {
            name.text = teams.name
            description.text = teams.description
            Glide.with(itemView.context).load(teams.logo).into(logo)

            itemView.setOnClickListener {
                listener(teams)
            }
        }
    }
    */
}