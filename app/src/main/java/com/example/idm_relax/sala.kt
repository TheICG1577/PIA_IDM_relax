package com.example.idm_relax

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class sala : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sala)

        val btn: Button = findViewById(R.id.button2)
        btn.setOnClickListener {

            val intent: Intent = Intent(this, resp:: class.java )
            startActivity(intent)
        }

        val btn2: Button = findViewById(R.id.button3)
        btn2.setOnClickListener {

            val intent: Intent = Intent(this, esc:: class.java )
            startActivity(intent)
        }

        val btn3: Button = findViewById(R.id.button4)
        btn3.setOnClickListener {

            val intent: Intent = Intent(this, obs:: class.java )
            startActivity(intent)
        }

        val btn4: Button = findViewById(R.id.button5)
        btn4.setOnClickListener {

            val intent: Intent = Intent(this, self:: class.java )
            startActivity(intent)
        }

        val btn5: Button = findViewById(R.id.button6)
        btn5.setOnClickListener {

            val intent: Intent = Intent(this, api:: class.java )
            startActivity(intent)
        }

        val btn6: Button = findViewById(R.id.button7)
        btn6.setOnClickListener {

            val intent: Intent = Intent(this, son:: class.java )
            startActivity(intent)
        }

        val sal: Button = findViewById(R.id.button8)
        sal.setOnClickListener {

            val intent: Intent = Intent(this, MainActivity:: class.java )
            startActivity(intent)
        }
    }
}