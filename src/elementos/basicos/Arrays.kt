package elementos.basicos

//ARRAY VACIO
/*
fun main() {
    var tags = emptyArray<String>()
    println("Tamaño inicial: ${tags.size}")

    tags = arrayOf("kotlin", "android", "dam")
    println("Tamaño tras asignar: ${tags.size}")
}
*/
//ARRAY NULL
/*
fun main() {
    val colors = arrayOfNulls<String>(3)
    println(colors.contentToString())

    colors[0] = "Rojo"
    colors[1] = "Verde"
    colors[2] = "Azul"
    println(colors.contentToString())
}
*/
//CONSTRUCTOR ARRAY
/*
fun main() {
    val negativeNumbers = Array(10) { -(it + 1) }
    println(negativeNumbers.joinToString())
}
*/
// val notas = DoubleArray(5)   // [0.0, 0.0, 0.0, 0.0, 0.0]
//val cuadrados = IntArray(5) { it * it }    // [0, 1, 4, 9, 16]

//Acceso a elementos
/*
fun main() {
    val planets = arrayOfNulls<String>(8)
    planets[0] = "Mercurio"
    planets[1] = "Venus"
    planets[2] = "Tierra"
    planets[3] = "Júpiter"
    planets[4] = "Saturno"
    planets[5] = "Urano"
    planets[6] = "Neptuno"
    planets[7] = "Plutón"
    println(planets.contentToString())
}
*/
//Recorrer Arrays
/*
fun main() {
    val planets = arrayOfNulls<String>(8)
    planets[0] = "Mercurio"
    planets[1] = "Venus"
    planets[2] = "Tierra"
    planets[3] = "Júpiter"
    planets[4] = "Saturno"
    planets[5] = "Urano"
    planets[6] = "Neptuno"
    planets[7] = "Plutón"

    for (i in planets.indices) {
        println("${planets[i]} está en la posición ${i + 1}")
    }
}
*/
//