package oop_00000126931_PaulusMarchionniSadipun.week5

fun main() {
    // ==========================================
    // GUIDED LAB: PEGAWAI & SMART CASTING
    // ==========================================
    val dosen1 = Dosen(nama = "Pak Jono", nidn = "0122334")
    val admin1 = Admin(nama = "Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        // Memanggil fungsi dari class induk (Runtime Polymorphism)
        pegawai.berkerja()

        // Smart Casting
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

    // ==========================================
    // TUGAS MANDIRI 1: MATH HELPER (OVERLOADING)
    // ==========================================
    println("\n=== TUGAS MANDIRI 1: MATH HELPER ===")

    val kalkulator = MathHelper()

    val luasPersegi = kalkulator.hitungLuas(5)
    println("Luas Persegi (sisi 5): $luasPersegi")

    val luasPersegiPanjang = kalkulator.hitungLuas(10, 5)
    println("Luas Persegi Panjang (panjang 10, lebar 5): $luasPersegiPanjang")

    val luasLingkaran = kalkulator.hitungLuas(7.0)
    println("Luas Lingkaran (jari-jari 7.0): $luasLingkaran")
}