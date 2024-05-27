package com.example.calculator

import android.media.tv.TvView
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var etNum1: EditText
    lateinit var etNum2: EditText
    lateinit var btn_add: Button
    lateinit var btn_subtract: Button
    lateinit var btn_divide: Button
    lateinit var btn_multiplication: Button
    lateinit var tvView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castViews()
        btn_add.setOnClickListener {
            val num1 = etNum1.text.toString().toInt()
            val num2 = etNum2.text.toString().toInt()
            val sum = num1 + num2
            tvView.text = sum.toString()
        }
        btn_subtract.setOnClickListener {
            val num1 = etNum1.text.toString().toInt()
            val num2 = etNum2.text.toString().toInt()
            val sum = num1 - num2
            tvView.text = sum.toString()
        }

        btn_multiplication.setOnClickListener {
            val num1 = etNum1.text.toString().toInt()
            val num2 = etNum2.text.toString().toInt()
            val sum = num1 * num2
            tvView.text = sum.toString()
        }


        btn_divide.setOnClickListener {
            val num1 = etNum1.text.toString().toInt()
            val num2 = etNum2.text.toString().toInt()
            val sum = num1 / num2
            tvView.text = sum.toString()
        }
    }

        fun castViews() {
            etNum1 = findViewById(R.id.etNum1)
            etNum2 = findViewById(R.id.etNum2)
            btn_add = findViewById(R.id.btn_add)
            btn_subtract = findViewById(R.id.btn_subtract)
            btn_multiplication = findViewById(R.id.btn_multiplication)
            btn_divide = findViewById(R.id.btn_division)
            tvView = findViewById(R.id.textView)


    }
}
