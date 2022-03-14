package dev.mruniverse.slimefriends.spigot.logs;

import dev.mruniverse.slimefriends.common.SlimeLogs;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class SpigotLogs implements SlimeLogs {

    private final JavaPlugin plugin;

    public SpigotLogs(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    private String color(String message) {
        return ChatColor.translateAlternateColorCodes('&', message);
    }

    @Override
    public void send(String message) {
        plugin.getServer().getConsoleSender().sendMessage(color(message));
    }
}

