package practicas

class Contador {
    companion object {
        var contador: Int = 0
        fun imprimirValor() {
            println("Valor actual del contador: $contador")
        }
    }

    fun aumentarContador() {
        contador++
    }
}

fun main(){
    Contador.contador++
    Contador.contador++
    Contador.contador++
    Contador.contador++
    Contador.imprimirValor()

    val instancia = Contador()
    instancia.aumentarContador()
    Contador.imprimirValor()
}