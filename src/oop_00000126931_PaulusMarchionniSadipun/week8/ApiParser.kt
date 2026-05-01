package oop_00000126931_PaulusMarchionniSadipun.week8

class ApiParser {
    fun parseProduct(rawJson: Map<String, Any?>): Product? {

        val id = requireNotNull(rawJson["id"] as? String) { "API Invalid: Missing ID" }
        val name = requireNotNull(rawJson["name"] as? String) { "API Invalid: Missing Name" }


        val type = rawJson["type"] as? String

        return when (type) {
            "ELECTRONIC" -> {

                val warranty = rawJson["warranty"] as? Int ?: 12
                Product.Electronic(id, name, warranty)
            }
            "CLOTHING" -> {

                val size = rawJson["size"] as? String ?: "All Size"
                Product.Clothing(id, name, size)
            }
            else -> null
        }
    }

    fun checkout(product: Product) {
        // Ekstrak ID dari product dengan pola when
        val id = when (product) {
            is Product.Electronic -> product.id
            is Product.Clothing -> product.id
        }

        // Lempar ID ke Java Service
        val rawResponse = JavaPaymentService.processPayment(id)

        // Gunakan !! untuk membuktikan Java Interop
        val trxId = rawResponse!!
        println("Berhasil Checkout! Transaction ID: $trxId")
    }
}