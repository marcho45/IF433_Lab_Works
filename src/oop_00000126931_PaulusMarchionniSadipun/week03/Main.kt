package oop_00000126931_PaulusMarchionniSadipun.week03

fun main(){
    val e = Employee("Marho");
    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    println("Pajak keren git yang harus dibayar: ${e.tax}");

}