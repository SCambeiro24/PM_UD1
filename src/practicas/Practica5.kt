package practicas

fun main(){
    print("Introduzca el primer entero: ")
    val a : Int = (readln()?: "0").toInt()

    print("Introduce el segundo entero")
    val b : Int = (readln()?: "0").toInt()

    val calculadora = CalculadoraNullable()

    println("suma = ${calculadora.sumar(a, b)}")
    println("resta = ${calculadora.restar(a, b)}")
    println("multiplicacion = ${calculadora.multiplicar(a, b)}")
    println("division  = ${calculadora.dividir(a, b)}")

}