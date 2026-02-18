package oop_00000126931_PaulusMarchionniSadipun.week02

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)

    println("-----APLIKASI PMB UMN -----");

    print("Msukan Nama: ")
    val name = scanner.nextLine()

    print("Maikan NIM (Wajib 5 Karakter): ")
    val nim = scanner.next()
    scanner.nextLine()

    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
    } else {
        // --- LOGIKA BARU DIMULAI DARI SINI ---
        print("Pilih Jalur (1. Reguler, 2. Umum): ")
        val type = scanner.nextInt()
        scanner.nextLine() // PENTING: Consume newline setelah nextInt()!

        if (type == 1) {
            // Jalur 1: User input jurusan manual (Pakai Primary Constructor)
            print("Masukkan Jurusan: ")
            val major = scanner.nextLine()

            val s1 = Student(name, nim, major)
            println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")

        } else if (type == 2) {
            // Jalur 2: Jurusan otomatis (Pakai Secondary Constructor)
            val s2 = Student(name, nim)
            println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")

        } else {
            println("Pilihan ngawur, pendaftaran batal!")
        }
    }

}
