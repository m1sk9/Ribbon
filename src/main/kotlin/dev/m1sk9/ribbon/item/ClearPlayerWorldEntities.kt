package dev.m1sk9.ribbon.item

import org.bukkit.Material
import org.bukkit.inventory.ItemStack

class ClearPlayerWorldEntities : ExecuteItem(
    "Clear World Entities",
    listOf("Remove all entities in the world"),
    ItemStack.of(Material.BLAZE_POWDER),
) {
    init {
        defaultSetting = {
            it
        }
    }
}
