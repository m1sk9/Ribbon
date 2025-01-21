package dev.m1sk9.ribbon.utils

import arrow.core.Option
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.TextColor
import org.bukkit.Bukkit
import org.bukkit.World
import org.bukkit.entity.Player

/**
 * Utility object for sending various types of messages to players.
 */
object SendMessageEffect {

    /**
     * Sends a chat message to a specific player.
     *
     * @param destination The player to send the message to.
     * @param content The content of the message.
     */
    fun sendMessageToSpecificPlayer(destination: Player, content: String) {
        destination.sendMessage(Component.text(content).color(TextColor.color(0x00FF00)))
    }

    /**
     * Sends an action bar message to a specific player.
     *
     * @param destination The player to send the message to.
     * @param content The content of the message.
     */
    fun sendActionBarMessageToSpecificPlayer(destination: Player, content: String) {
        destination.sendActionBar(Component.text(content).color(TextColor.color(0x00FF00)))
    }

    /**
     * Sends a chat message to all online players.
     *
     * @param content The content of the message.
     */
    fun sendMessageToOnlinePlayers(content: String) {
        Bukkit.broadcast(Component.text(content).color(TextColor.color(0x00FF00)))
    }

    /**
     * Sends an action bar message to all online players.
     *
     * @param content The content of the message.
     */
    fun sendActionBarMessageToOnlinePlayers(content: String) {
        Bukkit.getOnlinePlayers().forEach { it.sendActionBar(Component.text(content).color(TextColor.color(0x00FF00))) }
    }

    /**
     * Sends an action bar message to all players in a specific world, or to all online players if the world is not specified.
     *
     * @param content The content of the message.
     * @param world The world to send the message to, wrapped in an Option.
     */
    fun sendActionBarMessageToWorldPlayers(content: String, world: Option<World>) {
        when (world.isSome()) {
            true -> {
                world.map { w ->
                    w.players.forEach { it.sendActionBar(Component.text(content).color(TextColor.color(0x00FF00))) }
                }
            }

            else -> {
                Bukkit.getOnlinePlayers()
                    .forEach { it.sendActionBar(Component.text(content).color(TextColor.color(0x00FF00))) }
            }
        }
    }
}
