package dev.m1sk9.ribbon.menu

import dev.m1sk9.ribbon.menu.base.BackPage
import dev.m1sk9.ribbon.menu.base.NextPage
import org.bukkit.Material
import org.bukkit.Sound
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack
import xyz.xenondevs.invui.gui.PagedGui
import xyz.xenondevs.invui.gui.structure.Markers
import xyz.xenondevs.invui.item.impl.SimpleItem
import xyz.xenondevs.invui.window.Window


class SoundboardMenu: ExecuteMenu {

    override fun sendMenu(player: Player) {
        val soundList: List<Sound> = Sound.entries;

        val border = SimpleItem(ItemStack.of(Material.LIGHT_BLUE_STAINED_GLASS_PANE));
        val soundboardGui = PagedGui.items().apply {
            setStructure(
                "x x x x x x x x #",
                "x x x x x x x x u",
                "x x x x x x x x d",
                "x x x x x x x x #"
            )
            addIngredient('#', border)
            addIngredient('u', NextPage())
            addIngredient('d', BackPage())
            addIngredient('x', Markers.CONTENT_LIST_SLOT_HORIZONTAL)
            setContent(soundList.map { sound ->
                SoundboardItem(sound)
            })
        }.build()

        Window.single().apply {
            setViewer(player)
            setGui(soundboardGui)
            setTitle("Soundboard")
        }.build().open()
    }
}
