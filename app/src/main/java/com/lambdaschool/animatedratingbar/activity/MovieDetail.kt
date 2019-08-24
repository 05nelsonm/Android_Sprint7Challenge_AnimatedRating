package com.lambdaschool.animatedratingbar.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lambdaschool.animatedratingbar.R
import com.lambdaschool.animatedratingbar.adapter.MovieListAdapter
import com.lambdaschool.animatedratingbar.fragment.MovieDetailsFragment
import com.lambdaschool.animatedratingbar.model.MovieItem
import kotlinx.android.synthetic.main.activity_movie_list.*

class MovieDetail : AppCompatActivity() {

    // lateinit var adapter: MovieListAdapter

    companion object {
        const val FRAGMENT_KEY = "P98AINSDKFIUH09O12U3FIUH"
    }

    // private val movieList = mutableListOf<MovieItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_list)


        /*// Test data
        movieList.add(MovieItem("a;ldjsbg;pajknsd", 5, 0))
        movieList.add(MovieItem("a;ldjsbg;pajknsd", 5, 1))
        movieList.add(MovieItem("a;ldjsbg;pajknsd", 5, 2))
        movieList.add(MovieItem("a;ldjsbg;pajknsd", 5, 3))
        movieList.add(MovieItem("a;ldjsbg;pajknsd", 5, 4))
        movieList.add(MovieItem("a;ldjsbg;pajknsd", 5, 5))
        movieList.add(MovieItem("a;ldjsbg;pajknsd", 5, 6))
        movieList.add(MovieItem("a;ldjsbg;pajknsd", 5, 7))
        movieList.add(MovieItem("a;ldjsbg;pajknsd", 5, 8))
        movieList.add(MovieItem("a;ldjsbg;pajknsd", 5, 9))
        movieList.add(MovieItem("a;ldjsbg;pajknsd", 5, 10))
        movieList.add(MovieItem("a;ldjsbg;pajknsd", 5, 11))
        movieList.add(MovieItem("a;ldjsbg;pajknsd", 5, 12))
        movieList.add(MovieItem("a;ldjsbg;pajknsd", 5, 13))
        movieList.add(MovieItem("a;ldjsbg;pajknsd", 5, 14))
        movieList.add(MovieItem("a;ldjsbg;pajknsd", 5, 15))
        movieList.add(MovieItem("a;ldjsbg;pajknsd", 5, 16))
        movieList.add(MovieItem("a;ldjsbg;pajknsd", 5, 17))
        movieList.add(MovieItem("a;ldjsbg;pajknsd", 5, 18))

        btn_add_movie.setOnClickListener {
            val fragment = MovieDetailsFragment()

            val bundle = Bundle()
            bundle.putSerializable(FRAGMENT_KEY, MovieItem("", 0, -1))
            fragment.arguments = bundle

            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_details, fragment)
                //.addToBackStack(null)
                .commit()
        }

        list_view.setHasFixedSize(true)
        val manager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        adapter = MovieListAdapter(movieList)
        list_view.layoutManager = manager
        list_view.adapter = adapter
        */
    }
}