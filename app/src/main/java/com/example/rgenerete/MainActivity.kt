package com.example.rgenerete

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var minimumInput : EditText
    private lateinit var maximumInput : EditText
    private lateinit var textResult : TextView
    private lateinit var button : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        minimumInput = findViewById(R.id.minNumber)
        maximumInput = findViewById(R.id.maxNumber)
        textResult = findViewById(R.id.resultText)
        button  = findViewById(R.id.button)

        button.setOnClickListener {
            val minimumResult = Integer.parseInt(minimumInput.text.toString())
            val maximumResult = Integer.parseInt(maximumInput.text.toString())
            val result = (minimumResult..maximumResult).random()
            textResult.text = result.toString()
        }

    }
}