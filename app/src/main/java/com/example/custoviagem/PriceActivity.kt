package com.example.custoviagem

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText


class PriceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_precio_combustible)


        val edtprice = findViewById<TextInputEditText>(R.id.edt_price)


        val btnProximo1 = findViewById<Button>(R.id.proximo1)
        btnProximo1.setOnClickListener {
            val priceStr: String = edtprice.text.toString()

            if (priceStr == "") {
                Snackbar
                    .make(
                        edtprice,
                        "Preço obrigatório",
                        Snackbar.LENGTH_LONG
                    )
                    .show()
            } else {
                val price_Combustivel = priceStr.toFloat()
                println("Combustivel:" + price_Combustivel)

                val intentConsumo = Intent(this, ConsumoActivity::class.java)
                    .apply {
                        putExtra(KEY_PRICE, price_Combustivel)
                    }
                startActivity(intentConsumo)
            }


        }
    }
}
