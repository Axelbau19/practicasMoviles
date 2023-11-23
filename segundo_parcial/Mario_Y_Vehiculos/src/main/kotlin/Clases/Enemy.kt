package Clases

open class Enemy (val name: String, val strength:Int){
    init {
        println("Iniciando superclase")
    }
    protected var direction: String = "Left"
    protected fun changeDirection(){
        direction = if (direction=="Right") "Left" else "Right"
        println("$name va en dirección $direction")
    }
    protected fun die(){
        println("$name ha muerto")
    }
    open fun collision(collider: String){
        when (collider){
            "Weapon" -> die()
            "Enemy" -> changeDirection()
        }
    }
}