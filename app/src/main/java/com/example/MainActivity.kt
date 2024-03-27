package com.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etAge = findViewById<EditText>(R.id.etAge).text
        val btnClear = findViewById<Button>(R.id.btnClear)
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnClear.setOnClickListener {
            etAge.clear()
        }

        btnGenerate.setOnClickListener {

            when(etAge.toString().toInt()){
                67 -> tvResult.text = "You have the same age as Leonardo da Vinci"
                39 -> tvResult.text = "You have the same age as Cleopatra VII"
                32 -> tvResult.text = "You have the same age as Alexander the Great"
                56 -> tvResult.text = "You have the same age as Abraham Lincoln"
                55 -> tvResult.text = "You have the same age as Julius Caesar"
                81 -> tvResult.text = "You have the same age as Queen Victoria"
                78 -> tvResult.text = "You have the same age as Mahatma Gandhi"
                75 -> tvResult.text = "You have the same age as Oliver Tambo"
                52 -> tvResult.text = "You have the same age as William Shakespeare"
                95 -> tvResult.text = "You have the same age as Nelson Mandela"
                else -> tvResult.text = "You have entered an invalid age"
            }
        }
    }
}