package practicas

fun main() {
    val calculadora = CalculadoraCuerpoExpresion()

    print("Introduzca su nombre: ")
    val usuario : String? = readln()
    println(calculadora.saludar(nombre = usuario))

    print("Introduzca el primer entero: ")
    val a : Int? = readln()?.toIntOrNull()

    print("Introduzca el segundo entero: ")
    val b : Int? = readln()?.toIntOrNull()

    println("suma = ${calculadora.sumar(a, b)}")
    println("resta = ${calculadora.restar(a, b)}")
    println("multiplica = ${calculadora.multiplicar(a, b)}")
    println("División = ${calculadora.dividir(a, b)}")
}
