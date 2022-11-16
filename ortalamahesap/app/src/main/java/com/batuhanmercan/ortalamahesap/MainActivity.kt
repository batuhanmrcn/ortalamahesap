package com.batuhanmercan.ortalamahesap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.batuhanmercan.ortalamahesap.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonHesapla.setOnClickListener {
            if (binding.editSinav1.text.isNotEmpty()&&binding.editSinav2.text.isNotEmpty()){
                var sinav1 = binding.editSinav1.text.toString().toInt()
                var sinav2 = binding.editSinav2.text.toString().toInt()
                var ortalama : Double = (sinav1+sinav2)/2.toDouble()
                if (ortalama>=50){
                    binding.textViewSonuc.text = ortalama.toString()+" "+"Geçtiniz"
                    } else {
                    binding.textViewSonuc.text = ortalama.toString()+" "+"Kaldınız"

                }

            } else {
                binding.textViewSonuc.text = "Sınav Notunuzu Giriniz"


            }
        }
    }
}