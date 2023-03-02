package com.alfaro.mispeliculasfavoritas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.alfaro.mispeliculasfavoritas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(root)
            titulo.text = "Menu Principal"
        }

    }

    fun cambiarPantallaMatrix(view:View){
        val intent = Intent(this, Matrix::class.java).apply {
            putExtra("TITULO","MATRIX")
            putExtra("DESCRIPTION","El programador informático Thomas Anderson, más conocido en el mundo de los &quot;hacker&quot; como Neo, está en el punto de mira del temible agente Smith. Otros dos piratas informáticos, Trinity y Morfeo, se ponen en contacto con Neo para ayudarlo a escapar. Matrix te posee. Sigue al conejo blanco.")
        }

        startActivity(intent)

    }

    fun cambiarPantallaInception(view:View){
        val intent = Intent(this, Matrix::class.java).apply {
            putExtra("TITULO","INCEPTION")
            putExtra("DESCRIPTION","Dom Cobb (Leonardo DiCaprio) es un ladrón con una extraña habilidad para entrar a los sueños de la gente y robarle los secretos de sus subconscientes. Su habilidad lo ha convertido en un atractivo en el mundo del espionaje corporativo, pero ha tenido un gran costo en la gente que ama.")
        }
        startActivity(intent)

    }

    fun cambiarPantallaAmericanPie(view:View){
        val intent = Intent(this, Matrix::class.java).apply {
            putExtra("TITULO","AMERICAN PIE")
            putExtra("DESCRIPTION","Cuatro adolescentes se comprometen a perder su virginidad y hacen un pacto. Cada uno trata de ser el primero, pero se encuentran con obstáculos para lograr su objetivo.")
        }
        startActivity(intent)

    }

    fun cambiarPantallaAvengers(view:View){
        val intent = Intent(this, Matrix::class.java).apply {
            putExtra("TITULO","CAPITAN AMERICA CIVIL WAR")
            putExtra("DESCRIPTION","Después de que otro incidente internacional, en el que se ven envueltos los Vengadores, produzca daños colaterales, la presión política obliga a poner en marcha un sistema para depurar responsabilidades.")
        }
        startActivity(intent)
    }

    fun btnimagev(view: View) {}

}