package Supermercado

open class Producto {
    var nombre:String
        protected set
    var caducidad:String
        protected set
    var numLot:Int = 0
        protected set

    constructor(caducidad:String, numLote:Int, nombre:String) {
        this.caducidad = caducidad
        this.numLot = numLote
        this.nombre = nombre

    }
}