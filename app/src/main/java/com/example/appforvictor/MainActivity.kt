package com.example.appforvictor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RatingBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var ratingNumber: TextView
    private lateinit var ratingBar: RatingBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ratingBar = findViewById(R.id.rating_bar)
        ratingNumber = findViewById(R.id.rating_number)

        getRatingNumber()
    }

    private fun getRatingNumber() {
        ratingBar.setOnRatingBarChangeListener { ratingBar, rating, fromUser ->

            val yourRating = rating.toString()
            ratingNumber.text = yourRating
        }
    }
}