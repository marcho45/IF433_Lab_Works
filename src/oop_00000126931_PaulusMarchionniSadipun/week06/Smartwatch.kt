package oop_00000126931_PaulusMarchionniSadipun.week06

class Smartwatch : Watch(), BluetoothConnectable, Rechargeable {
    override fun showTime() {
        println(" layar oley menyala pada pukul 14:00 WIB")
    }

    override fun connectToBluetooth() {
        println("mencari perangkat hp di sekitar untuk pairing.....")
    }

    override fun chargeBattery() {
        println("mengisi daya menggunakan charger mengetik 15W")
    }


}