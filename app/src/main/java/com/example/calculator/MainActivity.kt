package com.example.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.sign

class MainActivity : AppCompatActivity() {
    lateinit var etNum1: EditText
    lateinit var etNum2: EditText
    lateinit var btn_add: Button
    lateinit var btn_subtract: Button
    lateinit var btn_divide: Button
    lateinit var btn_multiplication: Button
    lateinit var tvResult:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castViews()
        btn_add.setOnClickListener {
          validate("+")
        }
        btn_subtract.setOnClickListener {
            validate("-")
        }

        btn_multiplication.setOnClickListener {
            validate("*")
        }


        btn_divide.setOnClickListener {
            validate("/")
        }
    }

        fun castViews() {
            etNum1 = findViewById(R.id.etNum1)
            etNum2 = findViewById(R.id.etNum2)
            btn_add = findViewById(R.id.btn_add)
            btn_subtract = findViewById(R.id.btn_subtract)
            btn_multiplication = findViewById(R.id.btn_multiplication)
            btn_divide = findViewById(R.id.btn_division)
            tvResult= findViewById(R.id. textView)


    }

    fun validate(sign: String) {
        val num1 = etNum1.text.toString()
        val num2 = etNum1.text.toString()
        var inputError = false
        if (num1.isBlank()) {
            inputError = true
            etNum1.error = "Num 1 is required"
        }
        if (num2.isBlank()) {
            inputError = true
            etNum1.error = "Num 2 is required"
        }
        if(!inputError){
            calculate(num1.toDouble(), num2.toDouble(), sign)
        }
    }

    fun calculate(num1: Double ,num2:Double, sign:String){
//        val num1 = etNum1.text.toString().toInt()
//        val num2 = etNum2.text.toString().toInt()
        var result= 0.0

        when (sign){
            "+" -> result =  num1 + num2
            "-" -> result =  num1 - num2
            "*" -> result =  num1 * num2
            "/" -> result =  num1 / num2

        }
        tvResult.text= result.toString()
    }
}
