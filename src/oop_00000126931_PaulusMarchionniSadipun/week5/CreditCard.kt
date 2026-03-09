package oop_00000126931_PaulusMarchionniSadipun.week5

class CreditCard(accountName: String, val limit: Double, var usedAmount: Double = 0.0) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit){
            usedAmount += amount
            println("[$accountName] Pembayaran Credit Card sukses! Total terpakai: Rp${usedAmount}%")
        }else{
            println("[$accountName] Transaksi ditolak: Melebihi limit kartu kredit.")
        }
        }
    }
