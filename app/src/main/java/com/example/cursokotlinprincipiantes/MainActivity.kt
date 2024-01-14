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
        //variablesYConstantes()
        //tiposDeDatos()
        //operadores()
        //nullSafety()
        //funciones()
        //clases()
        interfaces()
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

    /**
     * 1.- Crear una clase Programador
     * 2.- Crear una interfaz llamada ProgramadorInterface
     * 3.- Crear una clase de datos llamada ProgrammerData
     *
     * REGLAS:
     * 1.- La clase de datos debe incluir tres constantes llamadas name, age y language
     * 2.- La clase interfaz debe tener un método llamado getProgrammerData(), que devolverá un objeto de tipo ProgrammerData
     * 3.- La clase Programador debe implementar la interfaz y se debe:
     *      - Crear tres funciones privadas que se encarguen de devolver un nombre, edad y lenguaje de programación respectivamente a vuestra elección
     *      - La función getProgrammerData debe devolver un objeto de tipo ProgrammerData con los datos de las tres funciones privadas creadas anteriormente
     * 4- Si cunado llamemos a la clase, solo podemos acceder al método getProgrammerData, es que lo hemos hecho bien
     */

}