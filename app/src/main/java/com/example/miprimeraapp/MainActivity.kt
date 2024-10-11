package com.example.miprimeraapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.miprimeraapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Accede al TextView en tu layout (activity_main.xml) y establece el texto
        binding.textView.text = "Hello world!"
    }
}