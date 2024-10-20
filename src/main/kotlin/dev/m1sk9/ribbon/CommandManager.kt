package dev.m1sk9.ribbon

import dev.m1sk9.ribbon.command.ItemCommand
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

        ItemCommand(sender).execute()

        // TODO: Add more commands?
        return true
    }
}
