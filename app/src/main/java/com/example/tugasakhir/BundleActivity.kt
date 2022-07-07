package com.example.tugasakhir

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tugasakhir.databinding.ActivityBundleBinding

class BundleActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBundleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBundleBinding.inflate(layoutInflater)
        setContentView(binding.root)

//       binding.hasil.text.toString()


        val nama = intent.getStringExtra("EXTRA_NAMA")
        val usia = intent.getStringExtra("EXTRA_USIA")
        val asal = intent.getStringExtra("EXTRA_ASAL")

        val hasilData = "Nama Anda Adalah : $nama \n" +
                "Usia Anda Adalah : $usia \n" +
                "Asal Anda Adalah : $asal \t\t\t\t"

        binding.hasil.text = hasilData
    }
}