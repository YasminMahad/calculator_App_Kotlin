package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var etFirstNumber: EditText
    lateinit var etSecondNumber: EditText
    lateinit var btnAdd: Button
    lateinit var btnSubtract: Button
    lateinit var btnMultiply: Button
    lateinit var btnModulus: Button
    lateinit var tvResultAdd: TextView
    lateinit var tvResultSubtract: TextView
    lateinit var tvResultMultiply: TextView
    lateinit var tvResultModulus: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAdd = findViewById(R.id.btnAdd)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnModulus = findViewById(R.id.btnModulus)
        etFirstNumber = findViewById(R.id.etFirstNumber)
        etSecondNumber = findViewById(R.id.etSecondNumber)
        tvResultAdd = findViewById(R.id.tvResultAdd)
        tvResultMultiply = findViewById(R.id.tvResultMultiply)
        tvResultModulus = findViewById(R.id.tvResultModulus)
        tvResultSubtract = findViewById(R.id.tvResultSubtract)



        btnAdd.setOnClickListener {
            var firstNumber = etFirstNumber.text.toString().toInt()
            var secondNumber = etSecondNumber.text.toString().toInt()
            calculateAddition(firstNumber,secondNumber)
        }

        btnSubtract.setOnClickListener {
            var firstNumber = etFirstNumber.text.toString().toInt()
            var secondNumber = etSecondNumber.text.toString().toInt()
            calculateSubtraction(firstNumber,secondNumber)
        }

        btnMultiply.setOnClickListener {
            var firstNumber = etFirstNumber.text.toString().toInt()
            var secondNumber = etSecondNumber.text.toString().toInt()
            calculateMultiply(firstNumber,secondNumber)
        }

        btnModulus.setOnClickListener {
            var firstNumber = etFirstNumber.text.toString().toInt()
            var secondNumber = etSecondNumber.text.toString().toInt()
            calculateModulus(firstNumber,secondNumber)
        }


    }

    fun calculateAddition(firstNumber:Int, secondNumber:Int){
        var add = secondNumber+ firstNumber
        tvResultAdd.text = add.toString()
    }

    fun calculateSubtraction(firstNumber: Int,secondNumber: Int){
        var sub = firstNumber - secondNumber
        tvResultSubtract.text = sub.toString()
    }

    fun calculateMultiply(firstNumber:Int, secondNumber: Int){
        var multiply = firstNumber * secondNumber
        tvResultMultiply.text = multiply.toString()
    }

    fun calculateModulus(firstNumber: Int,secondNumber: Int){
        var modulus = firstNumber % secondNumber
        tvResultModulus.text = modulus.toString()
    }
}