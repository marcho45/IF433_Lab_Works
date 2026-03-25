package oop_00000126931_PaulusMarchionniSadipun.week07

fun main () {
    println("=== TEST SINGLETON ===");
    println("Status: ${DatabaseManager.connectionStatus}");
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===");
    val client = NetworkClient.createClient();
    client.connect();

    println("\n=== TEST REGULAR CLASS ===");
    val data1 = RegularUser ("Alice", 22)
    val data2 = RegularUser ("Alice", 22)
    println(data1)
    println("Sama? ${data1 == data2}")

}