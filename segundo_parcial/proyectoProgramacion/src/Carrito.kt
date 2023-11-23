class Carrito{
    //Creamos nuestra lista
    private val listaProductos = mutableListOf<Producto>()
    //Cupon
    private var cupon: String?=null
    //Agregar Productos
    fun agregarProducto(producto: Producto){
        listaProductos.add(producto)
    }
    fun aplicarCupon (cuponObtenido:String){
        cupon=cuponObtenido
    }
    fun calcularPrecio(): Double{
        var total = 0.00
        for(producto in listaProductos){
            val productoIva = aplicarDescuento(producto,cupon)
            total+=productoIva
        }
        return total
    }

    fun  aplicarDescuento(producto: Producto,cuponObtenido: String?): Double {

        if(cuponObtenido == null){
            return producto.precio *1.16
        }

        when (cuponObtenido){

            "PROMO2020" ->{
                return  when{
                    producto.precio in 0.00..100.00 ->{
                        producto.precio*1.12
                    }
                    producto.precio in 1000.00..2000.00 ->{
                        producto.precio*1.04
                    }
                    producto.precio in 2000.00..4000.00 ->{
                        producto.precio*1.02
                    }
                    producto.precio > 4000.00 ->{
                        (producto.precio * 2 )/3
                    }
                    else -> producto.precio
                }
            }

            "NOIVA"->{
                return producto.precio/1.16
            }
            "MINUS100"->{
                return (producto.precio*1.16)-100.00
            }
            "HALFIVA"->{
                return  producto.precio*1.08
            }

            else -> return producto.precio*1.16
        }

    }
}