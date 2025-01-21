package dev.m1sk9.ribbon.utils

import arrow.core.Option
import dev.m1sk9.ribbon.ExecuteItem
import dev.m1sk9.ribbon.items.SwitchDifficulty
import dev.m1sk9.ribbon.items.SwitchGameMode
import dev.m1sk9.ribbon.items.SwitchOperator
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack

/**
 * Utility object to handle the execution of item effects.
 */
object ExecuteItemEffect {

    private val executeItemList = mutableListOf(
        SwitchGameMode(),
        SwitchOperator(),
        SwitchDifficulty()
    )

    /**
     * Gives all execute items to the specified player by adding them to the player's inventory.
     * If the item you are trying to add exists, it will be skipped.
     *
     * @param destination The player to whom the items will be given.
     */
    fun giveExecuteItemToPlayer(destination: Player) {
        executeItemList.forEach {
            if (destination.inventory.contains(it.build())) return@forEach
            destination.inventory.addItem(it.build())
        }
    }

    /**
     * Retrieves the list of execute items.
     *
     * @return A mutable list of execute items.
     */
    fun getExecuteItem(): MutableList<ExecuteItem> {
        return executeItemList
    }

    /**
     * Finds an execute item that matches the given item stack.
     *
     * @param searchQuery The item stack to search for.
     * @return An Option containing the matching execute item, or None if no match is found.
     */
    fun getExecuteItemByItem(searchQuery: ItemStack): Option<ExecuteItem> {
        return Option.fromNullable(executeItemList.find { it.build().isSimilar(searchQuery) })
    }
}
