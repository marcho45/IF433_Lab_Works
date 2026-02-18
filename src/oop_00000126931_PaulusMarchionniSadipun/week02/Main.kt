package oop_00000126931_PaulusMarchionniSadipun.week02

import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    println("--- PERPUSTAKAAN UMN ---")

    print("Judul Buku: ")
    val bookTitle = scanner.nextLine()

    print("Peminjam: ")
    val borrower = scanner.nextLine()

    print("Lama Pinjam (Hari): ")
    var days = scanner.nextInt()
    scanner.nextLine()


    if (days < 0) {
        println("WARNING: Input hari minus! Diubah otomatis jadi 1 hari.")
        days = 1
    }


    val loan = Loan(bookTitle, borrower, days)


    println("\n--- DETAIL PEMINJAMAN ---")
    println("Buku: ${loan.bookTitle}")
    println("Peminjam: ${loan.borrower}")
    println("Durasi: ${loan.loanDuration} hari")
    println("Total Denda: Rp ${loan.calculateFine()}")

}
