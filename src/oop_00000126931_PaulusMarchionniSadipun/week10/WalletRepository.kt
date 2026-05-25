package oop_00000126931_PaulusMarchionniSadipun.week10

// Menggunakan constraint <T: Any>
class WalletRepository<T : Any> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    // Pencarian yang hanya bekerja jika T mengimplementasikan INamed
    fun searchByName(query: String): List<T> {
        return items.filter { it is INamed && it.name.equals(query, ignoreCase = true) }
    }
}