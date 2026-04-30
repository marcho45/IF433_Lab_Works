package oop_00000126931_PaulusMarchionniSadipun.week8

class City(val name: String)
class Address(val city: City?)
class DeliveryDetails(val address: Address?)
class Order (val deliveryDetails: DeliveryDetails?, val totalPrice: Int)