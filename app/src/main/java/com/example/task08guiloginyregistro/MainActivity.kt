package com.example.task08guiloginyregistro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import com.example.task08guiloginyregistro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.botonLogin.isEnabled=false

        binding.editTextTextPassword2.addTextChangedListener(object :TextWatcher {
            override fun afterTextChanged(s: Editable?) {    }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {    }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.botonLogin.isEnabled = binding.editTextTextPersonName2.text.toString()==binding.editTextTextPassword2.text.toString()}})

        binding.editTextTextPersonName2.addTextChangedListener(object :TextWatcher {
            override fun afterTextChanged(s: Editable?) {    }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {    }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.botonLogin.isEnabled = binding.editTextTextPersonName2.text.toString()==binding.editTextTextPassword2.text.toString()
            }})

        binding.botonRegistro.setOnClickListener {
            val intent= Intent(this, pantallaRegistro::class.java)
            startActivity(intent)
        }

        binding.botonLogin.setOnClickListener {
            val intent= Intent(this, pantallaBienvenida::class.java)
            intent.putExtra("login",binding.editTextTextPersonName2.text.toString())
            startActivity(intent)
        }


    }
}