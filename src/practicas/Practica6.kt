package practicas

fun main(){

    print("Indica el peso en Kg: ")
    val peso : Float = (readln()?: "0").toFloat()

    print("Indica la altura en metros: ")
    val altura : Float = (readln()?: "0").toFloat()

    val imc = peso / (altura * altura)
   /* if (imc < 18.5){
        println("Tienes bajo peso")
    }
    else if (imc >= 18.5 && imc < 25){
        println("Tienes un peso normal")
    }
    else if (imc >= 25 && imc < 30) {
        println("Tienes sobrepeso")
    }
    else if (imc >= 30){
        println("Tienes obesidad")
    }*/
    when {
        imc < 18.5 -> println("Tienes bajo peso")
        imc >= 18.5 && imc < 25 -> println("Tienes un peso normal")
        imc >= 25 && imc < 30  -> println("Tienes sobrepeso")
        imc >= 30 -> println("Tienes obesidad")
    }
}