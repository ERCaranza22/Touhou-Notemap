package com.example.caranza_touhouapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    private lateinit var welcomeTextView: TextView
    private lateinit var clickhereBtnView: Button
    private lateinit var musicBtnView: Button
    private lateinit var characterBtnView: Button
    private lateinit var mapBtnView: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize button references
        welcomeTextView = findViewById(R.id.welcomeTextView)
        clickhereBtnView = findViewById(R.id.clickhere_btn)
        musicBtnView = findViewById(R.id.music_btn)
        characterBtnView = findViewById(R.id.character_btn)
        mapBtnView = findViewById(R.id.map_btn)

        val username = intent.getStringExtra("USERNAME")
        if (username != null) {
            welcomeTextView.text = "WELCOME, $username"
        } else {
            welcomeTextView.visibility = View.GONE
        }

        // Set up click listeners for the buttons
        clickhereBtnView.setOnClickListener {
            startActivity(Intent(this, InfoActivity::class.java))
        }

        musicBtnView.setOnClickListener {
            startActivity(Intent(this, MusicActivity::class.java))
        }

        characterBtnView.setOnClickListener {
            startActivity(Intent(this, CharacterActivity::class.java))
        }

        mapBtnView.setOnClickListener {
            startActivity(Intent(this, MapActivity::class.java))
        }
    }
}