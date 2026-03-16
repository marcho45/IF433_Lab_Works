package oop_00000126931_PaulusMarchionniSadipun.week06


class SmartLamp(override val id: String, override val name: String) : SmartDevice, Switchable {


    override fun turnOn() {
        println("Lampu '$name' menyala terang benderang menerangi ruangan.")
    }


    override fun turnOff() {
        println("Lampu '$name' dimatikan. Ruangan menjadi gelap.")
    }
}

