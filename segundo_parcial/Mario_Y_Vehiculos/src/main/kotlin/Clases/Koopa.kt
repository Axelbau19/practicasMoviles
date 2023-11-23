package Clases

import Clases.Enemy

class Koopa:
    Enemy("Koopa", 2){
    override fun collision(collider: String) {
        when(collider){
            "Weapon" -> {
                var state = "Shell"
                println("El estado ahora es $state")
            }
            "Enemy" -> changeDirection()
        }
        println("Usando la colisión de la clase Enemy")
        }
}