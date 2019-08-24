package com.lambdaschool.animatedratingbar.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lambdaschool.animatedratingbar.R
import com.lambdaschool.animatedratingbar.adapter.MovieListAdapter
import com.lambdaschool.animatedratingbar.fragment.AddButtonFragment
import com.lambdaschool.animatedratingbar.fragment.ListFragment
import com.lambdaschool.animatedratingbar.fragment.RatingsFragment
import com.lambdaschool.animatedratingbar.model.MovieItem
import com.lambdaschool.animatedratingbar.model.MovieItemList.movieList
import kotlinx.android.synthetic.main.fragment_list.*

class FragmentActivity : AppCompatActivity(),
    AddButtonFragment.OnButtonFragmentInteractionListener,
    ListFragment.OnListFragmentInteractionListener,
    RatingsFragment.OnRatingsFragmentInteractionListener {

    companion object {
        const val FRAGMENT_KEY = "P98AINSDKFIUH09O12U3FIUH"
    }

    override fun onButtonFragmentInteraction(item: MovieItem) {
        val buttonFragment = RatingsFragment()

        val bundle = Bundle()
        bundle.putSerializable(FRAGMENT_KEY, item)
        buttonFragment.arguments = bundle

        supportFragmentManager.beginTransaction()
            .replace(R.id.ratings_fragment_holder, buttonFragment)
            .addToBackStack(null)
            .commit()
    }

    override fun onRatingsFragmentInteraction(item: MovieItem) {
        if (item.movieName == "" && item.changedBoolean) {
            // Delete the item
            // Refactor movieList to update all movieIndexPos values
        } else if (item.changedBoolean) {
            // Item was modified
            movieList[item.movieIndexPos] = item
            list_fragment.adapter?.notifyItemChanged(item.movieIndexPos)
        } else if (item.movieName != ""){
            // New item added
            item.movieIndexPos = movieList.size
            movieList.add(item)
            list_fragment.adapter?.notifyItemInserted(item.movieIndexPos)
        }
    }

    override fun onListFragmentInteraction(item: MovieItem) {
        val listFragment = RatingsFragment()

        val bundle = Bundle()
        bundle.putSerializable(FRAGMENT_KEY, item)
        listFragment.arguments = bundle

        supportFragmentManager.beginTransaction()
            .replace(R.id.ratings_fragment_holder, listFragment)
            .addToBackStack(null)
            .commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        movieList.add(MovieItem("a;ldjsbg;pajknsd", 5, 0, false))
        movieList.add(MovieItem("a;ldjsbg;pajknsd", 5, 1, false))
        movieList.add(MovieItem("a;ldjsbg;pajknsd", 5, 2, false))
        movieList.add(MovieItem("a;ldjsbg;pajknsd", 5, 3, false))
        movieList.add(MovieItem("a;ldjsbg;pajknsd", 5, 4, false))
        movieList.add(MovieItem("a;ldjsbg;pajknsd", 5, 5, false))
        movieList.add(MovieItem("a;ldjsbg;pajknsd", 5, 6, false))
        movieList.add(MovieItem("a;ldjsbg;pajknsd", 5, 7, false))
        movieList.add(MovieItem("a;ldjsbg;pajknsd", 5, 8, false))
        movieList.add(MovieItem("a;ldjsbg;pajknsd", 5, 9, false))
        movieList.add(MovieItem("a;ldjsbg;pajknsd", 5, 10, false))
        movieList.add(MovieItem("a;ldjsbg;pajknsd", 5, 11, false))
        movieList.add(MovieItem("a;ldjsbg;pajknsd", 5, 12, false))
        movieList.add(MovieItem("a;ldjsbg;pajknsd", 5, 13, false))
        movieList.add(MovieItem("a;ldjsbg;pajknsd", 5, 14, false))
        movieList.add(MovieItem("a;ldjsbg;pajknsd", 5, 15, false))
        movieList.add(MovieItem("a;ldjsbg;pajknsd", 5, 16, false))
        movieList.add(MovieItem("a;ldjsbg;pajknsd", 5, 17, false))
        movieList.add(MovieItem("a;ldjsbg;pajknsd", 5, 18, false))

        val fragmentButton = AddButtonFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.button_fragment_holder, fragmentButton)
            .commit()

        val fragmentList = ListFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.list_fragment_holder, fragmentList)
            .commit()

        if (movieList.size == 0) {
            val fragmentRating = RatingsFragment()

            val bundle = Bundle()
            bundle.putSerializable(FRAGMENT_KEY, MovieItem("", 0, 0, false))
            fragmentRating.arguments = bundle
            supportFragmentManager.beginTransaction()
                .replace(R.id.ratings_fragment_holder, fragmentRating)
                .addToBackStack(null)
                .commit()
        }
    }
}
