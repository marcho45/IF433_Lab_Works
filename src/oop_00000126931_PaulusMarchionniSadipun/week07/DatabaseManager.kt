package oop_00000126931_PaulusMarchionniSadipun.week07

object DatabaseManager {
    var connectionStatus: String = "Disconnected";

    fun connect() {
        connectionStatus = "Connected to server";
        print("Database is ready");
    }
}