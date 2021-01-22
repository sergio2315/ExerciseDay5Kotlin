package com.example.exerciseday5kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.exerciseday5kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val numbersList = listOf("one", "five",
        "two", "three", "four")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val stringOrdenados= numbersList.map { it.toUpperCase() }
        val filterLength = numbersList.filter { it.length >= 4 }
        var findFirst = numbersList.filter{ it.startsWith("t") }
        binding.textView.setText("Original: "+numbersList.toString())

        binding.btn1.setOnClickListener {
            binding.textView2.setText(stringOrdenados.toString())
        }
        binding.btn2.setOnClickListener {
            binding.textView2.setText(filterLength.toString())
        }
        binding.btn3.setOnClickListener {
            binding.textView2.setText(findFirst.toString())
        }
    }
}