package dev.m1sk9.ribbon

import org.bukkit.plugin.java.JavaPlugin

class Ribbon : JavaPlugin() {

    override fun onEnable() {
        ListenerManager(this).init()
        this.getCommand("ribbon")?.setExecutor(RibbonCommand(this))
        logger.info("Ribbon v0.2.2 enabled!")
    }

    override fun onDisable() {
        logger.info("Ribbon disabled! Goodbye!")
    }
}
