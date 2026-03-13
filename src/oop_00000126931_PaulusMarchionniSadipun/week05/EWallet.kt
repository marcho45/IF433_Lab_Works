package oop_00000126931_PaulusMarchionniSadipun.week05

class EWallet (accountName: String, var balance: Double) : PaymentMethod(accountName) {
  override fun processPayment(amount: Double) {
      if (balance >= amount) {
          balance -= amount // Saldo dipotong tagihan
          println("[$accountName] Pembayaran EWallet sukses! Sisa saldo: Rp$balance") // Cetak sukses
      } else {
          println("[$accountName] Transaksi gagal: Saldo tidak cukup.") //
      }
  }

    // Fungsi unik EWallet untuk nambah saldo
    fun topUp(amount: Double) {
        balance += amount // Saldo bertambah
        println("[$accountName] Top Up Rp$amount berhasil! Saldo sekarang: Rp$balance")
    }
}