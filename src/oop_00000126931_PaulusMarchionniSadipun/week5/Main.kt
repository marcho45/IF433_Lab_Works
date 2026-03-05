package oop_00000126931_PaulusMarchionniSadipun.week5

fun main() {
    val dosen1 = Dosen(nama = "Pak Jono", nidn = "0122334");
    val admin1 = Admin(nama = "Bu Siti");

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1);

    println("=== AKTIFITAS PEGAWAI ===");
    for (pegawai in daftarPegawai) {
        pegawai.berkerja()

        when (pegawai){
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})");
                pegawai.mengajar()
            }is Admin -> {
                println("=> Terdeteksi sebagai Admin");
                pegawai.doAdminWork()
            }
        }
        println("-----------------------------------------------------------")
    }

}