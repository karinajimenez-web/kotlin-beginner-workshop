fun isPrime(number: Int): Boolean {
    if (number < 2) return false

    var divisor = 2
    while (divisor * divisor <= number) {
        if (number % divisor == 0) return false
        divisor++
    }
    return true
}

fun factorial(number: Int): Long {
    require(number >= 0) { "El número debe ser no negativo." }

    var resultado = 1L
    for (i in 2..number) {
        resultado *= i.toLong()
    }
    return resultado
}

fun isEven(number: Int): Boolean {
    return number % 2 == 0
}

fun main() {
    val numero = 5

    println("¿$numero es primo?: ${isPrime(numero)}")
    println("Factorial de $numero: ${factorial(numero)}")
    println("¿$numero es par?: ${isEven(numero)}")
}
