package com.example.rdhomework

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val phoneTextView : TextView = findViewById(R.id.phone_tv)
        val emailTextView : TextView = findViewById(R.id.email_tv)
        phoneTextView.setOnClickListener {
            Toast.makeText(this, "Phone TV clicked", Toast.LENGTH_SHORT).show()
        }
        emailTextView.setOnClickListener {
            Toast.makeText(this, "Email TV clicked", Toast.LENGTH_SHORT).show()
        }
    }
}