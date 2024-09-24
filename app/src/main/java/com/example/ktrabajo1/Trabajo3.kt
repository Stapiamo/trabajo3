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


fun main() {

    val usuario1 = Usuario(nombre = "Nimona", edad = 25, trabajo = "cartera")
    val usuario2 = Usuario(nombre = "Arale", edad = 37, trabajo = null, referencia = usuario1)

    usuario1.mostrarDatos()
    usuario2.mostrarDatos()
}


