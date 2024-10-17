package com.bilge.studycorner

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LibraryOneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_library_one)


        val button = findViewById<Button>(R.id.backButton)
        button.setOnClickListener {

            val intent = Intent(this, LibraryActivity::class.java)
            startActivity(intent)
        }
    }
}