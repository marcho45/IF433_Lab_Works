package oop_00000126931_PaulusMarchionniSadipun.week07

class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("Connecting to $url")
    }
}