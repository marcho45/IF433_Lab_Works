package week4

import oop_00000126931_PaulusMarchionniSadipun.week04.Vehicle

fun main () {
    println("--- Testing Vehicle ---");
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()
}