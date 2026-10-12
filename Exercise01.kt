fun main() {
    val numero1 = 12.0
    val numero2 = 4.0
    val operacion = "/" // Cambia por "+", "-", "*" o "/"

    val resultado = when (operacion) {

        "+" -> numero1 + numero2
        "-" -> numero1 - numero2
        "*" -> numero1 * numero2
        "/" -> {
            if (numero2 != 0.0) {
                numero1 / numero2
            } else {
                println("Error: no se puede dividir entre cero.")
                return
            }
        } else -> {
                println("Operación no válida.")
                return
        }
    }
    println("$numero1 $operacion $numero2 = $resultado")
}
