package me.inventor02.intrachat;

import me.inventor02.intrachat.commands.CommandAbout;
import me.inventor02.intrachat.commands.CommandManager;
import org.bukkit.plugin.java.JavaPlugin;

public class IntraChat extends JavaPlugin {
    private static IntraChat instance;

    @Override
    public void onEnable() {
        // TODO: Messages
        instance = this;

        CommandManager.registerCommands();
    }

    @Override
    public void onDisable() {
        // TODO: Messages
    }

    public static IntraChat getInstance() {
        return instance;
    }
}
