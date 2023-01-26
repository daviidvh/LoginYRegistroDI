package com.example.task08guiloginyregistro

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
        binding.button2.isEnabled=false

        binding.editTextTextPassword2.addTextChangedListener(object :TextWatcher {
            override fun afterTextChanged(s: Editable?) {    }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {    }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if(binding.editTextTextPersonName2.text.toString()==binding.editTextTextPassword2.text.toString())
                    binding.button2.isEnabled=true }})

        binding.editTextTextPersonName2.addTextChangedListener(object :TextWatcher {
            override fun afterTextChanged(s: Editable?) {    }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {    }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if(binding.editTextTextPersonName2.text.toString()==binding.editTextTextPassword2.text.toString())
                    binding.button2.isEnabled=true }})
    }
}