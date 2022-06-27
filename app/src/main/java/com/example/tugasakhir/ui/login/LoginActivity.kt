package com.example.tugasakhir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.tugasakhir.databinding.ActivityLoginBinding
import com.example.tugasakhir.util.Prefs

class LoginActivity : AppCompatActivity() {

    private var _binding: ActivityLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val s = Prefs(this)
        if (s.getIsLogin()) {
            binding.status.text = "SUDAH LOGIN"
        } else binding.status.text = "BELUM LOGIN"

        binding.login.setOnClickListener {
            s.setIsLogin(true)
            onBackPressed()
        }
        binding.logout.setOnClickListener {
            s.setIsLogin(false)
            onBackPressed()
        }
        Log.d("PESAN", "Pesan Singkat")
    }
}