package practicas

fun main(){

    val notas =  DoubleArray(5)

    println("Introduce 5 notas: ")
    for (i in 0 until notas.size){
        print("Nota: $(i +1)")
        notas[i] = (readLine() ?:"0.0").toDouble()
    }

    var suma = 0.0
    for (i in 0 until notas.size) {
        suma += notas[i]
    }
    val promedio = suma / notas.size

    var notaMaxima = notas[0]
    for (i in 1 until notas.size) {
        if (notas[i] > notaMaxima) {
            notaMaxima = notas[i]
        }
    }

    println("Notas introducidas: ")
    for (i in 0 until notas.size) {
        println("Nota ${i + 1}: ${notas[i]}")
    }
    println("Suma total: $suma")
    println("Nota más alta: $notaMaxima")
    println("Promedio: $promedio")
}