package com.bilge.studycorner

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import android.widget.Toast
import com.google.android.material.imageview.ShapeableImageView


class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)




        setContentView(R.layout.activity_home)

        //click on text: View All and change to new Activity

        val textViewRight: TextView = findViewById(R.id.textViewRight)


        textViewRight.setOnClickListener {
            // Start the new activity
            val intent = Intent(this, ViewAllActivity::class.java)
            startActivity(intent)
        }



        //click on the images
        val imageView1: ShapeableImageView = findViewById(R.id.imageView1)
        val imageView2: ShapeableImageView = findViewById(R.id.imageView2)
        val imageView3: ShapeableImageView = findViewById(R.id.imageView3)

        val imageView4: ShapeableImageView = findViewById(R.id.rated1)
        val imageView5: ShapeableImageView = findViewById(R.id.rated2)
        val imageView6: ShapeableImageView = findViewById(R.id.rated3)

        imageView1.setOnClickListener {
         //   Toast.makeText(this, "Library!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, LibraryActivity::class.java)
            startActivity(intent)
        }

        // Set OnClickListener for imageView2
        imageView2.setOnClickListener {
           // Toast.makeText(this, "Coffee Shop!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, CoffeeShopActivity::class.java)
            startActivity(intent)
        }

        // Set OnClickListener for imageView3
        imageView3.setOnClickListener {
           // Toast.makeText(this, "Co-Working Space!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, CoWorkingActivity::class.java)
            startActivity(intent)
        }

        imageView4.setOnClickListener {
            // Toast.makeText(this, "Co-Working Space!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, LibraryTwoActivity::class.java)
            startActivity(intent)
        }

        imageView5.setOnClickListener {
            // Toast.makeText(this, "Co-Working Space!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, CoffeeShopTwoActivity::class.java)
            startActivity(intent)
        }
        imageView6.setOnClickListener {
            // Toast.makeText(this, "Co-Working Space!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, LibraryOneActivity::class.java)
            startActivity(intent)
        }


        //handling bottom Navigation
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigation)
        bottomNavigationView.selectedItemId = R.id.bottom_home
        bottomNavigationView.setOnItemSelectedListener { item: MenuItem ->
            when (item.itemId) {
                R.id.bottom_home -> return@setOnItemSelectedListener true
                R.id.bottom_map -> {
                    startActivity(
                        Intent(
                            applicationContext,
                            MapActivity::class.java
                        )
                    )
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                    finish()
                    return@setOnItemSelectedListener true
                }

                R.id.bottom_notes -> {
                    startActivity(
                        Intent(
                            applicationContext,
                            NotesActivity::class.java
                        )
                    )
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                    finish()
                    return@setOnItemSelectedListener true
                }

                R.id.bottom_Timer -> {
                    startActivity(
                        Intent(
                            applicationContext,
                            TimerActivity::class.java
                        )
                    )
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                    finish()
                    return@setOnItemSelectedListener true
                }
            }
            false
        }
    }
}