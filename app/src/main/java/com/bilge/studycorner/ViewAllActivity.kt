package com.bilge.studycorner

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ViewAllActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_view_all)

        //click on back to be back on home screen


        val imageView1: Button = findViewById(R.id.fixedButton4)
        val imageView2: ImageView = findViewById(R.id.imageView1)
        val imageView3: ImageView = findViewById(R.id.imageView2)
        val imageView4: ImageView = findViewById(R.id.imageView3)
        val imageView5: ImageView = findViewById(R.id.imageView4)

        imageView1.setOnClickListener {
           // Toast.makeText(this, "Back clicked!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        imageView2.setOnClickListener {
            // Toast.makeText(this, "Back clicked!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, CoWorkingOneActivity::class.java)
            startActivity(intent)
        }

        imageView3.setOnClickListener {
            // Toast.makeText(this, "Back clicked!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, CoffeeShopThreeActivity::class.java)
            startActivity(intent)
        }


        imageView4.setOnClickListener {
            // Toast.makeText(this, "Back clicked!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, LibraryOneActivity::class.java)
            startActivity(intent)
        }

        imageView5.setOnClickListener {
            // Toast.makeText(this, "Back clicked!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, CoWorkingTwoActivity::class.java)
            startActivity(intent)
        }



    }
}