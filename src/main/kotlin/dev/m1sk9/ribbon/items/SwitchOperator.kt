package dev.m1sk9.ribbon.items

import dev.m1sk9.ribbon.ExecuteItem
import dev.m1sk9.ribbon.utils.SendMessageEffect
import org.bukkit.Material
import org.bukkit.entity.Player

class SwitchOperator : ExecuteItem(
    "Switch Operator",
    listOf("Switch your operator"),
    Material.STICK
) {
    override fun execute(executePlayer: Player) {
        executePlayer.apply {
            isOp = !isOp
            SendMessageEffect.sendActionBarMessageToOnlinePlayers("$name is now ${if (isOp) "an operator" else "not an operator"}.")
        }
    }
}
