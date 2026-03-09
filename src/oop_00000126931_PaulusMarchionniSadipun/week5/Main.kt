package oop_00000126931_PaulusMarchionniSadipun.week5

fun main() {

    val dosen1 = Dosen(nama = "Pak Jono", nidn = "0122334")
    val admin1 = Admin(nama = "Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.berkerja()

        when (pegawai){
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("-----------------------------------------------------------")
    }

    println("\n=== TUGAS MANDIRI 1: MATH HELPER ===")

    val kalkulator = MathHelper()

    val luasPersegi = kalkulator.hitungLuas(5)
    println("Luas Persegi (sisi 5): $luasPersegi")

    val luasPersegiPanjang = kalkulator.hitungLuas(10, 5)
    println("Luas Persegi Panjang (panjang 10, lebar 5): $luasPersegiPanjang")

    val luasLingkaran = kalkulator.hitungLuas(7.0)
    println("Luas Lingkaran (jari-jari 7.0): $luasLingkaran")

    println("\n=== TUGAS MANDIRI 2: SISTEM PEMBAYARAN ===")

    val dompetMarko = EWallet(accountName = "MarkoPay", balance = 50000.0)
    val kartuMarko = CreditCard(accountName = "MarkoCard", limit = 100000.0)

    val daftarPembayaran: List<PaymentMethod> = listOf(dompetMarko, kartuMarko)

    for (metode in daftarPembayaran) {
        println("-> Mencoba membayar Rp75000 dengan akun: ${metode.accountName}")

        metode.processPayment(75000.0)

        if (metode is EWallet) {
            println("=> Wah, saldo kurang! Sistem otomatis melakukan Top Up...")
            metode.topUp(50000.0)

            println("=> Mencoba membayar ulang...")
            metode.processPayment(75000.0)
        }

        println("-".repeat(30))
    }
}