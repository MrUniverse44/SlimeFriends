package dev.mruniverse.slimefriends.bungeecord.logs;

import dev.mruniverse.slimefriends.common.SlimeLogs;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.plugin.Plugin;

public class BungeeLogs implements SlimeLogs {

    private final Plugin plugin;

    public BungeeLogs(Plugin plugin) {
        this.plugin = plugin;
    }

    private String color(String message) {
        return ChatColor.translateAlternateColorCodes('&', message);
    }

    @Override
    public void send(String message) {
        plugin.getProxy().getConsole().sendMessage(new TextComponent(color(message)));
    }
}
