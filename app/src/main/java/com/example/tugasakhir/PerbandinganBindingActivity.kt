package com.example.tugasakhir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.tugasakhir.databinding.ActivityPerbandinganBindingBinding
import kotlinx.android.synthetic.main.activity_perbandingan_binding.*

class PerbandinganBindingActivity : AppCompatActivity() {
    lateinit var binding: ActivityPerbandinganBindingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPerbandinganBindingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val button1 = findViewById<Button>(R.id.find)

        button1.setOnClickListener {
            Toast.makeText(this, "Ini Menggunakan FIND VIEW BY ID", Toast.LENGTH_SHORT).show()
        }

        btn_kotsin.setOnClickListener {
            Toast.makeText(this, "Ini Menggunakan KOTLIN SINTETIC", Toast.LENGTH_SHORT).show()
        }

        binding.btnBinding.setOnClickListener {
            Toast.makeText(this, "Ini Menggunakan VIEW BINDING", Toast.LENGTH_SHORT).show()
        }
    }
}