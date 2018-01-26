package Supermercado

class Fresco(frescura:String, caducidad:String, numLote:Int, nombre:String):Producto(caducidad, numLote, nombre) {
    var nivelFrescura:String
        private set
    init{
        this.nivelFrescura = frescura
    }
}