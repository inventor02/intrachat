package me.inventor02.intrachat;

import org.bukkit.plugin.java.JavaPlugin;

public class IntraChat extends JavaPlugin {
    private static IntraChat instance;

    @Override
    public void onEnable() {
        // TODO: Messages
        instance = this;
    }

    @Override
    public void onDisable() {
        // TODO: Messages
    }

    public static IntraChat getInstance() {
        return instance;
    }
}
