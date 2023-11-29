package com.example.cursokotlinprincipiantes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    var TAG = ":::TAG"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        variablesYConstantes()
        tiposDeDatos()
        operadores()
    }
    // Aqui vamos a ver variables y constantes
    private fun variablesYConstantes(){
        /*
        *1. - Nombre para representar el valor de un dato
        * */
        var myFirstVariable = "Hello World"
        myFirstVariable = "Bye World!"
        Log.d(TAG,myFirstVariable)

    }

    private fun tiposDeDatos(){
        //Cadena de texto
        var string = "MyString"
        //Valores numericos (int,short,long,byte)
        var number:Long = 10
        number = 2
        //Valores numericos decimales (double,float)
        var decimal = 10.5
        // Condiciones verdaderas o falsas
        var boolean = false
        var boolean2 = true

        Log.d(TAG,"My number is $number")
    }

    private fun operadores(){
        val firstValue = 5
        val secondValue = 7

        //Operadores aritmeticos
        val suma = firstValue + secondValue
        val resta = firstValue - secondValue
        val multiplicacion = firstValue * secondValue
        val division = firstValue / secondValue
        var resto = firstValue % secondValue

        //Operadores de comparacion
        val igualdad = firstValue == secondValue
        val desigualdad = firstValue != secondValue
        val menor = firstValue < secondValue
        val mayor = firstValue > secondValue
        val menorIgual = firstValue <= secondValue
        val mayorIgual = firstValue >= secondValue

        //Operadores logicos
        val name = "Antonio"
        val age = 20

        val igualdad2:Boolean = name == "Antonio"
        val menorQue2:Boolean = age <= 50

        val conjuncion = igualdad2 && menorQue2
        val disyuscion = igualdad2 || menorQue2
        val negacion = !igualdad2

        Log.d(TAG,"El resultado es: $disyuscion")
    }

    private fun nullSafety(){
        val nullString:String? = null
        val name:String? = "Antonio"
        val age:Int? = 20

        if(nullString != null)
            Log.d(TAG,nullString)

        nullString?.let {  Log.d(TAG,nullString) }?: run { Log.d(TAG,nullString!!) }
    }
}