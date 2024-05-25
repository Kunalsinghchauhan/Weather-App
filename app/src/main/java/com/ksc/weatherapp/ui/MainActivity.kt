package com.ksc.weatherapp.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.ksc.weatherapp.R

class MainActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        auth = FirebaseAuth.getInstance()
        // Check if user is signed in (non-null) and update UI accordingly.
        if (auth.currentUser == null) {
            startActivity(Intent(this, LogInActivity::class.java))
        }


    }
}