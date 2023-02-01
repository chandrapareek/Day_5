package com.example.day_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var Rb:RadioButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv = findViewById<TextView>(R.id.tv)
        val rg = findViewById<RadioGroup>(R.id.rg)
        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener{
            val selectedOption = rg.checkedRadioButtonId
            Rb = findViewById(selectedOption)
            tv.text = Rb.text
        }

    }
}