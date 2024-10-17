package com.bilge.studycorner

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView


class TimerActivity : AppCompatActivity() {

    private lateinit var countDownTimer: CountDownTimer
    private var isTimerRunning = false
    private val initialTime = 60000L // 1 minute in milliseconds
    private val interval = 1000L // 1 second in milliseconds


    private lateinit var timerTextView: TextView
    private lateinit var progressBar: ProgressBar
    private lateinit var startButton: Button
    private lateinit var stopButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timer)



        // Reference views using findViewById
        timerTextView = findViewById(R.id.timerTextView)
        progressBar = findViewById(R.id.progressBar)
        startButton = findViewById(R.id.startButton)
        stopButton = findViewById(R.id.stopButton)

        // Set the initial time and progress in the UI
        timerTextView.text = "Time remaining: ${initialTime / 1000} minutes"
        progressBar.max = (initialTime / 1000).toInt() // Progress bar max is the total time in seconds
        progressBar.progress = progressBar.max

        // Start countdown when the Start button is clicked
        startButton.setOnClickListener {
            if (!isTimerRunning) {
                startCountdown()
            }
        }

        // Stop countdown when the Stop button is clicked
        stopButton.setOnClickListener {
            if (isTimerRunning) {
                stopCountdown()
            }
        }



        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigation)
        bottomNavigationView.selectedItemId = R.id.bottom_Timer
        bottomNavigationView.setOnItemSelectedListener { item: MenuItem ->
            when (item.itemId) {
                R.id.bottom_home -> {
                    startActivity(
                        Intent(
                            applicationContext,
                            Home::class.java
                        )
                    )
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                    finish()
                    return@setOnItemSelectedListener true
                }

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

                R.id.bottom_Timer -> return@setOnItemSelectedListener true
            }
            false
        }
    }


    private fun startCountdown() {
        countDownTimer = object : CountDownTimer(initialTime, interval) {
            override fun onTick(millisUntilFinished: Long) {
                // Calculate the remaining time in seconds
                val secondsLeft = millisUntilFinished / 1000
                timerTextView.text = "Time remaining: $secondsLeft seconds"

                // Update the progress bar
                val progress = (millisUntilFinished / 1000).toInt()
                progressBar.progress = progress
            }

            override fun onFinish() {
                // When the countdown finishes, update the UI
                timerTextView.text = "Countdown finished!"
                progressBar.progress = 0
            }
        }

        // Start the countdown timer
        countDownTimer.start()
        isTimerRunning = true
    }

    private fun stopCountdown() {
        countDownTimer.cancel() // Cancel the countdown timer
        timerTextView.text = "Countdown stopped!"
        progressBar.progress = 0 // Reset progress bar
        isTimerRunning = false
    }










}