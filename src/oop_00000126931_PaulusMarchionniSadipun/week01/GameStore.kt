package oop_00000126931_paulus_marchionni_sadipun.week01

fun main() {
    val gameTitle = "Elden Ring"
    val price = 600000

    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    // Langkah 3: Panggil dengan Named Arguments
    printReceipt(title = gameTitle, finalPrice = finalPrice)
}

fun calculateDiscount(price: Int) = if (price > 500000) (price * 0.2).toInt() else (price * 0.1).toInt()

// Fungsi Cetak Struk
fun printReceipt(title: String, finalPrice: Int) {
    println("=== STRUK PEMBELIAN ===")
    println("Judul Game : $title")
    println("Harga Akhir: Rp $finalPrice")
}