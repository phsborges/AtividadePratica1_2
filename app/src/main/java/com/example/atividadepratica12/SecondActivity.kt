package com.example.atividadepratica12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

        private lateinit var textViewMessage: TextView

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_second)

            textViewMessage = findViewById(R.id.textViewMessage)

            val message = intent.getStringExtra("message")
            textViewMessage.text = message

    }
}