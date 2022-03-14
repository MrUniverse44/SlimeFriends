package dev.mruniverse.slimefriends.bungeecord;

import dev.mruniverse.slimefriends.bungeecord.logs.BungeeLogs;
import dev.mruniverse.slimefriends.common.InitializeMode;
import dev.mruniverse.slimefriends.common.SlimeFriends;
import dev.mruniverse.slimefriends.common.SlimeLoader;
import dev.mruniverse.slimefriends.common.SlimeLogs;
import net.md_5.bungee.api.plugin.Plugin;

@SuppressWarnings("unused")
public final class SlimeFriendsMain extends Plugin implements SlimeFriends {

    private SlimeLogs logs;
    private SlimeLoader loader;

    @Override
    public void onEnable() {
        logs = new BungeeLogs(this);
        loader = new SlimeLoader(this);

        loader.init();
    }

    @Override
    public void onDisable() {
        loader.shutdown();
    }

    @Override
    public InitializeMode getServerType() {
        return InitializeMode.BUNGEECORD;
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
