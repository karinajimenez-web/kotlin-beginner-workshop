class Product(
    val nombre: String,
    val precio: Double,
    var cantidadDisponible: Int
) {
    fun calcularValorInventario(): Double {
        return precio * cantidadDisponible
    }

    fun mostrarInformacion() {
        println("Producto: $nombre")
        println("Precio unitario: $%.2f".format(precio))
        println("Cantidad disponible: $cantidadDisponible")
        println("Valor total del inventario: $%.2f".format(calcularValorInventario()))
        println("------------------------------")
    }
}

fun main() {
    val productos = listOf(
        Product("Teclado", 65000.0, 8),
        Product("Mouse", 35000.0, 12),
        Product("Audífonos", 90000.0, 5)
    )

    for (producto in productos) {
        producto.mostrarInformacion()
    }
}
