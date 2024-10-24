package dev.m1sk9.ribbon.item

import net.kyori.adventure.sound.Sound
import net.kyori.adventure.text.Component
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack

class SwitchOpItem : ExecuteItem(
    "OP Switching",
    listOf("Toggle OP privileges", "Does not affect permission management plugins such as LuckPerms"),
    ItemStack.of(Material.NETHER_STAR),
) {
    init {
        defaultSetting = {
            it
        }
    }

    override fun execute(player: Player) {
        player.apply {
            isOp = !isOp
            sendActionBar(Component.text("§a[Ribbon] Switched to ${if (player.isOp) "OP" else "Non-OP"} mode!"))
            playSound(Sound.sound(org.bukkit.Sound.BLOCK_NOTE_BLOCK_FLUTE, Sound.Source.PLAYER, 1f, 1f))
        }
    }
}
