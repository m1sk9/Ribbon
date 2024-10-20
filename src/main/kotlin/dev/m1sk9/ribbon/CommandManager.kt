package dev.m1sk9.ribbon

import dev.m1sk9.ribbon.actions.MessageAction
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import org.bukkit.plugin.Plugin

class CommandManager(private val plugin: Plugin) : CommandExecutor {

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<String>): Boolean {
        if (sender !is Player) {
            plugin.logger.warning("This command can only be executed by players.")
            return false
        }

        val itemManager = ExecuteItemManager()
        itemManager.getItems().forEach {
            sender.inventory.addItem(it.getItemStack())
        }
        MessageAction(sender).sendActionBar("Added all debug items to your inventory!")

        // TODO: Add more commands?
        return true
    }
}
