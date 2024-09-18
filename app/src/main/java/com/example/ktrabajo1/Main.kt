package com.example.ktrabajo1

fun main() {
    println("Ingrese su Edad!")
    val edad = readLine()?.toIntOrNull()

    println("Indique qué día de la semana irá: lunes,Martes,Miercoles,Jueves,Viernes,Sabado,Domingo")
    val diasemana = readLine()?.lowercase()


    if (edad == null || diasemana == null) {
        println("Entrada inválida. Por favor, ingrese una edad numérica válida y un día de la semana correcto.")
        return
    }
    val costo = calcularCostoEntrada(edad, diasemana)
    println("El costo de la entrada es: $costo")
}

fun calcularCostoEntrada(edad: Int, diasemana: String): String {
    return when {
        edad in 0..4 -> "$0"
        edad in 5..15 -> "$15,000"
        edad in 16..60 -> {0
            val precioBase = 30_000
            val descuento = if (diasemana == "lunes" || diasemana == "martes") 5_000 else 0
            "${precioBase - descuento}"
        }
        edad in 61..100 -> "$20,000"
        edad > 100 -> "Error: Edad superior a 100 años no válida."
        else -> "Edad inválida."
    }
}