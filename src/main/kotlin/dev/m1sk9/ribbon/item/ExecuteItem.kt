package dev.m1sk9.ribbon.item

import net.kyori.adventure.text.Component
import org.bukkit.enchantments.Enchantment
import org.bukkit.inventory.ItemStack

abstract class ExecuteItem(
    private val name: String,
    private val lore: List<String>,
    private val baseItem: ItemStack,
) {

    protected lateinit var defaultSetting: (ItemStack) -> ItemStack

    fun getName(): String {
        return name
    }

    fun getBaseItem(): ItemStack {
        return baseItem
    }

    fun getItemStack(): ItemStack {
        val item = baseItem.clone()
        val meta = item.itemMeta

        meta.displayName(Component.text(name))
        meta.lore(lore.map { Component.text(it) })
        meta.addEnchant(Enchantment.UNBREAKING, 1, true)

        item.itemMeta = meta
        return defaultSetting(item)
    }

}
