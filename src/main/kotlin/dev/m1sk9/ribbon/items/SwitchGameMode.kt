package dev.m1sk9.ribbon.items

import dev.m1sk9.ribbon.ExecuteItem
import dev.m1sk9.ribbon.utils.SendMessageEffect
import org.bukkit.GameMode
import org.bukkit.Material
import org.bukkit.entity.Player

class SwitchGameMode : ExecuteItem(
    "Switch GameMode",
    listOf("Switch your gamemode!"),
    Material.DIAMOND_SWORD
) {
    override fun execute(executePlayer: Player) {
        executePlayer.apply {
            gameMode = when (executePlayer.gameMode) {
                GameMode.SURVIVAL -> GameMode.CREATIVE
                GameMode.CREATIVE -> GameMode.SURVIVAL
                else -> GameMode.SURVIVAL
            }
            SendMessageEffect.sendActionBarMessageToSpecificPlayer(this, "Gamemode switched to ${gameMode.name}.")
        }
    }
}
