package com.example.atividadepratica12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var editTextMessage: EditText
    private lateinit var buttonNext: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextMessage = findViewById(R.id.editTextMessage)
        buttonNext = findViewById(R.id.buttonNext)

        buttonNext.setOnClickListener {
            val message = editTextMessage.text.toString()

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("message", message)
            startActivity(intent)
        }
    }
}

