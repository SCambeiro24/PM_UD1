package practicas

class CocheTuneado(marca: String, modelo: String) {

    var marca: String = marca
        get() = field.uppercase()

    var modelo: String = modelo
        get() = field.uppercase()

    var velocidad: Int = 0
        set(value) {
            field = if (value >= 0) value else 0
        }


    constructor(marca: String, modelo: String, velocidadInicial: Int) : this(marca, modelo) {
        if (velocidadInicial >= 0) {
            velocidad = velocidadInicial
        }
    }

    fun acelerar(cantidad: Int) {
        if (cantidad > 0) {
            velocidad += cantidad
        }
    }

    fun frenar(cantidad: Int) {
        velocidad -= cantidad
        if (velocidad < 0) {
            velocidad = 0
        }
    }

}

fun main() {
    val coche1 = CocheTuneado("Toyota", "chr")
    val coche2 = CocheTuneado("Ferrari", "F40", 50)
    val coche3 = CocheTuneado("Volkswagen", "1.9 TDI", 20)

    coche1.acelerar(100)
    coche2.frenar(50)
    coche3.acelerar(80)
    coche3.frenar(30)

    println("Coche1 : ${coche1.marca} ${coche1.modelo}, velocidad: ${coche1.velocidad}")
    println("Coche2 : ${coche2.marca} ${coche2.modelo}, velocidad: ${coche2.velocidad}")
    println("Coche3 : ${coche3.marca} ${coche3.modelo}, velocidad: ${coche3.velocidad}")
}