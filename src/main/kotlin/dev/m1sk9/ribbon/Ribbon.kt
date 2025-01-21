package dev.m1sk9.ribbon

import org.bukkit.plugin.java.JavaPlugin

class Ribbon : JavaPlugin() {

    override fun onEnable() {
        getCommand("ribbon")?.setExecutor(Command())
        server.pluginManager.registerEvents(Listener(), this)
        logger.info("Ribbon v0.3.0 enabled!")
    }

    override fun onDisable() {
        logger.info("Ribbon disabled! Goodbye!")
    }
}
