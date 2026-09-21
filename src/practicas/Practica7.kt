package practicas

fun main() {
    println("Introduce la primera nota: ")
    val nota1: Float = (readln() ?: "0").toFloat()

    println("Introduce la segunda nota: ")
    val nota2: Float = (readln() ?: "0").toFloat()

    println("Introduce la tercera nota: ")
    val nota3: Float = (readln() ?: "0").toFloat()

    println("Introduce la cuarta nota: ")
    val nota4: Float = (readln() ?: "0").toFloat()

    val media = (nota1 + nota2 + nota3 + nota4) / 4
    val mediafinal: Any = when {
        media >= 7 -> "Notable"
        media >= 5 && media < 7 -> "Aprobado"
        media < 5 -> {
            print("¿Se ha presentado a recuperación? (S/N)")
            val respuesta : String? = readln()?.uppercase()

            when (respuesta) {
                "S" -> "En recuperación"
                "N" -> "Suspenso"
                else -> "Respuesta no esperada"
            }
        }
        else -> "Nota no esperada"
    }
    println("El alumno tiene: $mediafinal")
}