package com.example.idm_relax
import android.media.MediaPlayer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class esc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_esc)
        val btn1=findViewById<Button>(R.id.button9)
        val btn2=findViewById<Button>(R.id.button10)
        val btn3=findViewById<Button>(R.id.button11)
        val btn4=findViewById<Button>(R.id.button12)

        btn1.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.ding)
            mp.start()
        }

        btn2.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.plop)
            mp.start()
        }

        btn3.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.shine)
            mp.start()
        }

        btn4.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.sq)
            mp.start()
        }


    }
}