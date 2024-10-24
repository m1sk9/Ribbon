package dev.m1sk9.ribbon.item

import net.kyori.adventure.sound.Sound
import net.kyori.adventure.text.Component
import org.bukkit.GameMode
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack

class ControlXPItem: ExecuteItem(
    "Control XP",
    listOf("Control your experience points", "Right-click to setting 99999 Lv", "Shift + Right-click to clear XP", "Note: Available only during Survival Mode."),
    ItemStack.of(Material.MAGMA_CREAM),
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

            when (isSneaking) {
                true -> {
                    level = 0
                    exp = 0.0F
                    sendActionBar(Component.text("§a[Ribbon] Your experience points has been cleared."))
                }
                false -> {
                    level = 99999
                    sendActionBar(Component.text("§a[Ribbon] Your experience points has been set to 99999 Lv."))
                }
            }
            playSound(Sound.sound(org.bukkit.Sound.BLOCK_NOTE_BLOCK_FLUTE, Sound.Source.PLAYER, 1f, 1f))
        }
    }
}
