package com.example.task08guiloginyregistro

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.task08guiloginyregistro.databinding.ActivityMainBinding
import com.example.task08guiloginyregistro.databinding.ActivityPantallaBienvenidaBinding

class pantallaBienvenida : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityPantallaBienvenidaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var nombreUsu= intent.getStringExtra("login")


        binding.textView.text = "Bienvenido: "+nombreUsu

    }


    }
