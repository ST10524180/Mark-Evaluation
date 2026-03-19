package com.example.myevaluation

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myevaluation.ui.theme.MyEvaluationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val marksInput = findViewById<EditText>(R.id.editTextText)
        val resultText = findViewById<TextView>(R.id.txtResult)
        val button = findViewById<Button>(R.id.Button)
        val resetButton = findViewById<Button>(R.id.btnReset)

        button.setOnClickListener{

            val mark = marksInput.text.toString().toInt()

            if (mark >= 80){
                resultText.text = "Symbol : A"

            }
            else if (mark >= 70){
                resultText.text = "Symbol : B"
            }
            else if (mark >= 60){
                resultText.text = "Symbol : C"
            }
            else if (mark >=50){
                resultText.text = "Symbol : D"
            }
            else {
                resultText.text = "Symbol : E"
            }
        }

        //Reset Button
        resetButton.setOnClickListener{
            marksInput.text.clear()
            resultText.text = "Result will appear here"
        }



    }
}
