package dev.m1sk9.ribbon.actions

import org.bukkit.entity.Player

class TargetPlayer(
    private val player: Player,
) {

    fun switchGameMode() {
        player.gameMode = when (player.gameMode) {
            org.bukkit.GameMode.SURVIVAL -> org.bukkit.GameMode.CREATIVE
            org.bukkit.GameMode.CREATIVE -> org.bukkit.GameMode.SURVIVAL
            else -> org.bukkit.GameMode.SURVIVAL
        }

        MessageAction(player).sendSuccess("ゲームモードを切り替えました")
    }

}
