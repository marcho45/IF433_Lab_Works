package oop_00000126931_PaulusMarchionniSadipun.week07

class Weapon private constructor(val item: GameItem, val durability: Int) {

    // Ini adalah 'Pabrik'-nya
    companion object {

        fun forgeStarterSword(): Weapon {
            // Membuat resep pedang awal sesuai instruksi modul
            val starterItem = GameItem(name = "Pedang Kayu Bapuk", damage = 5, rarity = ItemRarity.COMMON)
            return Weapon(item = starterItem, durability = 50)
        }

        fun forgeEpicSword(): Weapon {
            // Membuat resep pedang sakti
            val epicItem = GameItem(name = "Pedang Excalibur", damage = 150, rarity = ItemRarity.EPIC)
            return Weapon(item = epicItem, durability = 500)
        }
    }
}