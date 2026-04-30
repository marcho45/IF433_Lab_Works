package oop_00000126931_PaulusMarchionniSadipun.week8

import java.time.Month

sealed class Product {

    data class Electronic (
        val id: String,
        val name: String,
        val warrantyMonth: Int)
        : Product()

    data class Clothing(val id: String,
                        val name: String,
                        val size: String)
        : Product()
}