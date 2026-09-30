package practicas
import kotlin.math.PI
interface Figura {
    fun calcularSuperficie(): Double
    fun calcularPerimetro(): Double
    fun tituloResultado() {
        println("Datos de la figura")
    }
}

class Cuadrado (val lado: Double) : Figura {
    override fun calcularSuperficie() = lado * lado
    override fun calcularPerimetro() = 4 * lado
    override fun tituloResultado() = println("Datos de la figura Cuadrado")
}

class Rectangulo (val lado: Double, val Lado2: Double) : Figura {
    override fun calcularSuperficie() = lado * Lado2
    override fun calcularPerimetro() = 2 * lado + 2 * Lado2
    override fun tituloResultado() = println("Datos de la rectangulo")
}

class Circulo (val radio: Double) : Figura {
    override fun calcularSuperficie() = PI * radio * radio
    override fun calcularPerimetro() = 2 * PI * radio
    override fun tituloResultado() = println("Datos de la figura Circulo")
}


fun main() {
    val cuadrado1 = Cuadrado(10.0)
    cuadrado1.tituloResultado()
    println("Perímetro del cuadrado : ${cuadrado1.calcularPerimetro()}")
    println("Superficie del cuadrado : ${cuadrado1.calcularSuperficie()}")
    val rectangulo1 = Rectangulo(10.0, 5.0)
    rectangulo1.tituloResultado()
    println("Perímetro del rectángulo : ${rectangulo1.calcularPerimetro()}")
    println("Superficie del rectángulo : ${rectangulo1.calcularSuperficie()}")
    val circulo1 = Circulo(5.0)
    circulo1.tituloResultado()
    println("Perímetro del circulo: ${circulo1.calcularPerimetro()}")
    println("Superficie del circulo : ${circulo1.calcularSuperficie()}")
}
