package dev.m1sk9.ribbon.actions

import net.kyori.adventure.sound.Sound
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.TextColor
import org.bukkit.entity.Player

class MessageAction(private val targetPlayer: Player) {

    private val prefix = "[Ribbon] "

    fun send(message: String) {
        targetPlayer.sendMessage(Component.text(prefix + message).color(TextColor.color(0x17C7FF)))
    }

    fun sendActionBar(message: String) {
        targetPlayer.sendActionBar(Component.text(prefix + message).color(TextColor.color(0x17C7FF)))
    }

    fun sendSuccess(message: String) {
        targetPlayer.sendActionBar(Component.text(prefix + message).color(TextColor.color(0x00FF00)))
        targetPlayer.playSound(Sound.sound(org.bukkit.Sound.BLOCK_NOTE_BLOCK_FLUTE, Sound.Source.PLAYER, 1.0f, 1.0f))
    }

    fun sendError(message: String) {
        targetPlayer.sendActionBar(Component.text(prefix + message).color(TextColor.color(0xFF0000)))
        targetPlayer.playSound(Sound.sound(org.bukkit.Sound.BLOCK_NOTE_BLOCK_BASS, Sound.Source.PLAYER, 1.0f, 1.0f))
    }

    fun sendWarning(message: String) {
        targetPlayer.sendActionBar(Component.text(prefix + message).color(TextColor.color(0xFFA500)))
        targetPlayer.playSound(Sound.sound(org.bukkit.Sound.BLOCK_NOTE_BLOCK_CHIME, Sound.Source.PLAYER, 1.0f, 1.0f))
    }

}
