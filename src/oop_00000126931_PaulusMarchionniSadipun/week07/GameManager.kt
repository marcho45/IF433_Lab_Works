package oop_00000126931_PaulusMarchionniSadipun.week07

object GameManager {

    var isGameRunning: Boolean = false

    fun startGame() {
        if (!isGameRunning) {
            println("Game is already running")
        }else {
            isGameRunning = true
            println("Memulai Game Engine")
        }
    }
}