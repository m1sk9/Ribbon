package dev.m1sk9.ribbon.command

import org.bukkit.entity.Player

interface SubCommandExecutor {
    fun execute(player: Player, args: Array<String>): Boolean
}
