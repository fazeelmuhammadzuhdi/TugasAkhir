package com.example.tugasakhir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class InputActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input)
    }

    fun hasil(view: View) {
        val angka1 = findViewById<EditText>(R.id.tugas).text.toString()
        val angka2 = findViewById<EditText>(R.id.uts).text.toString()
        val angka3 = findViewById<EditText>(R.id.uas).text.toString()
        val hasil = findViewById<TextView>(R.id.totalnilai)
        val hasil2 = findViewById<TextView>(R.id.grade)


        if (angka1.equals("")) {
            findViewById<EditText>(R.id.tugas).setError("Masukan angka")
        } else if (angka2.equals("")) {
            findViewById<EditText>(R.id.uts).setError("Masukan angka")
        } else if (angka3.equals("")) {
            findViewById<EditText>(R.id.uas).setError("Masukan angka")
        } else {
            val jumlah =
                (angka1.toDouble() * 0.3) + (angka2.toDouble() * 0.3) + (angka3.toDouble() * 0.4)
            hasil.text = jumlah.toString()


            val jumlah2 =
                (angka1.toDouble() * 0.3) + (angka2.toDouble() * 0.3) + (angka3.toDouble() * 0.4)
            hasil2.text = jumlah2.toString()

            if (jumlah2 >= 85) {
                findViewById<TextView>(R.id.grade).text = "A".toString()
            } else if (jumlah2 >= 60) {
                findViewById<TextView>(R.id.grade).text = "B".toString()
            } else if (jumlah2 > 40) {
                findViewById<TextView>(R.id.grade).text = "C".toString()
            } else {
                findViewById<TextView>(R.id.grade).text = "D".toString()
            }
        }
    }
    fun bersih(view: View) {
        findViewById<EditText>(R.id.tugas).text.clear()
        findViewById<EditText>(R.id.uts).text.clear()
        findViewById<EditText>(R.id.uas).text.clear()
        findViewById<TextView>(R.id.totalnilai).text = "0".toString()
        findViewById<TextView>(R.id.grade).text = "0".toString()

    }
}