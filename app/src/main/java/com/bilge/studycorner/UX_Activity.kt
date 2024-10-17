package com.bilge.studycorner

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class UX_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_ux)



        val button = findViewById<Button>(R.id.nextButton2)
        button.setOnClickListener {

            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }

        val button2 = findViewById<Button>(R.id.backButton2)
        button2.setOnClickListener {

            val intent = Intent(this, ContentTechnicalActivity::class.java)
            startActivity(intent)
        }





    }
}