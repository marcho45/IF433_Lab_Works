package oop_00000126931_PaulusMarchionniSadipun.week06

class Gopay : PaymentMethod {
    override fun pay(amount: Double) {
        println("processing $$amount via Gopay Server")
    }
}

class CreditCard : PaymentMethod {
    override fun pay(amount: Double) {
        println("Contracting Bank for $$$amount")
    }
}