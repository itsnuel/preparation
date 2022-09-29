package com.example.preparation

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bgImage: ImageView = findViewById(R.id.image)
        val text: TextView = findViewById(R.id.motto)

        val oneAnimation = AnimationUtils.loadAnimation(this, R.anim.one_animation)
        val twoAnimation = AnimationUtils.loadAnimation(this, R.anim.two_animation)

        bgImage.startAnimation(oneAnimation)
        text.startAnimation(twoAnimation)


        android.os.Handler().postDelayed({
            val intent= Intent(this@MainActivity, second::class.java)
            startActivity(intent)
            finish()
        },4000)
    }
}