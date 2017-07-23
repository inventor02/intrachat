package me.inventor02.intrachat.commands;

import me.inventor02.intrachat.IntraChat;
import me.shawlaf.cmdlib.AbstractCommand;

public class CommandManager {
    public static void registerCommands() {
        new CommandAbout(IntraChat.getInstance());
    }
}
