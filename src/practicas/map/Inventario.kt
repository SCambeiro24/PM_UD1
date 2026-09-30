package practicas.map

class Inventario {
    private val productos = mutableMapOf<String, Producto>()

    // Agregar un producto al inventario
    fun agregarProducto(id: String, producto: Producto) {
        productos[id] = producto
        println("Producto '$id' agregado correctamente.")
    }

    fun actualizarPrecio(id: String, nuevoPrecio: Double) {
        val producto = productos[id]
        if (producto != null) {
            producto.precio = nuevoPrecio
            println("Precio del producto '$id' actualizado a $nuevoPrecio.")
        } else {
            println("Error: No se encontró el producto con ID '$id'.")
        }
    }

    fun eliminarProducto(id: String) {
        val eliminado = productos.remove(id)
        if (eliminado != null) {
            println("Producto '$id' eliminado del inventario.")
        } else {
            println("Error: No se encontró el producto con ID '$id' para eliminar.")
        }
    }

    fun mostrarProductos() {
        if (productos.isEmpty()) {
            println("El inventario está vacío.")
        } else {
            println("--- Lista de Productos ---")
            for ((id, producto) in productos) {
                println("ID: $id | Nombre: ${producto.nombre} | Precio: ${producto.precio}")
            }
        }
    }

    fun buscarProductoPorId(id: String): Producto? {
        return productos[id]
    }
}