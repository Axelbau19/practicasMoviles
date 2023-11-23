package Clases

class vehiculo(val marca:String,  val modelo:String,  val color:String = "Negro"){
    init {
        println("""Los datos del coche son:
            marca: $marca
            modelo: $modelo
            color: $color""")
    }
    constructor( marca:String,  modelo:String,  color:String, placas:String): this(marca,modelo,color){
        this.placas=placas
        println("Las placas son: ${this.placas}")

    }
    var placas =""
    var gasolina=0f
    var encendido=false


    fun VturnOn(){
        encendido = true
    }
    fun VturnOff(){
        encendido = false
    }

    fun recargar (litros:Float){
        gasolina += litros
    }


}