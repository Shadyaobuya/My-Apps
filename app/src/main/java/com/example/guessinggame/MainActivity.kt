package com.example.guessinggame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var checkBtn=findViewById<Button>(R.id.btncheck)
        var entry=findViewById<EditText>(R.id.eTNumber)

        checkBtn.setOnClickListener {
            if(entry.text.toString() == "") {
                Toast.makeText(baseContext,"Enter valid Number",Toast.LENGTH_SHORT).show()
        }
            else{
                var maxtries = 3
                var numTries = 0
                var secretNumber = 5
                while (numTries<maxtries){
                    var guess = entry.text.toString().toInt()

                    numTries++
                    if (guess==secretNumber){
                        Toast.makeText(baseContext,"You guessed Right", Toast.LENGTH_SHORT).show()
//                        System.exit(-1)
                    }
                    else if (guess > secretNumber){
                        Toast.makeText(baseContext,"Too large, Guess Again", Toast.LENGTH_SHORT).show()

                    }
                    else if(guess<secretNumber){
                        Toast.makeText(baseContext,"Too small, guess again", Toast.LENGTH_SHORT).show()

                    }

                }
                if (numTries>maxtries){
                    Toast.makeText(baseContext,"Chances depleted", Toast.LENGTH_SHORT).show()
                    System.exit(-1)


                }



            }

        }
    }

}