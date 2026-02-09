package oop_00000126931_paulus_marchionni_sadipun.week01

fun main() {
    val gameTitle = "Elden Ring"
    val price = 600000

    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    printReceipt(title = gameTitle, finalPrice = finalPrice)

    // Langkah 4: Null Safety
    val userNote: String? = null
    // Elvis Operator (?:) -> Jika null, gunakan string di sebelah kanan
    val noteToPrint = userNote ?: "Tidak ada catatan"

    println("Catatan    : $noteToPrint")
}

fun calculateDiscount(price: Int) = if (price > 500000) (price * 0.2).toInt() else (price * 0.1).toInt()

fun printReceipt(title: String, finalPrice: Int) {
    println("=== STRUK PEMBELIAN ===")
    println("Judul Game : $title")
    println("Harga Akhir: Rp $finalPrice")
}