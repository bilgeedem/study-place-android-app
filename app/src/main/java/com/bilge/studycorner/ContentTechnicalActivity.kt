package com.bilge.studycorner

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ContentTechnicalActivity : AppCompatActivity() {
    //First Activity [for Exam]
    //Change to UX Activity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Splash Screen
        Thread.sleep(3000)
        installSplashScreen()

        setContentView(R.layout.activity_content_technical)


        val button = findViewById<Button>(R.id.nextButton)
        button.setOnClickListener {

            val intent = Intent(this, UX_Activity::class.java)
            startActivity(intent)
        }



    }
}