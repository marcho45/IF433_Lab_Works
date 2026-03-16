package oop_00000126931_PaulusMarchionniSadipun.week06

interface SmartDevice {
    abstract val id: String
    abstract val name: String
}

interface Switchable {
    fun turnOn()
    fun turnOff()
}

interface Recordable {
    fun startRecord()
    fun stopRecord(){
        println("Perekaman dihentikan dan disimpan ke Cloud")
    }

}