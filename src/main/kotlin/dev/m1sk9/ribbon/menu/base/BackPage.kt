package dev.m1sk9.ribbon.menu.base

import org.bukkit.Material
import xyz.xenondevs.invui.gui.PagedGui
import xyz.xenondevs.invui.item.ItemProvider
import xyz.xenondevs.invui.item.builder.ItemBuilder
import xyz.xenondevs.invui.item.impl.controlitem.PageItem


class BackPage : PageItem(true) {

    override fun getItemProvider(gui: PagedGui<*>): ItemProvider {
        return ItemBuilder(Material.RED_STAINED_GLASS_PANE).apply {
            setDisplayName("Next page")
            addLoreLines(
                if (gui.hasNextPage())
                    (gui.currentPage + 2).toString() + "/" + gui.pageAmount
                else
                    "Last page"
            )
        }
    }
}
