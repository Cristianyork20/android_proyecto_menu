package com.example.app_int_menu

import android.R
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.app_int_menu.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Inflate the layout using View Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configurar un listener para manejar el clic en la imagen
        binding.imagenbutton1.setOnClickListener {
            // Crear un Intent para redirigir a SecondActivity
            val intent = Intent(this, imagen1::class.java)
            startActivity(intent)
        }

        binding.imagenbutton2.setOnClickListener {
            val intent = Intent(this, imagen2::class.java)
            startActivity(intent)
        }

        binding.imagenbutton3.setOnClickListener {
            val intent = Intent(this, imagen3::class.java)
            startActivity(intent)
        }

        binding.imagenbutton4.setOnClickListener {
            val intent = Intent(this, imagen4::class.java)
            startActivity(intent)
        }

        binding.imagenbutton5.setOnClickListener {
            val intent = Intent(this, imagen5::class.java)
            startActivity(intent)
        }

        binding.imagenbutton6.setOnClickListener {
            val intent = Intent(this, imagen6::class.java)
            startActivity(intent)
        }

        binding.imagenbutton7.setOnClickListener {
            val intent = Intent(this, imagen7::class.java)
            startActivity(intent)
        }

        binding.imagenbutton8.setOnClickListener {
            val intent = Intent(this, imagen8::class.java)
            startActivity(intent)
        }

        binding.imagenbutton9.setOnClickListener {
            val intent = Intent(this, imagen9::class.java)
            startActivity(intent)
        }

        binding.imagenbutton10.setOnClickListener {
            val intent = Intent(this, imagen10::class.java)
            startActivity(intent)
        }

        binding.imagenbutton11.setOnClickListener {
            val intent = Intent(this, imagen11::class.java)
            startActivity(intent)
        }

        binding.imagenbutton12.setOnClickListener {
            val intent = Intent(this, imagen12::class.java)
            startActivity(intent)
        }

        binding.imagenbutton13.setOnClickListener {
            val intent = Intent(this, imagen13::class.java)
            startActivity(intent)
        }

        binding.imagenbutton14.setOnClickListener {
            val intent = Intent(this, imagen14::class.java)
            startActivity(intent)
        }

        binding.imagenbutton15.setOnClickListener {
            val intent = Intent(this, imagen15::class.java)
            startActivity(intent)
        }
    }
}