package com.lambdaschool.animatedratingbar.adapter

/*
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.lambdaschool.animatedratingbar.R
import com.lambdaschool.animatedratingbar.model.MovieItem
import kotlinx.android.synthetic.main.movie_item_layout.view.*

class MovieListAdapter(private val data: MutableList<MovieItem>) :
    RecyclerView.Adapter<MovieListAdapter.ViewHolder>() {

    lateinit var context: Context

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name: TextView = view.tv_movie_name
        val rating: TextView = view.tv_movie_rating
        val itemCard: CardView = view.item_card
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewGroup = LayoutInflater.from(parent.context).inflate(R.layout.movie_item_layout, parent, false)
        context = parent.context
        return ViewHolder(viewGroup)
    }

    override fun getItemCount(): Int {
        return data.size

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text = data[position].movieName
        holder.rating.text = data[position].movieRating.toString()
        holder.itemCard.setOnClickListener {
            // link to fragment
        }
    }
}*/
