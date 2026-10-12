fun saludarUsuario(nombreUsuario: String?): String {
    return if (!nombreUsuario.isNullOrBlank()) {
        "¡Hola, $nombreUsuario! Bienvenido/a."
    } else {
        "¡Hola! Bienvenido/a."
    }
}

fun main() {
    val usuario1: String? = "Laura"
    val usuario2: String? = null
    val usuario3: String? = ""
    val usuario4: String? = "   "

    println(saludarUsuario(usuario1))
    println(saludarUsuario(usuario2))
    println(saludarUsuario(usuario3))
    println(saludarUsuario(usuario4))
}
