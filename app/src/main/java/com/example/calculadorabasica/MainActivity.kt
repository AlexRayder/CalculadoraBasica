package com.example.calculadorabasica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.core.view.ViewCompat

class MainActivity : AppCompatActivity() {

    lateinit var txtNum1: EditText
    lateinit var txtNum2: EditText
    lateinit var txtResultado: EditText
    lateinit var btnSumar:Button
    lateinit var btnRestar :Button
    lateinit var btnMultiplicar: Button
    lateinit var  btnDividir: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtNum1 = findViewById(R.id.txtNum1)
        txtNum2 = findViewById(R.id.txtNum2)
        txtResultado = findViewById(R.id.txtResultado)

        btnSumar = findViewById(R.id.btnSumar)
        btnRestar = findViewById(R.id.btnRestar)
        btnMultiplicar = findViewById(R.id.btnMultiplicar)
        btnDividir = findViewById(R.id.btnDividir)

        btnSumar.setOnClickListener { sumar() }
        btnRestar.setOnClickListener { restar() }
        btnMultiplicar.setOnClickListener { multiplicar() }
        btnDividir.setOnClickListener { dividir() }


    }
    private  fun sumar(){
        if (estavacio()){
            txtResultado.setText("Faltan Datos")
        }else{
            var num1 = txtNum1.text.toString().toInt()
            var num2 = txtNum2.text.toString().toInt()
            var suma = num1 + num2

            txtResultado.setText("$suma")
        }

    }

    private fun restar(){
        if (estavacio()){
            txtResultado.setText("Faltan Datos")
        }else{
            var num1 = txtNum1.text.toString().toInt()
            var num2 = txtNum2.text.toString().toInt()
            var resta = num1 - num2

            txtResultado.setText("$resta")
        }

    }

    private fun multiplicar(){
        if (estavacio()){
            txtResultado.setText("Faltan Datos")
        }else{
            var num1 = txtNum1.text.toString().toInt()
            var num2 = txtNum2.text.toString().toInt()
            var multiplicar = num1 * num2

            txtResultado.setText("$multiplicar")
        }

    }

    private fun dividir(){
        if (estavacio()){
            txtResultado.setText("Faltan Datos")
        }else{
            var num1 = txtNum1.text.toString().toInt()
            var num2 = txtNum2.text.toString().toInt()
            var dividir = num1 / num2

            txtResultado.setText("$dividir")
        }

    }

    private  fun estavacio():Boolean{
        if (txtNum1.text.toString().isEmpty() || txtNum2.text.isEmpty()){
            return true
        }
        return false
    }
}