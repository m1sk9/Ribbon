package dev.m1sk9.ribbon.command

import dev.m1sk9.ribbon.ExecuteItemManager
import dev.m1sk9.ribbon.actions.MessageAction
import org.bukkit.entity.Player

class ItemCommand(
    private val player: Player
) {

    fun execute() {
        val itemManager = ExecuteItemManager()
        itemManager.getItems().forEach {
            player.inventory.addItem(it.getItemStack())
        }
        MessageAction(player).sendActionBar("インベントリにアイテムを追加しました")
    }
}
