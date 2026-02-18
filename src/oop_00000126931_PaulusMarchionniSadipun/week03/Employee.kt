package oop_00000126931_PaulusMarchionniSadipun.week03

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            println("Mencoba set gaji ke: $value");
            this.salary = value
        }
}

