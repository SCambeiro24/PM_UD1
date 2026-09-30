package practicas

class Libro(val titulo: String, val autor: String, val anioPublicacion: Int) {

    operator fun component1() = titulo
    operator fun component2() = autor
    operator fun component3() = anioPublicacion
}

fun main(){
    val libro = Libro("Cien años de soledad", "Gabriel García Márquez", 1967)

    val (titulo, autor, anio) = libro

    println("Libro: $titulo Autor: $autor Año: $anio")
}