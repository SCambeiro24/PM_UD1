package practicas

fun main(){
    print("Introduce una cadena: ")
    val cadena = readln()

    print("Introduce una posición: ")
    val posicion = readln().toInt()

    val longitud = cadena.length

    if (posicion<0 || posicion > longitud){
        println("La posicion esta fuera de la cadena")
    }else{
        val caracter = cadena[posicion]
        println("Caracter: $caracter")
    }

    if (posicion > 0){
        val caracterAnterior = cadena[posicion - 1]
        println("Caracter anterior: $caracterAnterior ")
    }else{
        println("El caracter anterior mo existe")
    }

    if (posicion < longitud -1){
        val caracterPosterior = cadena[posicion + 1]
        println("Caracter posterior: $caracterPosterior")
    }else{
        println("El caracter posterior mo existe")
    }
}