package dev.m1sk9.ribbon.item

import net.kyori.adventure.sound.Sound
import net.kyori.adventure.text.Component
import org.bukkit.GameMode
import org.bukkit.Material
import org.bukkit.entity.Player
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

    override fun execute(player: Player) {
        player.apply {
            if (gameMode !== GameMode.SURVIVAL) {
                sendActionBar(Component.text("§c[Ribbon] This item is only available in Survival Mode!"))
                return
            }

            player.allowFlight = !player.allowFlight
            sendActionBar(Component.text("§a[Ribbon] Flight mode has been switched!"))
            playSound(Sound.sound(org.bukkit.Sound.BLOCK_NOTE_BLOCK_FLUTE, Sound.Source.PLAYER, 1f, 1f))
        }
    }

}
