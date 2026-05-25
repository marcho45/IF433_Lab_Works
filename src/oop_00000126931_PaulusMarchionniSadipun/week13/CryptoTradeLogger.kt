package oop_00000126931_PaulusMarchionniSadipun.week13

import java.io.File
import java.io.FileNotFoundException

data class TradeRecord(val id: Int, val symbol: String, val type: String, val margin: Double, val pnl: Double)

fun TradeRecord.toCsv(): String = "$id,$symbol,$type,$margin,$pnl"

fun fromCsvTrade(line: String): TradeRecord? {
    return try {
        val p = line.split(",")
        TradeRecord(p[0].trim().toInt(), p[1].trim(), p[2].trim(), p[3].trim().toDouble(), p[4].trim().toDouble())
    } catch (e: Exception) {
        println("(Log) Data korup diabaikan: $line")
        null
    }
}

fun saveTrades(trades: List<TradeRecord>, path: String) {
    File(path).printWriter().use { out ->
        trades.forEach { out.println(it.toCsv()) }
    }
}

fun loadTrades(path: String): List<TradeRecord> {
    return try {
        File(path).readLines().mapNotNull { fromCsvTrade(it) }
    } catch (e: FileNotFoundException) {
        emptyList()
    }
}

fun main() {
    val dummyTrades = listOf(
        TradeRecord(1, "BTCUSDT", "Long", 1000.0, 50.5),
        TradeRecord(2, "ETHUSDT", "Short", 500.0, -10.2)
    )
    saveTrades(dummyTrades, "crypto_trades.csv")

    File("crypto_trades.csv").appendText("CORRUPT_ID, DOGEUSDT, Hold, XX, YY\n")

    val loadedData = loadTrades("crypto_trades.csv")
    val totalPnl = loadedData.sumOf { it.pnl }

    println("=== VALID TRANSACTIONS ===")
    loadedData.forEach { println(it) }
    println("==== TOTAL PnL BERSIH: $totalPnl ====")
}