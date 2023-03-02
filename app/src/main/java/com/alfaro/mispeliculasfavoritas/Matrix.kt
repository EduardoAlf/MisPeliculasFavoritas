package com.alfaro.mispeliculasfavoritas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.alfaro.mispeliculasfavoritas.databinding.ActivityMainBinding
import com.alfaro.mispeliculasfavoritas.databinding.ActivityMatrixBinding

class Matrix : AppCompatActivity() {

    private lateinit var binding: ActivityMatrixBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMatrixBinding.inflate(layoutInflater).apply {
            setContentView(root)

        //Obtener los valores

        val titulostr = intent.getStringExtra("TITULO")
        val descripcionstr = intent.getStringExtra("DESCRIPTION")

        //Establecer Valores

            titulosv.text = titulostr
            tv1.text=descripcionstr

    }



    fun cerrar(view: View){
        finish()
    }

}

