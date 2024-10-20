package dev.m1sk9.ribbon

import org.bukkit.plugin.java.JavaPlugin

class Ribbon : JavaPlugin() {

    override fun onEnable() {
        logger.info("Ribbon v0.1.0 enabled!")
    }

    override fun onDisable() {
        logger.info("Ribbon disabled! Goodbye!")
    }
}
