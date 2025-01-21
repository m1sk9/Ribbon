package dev.m1sk9.ribbon

import net.kyori.adventure.text.Component
import org.bukkit.Material
import org.bukkit.enchantments.Enchantment
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack

abstract class ExecuteItem(private val name: String, private val lore: List<String>, private val originalItem: Material) {
    fun build(): ItemStack {
        val item = ItemStack(originalItem)
        val meta = item.itemMeta

        meta.displayName(Component.text(name))
        meta.lore( lore.map { Component.text(it) } )
        meta.addEnchant(Enchantment.UNBREAKING, 1, true)

        item.itemMeta = meta
        return item
    }

    fun getItemStack(): ItemStack {
        return build()
    }

    abstract fun execute(executePlayer: Player)
}
