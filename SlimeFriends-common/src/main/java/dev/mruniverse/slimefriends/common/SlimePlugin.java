package dev.mruniverse.slimefriends.common;

import java.io.File;

public interface SlimePlugin {

    File getDataFolder();

    default File getSlimeFile(SlimeFile file) {
        return new File(getDataFolder(), file.getPath());
    }
}
