package dev.m1sk9.ribbon.item

import org.bukkit.Material
import org.bukkit.inventory.ItemStack

class SwitchFlyItem : ExecuteItem(
    "Fly Switch",
    listOf("Switch flight mode", "Note: Available only during Survival Mode."),
    ItemStack.of(Material.FEATHER),
) {
    init {
        defaultSetting = {
            it
        }
    }
}
