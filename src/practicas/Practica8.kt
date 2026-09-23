package practicas

fun main(){
    println("Introduce un numero:")
    val n = readln()!!.toInt()

    for (i in 1..n){
        if (i % 3 == 0) {
            continue
        }

        if (i == 20){
            println("No puede pasar de 20")
            break
        }
        println(i)
    }
}