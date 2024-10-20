package dev.m1sk9.ribbon.item

import org.bukkit.Material
import org.bukkit.inventory.ItemStack

class SwitchOpItem : ExecuteItem(
    "OP Switching",
    listOf("Toggle OP privileges", "Does not affect permission management plugins such as LuckPerms"),
    ItemStack.of(Material.NETHER_STAR),
) {
    init {
        defaultSetting = {
            it
        }
    }
}
