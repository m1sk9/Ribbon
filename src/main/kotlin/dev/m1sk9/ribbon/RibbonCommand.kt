package dev.m1sk9.ribbon

import net.kyori.adventure.text.Component
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.bukkit.plugin.Plugin

class RibbonCommand(private val plugin: Plugin) : CommandExecutor {

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<String>): Boolean {
        if (sender !is Player) {
            plugin.logger.warning("This command can only be executed by players.")
            return false
        }

        // sender -> player
        sender.apply {
            ExecuteItemManager().getItems().forEach {
                inventory.addItem(it.getItemStack())
            }
            sendActionBar(Component.text("§a[Ribbon] Added all debug items to your inventory!"))
        }

        return true
    }
}