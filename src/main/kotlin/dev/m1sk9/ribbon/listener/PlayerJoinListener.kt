package dev.m1sk9.ribbon.listener

import org.bukkit.event.EventHandler
import org.bukkit.event.EventPriority
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

class PlayerJoinListener : Listener {

    @EventHandler(priority = EventPriority.LOW)
    fun onJoin(event: PlayerJoinEvent) {
        event.player.apply {
            sendMessage("§dRibbon is enabled on this server. Please run [/ribbon] to get debug items.")
        }
    }
}
