package dev.m1sk9.ribbon

import org.bukkit.plugin.java.JavaPlugin

class Ribbon : JavaPlugin() {

    override fun onEnable() {
        getCommand("ribbon")?.setExecutor(Command())
        server.pluginManager.registerEvents(Listener(), this)
        logger.warning {
            """
            -------------------------------------------------
            Ribbon is sunsetting with v0.3.2. (1.18.2 Supported versions too!)
            This plugin is no longer maintained and will not receive any updates.
            If you want to continue using Ribbon, please fork the repository and maintain it yourself.

            GitHub: https://github.com/m1sk9/Ribbon
            Modrinth: https://modrinth.com/plugin/ribbon
            ------------------------------------------------
            """.trimMargin()
        }
        logger.info("Ribbon v0.3.2-bp-1-18-2 enabled!")
    }

    override fun onDisable() {
        logger.info("Ribbon disabled! Goodbye!")
    }
}
