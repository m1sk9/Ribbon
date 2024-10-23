package dev.m1sk9.ribbon

import dev.m1sk9.ribbon.actions.MessageAction
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

        if (args.isEmpty()) {
            ItemCommand().execute(sender, args)
            return false
        }

        when (args[0]) {
            else -> {
                MessageAction(sender).apply {
                    sendError("Invalid sub-command: ${args[0]}")
                    send("Usage: /${label} [items]")
                }
            }
        }

        return true
    }
}
