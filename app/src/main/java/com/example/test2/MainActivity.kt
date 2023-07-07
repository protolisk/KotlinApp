package com.example.test2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputEditText: EditText = findViewById(R.id.inputEditText)
        val convertButton: Button = findViewById(R.id.convertButton)
        val resultTextView: TextView = findViewById(R.id.resultTextView)

        convertButton.setOnClickListener {
            val userInput = inputEditText.text.toString()
            val result = calculateLetterValues(userInput)
            resultTextView.text = "The sum of the letter values in your string is: $result"
        }
    }

    private fun calculateLetterValues(input: String): Int {
        val alphabet = "abcdefghijklmnopqrstuvwxyz"
        var sum = 0

        for (char in input) {
            val index = alphabet.indexOf(char)
            if (index != -1) {
                sum += index + 1
            }
        }

        return sum
    }
}