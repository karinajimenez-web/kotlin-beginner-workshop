fun main() {
    val nombre = "Laura"
    val nota1 = 4.2
    val nota2 = 3.8
    val nota3 = 4.6

    if (nota1 !in 0.0..5.0 || nota2 !in 0.0..5.0 || nota3 !in 0.0..5.0) {
        println("Error: las calificaciones deben estar entre 0.0 y 5.0.")
        return
    }

    val promedio = (nota1 + nota2 + nota3) / 3.0

    println("Estudiante: $nombre")
    println("Promedio: %.2f".format(promedio))

    if (promedio >= 3.0) {
        println("Estado: aprobado")
    } else {
        println("Estado: reprobado")
    }

    if (promedio >= 4.5) {
        println("¡Obtuvo un promedio excelente!")
    }
}
