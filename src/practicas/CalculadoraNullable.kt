package practicas

class CalculadoraNullable {

    fun sumar(a: Int?, b: Int?): Int {
        return (a ?: 0) + (b ?: 0)
    }
    fun restar(a: Int?, b: Int?): Int {
        return (a ?: 0) - (b ?: 0)
    }
    fun multiplicar(a: Int?, b: Int?): Int {
        return (a ?: 0) * (b ?: 0)
    }
    fun dividir(a: Int?, b: Int?): Int {
        return (a ?: 0) / (b ?: 0)
    }

}