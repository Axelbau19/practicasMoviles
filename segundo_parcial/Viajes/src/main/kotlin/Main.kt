//Bautista Rosales Alexis Axel 6NM60
import Clases.*

fun main() {
    val vehicleInstance = Vehicle.create()
    var saludos={ println("Saludos Upiicsa")}()
    val suma = {a: Int, b:Int -> a+b}
    println(suma(4,6))
    val presentarse: (String,Int) -> String = {name, age -> "Me llamo $name y tengo $age" }
    println(presentarse("Daniel", 21))

    val saverGrade: (Double,Double) -> String ={ expected:Double, saved:Double ->
        val percentage = saved / expected
        when{
            percentage > 1 -> "Ahorra pro"
            percentage ==1.0 -> "Buen ahorrador"
            percentage < 1.0 && percentage >= 0.8 -> "Almost"
            else -> "Aprendiz saver"
        }
    }
    println(saverGrade(150.0,100.0))

    val saverGrade2 = fun(expected:Double,saved:Double) :String {
        val percentage = saved / expected
        return when{
            percentage > 1 -> "Ahorra pro"
            percentage ==1.0 -> "Buen ahorrador"
            percentage < 1.0 && percentage >= 0.8 -> "Almost"
            else -> "Aprendiz saver"
        }
    }
    println(saverGrade2(150.0,100.0))
}