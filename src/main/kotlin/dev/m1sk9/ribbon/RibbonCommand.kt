package dev.m1sk9.ribbon

import dev.m1sk9.ribbon.menu.SoundboardMenu
import net.kyori.adventure.text.Component
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.command.TabExecutor
import org.bukkit.entity.Player
import org.bukkit.plugin.Plugin

class RibbonCommand(private val plugin: Plugin) : CommandExecutor, TabExecutor {

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<String>): Boolean {
        if (sender !is Player) {
            plugin.logger.warning("This command can only be executed by players.")
            return false
        }

        // sender -> player

        if (args.isEmpty()) {
            sender.apply {
                ExecuteItemManager().getItems().forEach {
                    inventory.addItem(it.getItemStack())
                }
                sendActionBar(Component.text("§a[Ribbon] Added all debug items to your inventory!"))
            }
            return true
        }

        when (args[0]) {
            "soundboard" -> {
                SoundboardMenu().sendMenu(sender)
            }
            else -> {
                sender.apply {
                    sendMessage("§c[Ribbon] Unknown subcommand: ${args[0]}")
                    sendMessage("§c --- Available subcommands: [soundboard]")
                }
            }
        }

        return true
    }

    override fun onTabComplete(sender: CommandSender, command: Command, alias: String, args: Array<String>): List<String> {
        return when (args.size) {
            1 -> listOf("soundboard")
            else -> emptyList()
        }
    }
}
