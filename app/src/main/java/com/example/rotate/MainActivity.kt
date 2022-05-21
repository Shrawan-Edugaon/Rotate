package com.example.rotate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClockWise = findViewById<Button>(R.id.clockwise)
        val btnAntiClockWise = findViewById<Button>(R.id.anticlockwise)

        btnClockWise.setOnClickListener {
            val image = findViewById<ImageView>(R.id.imageView)
            val animation:Animation = AnimationUtils.loadAnimation(this@MainActivity,R.anim.clockwise)
            image.startAnimation(animation)
        }
        btnAntiClockWise.setOnClickListener {
            val image = findViewById<ImageView>(R.id.imageView)
            val animation:Animation = AnimationUtils.loadAnimation(this@MainActivity,R.anim.anticlock)
            image.startAnimation(animation)
        }
    }
}