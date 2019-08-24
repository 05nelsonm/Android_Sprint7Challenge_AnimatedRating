package com.lambdaschool.animatedratingbar.fragment

import android.content.Context
import android.os.Bundle
import android.view.KeyEvent
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.lambdaschool.animatedratingbar.R
import com.lambdaschool.animatedratingbar.activity.MovieDetail.Companion.FRAGMENT_KEY
import com.lambdaschool.animatedratingbar.model.MovieItem
import kotlinx.android.synthetic.main.fragment_movie_details.*

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
class MovieDetailsFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var listener: OnFragmentInteractionListener? = null

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
        return inflater.inflate(R.layout.fragment_movie_details, container, false)
    }

    // TODO: Rename method, update argument and hook method into UI event
    fun onButtonPressed(data: MovieItem) {
        listener?.onFragmentInteraction(data)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val item = arguments?.getSerializable(FRAGMENT_KEY) as MovieItem

        et_movie_name.setText(item.movieName)
        // ratingStarAnimate(item.movieRating)

        iv_star1.setOnClickListener {
            item.movieRating = 1
            // ratingStarAnimate(item.movieRating)
        }
        iv_star2.setOnClickListener {
            item.movieRating = 2
            // ratingStarAnimate(item.movieRating)
        }
        iv_star3.setOnClickListener {
            item.movieRating = 3
            // ratingStarAnimate(item.movieRating)
        }
        iv_star4.setOnClickListener {
            item.movieRating = 4
            // ratingStarAnimate(item.movieRating)
        }
        iv_star5.setOnClickListener {
            item.movieRating = 5
            // ratingStarAnimate(item.movieRating)
        }

        et_movie_name.setOnKeyListener(View.OnKeyListener { v, keyCode, event ->
            if (keyCode == KeyEvent.KEYCODE_ENTER && event.action == KeyEvent.ACTION_UP) {
                item.movieName = et_movie_name.text.toString()
                listener
                return@OnKeyListener true
            }
            false
        })

        listener?.onFragmentInteraction(MovieItem("UUUUUUU", item.movieRating, 0))

        /*for (i in 1 until 5) {
            when (i <= item.movieRating) {
                true ->
            }
        }*/

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnFragmentInteractionListener) {
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
    interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        fun onFragmentInteraction(item: MovieItem)
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
            MovieDetailsFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
