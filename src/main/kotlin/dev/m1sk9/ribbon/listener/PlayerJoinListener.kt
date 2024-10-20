package dev.m1sk9.ribbon.listener

import dev.m1sk9.ribbon.actions.MessageAction
import org.bukkit.event.EventHandler
import org.bukkit.event.EventPriority
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

class PlayerJoinListener : Listener {

    @EventHandler(priority = EventPriority.LOW)
    fun onJoin(event: PlayerJoinEvent) {
        val player = event.player
        MessageAction(player).apply {
            send("このサーバーでは Ribbon が有効になっています。デバッグアイテムを入手には [/ribbon items] を実行してください。")
        }
    }
}
