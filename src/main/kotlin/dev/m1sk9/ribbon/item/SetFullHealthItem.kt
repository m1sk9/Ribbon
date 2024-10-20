package dev.m1sk9.ribbon.item

import org.bukkit.Material
import org.bukkit.inventory.ItemStack

class SetFullHealthItem : ExecuteItem(
    "Set Full Health",
    listOf("Instantly restores strength and satiety", "Remove all effect effects, if any.", "Note: Available only during Survival Mode."),
    ItemStack.of(Material.APPLE),
) {
    init {
        defaultSetting = {
            it
        }
    }
}
