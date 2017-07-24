package me.inventor02.intrachat;

import me.inventor02.intrachat.commands.CommandManager;
import me.inventor02.intrachat.metrics.Metrics;
import me.inventor02.intrachat.utils.VersionRelationManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;

public class IntraChat extends JavaPlugin {
    private static IntraChat instance;

    public static final int INTERNAL_VERSION = 1;

    @Override
    public void onEnable() {
        instance = this;

        CommandManager.registerCommands();

        try {
            Metrics metrics = new Metrics(this);
            metrics.start();
        } catch(IOException e) {
            getLogger().warning("Metrics failed to start. No statistics will be sent :(");
        }

        boolean hasUpdatesAvailable = VersionRelationManager.hasUpdatesAvailable();
        if(hasUpdatesAvailable)
            getLogger().info("Updates are available!");

        String versionMessage = VersionRelationManager.getMessage();
        if(! versionMessage.equals(""))
            getLogger().info(versionMessage);
    }

    @Override
    public void onDisable() {
        //
    }

    public static IntraChat getInstance() {
        return instance;
    }
}
