package com.example.custoviagem

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class precio_combustible : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_precio_combustible)


        val price = findViewById<TextInputEditText>(R.id.edttext_price)

        val btnProximo1 = findViewById<Button>(R.id.proximo1)
        btnProximo1.setOnClickListener {
            val intentConsumo = Intent(this, consumo::class.java)
            startActivity(intentConsumo)
        }


    }
}
