package com.bilge.studycorner

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.imageview.ShapeableImageView

class LibraryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_library_activity)




        //click on back to be back on home screen
        val backToHome: Button = findViewById(R.id.fixedButton3)


        backToHome.setOnClickListener {
           // Toast.makeText(this, "Back clicked!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        //click on the images
        val imageView1: ShapeableImageView = findViewById(R.id.libraryOne)
        val imageView2: ShapeableImageView = findViewById(R.id.libraryTwo)
        val imageView3: ShapeableImageView = findViewById(R.id.libraryThree)


        imageView1.setOnClickListener {
            //   Toast.makeText(this, "LibraryOne!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, LibraryOneActivity::class.java)
            startActivity(intent)
        }

        imageView2.setOnClickListener {
            //   Toast.makeText(this, "LibraryTwo!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, LibraryTwoActivity::class.java)
            startActivity(intent)
        }

        imageView3.setOnClickListener {
            //   Toast.makeText(this, "LibraryThree!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, LibraryThreeActivity::class.java)
            startActivity(intent)
        }




    }
}