package oop_00000126931_PaulusMarchionniSadipun.week11

data class User(var name: String = "", var age: Int = 0)

fun main() {
    println("=== TEST APPLY ===")
    val user = User().apply {
        name = "Alex"
        age = 25 // Typo modul $age=25$ diperbaiki
    }
    println(user)