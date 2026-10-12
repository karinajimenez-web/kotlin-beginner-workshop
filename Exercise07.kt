data class Contact(
    val nombre: String,
    val telefono: String,
    val correo: String
)

fun agregarContacto(contactos: MutableList<Contact>, contacto: Contact) {
    contactos.add(contacto)
    println("Contacto agregado: ${contacto.nombre}")
}

fun listarContactos(contactos: List<Contact>) {
    if (contactos.isEmpty()) {
        println("La agenda está vacía.")
        return
    }

    println("Lista de contactos:")
    for (contacto in contactos) {
        println("${contacto.nombre} | ${contacto.telefono} | ${contacto.correo}")
    }
}

fun buscarContacto(contactos: List<Contact>, nombre: String) {
    val contacto = contactos.find { it.nombre.equals(nombre, ignoreCase = true) }

    if (contacto != null) {
        println("Contacto encontrado: ${contacto.nombre}, ${contacto.telefono}, ${contacto.correo}")
    } else {
        println("No existe un contacto con el nombre $nombre.")
    }
}

fun eliminarContacto(contactos: MutableList<Contact>, nombre: String) {
    val eliminado = contactos.removeAll { it.nombre.equals(nombre, ignoreCase = true) }

    if (eliminado) {
        println("Contacto eliminado: $nombre")
    } else {
        println("No existe un contacto con el nombre $nombre.")
    }
}

fun main() {
    val contactos = mutableListOf(
        Contact("Ana", "3001112233", "ana@email.com"),
        Contact("Carlos", "3002223344", "carlos@email.com"),
        Contact("Diana", "3003334455", "diana@email.com"),
        Contact("Mateo", "3004445566", "mateo@email.com"),
        Contact("Sofía", "3005556677", "sofia@email.com")
    )

    listarContactos(contactos)
    println()

    agregarContacto(contactos, Contact("Andrés", "3006667788", "andres@email.com"))
    buscarContacto(contactos, "Diana")
    eliminarContacto(contactos, "Carlos")
    eliminarContacto(contactos, "Pedro")
    println()
    listarContactos(contactos)
}
