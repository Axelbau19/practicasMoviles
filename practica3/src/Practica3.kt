//Bautista Rosales Alexis Axel 6NM61
//Para guardar solo los atributos
data class Punto (val x : Double , val y:Double)

fun obtenerPendiente(punto1:Punto, punto2: Punto): Double {
return (punto2.y - punto1.y)/(punto2.x - punto1.x)
}

fun main(){
    val P1 = Punto(4.0,3.0)
    val P2 = Punto(-3.0,-2.0)
    val pendiente= obtenerPendiente(P1,P2)
    print("El valor de la pediente: $pendiente")

}
