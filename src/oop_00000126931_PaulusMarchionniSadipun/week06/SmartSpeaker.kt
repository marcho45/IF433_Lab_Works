package oop_00000126931_PaulusMarchionniSadipun.week06

class SmartSpeaker (override val id: String, override val name: String) : SmartDevice, Switchable {

    override fun turnOn() {
        println("Speaker $name manyala")
    }

    override fun turnOff() {
        println("Speaker $name dimatikan")
    }

    fun playMusic(song: String){
        println("Speaker $name Memutar lagu $song dari spotify")
    }

}