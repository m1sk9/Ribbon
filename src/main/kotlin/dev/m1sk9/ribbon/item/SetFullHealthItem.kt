package dev.m1sk9.ribbon.item

import net.kyori.adventure.sound.Sound
import net.kyori.adventure.text.Component
import org.bukkit.GameMode
import org.bukkit.Material
import org.bukkit.attribute.Attribute
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack

class SetFullHealthItem : ExecuteItem(
    "Set Full Health",
    listOf("Instantly restores strength and satiety", "Remove all effect effects, if any.", "Note: Available only during Survival Mode."),
    ItemStack.of(Material.APPLE),
) {
    init {
        defaultSetting = {
            it
        }
    }

    override fun execute(player: Player) {
        val playerAttribute = Pair(
            player.getAttribute(Attribute.MAX_HEALTH)!!.value,
            20
        )
        player.apply {
            if (gameMode !== GameMode.SURVIVAL) {
                sendActionBar(Component.text("§c[Ribbon] This item is only available in Survival Mode!"))
                return
            }

            health = playerAttribute.first
            foodLevel = playerAttribute.second
            activePotionEffects.forEach {
                removePotionEffect(it.type)
            }

            sendActionBar(Component.text("§a[Ribbon] Health and satiety have been restored!"))
            playSound(Sound.sound(org.bukkit.Sound.BLOCK_NOTE_BLOCK_FLUTE, Sound.Source.PLAYER, 1f, 1f))
        }
    }
}
