package com.bilge.studycorner

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CoffeeShopOneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_coffee_shop_one)





        val button = findViewById<Button>(R.id.backButton)
        button.setOnClickListener {

            val intent = Intent(this, CoffeeShopActivity::class.java)
            startActivity(intent)
        }











    }
}