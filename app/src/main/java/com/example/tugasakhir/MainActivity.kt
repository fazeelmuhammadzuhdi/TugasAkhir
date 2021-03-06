package com.example.tugasakhir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.tugasakhir.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.submit.setOnClickListener {

            if (binding.nama.text.toString() == "") {
                nama.error = "Wajib diisi"
                return@setOnClickListener
            }
            if (binding.usia.text.toString() == "") {
                usia.error = "Wajib diisi"
                return@setOnClickListener
            }
            if (binding.asal.text.toString() == "") {
                asal.error = "Wajib diisi"
                return@setOnClickListener
            }

            val nama =  binding.nama.text.toString()
            val usia =  binding.usia.text.toString()
            val asal =  binding.asal.text.toString()



            Intent(this, BundleActivity::class.java).also {
                it.putExtra("EXTRA_NAMA", nama)
                it.putExtra("EXTRA_USIA", usia)
                it.putExtra("EXTRA_ASAL", asal)
                startActivity(it)
            }
        }

        binding.batal.setOnClickListener {
            binding.nama.text.clear()
            binding.usia.text.clear()
            binding.asal.text.clear()

            Toast.makeText(this, "Dibersihkan", Toast.LENGTH_SHORT).show()
        }
    }

}