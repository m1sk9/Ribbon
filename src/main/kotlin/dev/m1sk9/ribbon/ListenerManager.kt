package dev.m1sk9.ribbon

import dev.m1sk9.ribbon.listener.PlayerInteractListener
import dev.m1sk9.ribbon.listener.PlayerJoinListener
import org.bukkit.Bukkit

class ListenerManager(private val plugin: Ribbon) {

    fun init() {
        listOf(
            PlayerJoinListener(),
            PlayerInteractListener()
        ).forEach {
            Bukkit.getPluginManager().registerEvents(it, plugin)
        }
    }
}
