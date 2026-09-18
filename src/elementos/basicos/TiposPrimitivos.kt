package elementos.basicos

// 1. Tipos enteros
val level: Byte = 50
val health: Short = 150
val missionPoints: Int = 40000
val experience: Long = 45121365412
val monstersExecuted = 9990001522L // La 'L' especifica al tipo Long

//Literales Constantes Para Binarios Y Hexadecimales
fun main() {
    val bitmapLocation = 0b00100001
    val chestColor = 0xCCC
    println(bitmapLocation)
    println(chestColor)
}
// Números Reales
val attackSpeed: Float = 0.5f
val dodgeChance: Double = 0.2

//Literales Constantes Para Números Reales
/*
fun main() {
    // Literales reales
    val exp1 = 3.211e2
    val exp2 = .0001e10
    val exp3 = 48e5
    val exp4 = 10e-4

    println(exp1)
    println(exp2)
    println(exp3)
    println(exp4)
}
*/

/*
//Caracteres
fun main() {
    val response: Char = 'Y'
    println(response)
}
*/

/*
//Caracteres de escape
fun main() {
    print("Uno\nDos\nTres")
}
*/

/*
// Boolean
 val globalMapEnable: Boolean = true
*/
