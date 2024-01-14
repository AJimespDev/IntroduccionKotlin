package com.example.cursokotlinprincipiantes

class RetoFunciones {
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
     * 4- Si cuando llamemos a la clase, solo podemos acceder al método getProgrammerData, es que lo hemos hecho bien
     */
    private fun retoFunciones(){
        val programador = Programador()
        programador.getProgrammerData()
    }

    class Programador():ProgramadorInterface{
        private fun getName():String{
            return "Antonio"
        }
        private fun getAge():Int{
            return 20
        }
        private fun getLanguage():String{
            return "Kotlin"
        }
        override fun getProgrammerData(): ProgrammerData {
            return ProgrammerData(getName(),getAge(),getLanguage())
        }

    }


    interface ProgramadorInterface{
        fun getProgrammerData():ProgrammerData

    }
    data class ProgrammerData(
        val name:String,
        val age:Int,
        val language: String
    )
}