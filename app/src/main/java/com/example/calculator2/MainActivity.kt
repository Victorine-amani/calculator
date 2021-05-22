package com.example.calculator2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnOne = findViewById<Button>(R.id.btn1)
        val btnTwo = findViewById<Button>(R.id.btn2)
        val btnThree = findViewById<Button>(R.id.btn3)
        val btnFour = findViewById<Button>(R.id.btn4)
        val inPut = findViewById<EditText>(R.id.etInput1)
        val input=findViewById<EditText>(R.id.etInput2)
        val outPut = findViewById<TextView>(R.id.tvResult)
        btnOne.setOnClickListener {
            val first=inPut.text.toString().toInt()
            val second=input.text.toString().toInt()
            val add=first+second
            outPut.setText(add.toString())
        }
        btnTwo.setOnClickListener {
            val first=inPut.text.toString().toInt()
            val second=input.text.toString().toInt()
            val add=first-second
            outPut.setText(add.toString())
        }
        btnThree.setOnClickListener {
            val first=inPut.text.toString().toInt()
            val second=input.text.toString().toInt()
            val add=first*second
            outPut.setText(add.toString())
        }
        btnFour.setOnClickListener {
            val first=inPut.text.toString().toInt()
            val second=input.text.toString().toInt()
            val add=first%second
            outPut.setText(add.toString())
        }


    }


}


