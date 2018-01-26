package Supermercado

import java.util.*


fun main(args:Array<String>) {

    val pera = Fresco("Medio Fresco", "20 de abril", 1120304, "pera")

    println("Frescura: " + pera.nivelFrescura)
    println("Caducidad: " + pera.caducidad)
    println("Lote: " + pera.numLot)
    println("")


    val jamon = Refrigerado(Date().toString(), "20 de Enero", 312312, "Jamon")

    println("El producto es " + jamon.nombre)
    println("El producto fue guardado el" + jamon.tiempoRefrigeracion)
    println("Se caduca el " + jamon.caducidad)
    println("El numero de lote es " + jamon.numLot)

    val sabalito = CongeladoAgua(true, "-15C", Date().toString(), 1343, "Sabalito")
    
    //Prueba
    val isAgua = sabalito.isAgua()
    if (isAgua) {
        println("Esta congelado en agua")
    }



        }
