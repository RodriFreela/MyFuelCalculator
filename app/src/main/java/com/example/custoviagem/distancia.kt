package com.example.custoviagem

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class distancia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_distancia)

        val distancia1 = findViewById<TextInputEditText>(R.id.edt_distancia)



        val calcular = findViewById<Button>(R.id.Calcular)
        calcular.setOnClickListener {
            val distancia = distancia1.text
            // println("Distancia:" + distancia)

            val resultado = Intent(this, resultado::class.java)
            startActivity(resultado)
        }
    }
}