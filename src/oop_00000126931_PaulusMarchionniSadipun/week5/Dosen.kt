package oop_00000126931_PaulusMarchionniSadipun.week5

 class Dosen(nama: String, val nidn: String): Pegawai(nama) {
     override fun berkerja() {
         println("[$nama] sedang menyiapkan materi dan RPKPS.")

     }

     fun mengajar(){
         println("[$nama] sedang mengajar mahasiswa di kelas.")
     }
}