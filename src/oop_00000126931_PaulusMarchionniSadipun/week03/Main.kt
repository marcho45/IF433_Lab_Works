package oop_00000126931_PaulusMarchionniSadipun.week03

fun main() {
    println("--- GAME LEVELING SYSTEM ---")

    val p1 = Player("Marko")
    println("Player: ${p1.username}")
    println("Level Awal: ${p1.level}")



    println("\n[Aksi 1] Mengalahkan Slime...")
    p1.addXp(50)
    println("Status: Level ${p1.level}")


    println("\n[Aksi 2] Mengalahkan Naga...")
    p1.addXp(60)
    println("Status Akhir: Level ${p1.level}")
}