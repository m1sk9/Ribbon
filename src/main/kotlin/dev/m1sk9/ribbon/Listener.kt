package dev.m1sk9.ribbon

import dev.m1sk9.ribbon.utils.ExecuteItemEffect
import dev.m1sk9.ribbon.utils.SendMessageEffect
import org.bukkit.event.EventHandler
import org.bukkit.event.EventPriority
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerInteractEvent
import org.bukkit.event.player.PlayerJoinEvent

class Listener : Listener {

    @EventHandler
    fun onPlayerJoin(event: PlayerJoinEvent) {
        SendMessageEffect.sendMessageToOnlinePlayers("This server is running Ribbon! Use /ribbon to get started!")
    }

    @EventHandler(priority = EventPriority.HIGH)
    fun onPlayerInteraction(event: PlayerInteractEvent) {
        val targetItem = event.player.inventory.itemInMainHand
        val executeItem = ExecuteItemEffect.getExecuteItemByItem(targetItem)
        if (executeItem.isNone()) return

        executeItem.map {
            it.execute(event.player)
            event.isCancelled = true
        }
    }
}
