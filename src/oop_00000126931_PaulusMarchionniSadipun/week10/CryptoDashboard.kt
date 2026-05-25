package oop_00000126931_PaulusMarchionniSadipun.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 4.2))
    coinRepo.add(Coin("USDT", 1500.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("=== CRYPTO DASHBOARD ===")
    println("Status API: ${response.status}")
    response.data.forEach {
        println("Koin: ${it.name} | Saldo: ${it.balance}")
    }

    println("\n=== TRANSACTION LOGS ===")
    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX-991A", 0.15))
    txRepo.add(Transaction("TX-992B", 1.2))

    txRepo.getAll().forEach {
        println("ID: ${it.id} | Jumlah: ${it.amount}")
    }
}