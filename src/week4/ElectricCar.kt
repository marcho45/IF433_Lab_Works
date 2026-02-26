package week4

import oop_00000126931_PaulusMarchionniSadipun.week04.Vehicle

 class  ElectricCar (brand: String,  numberOfDoors: Int, val batteryCapacity:
Int) : Car(brand, numberOfDoors) {

     final override fun accelerate() {

         println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity")
     }

}