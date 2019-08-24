package com.lambdaschool.animatedratingbar.model

import java.io.Serializable

class MovieItem (
    var movieName: String,
    var movieRating: Int,
    var movieIndexPos: Int,
    var changedBoolean: Boolean
) : Serializable