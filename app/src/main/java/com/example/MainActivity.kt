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
        //Code Attribution
        // This method was taken on stackoverflow
        // https://stackoverflow.com/questions/53138172/how-to-implement-switch-case-statement-in-kotlin
        // Ryan M
        // https://stackoverflow.com/users/208273/ryan-m

        btnGenerate.setOnClickListener {

            when(etAge.toString().toInt()){

                67 -> tvResult.text = "You have the same age as Leonardo da Vinci, he was an italian polymath of the High Renaissance who was a painter, " +
                                         "engineer,and a scientist. "

                39 -> tvResult.text = "You have the same age as Cleopatra VII, she was Queen of the Kingdom of Egypt"

                32 -> tvResult.text = "You have the same age as Alexander the Great, he was a king of the ancient greek"

                56 -> tvResult.text = "You have the same age as Abraham Lincoln he was an american, lawyer who served as " +
                                         "the 16th President of the United States "

                55 -> tvResult.text = "You have the same age as Julius Caesar, he was a Roman general and statesman"

                81 -> tvResult.text = "You have the same age as Queen Victoria, she was the Queen of the kingdom of Great Britain "

                78 -> tvResult.text = "You have the same age as Mahatma Gandhi, he was an indian lawyer also inspired movements for civil rights and freedom across the world"

                75 -> tvResult.text = "You have the same age as Oliver Tambo he founded the ANC youth league along side with Nelson Mandela in 1944"

                52 -> tvResult.text = "You have the same age as William Shakespeare, he was an english playwright, poet and actor"

                95 -> tvResult.text = "You have the same age as Nelson Mandela, he was a South African anti-apartheid activist, politician " +
                                        "and statesman who served as the first president of South Africa from 1994 to 1999"

                else -> tvResult.text = "You have entered an invalid age"
            }
        }
    }
}