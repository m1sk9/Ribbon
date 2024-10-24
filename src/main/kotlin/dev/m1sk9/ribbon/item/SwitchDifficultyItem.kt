package dev.m1sk9.ribbon.item

import net.kyori.adventure.sound.Sound
import net.kyori.adventure.text.Component
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack

class SwitchDifficultyItem: ExecuteItem (
    "Switch Difficulty",
    listOf("Switch difficulty between Peaceful and Normal"),
    ItemStack.of(Material.DIAMOND_AXE)
) {
    init {
        defaultSetting = {
            it
        }
    }

    override fun execute(player: Player) {
        player.apply {
            world.difficulty = when (world.difficulty) {
                org.bukkit.Difficulty.PEACEFUL -> org.bukkit.Difficulty.NORMAL
                org.bukkit.Difficulty.NORMAL -> org.bukkit.Difficulty.PEACEFUL
                else -> org.bukkit.Difficulty.PEACEFUL
            }

            sendActionBar(Component.text("§a[Ribbon] Difficulty has been switched to ${world.difficulty.name}!"))
            playSound(Sound.sound(org.bukkit.Sound.BLOCK_NOTE_BLOCK_FLUTE, Sound.Source.PLAYER, 1f, 1f))
        }
    }
}

