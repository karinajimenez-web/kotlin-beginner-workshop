fun main() {
    val numero = 7
    var suma = 0

    println("Tabla de multiplicar del $numero:")

    for (i in 1..10) {
        val resultado = numero * i
        println("$numero x $i = $resultado")
        suma += resultado
    }

    println("Suma de todos los resultados: $suma")
}
