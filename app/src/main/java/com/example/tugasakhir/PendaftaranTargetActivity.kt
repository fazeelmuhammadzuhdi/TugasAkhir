package com.example.tugasakhir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tugasakhir.databinding.ActivityPendaftaranTargetBinding

class PendaftaranTargetActivity : AppCompatActivity() {
    lateinit var binding: ActivityPendaftaranTargetBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPendaftaranTargetBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nama = intent.getStringExtra("nama")
        val usia = intent.getStringExtra("usia")
        val asal = intent.getStringExtra("asal")

        val hasilData = "Nama Anda Adalah : $nama \n" +
                "Usia Anda Adalah : $usia \n" +
                "Asal Anda Adalah : $asal \t\t\t\t"

        binding.hasilakhir.text = hasilData
    }
}