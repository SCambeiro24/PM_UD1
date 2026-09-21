package control_flujo

// If como sentencia
/*
fun main (){
        val level = 12
        if (level >= 45) {
            println("Aprendiste Acrobacia")
        } else {
            println("Se requiere nivel 45. Nivel actual $level")
        }
// Salida: Se requiere nivel 45. Nivel actual 12
}
*//*
fun main() {
    val level = 8
    val hasStaff = false
    if (level >= 10 && hasStaff) {
        println("Puedes lanzar el hechizo")
    } else if (level >= 10 || hasStaff) {
        println("Casi lo consigues")
    } else if (!hasStaff) {
        println("Te falta el báculo")
    }
}
// Salida: Puedes lanzar el hechizo
*/
/*
// If como expresión
fun main() {
    val enemyHeroHealth = 15
    val cardAttack: Int
    if (enemyHeroHealth <= 15) {
        cardAttack = 9
    } else {
        cardAttack = 6
    }
    println("Ataque:$cardAttack")
}
*//*
// If y else en expresión
fun main() {
    val level = 40
    if (level >= 45) {   // como sentencia, no exige 'else'
        println("Aprendiste Acrobacia")
    }
    println("Fin")
}
*/
/*
fun main() {
    val enemyHeroHealth = 14
    val cardAttack = if (enemyHeroHealth <= 15) {
        println("Grrrrrrrr!!")
        9
    } else {
        println("...")
        6
    }
    println("Ataque:$cardAttack")
}
*/
// Smart Cast dentro de un if
/*
    fun describir(x: Any) {
        if (x is String) {
            // Aquí 'x' ya se trata como String, sin cast explícito
            println("Es un String de longitud ${x.length}")
        } else {
            println("No es un String")
        }
    }

fun main() {
    describir("Hola")
    describir(123)
}
*/

fun clasificarAnidado(nota: Int) {
    if (nota >= 9) {
        println("Sobresaliente")
    } else {
        if (nota >= 7) {
            println("Notable")
        } else {
            println("Aprobado o menos")
        }
    }
}

// else if encadenado (preferible)
fun clasificarEncadenado(nota: Int) {
    if (nota >= 9) {
        println("Sobresaliente")
    } else if (nota >= 7) {
        println("Notable")
    } else {
        println("Aprobado o menos")
    }
}
fun main() {
    clasificarAnidado(8)
    clasificarEncadenado(10)
}