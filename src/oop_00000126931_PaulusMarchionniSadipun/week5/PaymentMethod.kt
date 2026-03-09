package oop_00000126931_PaulusMarchionniSadipun.week5

abstract class PaymentMethod (val accountname: String) {
    abstract fun processPayment(amount: Double)
}