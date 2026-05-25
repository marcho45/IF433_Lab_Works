package oop_00000126931_PaulusMarchionniSadipun.week10

// Interface untuk fungsi pencarian nanti
interface INamed {
    val name: String
}

// Data class Coin yang mengimplementasikan interface INamed
data class Coin(override val name: String, val balance: Double) : INamed

// Data class Transaction
data class Transaction(val id: String, val amount: Double)