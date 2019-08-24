package com.lambdaschool.animatedratingbar.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lambdaschool.animatedratingbar.R
import com.lambdaschool.animatedratingbar.activity.MovieDetail.Companion.FRAGMENT_KEY
import com.lambdaschool.animatedratingbar.fragment.ListFragment
import com.lambdaschool.animatedratingbar.fragment.MovieDetailsFragment
import com.lambdaschool.animatedratingbar.model.MovieItem
import com.lambdaschool.animatedratingbar.model.MovieItemList.movieList
import kotlinx.android.synthetic.main.fragment_list.*

class FragmentActivity : AppCompatActivity(), ListFragment.OnMovieListFragmentInteractionListener {
    override fun onFragmentInteraction(item: MovieItem) {

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

        val fragment = MovieDetailsFragment()

        val bundle = Bundle()
        bundle.putSerializable(FRAGMENT_KEY, item)
        fragment.arguments = bundle
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

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

        val fragment = ListFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.main_fragment_holder, fragment)
            .addToBackStack(null)
            .commit()
    }
}
