package oop_00000126931_PaulusMarchionniSadipun.week14

import java.io.File
import java.io.FileWriter // Kita import ini untuk persiapan pakai blok use nanti

class BadOrderProcessor {
    private val file = File("orders.csv")

    fun processOrder(itemName: String, basePrice: Double, customerType: String) {
        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP" -> basePrice * 0.90
            else -> basePrice
        }
        println("Memproses pesanan $itemName seharga $finalPrice")
        file.appendText("$itemName, $finalPrice, $customerType\n")
        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}

// --- REFACTORING SRP & DIP ---
interface OrderRepository {
    fun saveOrder(itemName: String, finalPrice: Double, customerType: String)
}

class CsvOrderRepository : OrderRepository {
    override fun saveOrder(itemName: String, finalPrice: Double, customerType: String) {
        // Menggunakan blok safe resource handling 'use'
        FileWriter("orders.csv", true).use { writer ->
            writer.append("$itemName, $finalPrice, $customerType\n")
        }
    }
}

interface NotificationService {
    fun sendNotification(message: String)
}

class EmailNotifier : NotificationService {
    override fun sendNotification(message: String) {
        println("Email terkirim: $message")
    }
}

class SafeOrderProcessor(val repo: OrderRepository, val notifier: NotificationService) {
    // Kita biarkan kosong sebentar, akan diisi di langkah selanjutnya (OCP)
}