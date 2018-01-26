package Supermercado

class Refrigerado(tiemporefrigeracion:String, caducidad:String, numLote:Int, nombre:String):Producto(caducidad, numLote, nombre) {
    var tiempoRefrigeracion:String
        protected set
    init{
        this.tiempoRefrigeracion = tiemporefrigeracion
    }
}