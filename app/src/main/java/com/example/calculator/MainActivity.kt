package com.example.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.calculator.databinding.ActivityMainBinding
import kotlin.math.sign

class MainActivity : AppCompatActivity() {
//    lateinit var etNum1: EditText
//    lateinit var etNum2: EditText
//    lateinit var btn_add: Button
//    lateinit var btn_subtract: Button
//    lateinit var btn_divide: Button
//    lateinit var btn_multiplication: Button
//    lateinit var tvResult:TextView
lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        castViews()
        binding.btnAdd.setOnClickListener {
          validate("+")
        }
        binding.btnSubtract.setOnClickListener {
            validate("-")
        }

        binding.btnMultiplication.setOnClickListener {
            validate("*")
        }


        binding.btnDivision.setOnClickListener {
            validate("/")
        }
    }

//        fun castViews() {
//            etNum1 = findViewById(R.id.etNum1)
//            etNum2 = findViewById(R.id.etNum2)
//            btn_add = findViewById(R.id.btnAdd)
//            btn_subtract = findViewById(R.id.btnSubtract)
//            btn_multiplication = findViewById(R.id.btnMultiplication)
//            btn_divide = findViewById(R.id.btnDivision)
//            tvResult= findViewById(R.id. textView)
//
//
//    }

    fun validate(sign: String) {
        val num1 = binding.etnum1.text.toString()
        val num2 = binding.etnum2.text.toString()

        var inputError = false
        if (num1.isBlank()) {
            inputError = true
            binding.etnum1.error = "Num 1 is required"
        }
        if (num2.isBlank()) {
            inputError = true
            binding.etnum2.error = "Num 2 is required"
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
        binding.tvResult.text= result.toString()
    }
}

