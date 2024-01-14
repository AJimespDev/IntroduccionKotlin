package com.example.cursokotlinprincipiantes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.util.Calendar

var TAG = ":::TAG"
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // =========================================================
        //variablesYConstantes()
        //tiposDeDatos()
        //operadores()
        //nullSafety()
        //funciones()
        //clases()
        //interfaces()
        // =========================================================
        //condicionalesIf()
        //condicionalesWhen()
        //listados()
        //bucleFor()
        //bucleWhile()
        //bucleDoWhile()
        //controlDeErrores()

    }
    //region EmpezandoAProgramar
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

    private fun funciones(){
        funcionSimple()
        funcionParametros("Antonio",20)

        val calculaEdad:Int = funcionRetorno(2003)
        Log.d(TAG,"My age is $calculaEdad")
    }

    private fun funcionSimple(){
        Log.d(TAG,"Antonio")
        Log.d(TAG,20.toString())
    }

    private fun funcionParametros(name:String,age:Int){
        Log.d(TAG,"My name is $name")
        Log.d(TAG,"My age is $age")
    }

    private fun funcionRetorno(birthYear: Int): Int {
        return Calendar.getInstance().get(Calendar.YEAR) - birthYear

    }

    private fun clases(){
        val antonioData = PersonData("Antonio",20)
        val antonio = Persona(antonioData)
        val rodrigoData = PersonData("Rodrigo",26)
        val rodrigo = Persona(rodrigoData)
        antonio.presentacion()
        rodrigo.presentacion()
    }

    class Persona(private val data:PersonData){
        fun presentacion(){
            Log.d(TAG,"My name is ${data.name} and my age is ${data.age}")
        }
    }

    data class PersonData(
        val name:String?,
        val age:Int
    )

    private fun interfaces(){
        val antonioData = PersonData("Antonio",20)
        val antonio = SegundaPersona(antonioData)
        val edad = antonio.returnAge(2003)
        Log.d(TAG,"My age is $edad")
    }
    class SegundaPersona(private val data:PersonData):PersonInterface{
        fun presentacion(){
            Log.d(TAG,"My name is ${data.name} and my age is ${data.age}")
        }

        override fun returnAge(birthYear: Int): Int = 2024 - data.age
    }

    interface PersonInterface{
        fun returnAge(birthYear: Int): Int
    }
    //endregion

    //region EstructurasDeControl
    private fun condicionalesIf() {
        val firstNumber = 10
        val secondNumber = 5
        val booleanValue = false

        if (firstNumber < secondNumber) {
            Log.d(TAG, "Primera opcion")

            if (secondNumber == 4) {
            } else {
            }
        } else if (booleanValue) {
            Log.d(TAG, "Segunda opcion")
        } else if (booleanValue) {
            Log.d(TAG, "Segunda opcion")
        } else if (booleanValue) {
            Log.d(TAG, "Segunda opcion")
        } else {
            Log.d(TAG, "Tercera opcion")
        }

        val edad: Int = if (!booleanValue) {
            17
        } else {
            26
        }

        Log.d(TAG, edad.toString())
    }

    private fun condicionalesWhen() {
//        val language = "Scala"
//
//        when (language) {
//            "Kotlin", "Scala" -> {
//                Log.d(TAG, "Se ha seleccionado Kotlin")
//            }
//            "Java" -> Log.d(TAG, "Se ha seleccionado Java")
//            "Python" -> Log.d(TAG, "Se ha seleccionado Python")
//            "Ruby" -> Log.d(TAG, "Se ha seleccionado Ruby")
//            else -> Log.d(TAG, "Se ha seleccionado otro lenguaje")
//        }

        val myNumber = 94
        when (myNumber) {
            in 0..10 -> {
                Log.d(TAG, "Se ha seleccionado Kotlin")
            }
            40 -> {
                Log.d(TAG, "Se ha seleccionado Java")
            }
            in 80..119 -> {
                Log.d(TAG, "Se ha seleccionado Python")
            }
            120 -> {
                Log.d(TAG, "Se ha seleccionado Ruby")
            }
            else -> Log.d(TAG, "Se ha seleccionado otro lenguaje")
        }
    }

    private fun listados() {
        val myList = listOf("Rodrigo", "Raquel", "David", "Lorena", "Allison")
        val myArrayList = arrayListOf("Rodrigo", "Raquel", "David", "Lorena", "Allison")

        val listItem = myList[2]

        myArrayList[2] = "Sandra"
        val arrayListItem = myArrayList[2]

        myArrayList.removeAt(3)

        Log.d(TAG, myArrayList.toString())
    }

    private fun bucleFor() {
        val myArrayList = arrayListOf("Rodrigo", "Raquel", "David", "Lorena", "Allison")

//        for (persona in myArrayList) {
//            Log.d(TAG, persona)
//        }

//        for (position in 0 until 5) {
//            Log.d(TAG, position.toString())
//        }

//        for (position in 0..10 step 3) {
//            Log.d(TAG, position.toString())
//        }

        for (position in 10 downTo 3 step 2) {
            Log.d(TAG, position.toString())
        }
    }

    private fun bucleWhile() {
        var myNumber = 0

        while (myNumber <= 10) {
            Log.d(TAG, myNumber.toString())
            myNumber += 3
        }
    }

    private fun bucleDoWhile() {
        var myNumber = 1

        do {
            Log.d(TAG, myNumber.toString())
            myNumber++
        } while (myNumber <= 10)
    }

    private fun controlDeErrores() {
        val myArrayList = arrayListOf(1, 2, 3, 4, 5)
        val myString: String = "Hola"

        try {
            for (position in 0..myArrayList.size) {
                Log.d(TAG, myString)
            }
        } catch (exception: Exception) {
            exception.printStackTrace()
            Log.d(TAG, "Catch")
        } finally {
            Log.d(TAG, "Finally")
        }
    }
    //endregion

}