package com.example.projectwithpictures

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val button = findViewById<Button>(R.id.button1)
        val imageView = findViewById<ImageView>(R.id.iv_photo)
        val pictures = listOf (
            "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_1280.jpg",
            "https://cdn.pixabay.com/photo/2016/05/05/02/37/sunset-1373171_1280.jpg",
            "https://cdn.pixabay.com/photo/2015/10/30/20/13/sunrise-1014712__480.jpg",
            "https://cdn.pixabay.com/photo/2018/05/30/00/24/thunderstorm-3440450__480.jpg",
            "https://cdn.pixabay.com/photo/2016/11/06/05/36/lake-1802337__480.jpg",
            "https://cdn.pixabay.com/photo/2018/10/05/14/39/sunset-3726030__480.jpg",
            "https://cdn.pixabay.com/photo/2018/02/02/17/29/nature-3125912__480.jpg",
            "https://cdn.pixabay.com/photo/2018/01/31/07/36/secret-3120483__480.jpg",
            "https://cdn.pixabay.com/photo/2015/02/14/19/46/winter-landscape-636634__480.jpg",
            "https://cdn.pixabay.com/photo/2017/09/18/15/38/moon-2762111_1280.jpg"
            )
        var iterator = 0;
        val LIMIT = 10

        button.setOnClickListener {
            Glide
                .with(this)
                .load(pictures[iterator])
                .into(imageView)
            iterator = if (iterator == LIMIT - 1) 0 else iterator + 1

        }
    }
}
