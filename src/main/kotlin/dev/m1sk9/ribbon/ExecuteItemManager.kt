package dev.m1sk9.ribbon

import dev.m1sk9.ribbon.item.*

class ExecuteItemManager {

    private val items = mutableMapOf(
        SwitchGamemodeItem().getName() to SwitchGamemodeItem(),
        SwitchOpItem().getName() to SwitchOpItem(),
        SwitchFlyItem().getName() to SwitchFlyItem(),
        SwitchDifficultyItem().getName() to SwitchDifficultyItem(),
        SetFullHealthItem().getName() to SetFullHealthItem(),
        ClearEntitiesItem().getName() to ClearEntitiesItem(),
        ControlXPItem().getName() to ControlXPItem(),
    )

    fun getItem(name: String): ExecuteItem? {
        return items[name]
    }

    fun getItems(): List<ExecuteItem> {
        return items.values.toList()
    }
}
