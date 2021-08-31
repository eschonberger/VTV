package com.example.testing

class Vehiculo {

    var anio: Int =0


    //Para Setear Valores del atributo ano
    set (value){
        if (value<2018) {
            field = value
        } else mensaje()

    }

    //para Obtener Valores
    var marca: String =""

    get(){
        return field.toUpperCase()
       }


    fun mensaje() {
        print ("Debe Abonar")
    }

    var modelo : String = ""

    var patente : String = ""

    var cantEjes : Int = 0

    var kmActual : Int =0

    var domicilioRadicacion: String = ""



}

fun controlarVelocidad(){

}
