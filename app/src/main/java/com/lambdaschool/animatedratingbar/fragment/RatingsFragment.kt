package com.lambdaschool.animatedratingbar.fragment

import android.content.Context
import android.os.Bundle
import android.view.KeyEvent
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

import com.lambdaschool.animatedratingbar.R
import com.lambdaschool.animatedratingbar.activity.FragmentActivity.Companion.FRAGMENT_KEY
import com.lambdaschool.animatedratingbar.model.MovieItem
import kotlinx.android.synthetic.main.fragment_ratings.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [MovieDetailsFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [MovieDetailsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */

class RatingsFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var listener: OnRatingsFragmentInteractionListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ratings, container, false)
    }

    // TODO: Rename method, update argument and hook method into UI event
    fun onButtonPressed(data: MovieItem) {
        listener?.onRatingsFragmentInteraction(data)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val item = arguments?.getSerializable(FRAGMENT_KEY) as MovieItem
        val originalItemName = item.movieName
        val originalItemRating = item.movieRating

        et_movie_name.setText(item.movieName)
        //ratingStarAnimate(item.movieRating)

        iv_star1.setOnClickListener {
            item.movieRating = 1
            Toast.makeText(context, "---1---", Toast.LENGTH_SHORT).show()
            // ratingStarAnimate(item.movieRating)
        }
        iv_star2.setOnClickListener {
            item.movieRating = 2
            Toast.makeText(context, "---2---", Toast.LENGTH_SHORT).show()
            // ratingStarAnimate(item.movieRating)
        }
        iv_star3.setOnClickListener {
            item.movieRating = 3
            Toast.makeText(context, "---3---", Toast.LENGTH_SHORT).show()
            // ratingStarAnimate(item.movieRating)
        }
        iv_star4.setOnClickListener {
            item.movieRating = 4
            Toast.makeText(context, "---4---", Toast.LENGTH_SHORT).show()
            // ratingStarAnimate(item.movieRating)
        }
        iv_star5.setOnClickListener {
            item.movieRating = 5
            Toast.makeText(context, "---5---", Toast.LENGTH_SHORT).show()
            // ratingStarAnimate(item.movieRating)
        }

        et_movie_name.setOnKeyListener(View.OnKeyListener { _, keyCode, event ->
            if (keyCode == KeyEvent.KEYCODE_ENTER && event.action == KeyEvent.ACTION_UP) {
                item.movieName = et_movie_name.text.toString()
                if (originalItemName == "") {
                    item.changedBoolean = false // was a new input, so use .notifyItemInserted(index)
                } else if (originalItemName != item.movieName || originalItemRating != item.movieRating){
                    item.changedBoolean = true // item was updated, so use .notifyItemChanged(index)
                }
                listener?.onRatingsFragmentInteraction(item)
                return@OnKeyListener true
            }
            false
        })
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnRatingsFragmentInteractionListener) {
            listener = context
        } else {
            throw RuntimeException(context.toString() + " must implement OnFragmentInteractionListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     *
     *
     * See the Android Training lesson [Communicating with Other Fragments]
     * (http://developer.android.com/training/basics/fragments/communicating.html)
     * for more information.
     */

    interface OnRatingsFragmentInteractionListener {
        fun onRatingsFragmentInteraction(item: MovieItem)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment MovieDetailsFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            RatingsFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
