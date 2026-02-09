package oop_00000126931_paulus_marchionni_sadipun.week01

fun main(args: Array<String>) {
    val radius = 7.0
    val pi = 3.14
    val area = pi * radius * radius

    println("Radius: $radius, Area: $area")

    // REFACTOR: Panggil fungsi di dalam println
    // Karena fungsi checkSize sekarang mengembalikan String (teks), bukan langsung print.
    println(checkSize(area))
}

// REFACTOR: Ubah menjadi Expression Body Function (=)
// Menggunakan if sebagai expression yang mengembalikan nilai String
fun checkSize(area: Double) = if (area > 100) "This is a Big Circle" else "This is a Small Circle"