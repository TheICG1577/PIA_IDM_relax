package com.example.idm_relax

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Thread.sleep(2000)
        setTheme(R.style.Theme_IDM_relax)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById(R.id.button)
        btn.setOnClickListener {

            val intent: Intent = Intent(this, sala:: class.java )
          startActivity(intent)
        }
    }
}