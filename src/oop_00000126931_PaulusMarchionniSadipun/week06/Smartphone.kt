package oop_00000126931_PaulusMarchionniSadipun.week06

class Smartphone : Camera, Phone {

    override fun turnOn() {
        super<Camera>.turnOn()
        super<Phone>.turnOn()
        println(" sistem OS smartphone berhasil booting")
    }
}