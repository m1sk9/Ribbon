package dev.m1sk9.ribbon.item

import net.kyori.adventure.sound.Sound
import net.kyori.adventure.text.Component
import org.bukkit.GameMode
import org.bukkit.Material
import org.bukkit.entity.Player
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

    override fun execute(player: Player) {
        player.apply {
            gameMode = when (player.gameMode) {
                GameMode.SURVIVAL -> GameMode.CREATIVE
                GameMode.CREATIVE -> GameMode.SURVIVAL
                else -> GameMode.SURVIVAL
            }

            sendActionBar(Component.text("§a[Ribbon] Game mode has been switched to ${gameMode.name}."))
            playSound(Sound.sound(org.bukkit.Sound.BLOCK_NOTE_BLOCK_FLUTE, Sound.Source.PLAYER, 1f, 1f))
        }
    }
}
