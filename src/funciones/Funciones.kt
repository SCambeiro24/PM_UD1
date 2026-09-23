package funciones

// Sintaxis de declaración
/*
fun nombreFuncion(parametro: Tipo): TipoRetorno {
    // cuerpo
    return valor
}
*/
//Ejemplo
/*
    fun square(x: Int): Int {
        return x * x
    }
*/
// Llamar una función
/*
fun square(x: Int): Int {
    return x * x
}

fun main() {
    print(square(7))  // Salida: 4
}
*/
// Funciones con cuerpo de expresión
/*
fun model(x: Int, y: Int, z: Int) = 3 * x - 2 * y + z * z

fun main() {
    println("f(1,0,5)= ${model(1, 0, 5)}")
}
// Salida: f(1,0,5)= 28
*/
// Retorno tipo Unit
/*
fun isVowel(c: Char): Unit {
    when (c) {
        'a', 'e', 'i', 'o', 'u' -> println("$c es una vocal")
        else -> println("$c no es una vocal")
    }
}

// Unit omitido (equivalente)
fun isVowel(c: Char) {
    when (c) {
        'a', 'e', 'i', 'o', 'u' -> println("$c es una vocal")
        else -> println("$c no es una vocal")
    }
}

fun main() {
    isVowel('v')
}
// Salida: v no es una vocal
*/