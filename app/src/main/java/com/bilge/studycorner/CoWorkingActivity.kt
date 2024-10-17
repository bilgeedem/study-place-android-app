package com.bilge.studycorner

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.imageview.ShapeableImageView

class CoWorkingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_co_working)


        //click on back to be back on home screen


        val backToHome: Button = findViewById(R.id.fixedButton)


        backToHome.setOnClickListener {
          //  Toast.makeText(this, "Back clicked!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        //click on the images
        val imageView1: ShapeableImageView = findViewById(R.id.CoWorkingOne)
        val imageView2: ShapeableImageView = findViewById(R.id.CoWorkingTwo)

        imageView1.setOnClickListener {
            //   Toast.makeText(this, "LibraryOne!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, CoWorkingOneActivity::class.java)
            startActivity(intent)
        }

        imageView2.setOnClickListener {
            //   Toast.makeText(this, "LibraryTwo!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, CoWorkingTwoActivity::class.java)
            startActivity(intent)
        }



    }
}