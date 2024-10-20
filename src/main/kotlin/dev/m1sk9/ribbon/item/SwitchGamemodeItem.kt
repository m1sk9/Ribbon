package dev.m1sk9.ribbon.item

import org.bukkit.Material
import org.bukkit.inventory.ItemStack

class SwitchGamemodeItem : ExecuteItem(
    "Switch GameMode",
    listOf("Toggle game mode between Creative and Survival"),
    ItemStack.of(Material.DIAMOND_SWORD),
) {
    init {
        defaultSetting = {
            it
        }
    }
}
