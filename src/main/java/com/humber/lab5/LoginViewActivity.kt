package com.humber.lab5

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {

    private lateinit var tvLoginView: TextView
    private lateinit var tvOnlineView: TextView
    private lateinit var btnBack: Button
    private lateinit var btnProfile: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Set the layout for this activity
        setContentView(R.layout.activity_login)

        // Bind UI components to variables using their IDs
        tvLoginView = findViewById(R.id.tvLoginView)
        tvOnlineView = findViewById(R.id.tvOnlineView)
        btnBack = findViewById(R.id.btnBack)
        btnProfile = findViewById(R.id.btnProfile)

        // Set up the "Back" button to finish the activity
        btnBack.setOnClickListener {
            finish() // Ends this activity
        }

        // Set up the "Go to Profile" button to launch the ProfileActivity
        btnProfile.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        // Refresh UI data here if needed
    }
}
