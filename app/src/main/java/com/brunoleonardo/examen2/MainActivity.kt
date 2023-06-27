package com.brunoleonardo.examen2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.brunoleonardo.examen2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       // ajouter la passage de un activity a autre
        binding.btnSaisir.setOnClickListener {
            val intent = Intent(this, Activity2::class.java)
            startActivity(intent)


        }
    }




}