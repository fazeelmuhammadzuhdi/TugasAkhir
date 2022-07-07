package com.example.tugasakhir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.tugasakhir.databinding.ActivityPendaftaranBinding
import kotlinx.android.synthetic.main.activity_main.*

class PendaftaranActivity : AppCompatActivity() {
    lateinit var binding: ActivityPendaftaranBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPendaftaranBinding.inflate(layoutInflater)
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


            val bundle = Bundle()
            bundle.putString("nama", binding.nama.text.toString())
            bundle.putString("usia", binding.usia.text.toString())
            bundle.putString("asal", binding.asal.text.toString())
            val intent = Intent(this, PendaftaranTargetActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }

        binding.batal.setOnClickListener {
            binding.nama.text.clear()
            binding.usia.text.clear()
            binding.asal.text.clear()

            Toast.makeText(this, "Dibersihkan", Toast.LENGTH_SHORT).show()
        }
    }
}