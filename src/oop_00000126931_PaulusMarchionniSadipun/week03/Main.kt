package oop_00000126931_PaulusMarchionniSadipun.week03

fun main() {
    println("--- TOKO SENJATA (WEAPON TEST) ---")

    val sword = Weapon("Excalibur")

    println("Senjata: ${sword.name}")


    println("\n[Test 1] Set damage ke -50")
    sword.damage = -50
    println("Damage saat ini: ${sword.damage}")
    println("Tier: ${sword.tier}")


    println("\n[Test 2] Set damage ke 9999")
    sword.damage = 9999
    println("Damage saat ini: ${sword.damage}")
    println("Tier: ${sword.tier}")


    println("\n[Test 3] Set damage ke 600")
    sword.damage = 600
    println("Damage saat ini: ${sword.damage}")
    println("Tier: ${sword.tier}")
}