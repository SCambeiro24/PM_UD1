package practicas

fun obtenerCoordenadas(): Pair<Double, Double> {
    return Pair(12.5, 8.3)
}

fun obtenerColorRGB(): Triple<Int, Int, Int> {
    return Triple(120, 200, 150)
}

fun main() {
    val (x, y) = obtenerCoordenadas()
    println("La coordenada tiene x = $x, y = $y")

    val (r, g, b) = obtenerColorRGB()
    println("Color RGB: r=$r, g=$g, b=$b")
}