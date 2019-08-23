package com.lambdaschool.animatedratingbar.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lambdaschool.animatedratingbar.R
//import com.lambdaschool.animatedratingbar.adapter.MovieListAdapter
import com.lambdaschool.animatedratingbar.model.MovieItem
import kotlinx.android.synthetic.main.activity_movie_list.*

class MovieListActivity : AppCompatActivity() {

    private val movieList = mutableListOf<MovieItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_list)

        btn_add_movie.setOnClickListener {
            //link to fragment to add movie
        }

        /*list_view.setHasFixedSize(true)
        val manager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        val adapter = MovieListAdapter(movieList)
        list_view.layoutManager = manager
        list_view.adapter = adapter*/
    }
}