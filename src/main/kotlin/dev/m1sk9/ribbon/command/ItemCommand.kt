package dev.m1sk9.ribbon.command

import dev.m1sk9.ribbon.ExecuteItemManager
import dev.m1sk9.ribbon.actions.MessageAction
import org.bukkit.entity.Player

class ItemCommand: SubCommandExecutor {

    override fun execute(player: Player, args: Array<String>): Boolean {
        val itemManager = ExecuteItemManager()
        itemManager.getItems().forEach {
            player.inventory.addItem(it.getItemStack())
        }
        MessageAction(player).sendActionBar("Added all debug items to your inventory!")

        return true
    }
}
