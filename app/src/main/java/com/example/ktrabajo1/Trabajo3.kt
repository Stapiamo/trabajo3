package com.example.ktrabajo1
import androidx.compose.ui.res.stringResource

class Usuario(
    var nombre: String,
    var edad: Int,
    var trabajo: String? = null,
    var referencia: Usuario? = null
) {
    fun mostrarDatos() {
        println("Nombre: $nombre")
        println("Edad: $edad")
        println("Trabajo: ${trabajo ?: "No especificado"}")
        if (referencia != null) {
            println("Referencia: ${referencia!!.nombre}")
        } else {
            println("Referencia: No especificada")
        }
        println()
    }
}

class Listado {
    private val listaUsuarios = mutableListOf<Usuario>()

    //Función AGREGAR
    fun agregarUsuario(usuario: Usuario) {
        listaUsuarios.add(usuario)
        println("Usuario ${usuario.nombre} agregado a la lista.")
    }

    // Función ELIMINAR
    fun eliminarUsuario(nombre: String) {
        val usuarioAEliminar = listaUsuarios.find { it.nombre == nombre }
        if (usuarioAEliminar != null) {
            listaUsuarios.remove(usuarioAEliminar)
            println("Usuario $nombre eliminado de la lista.")
        } else {
            println("Usuario $nombre no encontrado.")
        }
    }

    // Función MOSTRAR
    fun mostrarLista() {
        if (listaUsuarios.isEmpty()) {
            println("La lista de usuarios está vacía.")
        } else {
            println("Lista de usuarios:")
            listaUsuarios.forEach { it.mostrarDatos() }
        }
    }
}

fun main() {
    val listado = Listado()

    // Crear algunos usuarios
    val usuario1 = Usuario(nombre = "Nimona", edad = 25, trabajo = "cartera")
    val usuario2 = Usuario(nombre = "Arale", edad = 37, trabajo = null, referencia = usuario1)
    val usuario3 = Usuario(nombre = "Akane", edad = 18, trabajo = "científica")
    val usuario4 = Usuario(nombre = "Goku", edad = 42, trabajo = "luchador", referencia =null)
    val usuario5 = Usuario(nombre = "Kang", edad = 19, trabajo = "Actor")


    listado.agregarUsuario(usuario1)
    listado.agregarUsuario(usuario2)
    listado.agregarUsuario(usuario3)
    listado.agregarUsuario(usuario4)
    listado.agregarUsuario(usuario5)


    listado.mostrarLista()

    listado.eliminarUsuario("Akane")
    listado.mostrarLista()
}