package practicas

data class Producto(val nombre: String, val codigo: String)

class Inventario {
    private val productos: MutableSet<Producto> = mutableSetOf()

    fun agregarProducto(producto: Producto) {
        val agregar = productos.add(producto)
        if (agregar) {
            println("Producto '${producto.nombre}' agregado correctamente.")
        } else {
            println("Producto '${producto.nombre}' ya existe en el inventario.")
        }
    }

    // Esta función debe estar DENTRO de la clase Inventario
    fun mostrarProductos() {
        if (productos.isEmpty()) {
            println("El inventario está vacío.")
        } else {
            println("Inventario de productos:")
            for ((nombre, codigo) in productos) {
                println(" - $nombre ($codigo)")
            }
        }
    }
}

fun main() {
    val inventario = Inventario()
    val p1 = Producto("Teclado", "P001")
    val p2 = Producto("Ratón", "P002")
    val p3 = Producto("Teclado", "P001") // Duplicado

    inventario.agregarProducto(p1)
    inventario.agregarProducto(p2)
    inventario.agregarProducto(p3)
    inventario.mostrarProductos()
}