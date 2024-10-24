package dev.m1sk9.ribbon.menu

import org.bukkit.Material
import org.bukkit.Sound
import org.bukkit.entity.Player
import org.bukkit.event.inventory.ClickType
import org.bukkit.event.inventory.InventoryClickEvent
import xyz.xenondevs.invui.item.ItemProvider
import xyz.xenondevs.invui.item.builder.ItemBuilder
import xyz.xenondevs.invui.item.impl.AbstractItem
import java.util.*

class SoundboardItem(private val targetSound: Sound): AbstractItem() {

    override fun getItemProvider(): ItemProvider {
       // サウンド名の Prefix からおおよその区分分けをできるように.
       // 詳しくは [org.bukkit.Sound] の Enum 定義を参照.
       // ページ順はこの Enum 定義に準拠している.
       return ItemBuilder(
            when {
                targetSound.name.startsWith("AMBIENT") -> Material.STONE
                targetSound.name.startsWith("BLOCK") -> Material.GRASS_BLOCK
                targetSound.name.startsWith("ENTITY") -> Material.PLAYER_HEAD
                targetSound.name.startsWith("ITEM") -> Material.CHEST
                targetSound.name.startsWith("MUSIC") -> Material.JUKEBOX
                else -> Material.NOTE_BLOCK
            }
       ).apply {
            setDisplayName("§d${targetSound.name}")
            setLegacyLore(listOf("Category: ${targetSound.name.split('_')[0].replaceFirstChar {
                if (it.isLowerCase()) it.titlecase(
                    Locale.getDefault()
                ) else it.toString()
            }}"))
       }
    }

    override fun handleClick(clickType: ClickType, player: Player, invClickEvent: InventoryClickEvent) {
        player.playSound(player.location, targetSound, 1f, 1f)
    }
}
