package oop_00000126931_PaulusMarchionniSadipun.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("--- RPG BATTLE ARENA ---")


    print("Masukkan Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan Base Damage Hero (misal 15): ")
    val heroDamage = scanner.nextInt()


    val myHero = Hero(heroName, baseDamage = heroDamage)


    var enemyHp = 100
    println("Musuh muncul dengan HP: $enemyHp")
    println("PERTARUNGAN DIMULAI!")


    while (myHero.isAlive() && enemyHp > 0) {
        println("\n--- GILIRANMU ---")
        println("1. Serang")
        println("2. Kabur")
        print("Pilihan: ")
        val action = scanner.nextInt()

        if (action == 1) {

            myHero.attack("Musuh Jahat")
            enemyHp -= myHero.baseDamage
            if (enemyHp < 0) enemyHp = 0
            println("Musuh terkena ${myHero.baseDamage} damage. Sisa HP Musuh: $enemyHp")


            if (enemyHp > 0) {
                println("\n--- GILIRAN MUSUH ---")

                val enemyDamage = (10..20).random()
                myHero.takeDamage(enemyDamage)
            }
        } else if (action == 2) {
            println("${myHero.name} melarikan diri dari pertarungan...")
            break
        } else {
            println("Aksi tidak valid! Kehilangan giliran.")
        }
    }


    println("\n--- HASIL AKHIR ---")
    if (myHero.isAlive() && enemyHp <= 0) {
        println("SELAMAT! ${myHero.name} MENANG!")
    } else if (!myHero.isAlive()) {
        println("GAME OVER. ${myHero.name} gugur dalam pertarungan.")
    } else {
        println("Pertarungan berakhir imbang/kabur.")
    }
}
