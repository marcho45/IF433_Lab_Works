package oop_00000126931_paulus_marchionni_sadipun.week01

fun main(args: Array<String>) {
    // Variable definition
    // REFACTOR: Ubah var jadi val, hapus :Double (Type Inference)
    val radius = 7.0
    val pi = 3.14

    // Calculation
    // REFACTOR: Ubah var jadi val, hapus :Double
    val area = pi * radius * radius

    // Output Concatenation
    // REFACTOR: Ubah jadi String Template ($radius, $area)
    println("Radius: $radius, Area: $area")

    // Logic check
    checkSize(area)
}

fun checkSize(area: Double) {
    if (area > 100) {
        println("This is a Big Circle")
    } else {
        println("This is a Small Circle")
    }
}