package oop_00000126931_PaulusMarchionniSadipun.week07


enum class ItemRarity (val dropChance: Int) {

    COMMON (70),
    UNCOMMON(50),
    RARE(35),
    EPIC(10),
    LEGENDARY(1)

}

data class GameItem(val name: String, val damage: Int, val rarity: ItemRarity) {

}