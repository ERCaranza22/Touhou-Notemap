package com.example.caranza_touhouapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CharacterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_character)

        val reimuBtn = findViewById<Button>(R.id.reimu_btn)
        val marisaBtn = findViewById<Button>(R.id.marisa_btn)
        val sakuyaBtn = findViewById<Button>(R.id.sakuya_btn)
        val sanaeBtn = findViewById<Button>(R.id.sanae_btn)
        val youmuBtn = findViewById<Button>(R.id.youmu_btn)
        val reisenBtn = findViewById<Button>(R.id.reisen_btn)

        reimuBtn.setOnClickListener {
            startActivity(Intent(this, ReimuCharActivity::class.java))
        }

        marisaBtn.setOnClickListener {
            startActivity(Intent(this, MarisaCharActivity::class.java))
        }

        sakuyaBtn.setOnClickListener {
            startActivity(Intent(this, SakuyaCharActivity::class.java))
        }

        sanaeBtn.setOnClickListener {
            startActivity(Intent(this, SanaeCharActivity::class.java))
        }

        youmuBtn.setOnClickListener {
            startActivity(Intent(this, YoumuCharActivity::class.java))
        }

        reisenBtn.setOnClickListener {
            startActivity(Intent(this, ReisenCharActivity::class.java))
        }
    }
}