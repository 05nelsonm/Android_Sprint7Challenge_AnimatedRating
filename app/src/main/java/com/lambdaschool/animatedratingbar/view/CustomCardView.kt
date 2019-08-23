package com.lambdaschool.animatedratingbar.view

import android.content.Context
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.lambdaschool.animatedratingbar.R

class CustomCardView(context: Context, attrs: AttributeSet?): LinearLayout(context, attrs) {

    constructor(context: Context) : this(context, null)

    init {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.CustomCardView)
        val textSize = typedArray.getDimension(R.styleable.CustomCardView_textSize, 28f)
        val textList = typedArray.getTextArray(R.styleable.CustomCardView_android_entries)
        typedArray.recycle()

        val textLayoutParams = LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT, 1f)
        val tv_movie_name = LayoutInflater.from(context).inflate(R.layout.movie_item_layout, this, false) as TextView
        tv_movie_name.text = textList[0]
        tv_movie_name.layoutParams = textLayoutParams
        tv_movie_name.textSize = textSize
        tv_movie_name.id = R.id.tv_movie_name

        val tv_dash = LayoutInflater.from(context).inflate(R.layout.movie_item_layout, this, false) as TextView
        tv_dash.text = textList[1]
        tv_dash.layoutParams = textLayoutParams
        tv_dash.textSize = textSize
        tv_dash.id = R.id.tv_dash

        val tv_movie_rating = LayoutInflater.from(context).inflate(R.layout.movie_item_layout, this, false) as TextView
        tv_movie_rating.text = textList[2]
        tv_movie_rating.layoutParams = textLayoutParams
        tv_movie_rating.textSize = textSize
        tv_movie_rating.id = R.id.tv_movie_rating

        /*<TextView
                android:id="@+id/tv_movie_name"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="This Movie"
        android:textColor="@color/secondaryTextColor"
        android:textSize="28sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

        <TextView
        android:id="@+id/tv_dash"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text=" - "
        android:textColor="@color/secondaryTextColor"
        android:textSize="28sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toEndOf="@id/tv_movie_name"
        app:layout_constraintTop_toTopOf="parent" />

        <TextView
        android:id="@+id/tv_movie_rating"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="5"
        android:textColor="@color/secondaryTextColor"
        android:textSize="28sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toEndOf="@id/tv_dash"
        app:layout_constraintTop_toTopOf="parent" />*/

        orientation = HORIZONTAL
        addView(tv_movie_name)
        addView(tv_dash)
        addView(tv_movie_rating)

    }

}