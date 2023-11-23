package Clases
import kotlin.concurrent.schedule
import java.util.*

class Mario(var vidas: Int = 3) {  
    init {
        println("It's a me! Mario!")
    }
    private var state = "small"
        set(value){
            val before = field
            field = value
            println("Tu estado ahora es $field")
            if(value=="Star"){
                Timer("SettingUp", false).schedule(10000){
                    field = before
                    println("tu estado ahora es $field")
                }
            }
        }
    private var lives = 3
        set(value){
            if(field == 1){
                field = 0
                gameOver()
            }
            else if (field == 0){
                println("Necesitas volver a jugar")
            }
            else{
                field = value
            }
        }
    val isAlive: Boolean
        get(){
            return lives >=1
        }
    }
    fun collision(collisionObj: String){
        when (collisionObj){
            "Goomba" -> lives--
            "Super Mushroom" -> state = "Super Mario"
            "Fire flower" -> state = "Fire Mario"
            "Star" -> state = "Star"

            else -> println("Objeto desconocido, ¡No pasa nada!")
        }
    }
    fun getLives(): String{
        return "$lives vidas"
    }
    private fun gameOver(){
        println("Juego Terminado")
    }
}
