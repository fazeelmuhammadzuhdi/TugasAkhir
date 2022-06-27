package com.example.tugasakhir.ui.keranjang

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class KeranjangViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Ini Adalah Keranjang"
    }
    val text: LiveData<String> = _text
}