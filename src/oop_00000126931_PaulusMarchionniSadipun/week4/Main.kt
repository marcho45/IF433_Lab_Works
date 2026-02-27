package oop_00000126931_PaulusMarchionniSadipun.week4

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

    println("\n--- Testing ElectricCar ---")
    val electricCar = ElectricCar(brand = "Wuling", numberOfDoors = 4, batteryCapacity = 100)
    electricCar.accelerate()
    electricCar.honk()
    electricCar.openTrunk()

    println("\n--- Manager ---")
    val manager = Manager (name = "Marcho", baseSalary = 1_000_000)
    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    println("\n--- Developer ---")
    val developer = Developer (programmingLanguage = "TypeScript", name = "Antony", baseSalary = 500_000)
    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}