package practicas

data class Usuario2(val username: String, val email: String)

class GestorUsuarios {
    private val usuarios: MutableList<Usuario2> = mutableListOf()

    fun agregarUsuario(usuario: Usuario2): Boolean {
        if (usuarios.any { it.email == usuario.email }) {
            println("No se pudo agregar: el email '${usuario.email}' ya está registrado.")
            return false
        }
        usuarios.add(usuario)
        println("Usuario '${usuario.username}' agregado correctamente.")
        return true
    }

    fun mostrarUsuarios() {
        if (usuarios.isEmpty()) {
            println("No hay usuarios registrados.")
        } else {
            println("Lista de usuarios registrados:")
            usuarios.forEach {
                println(" - ${it.username} (${it.email})")
            }
        }
    }

    fun buscarUsuarioPorEmail(email: String): Usuario2? {
        val usuario = usuarios.find { it.email == email }
        return if (usuario != null) {
            println("Usuario encontrado: ${usuario.username} (${usuario.email})")
            usuario
        } else {
            println("No se encontró ningún usuario con el email '$email'.")
            null
        }
    }
}

fun main() {
    val gestor = GestorUsuarios()

    val u1 = Usuario2("juan123", "juan@mail.com")
    val u2 = Usuario2("ana89", "ana@mail.com")
    val u3 = Usuario2("pepe77", "juan@mail.com") // mismo email que u1

    gestor.agregarUsuario(u1)
    gestor.agregarUsuario(u2)
    gestor.agregarUsuario(u3) // rechazado por duplicado

    gestor.mostrarUsuarios()

    gestor.buscarUsuarioPorEmail("ana@mail.com")
    gestor.buscarUsuarioPorEmail("noexiste@mail.com")
}