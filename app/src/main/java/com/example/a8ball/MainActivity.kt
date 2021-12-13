package com.example.a8ball

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // link all the variables with its id
        val imageView = findViewById<View>(R.id.image_eightBall) as ImageView
        val button = findViewById<View>(R.id.askButton) as Button

        // create an array to store all the images
        val a = intArrayOf(R.drawable.ball2, R.drawable.ball3, R.drawable.ball4, R.drawable.ball5)

        // ask button's onClick function
        button.setOnClickListener { // generate a number using Random() function
            val random = Random()
            val x = random.nextInt(4)

            // set the image to the view
            imageView.setImageResource(a[x])
        }
    }
}
