package dev.m1sk9.ribbon.actions

import org.bukkit.GameMode
import org.bukkit.entity.Player

class TargetPlayer(
    private val player: Player,
) {

    fun switchGameMode() {
        player.gameMode = when (player.gameMode) {
            GameMode.SURVIVAL -> GameMode.CREATIVE
            GameMode.CREATIVE -> GameMode.SURVIVAL
            else -> GameMode.SURVIVAL
        }
        MessageAction(player).sendSuccess("Switched to ${player.gameMode.name} mode!")
    }

    fun switchOp() {
        player.isOp = !player.isOp
        MessageAction(player).sendSuccess("Switched to ${if (player.isOp) "OP" else "Non-OP"} mode!")
    }

    fun switchFly() {
        if (player.gameMode != GameMode.SURVIVAL) {
            MessageAction(player).sendError("You can't switch fly mode in ${player.gameMode.name} mode!")
            return
        }
        player.allowFlight = !player.allowFlight
        MessageAction(player).sendSuccess("Switched to ${if (player.allowFlight) "Fly" else "Walk"} mode!")
    }

    fun setFullHealth() {
        if (player.gameMode != GameMode.SURVIVAL) {
            MessageAction(player).sendError("You can't set full health in ${player.gameMode.name} mode!")
            return
        }
        player.health = player.getAttribute(org.bukkit.attribute.Attribute.GENERIC_MAX_HEALTH)!!.value
        player.foodLevel = 20
        when (player.clearActivePotionEffects()) {
            true -> {
                MessageAction(player).sendSuccess("Health / Food level has been restored and effects have been cleared!")
            }
            false -> {
                MessageAction(player).sendSuccess("Health / Food level has been restored!")
            }
        }
    }

    fun clearPlayerWorldEntities() {
        val world = player.world
        world.entities.forEach {
            if (it is Player) {
                return@forEach
            }
            it.remove()
        }
        MessageAction(player).sendSuccess("All entities in the world have been removed!")
    }

}
