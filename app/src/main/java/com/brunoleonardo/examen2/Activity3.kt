package com.brunoleonardo.examen2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.brunoleonardo.examen2.databinding.Activity3Binding

class Activity3 : AppCompatActivity() {
    lateinit var binding: Activity3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}