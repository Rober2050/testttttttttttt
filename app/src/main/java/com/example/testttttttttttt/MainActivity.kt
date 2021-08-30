package com.example.testttttttttttt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val tag = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btn=  findViewById<Button>(R.id.btnTest)
        btn.setOnClickListener{
            val txt = findViewById<TextView>(R.id.txtSaludo)
            txt.text="Se pulso el botón"
            Log.d(tag, "Boton pulsado test ")
            println("Agregado por DevTest")
        }

        Log.d(tag, "Paso por OnCreate")


    }

        override fun onStart() {
            Log.d(tag, "pasando por OnStart")
            super.onStart()

        }

     override fun onResume(){
         Log.d(tag,"Estoy pasando por OnResume")
         super.onResume()
     }

      override fun onPause(){
          Log.d(tag,"Estoy pasando por onPause")
          super.onPause()
      }

    override fun onStop(){
        Log.d(tag, "Etoy pasando por onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(tag,"Estoy pasando por onDestroy")
        super.onDestroy()
    }

    }




