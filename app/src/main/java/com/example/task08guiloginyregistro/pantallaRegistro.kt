package com.example.task08guiloginyregistro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.task08guiloginyregistro.databinding.ActivityPantallaRegistroBinding

class pantallaRegistro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityPantallaRegistroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imgBotonCerrar.setOnClickListener(){
            finish()
        }

        binding.botonCancelar.setOnClickListener {
            val intent= Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.botonRegistrar.setOnClickListener {

            val usuarios = arrayListOf<String>()
            usuarios.add(binding.nomUsu.text.toString())
            println(usuarios.toString())
            val intent= Intent(this, MainActivity::class.java)
            intent.putExtra("array",usuarios.toString())
            startActivity(intent)
        }

    }
}