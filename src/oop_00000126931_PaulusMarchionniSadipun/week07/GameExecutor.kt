package oop_00000126931_PaulusMarchionniSadipun.week07

fun processEvent(event: BattleState) {
    when (event) {
        is MonsterEncounter -> {
            println("⚔️ AWAS! Kamu diserang oleh monster: ${event.monsterName}!")
        }
        is LootDropped -> {
            val namaitem = event.item.name
            val itemrarity = event.item.rarity
        }
        is GameOver ->  {
            println("💀 YAHH GAME OVER! Alasan: ${event.reason}")
        }
        is SafeZone -> {
            println("🛡️ Fiuh... Kamu berada di Safe Zone. Tidak ada musuh di sini.")
        }
    }
    println("-".repeat(50))
}