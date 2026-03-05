package oop_00000126931_PaulusMarchionniSadipun.week5

class Admin (nama: String) : Pegawai(nama) {
    override fun berkerja() {
        println("[$nama] sedang duduk di depan computer melayani administrasi.")
    }

    fun doAdminWork(){
        println("[$nama] sedang merekap data absensi mahasiswa.")
    }

}