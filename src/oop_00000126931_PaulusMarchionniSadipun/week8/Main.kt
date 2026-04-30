package oop_00000126931_PaulusMarchionniSadipun.week8

fun main() {

    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?:
    "Kota tidak diketahui "
    println("Tujian pengiriman: $destination")

}
