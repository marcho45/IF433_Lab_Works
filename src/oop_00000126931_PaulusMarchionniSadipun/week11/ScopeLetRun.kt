package oop_00000126931_PaulusMarchionniSadipun.week11

import java.awt.SystemColor.text

fun main() {
    println("=== TEST LET FUNCTION ===")
    val name: String? = "Alexander"

    val length = name?.let {
        println("Nama terdeteksi: $it")
        it.length
    }
    println("Panjang nama: $length")
}

