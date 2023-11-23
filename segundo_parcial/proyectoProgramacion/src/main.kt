
object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val carrito1 = Carrito()
        val carrito2 = Carrito()


        val producto1= Producto("Leche",18.50)
        val producto2= Producto("Huevos",25.00)
        val producto3 = Producto("Chamarra gucci", 1000.0)
        val producto4 = Producto("Lentes gucci",1500.0)
        carrito1.agregarProducto(producto1)
        carrito1.agregarProducto(producto2)
        carrito1.aplicarCupon("NOIVA")
        carrito2.agregarProducto(producto3)
        carrito2.agregarProducto(producto4)
        //carrito2.aplicarCupon("PROMO2020")
        carrito2.aplicarCupon("MINUS100")
        val totalPagar1= carrito1.calcularPrecio()
        val totalPagar2 = carrito2.calcularPrecio()
        println(totalPagar1)
        println(totalPagar2)
    }
}