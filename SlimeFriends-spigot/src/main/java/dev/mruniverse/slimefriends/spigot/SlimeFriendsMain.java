package dev.mruniverse.slimefriends.spigot;

import dev.mruniverse.slimefriends.common.InitializeMode;
import dev.mruniverse.slimefriends.common.SlimeFriends;
import dev.mruniverse.slimefriends.common.SlimeLoader;
import dev.mruniverse.slimefriends.common.SlimeLogs;
import dev.mruniverse.slimefriends.spigot.logs.SpigotLogs;
import org.bukkit.plugin.java.JavaPlugin;

public final class SlimeFriendsMain extends JavaPlugin implements SlimeFriends {

    private SlimeLogs logs;
    private SlimeLoader loader;

    @Override
    public void onEnable() {
        logs = new SpigotLogs(this);
        loader = new SlimeLoader(this);

        loader.init();
    }

    @Override
    public void onDisable() {
        loader.shutdown();
    }

    @Override
    public InitializeMode getServerType() {
        return InitializeMode.SPIGOT;
    }

    @Override
    public SlimeLogs getLogs() {
        return logs;
    }

    @Override
    public void reload() {
        loader.reload();
    }
}