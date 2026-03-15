package oop_00000126931_PaulusMarchionniSadipun.week06

fun ProcessCheckout(method: PaymentMethod, amount: Double){
    println("-> memulai chekout....")
    method.pay(amount)
}

fun main() {
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n === TESTING CHECKOUT ===")
    ProcessCheckout( method = pay1, amount = 500.0)
    ProcessCheckout(method = pay2, amount = 500.0)
}