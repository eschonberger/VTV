package com.example.testing
import java.util.*

class Persona {
    var nombre: String = ""
    set(value) {
        if (value != "bin laden") {
            field = value

        }  else
            //Invoco el metodo y le paso el argumento
            llamarFbi(value)

        }

    var apellido: String = ""
    var dni: Int = 0
    var mail: String = ""
    //var fechaNacimiento: Date = TODO()
    var domicilio: String = ""
    var discapacitado: Boolean = false
    var estadojubilado: Boolean = false
}
    fun getJubilacion() {
    }

    fun getDiscapacidad() {
    }

fun llamarFbi(nom:String):Unit{
    println(nom + " Usted esta siendo buscado. Bajese del Auto")
}