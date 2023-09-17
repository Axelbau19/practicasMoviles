import kotlin.math.PI

/*Bautista Rosales Alexis Axel 6NM61*/
const val pi = PI
fun main(){
    /*Para un número decimal, ¿Qué tipo de dato se asigna por defecto? Imprimirlo */
    val valor1 = 1.32
    println(valor1::class.simpleName)

    /*Volver flotante a la variable decimal */
    val valorFloat = valor1.toFloat()
    println(valorFloat::class.simpleName)

    /*Declarar una variable const val con el valor de PI y multiplicarla por 2 veces nuestra variable decimal para sacar el perímetro de un círculo.
    Para multiplicar adelantaremos el uso del operador de multiplicación * y su uso es así: */
    val perimetro= 2 * pi
    println("El perímetro del círculo es:$perimetro")
}