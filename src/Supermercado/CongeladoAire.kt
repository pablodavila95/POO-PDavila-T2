package Supermercado

class CongeladoAire(aire:Boolean, temperatura:String, caducidad:String, numLote:Int, nombre:String):Congelado(temperatura, caducidad, numLote, nombre) {
    var aire:Boolean
        private set
    init{
        this.aire = true
    }

    fun isAire(): Boolean {
        return aire
    }
}