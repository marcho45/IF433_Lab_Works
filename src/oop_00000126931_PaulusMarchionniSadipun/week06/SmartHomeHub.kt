package oop_00000126931_PaulusMarchionniSadipun.week06

class SmartHomeHub () {

    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
        println("Perangkat '${device.name}' (ID: ${device.id}) berhasil ditambahkan ke Hub.")
    }

    fun turnOffAllSwitches(){
        println("\n=== Mematikan semua perangkat Switchable ===")

        for (device in devices) {

            if (device is Switchable) {
                device.turnOff()
            }
            }
    }
}