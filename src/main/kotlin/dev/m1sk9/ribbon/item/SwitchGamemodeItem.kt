package dev.m1sk9.ribbon.item

import org.bukkit.Material
import org.bukkit.inventory.ItemStack

class SwitchGamemodeItem : ExecuteItem(
    "ゲームモード切り替え",
    listOf("ゲームモードを クリエイティブモード / サバイバルモード の間で切り替えます"),
    ItemStack.of(Material.DIAMOND_SWORD),
) {
    init {
        defaultSetting = {
            it
        }
    }
}
