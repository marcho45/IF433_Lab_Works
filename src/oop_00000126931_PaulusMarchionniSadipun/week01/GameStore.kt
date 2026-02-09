package oop_00000126931_paulus_marchionni_sadipun.week01

fun main() {
    val gameTitle = "Elden Ring"
    val price = 600000

    // Panggil fungsi diskon (untuk mengetes)
    val discount = calculateDiscount(price)
    println("Diskon: $discount")
}

// Langkah 2: Logika Diskon (Expression Body)
// Jika harga > 500.000 diskon 20%, selain itu 10%
fun calculateDiscount(price: Int) = if (price > 500000) (price * 0.2).toInt() else (price * 0.1).toInt()