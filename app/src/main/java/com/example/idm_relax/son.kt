package com.example.idm_relax

import android.app.Activity
import android.app.Instrumentation
import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts

class son : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_son)

       val btnc = findViewById<Button>(R.id.button13)

        btnc.setOnClickListener{
            startForResult.launch(Intent(MediaStore.ACTION_IMAGE_CAPTURE))
        }

    }
    private val startForResult = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
       result: ActivityResult ->
        if(result.resultCode == Activity.RESULT_OK){
        val intent = result.data
            val imageBitmap = intent?.extras?.get("data") as Bitmap
            val imageView = findViewById<ImageView>(R.id.imageView2)
            imageView.setImageBitmap(imageBitmap)

        }

    }
}