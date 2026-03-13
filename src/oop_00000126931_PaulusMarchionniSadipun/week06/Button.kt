package oop_00000126931_PaulusMarchionniSadipun.week06

class Button(override val name: String) : Clickable {
    override fun click() {
        (" Tombol '$name' berhasil diklik ")
    }
}