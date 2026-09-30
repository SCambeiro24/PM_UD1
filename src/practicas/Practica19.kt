package practicas

class Novela(val titulo: String, val autor: String, val anioPublicacion: Int) {

    operator fun component1() = titulo
    operator fun component2() = autor
    operator fun component3() = anioPublicacion
}

fun main() {
    // Crear una lista de novelas
    val biblioteca = listOf(
        Novela("1984", "George Orwell", 1949),
        Novela("Orgullo y prejuicio", "Jane Austen", 1813),
        Novela("La sombra del viento", "Carlos Ruiz Zafón", 2001)
    )

    for ((titulo, autor, anio) in biblioteca) {
        println("La novela $titulo del autor $autor fue publicada en el año $anio")
    }

    biblioteca.forEach { (titulo, _, anio) ->
        println("La novela $titulo fue publicada en el año $anio")
    }
}