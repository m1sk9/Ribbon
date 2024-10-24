package dev.m1sk9.ribbon.item

import net.kyori.adventure.sound.Sound
import net.kyori.adventure.text.Component
import org.bukkit.Material
import org.bukkit.entity.Player
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

    override fun execute(player: Player) {
        player.world.entities.removeIf {
            it !is Player
        }
        player.apply {
            world.entities.removeIf {
                it !is Player
            }

            sendActionBar(Component.text("§a[Ribbon] Removed all entities in the world!"))
            playSound(Sound.sound(org.bukkit.Sound.BLOCK_NOTE_BLOCK_FLUTE, Sound.Source.PLAYER, 1f, 1f))
        }
    }
}
