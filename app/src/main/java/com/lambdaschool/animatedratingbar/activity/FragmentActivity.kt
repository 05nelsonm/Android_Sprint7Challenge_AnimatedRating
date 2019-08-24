package com.lambdaschool.animatedratingbar.activity

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lambdaschool.animatedratingbar.R
import com.lambdaschool.animatedratingbar.fragment.AddButtonFragment
import com.lambdaschool.animatedratingbar.fragment.ListFragment
import com.lambdaschool.animatedratingbar.fragment.RatingsFragment
import com.lambdaschool.animatedratingbar.model.MovieItem
import com.lambdaschool.animatedratingbar.model.MovieItemList.movieList

class FragmentActivity : AppCompatActivity(),
    AddButtonFragment.OnButtonFragmentInteractionListener,
    ListFragment.OnListFragmentInteractionListener,
    RatingsFragment.OnRatingsFragmentInteractionListener {

    lateinit var contextFA: Context

    companion object {
        const val FRAGMENT_KEY = "P98AINSDKFIUH09O12U3FIUH"
    }

    override fun onButtonFragmentInteraction(item: MovieItem) {

    }

    override fun onRatingsFragmentInteraction(item: MovieItem) {

    }

    override fun onListFragmentInteraction(item: MovieItem) {
        /*val listFragment = RatingsFragment()

        val bundle = Bundle()
        bundle.putSerializable(FRAGMENT_KEY, item)
        listFragment.arguments = bundle

        supportFragmentManager.beginTransaction()
            .replace(R.id.ratings_fragment_holder, listFragment)
            .addToBackStack(null)
            .commit()*/
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

        val fragmentButton = AddButtonFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.button_fragment_holder, fragmentButton)
            .commit()

        val fragmentList = ListFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.list_fragment_holder, fragmentList)
            .commit()

        /*if (movieList.size == 0) {
            val fragmentRating = RatingsFragment()

            val bundle = Bundle()
            bundle.putSerializable(FRAGMENT_KEY, MovieItem("", 0, 0))
            fragmentRating.arguments = bundle
            supportFragmentManager.beginTransaction()
                .replace(R.id.ratings_fragment_holder, fragmentRating)
                .addToBackStack(null)
                .commit()
        }*/
    }
}
