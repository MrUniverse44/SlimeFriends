package dev.mruniverse.slimefriends.common;


public interface SlimeFriends extends SlimePlugin {

    InitializeMode getServerType();

    SlimeLogs getLogs();

    void reload();


}
