package Supermercado

open class Congelado:Producto {
    var temperatura:String protected set

    constructor(temperatura:String, caducidad:String, numLote:Int, nombre:String) : super(caducidad, numLote, nombre) {
        this.temperatura = temperatura
    }
}