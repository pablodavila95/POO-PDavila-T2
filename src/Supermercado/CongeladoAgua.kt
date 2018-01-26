package Supermercado

class CongeladoAgua(agua:Boolean, temperatura:String, caducidad:String, numLote:Int, nombre:String):Congelado(temperatura, caducidad, numLote, nombre) {
    var agua:Boolean
        private set
    init{
        this.agua = true
    }


    //Probando funciones en las clases
    fun isAgua(): Boolean {
        return agua
    }
}