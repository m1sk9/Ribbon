package dev.m1sk9.ribbon.items

import dev.m1sk9.ribbon.ExecuteItem
import dev.m1sk9.ribbon.utils.SendMessageEffect
import org.bukkit.Difficulty
import org.bukkit.Material
import org.bukkit.entity.Player

class SwitchDifficulty : ExecuteItem (
    "Switch Difficulty",
    listOf("Switch the world difficulty"),
    Material.POPPY
) {
    override fun execute(executePlayer: Player) {
        executePlayer.apply {
            world.difficulty = when (world.difficulty) {
                Difficulty.PEACEFUL -> Difficulty.EASY
                Difficulty.EASY -> Difficulty.NORMAL
                Difficulty.NORMAL -> Difficulty.HARD
                else -> Difficulty.PEACEFUL
            }
            SendMessageEffect.sendActionBarMessageToOnlinePlayers("World difficulty switched to ${world.difficulty.name}.")
        }
    }
}
