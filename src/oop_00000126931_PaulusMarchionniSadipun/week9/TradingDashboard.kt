package oop_00000126931_PaulusMarchionniSadipun.week9

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 50, -12.0, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 5, 2.5, "OPEN"),
        TradeLog("ETHUSDT", "LONG", 15, 8.4, "CLOSED"),
        TradeLog("SOLUSDT", "SHORT", 10, -2.1, "OPEN")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
}