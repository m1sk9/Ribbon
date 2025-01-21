package dev.m1sk9.ribbon

import dev.m1sk9.ribbon.utils.ExecuteItemEffect
import dev.m1sk9.ribbon.utils.SendMessageEffect
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class Command : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<String>): Boolean {
        if (sender !is Player) return false

        if (args.isEmpty()) {
            sender.apply {
                ExecuteItemEffect.giveExecuteItemToPlayer(this)
                SendMessageEffect.sendMessageToSpecificPlayer(this, "Given execute items!")
            }
            return true
        }

        return true
    }
}
