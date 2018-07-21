package com.example.allef.next.pushnotificationmovilenext.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.allef.next.pushnotificationmovilenext.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val url = "http://www.cuelogic.com/blog/wp-content/uploads/2017/08/Kotlin-for-Android-development.png"
        val urrl = "https://cdn-images-1.medium.com/max/1600/1*HM0_o1nuKzEHeFNj1I0dHw.jpeg"

        Glide.with(this)
                .load(url).into(imageViewpicasso)

        Picasso.get()
                .load(urrl).into(imageView)




    }
}
