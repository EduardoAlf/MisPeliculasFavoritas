package com.alfaro.mispeliculasfavoritas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.alfaro.mispeliculasfavoritas.databinding.ActivityInceptionBinding
import com.alfaro.mispeliculasfavoritas.databinding.ActivityMatrixBinding

class Inception : AppCompatActivity() {

    private lateinit var binding: ActivityInceptionBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInceptionBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun cerrar(view: View){
        finish()
    }
}