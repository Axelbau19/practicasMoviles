package Clases

class Phone {
    var isOn = false
    lateinit var model: String

    fun turnOn(){
        isOn = true
    }
    fun turnOff(){
        isOn = false
    }

    fun getTurn() {
        val turnMode = if (isOn) "Encendido" else "Apagado"
        println("El telefono esta $turnMode")
    }

}