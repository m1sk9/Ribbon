package dev.m1sk9.ribbon.utils

import arrow.core.Option
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.TextColor
import org.bukkit.Bukkit
import org.bukkit.World
import org.bukkit.entity.Player

object SendMessageEffect {

    fun sendMessageToSpecificPlayer(destination: Player, content: String) {
        destination.sendMessage(Component.text(content).color(TextColor.color(0x00FF00)))
    }

    fun sendActionBarMessageToSpecificPlayer(destination: Player, content: String) {
        destination.sendActionBar(Component.text(content).color(TextColor.color(0x00FF00)))
    }

    fun sendMessageToOnlinePlayers(content: String) {
        Bukkit.broadcast(Component.text(content).color(TextColor.color(0x00FF00)))
    }

    fun sendActionBarMessageToOnlinePlayers(content: String) {
        Bukkit.getOnlinePlayers().forEach { it.sendActionBar(Component.text(content).color(TextColor.color(0x00FF00))) }
    }

    fun sendActionBarMessageToWorldPlayers(content: String, world: Option<World>) {
        when (world.isSome()) {
            true -> {
                world.map { w ->
                    w.players.forEach { it.sendActionBar(Component.text(content).color(TextColor.color(0x00FF00))) }
                }
            }
            else -> {
                Bukkit.getOnlinePlayers().forEach { it.sendActionBar(Component.text(content).color(TextColor.color(0x00FF00))) }
            }
        }
    }
}
