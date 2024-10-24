package dev.m1sk9.ribbon.listener

import dev.m1sk9.ribbon.ExecuteItemManager
import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.EventPriority
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerInteractEvent

class PlayerInteractListener : Listener {

    @EventHandler(priority = EventPriority.NORMAL)
    fun onInteract(event: PlayerInteractEvent) {
        val player = event.player
        val item = player.inventory.itemInMainHand

        if (item.isEmpty || item.type == Material.AIR) {
            return
        }

        val executeItems = ExecuteItemManager().getItems()

        executeItems.forEach {
            if (!item.isSimilar(it.getItemStack())) {
                return@forEach
            }
            it.execute(player)
            event.isCancelled = true
        }
    }
}
