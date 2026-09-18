package practicas

fun main(){
    print("Cual es tu nombre?")
    val nombre = readln()
    print("Cual es tu edad?")
    val edadInput = readln() ?: "0"
    val edad = edadInput.toInt()

    val edadfut = edad + 5
    println("Hola $nombre , tienes $edad años y en 5 años tendras: $edadfut")
}