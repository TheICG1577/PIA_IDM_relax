package com.example.idm_relax

import android.annotation.SuppressLint
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class resp : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resp)
        val btn1=findViewById<Button>(R.id.b13)

        btn1.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.bre)
            mp.start()
        }



    }
}