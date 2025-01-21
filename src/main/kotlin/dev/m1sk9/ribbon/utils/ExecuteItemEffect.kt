package dev.m1sk9.ribbon.utils

import arrow.core.Option
import dev.m1sk9.ribbon.ExecuteItem
import dev.m1sk9.ribbon.items.SwitchDifficulty
import dev.m1sk9.ribbon.items.SwitchGameMode
import dev.m1sk9.ribbon.items.SwitchOperator
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack

object ExecuteItemEffect {

    private val executeItemList = mutableListOf(
        SwitchGameMode(),
        SwitchOperator(),
        SwitchDifficulty()
    )

    fun giveExecuteItemToPlayer(destination: Player) {
        executeItemList.forEach { destination.inventory.addItem(it.build()) }
    }

    fun getExecuteItem(): MutableList<ExecuteItem> {
        return executeItemList
    }

    fun getExecuteItemByItem(searchQuery: ItemStack): Option<ExecuteItem> {
        return Option.fromNullable(executeItemList.find { it.build().isSimilar(searchQuery) })
    }
}
