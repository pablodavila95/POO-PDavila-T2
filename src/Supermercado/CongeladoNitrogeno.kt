package Supermercado

class CongeladoNitrogeno(nitro:Boolean, temperatura:String, caducidad:String, numLote:Int, nombre:String):Congelado(temperatura, caducidad, numLote, nombre) {
    var nitro:Boolean
        private set
    init{
        this.nitro = true
    }

    fun isNitro() : Boolean {
        return nitro
    }
}