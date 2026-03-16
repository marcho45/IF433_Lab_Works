package oop_00000126931_PaulusMarchionniSadipun.week06


class SmartCCTV(override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {


    override fun turnOn() {
        println("CCTV '\$name' menyala dan mulai memantau area.")
        startRecord()
    }


    override fun turnOff() {
        println("CCTV '\$name' dimatikan.")
        stopRecord()
    }

    override fun startRecord() {
        println("CCTV '\$name' sedang merekam video...")
    }


}
