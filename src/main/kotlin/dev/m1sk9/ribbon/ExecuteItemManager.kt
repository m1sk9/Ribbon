package dev.m1sk9.ribbon

import dev.m1sk9.ribbon.item.ExecuteItem
import dev.m1sk9.ribbon.item.SwitchGamemodeItem

class ExecuteItemManager {

    private val items = mutableMapOf(
        SwitchGamemodeItem().getName() to SwitchGamemodeItem()
    )

    fun getItem(name: String): ExecuteItem? {
        return items[name]
    }

    fun getItems(): List<ExecuteItem> {
        return items.values.toList()
    }
}
