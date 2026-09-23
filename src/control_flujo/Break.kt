package control_flujo
/*
fun main() {
    while (true) {
        print("Escribe una palabra:")
        val word = readln()!!
        if (word == "salir") break
        println("Caracteres:${word.length}")
    }
}
*/
/*
fun main() {
    val matrix = arrayOf(
        intArrayOf(1, 1, 1),
        intArrayOf(0, 1, 0),
        intArrayOf(1, 1, 0),
    )
    for (row in matrix.indices) {
        for (col in matrix[row].indices) {
            if (matrix[row][col] == 0) {
                println("Matriz inválida en [$col,$row]")
                break  // Solo sale del bucle de columnas (el más interno)
            }
        }
    }
}
// Salida:
// Matriz inválida en [0,1]
// Matriz inválida en [2,2]
*/

// break etiquetado
fun main() {
    val matrix = arrayOf(
        intArrayOf(1, 1, 1),
        intArrayOf(0, 1, 0),
        intArrayOf(1, 1, 0),
    )
    Loop@ for (row in matrix.indices) {
        for (col in matrix[row].indices) {
            if (matrix[row][col] == 0) {
                println("Matriz inválida en [$col,$row]")
                break@Loop  // Sale del bucle de filas (Loop)
            }
        }
    }
}
// Salida: Matriz inválida en [0,1]