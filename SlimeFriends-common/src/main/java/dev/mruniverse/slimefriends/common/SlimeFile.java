package dev.mruniverse.slimefriends.common;

public enum SlimeFile {
    SETTINGS("settings.yml");

    private final String path;

    SlimeFile(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

}
