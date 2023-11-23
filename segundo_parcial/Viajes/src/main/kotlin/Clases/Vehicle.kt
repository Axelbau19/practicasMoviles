package Clases

class Vehicle {
    init {
        println("Vehiculo creado")
    }
    companion object Factory {
        fun create(): Vehicle = Vehicle()
    }
}