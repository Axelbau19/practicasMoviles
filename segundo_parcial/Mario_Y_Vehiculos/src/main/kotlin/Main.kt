//Bautista Rosales Alexis Axel 6NM60
import Clases.*


fun main() {
    val myPhone = Phone()
    myPhone.getTurn()
    myPhone.turnOn()
    myPhone.turnOff()

    val myCoche = vehiculo(marca="Ford",modelo="Focus",color="verde")


    var Mario = Mario()
    Mario.collision("star")

    val enemy = Goomba()
    enemy.collision("Enemy")
    enemy.collision("Weapon")
    val koopa = Koopa()
    koopa.collision("Weapon")


    myCoche.placas="REM-4123"
    println("El coche esta prendido? ${myCoche.encendido}")
    myCoche.VturnOn()
    println("El coche esta prendido? ${myCoche.encendido}")
    println("El tanque tiene ${myCoche.gasolina}")
    myCoche.recargar(20.07f)
    println("El tanque tiene ${myCoche.gasolina}")
    println("El tanque ahora tiene ${myCoche.gasolina}")
    val golNegro = vehiculo("Volkswagen", "Gol")
    val sonicAzul = vehiculo(
        marca = "Ford",
        modelo = "Sonic",
        color = "Azul",
        placas = "ALS9763"
    )
    println(golNegro)
    println(sonicAzul)
}