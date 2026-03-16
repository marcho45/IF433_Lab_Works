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

    val lampu = SmartLamp(id = "L01", name = "Ruang Tamu")
    val speaker = SmartSpeaker(id = "S01", name = "Google Nest Dapur")
    val cctv = SmartCCTV(id = "C01", name = "Ezviz Garasi")
    println("Perangkat berhasil dibuat!")


    println("\n === TESTING CHECKOUT ===")
    ProcessCheckout( method = pay1, amount = 500.0)
    ProcessCheckout(method = pay2, amount = 500.0)


    val hub = SmartHomeHub()

    hub.addDevice(lampu)
    hub.addDevice(speaker)
    hub.addDevice(cctv)


    hub.activateSecurityMode()
    hub.turnOffAllSwitches()
}

