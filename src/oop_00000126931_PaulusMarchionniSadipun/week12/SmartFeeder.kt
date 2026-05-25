package oop_00000126931_PaulusMarchionniSadipun.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }

    if (isJammed) {
        throw DispenserJamException()
    }

    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }

    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram
}

fun main() {
    var currentKibbleStock = 50

    println("--- JADWAL MAKAN PAGI ---")
    try {
        currentKibbleStock = dispenseKibble(
            requestedGram = 80,
            availableGram = currentKibbleStock,
            isJammed = false
        )
    } catch (e: DispenserJamException) {
        println("ERROR (Hardware): ${e.message}")
    } catch (e: FoodEmptyException) {
        println("ERROR (Stock): ${e.message}")
    } catch (e: Exception) {
        println("ERROR (General): ${e.message}")
    } finally {
        println("Siklus pengecekan dispenser pagi selesai.\n")
    }

    println("--- JADWAL MAKAN SORE ---")
    runCatching {
        dispenseKibble(
            requestedGram = 30,
            availableGram = 1000, // Pemilik baru isi ulang
            isJammed = false
        )
    }.onSuccess { newStock ->
        currentKibbleStock = newStock
        println("Makan sore sukses! Sisa stok kibble: $currentKibbleStock gr")
    }.onFailure { error ->
        println("Peringatan ke Pemilik: ${error.message}")
        println("(Opsional: Berikan chicken jerky secara manual)")
    }
}

