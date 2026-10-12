fun main() {
    val numeros = listOf(12, 7, 4, 9, 15, 20, 3, 8, 11, 6)

    var suma = 0
    var pares = 0
    var impares = 0

    for (numero in numeros) {
        suma += numero

        if (numero % 2 == 0) {
            pares++
        } else {
            impares++
        }
    }

    val promedio = suma.toDouble() / numeros.size

    println("Lista: $numeros")
    println("Suma: $suma")
    println("Promedio: %.2f".format(promedio))
    println("Número mayor: ${numeros.maxOrNull()}")
    println("Número menor: ${numeros.minOrNull()}")
    println("Cantidad de pares: $pares")
    println("Cantidad de impares: $impares")
}
