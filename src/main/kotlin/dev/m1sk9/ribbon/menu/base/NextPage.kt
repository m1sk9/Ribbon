package dev.m1sk9.ribbon.menu.base

import org.bukkit.Material
import xyz.xenondevs.invui.gui.PagedGui
import xyz.xenondevs.invui.item.ItemProvider
import xyz.xenondevs.invui.item.builder.ItemBuilder
import xyz.xenondevs.invui.item.impl.controlitem.PageItem


class NextPage : PageItem(false) {

    override fun getItemProvider(gui: PagedGui<*>): ItemProvider {
        return ItemBuilder(Material.LIME_STAINED_GLASS_PANE).apply {
            setDisplayName("Previous Page")
            addLoreLines(
                if (gui.hasPreviousPage())
                    gui.currentPage.toString() + "/" + gui.pageAmount
                else
                    "First page"
            )
        }
    }
}
