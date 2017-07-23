package me.inventor02.intrachat.commands;

import me.inventor02.intrachat.messages.Messages;
import me.shawlaf.cmdlib.AbstractCommand;
import me.shawlaf.cmdlib.Arguments;
import me.shawlaf.cmdlib.Sender;
import me.shawlaf.cmdlib.info.Command;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

@Command(name = "aboutintrachat", description = "Displays information about IntraChat", usage = "/aboutintrachat", canBeUsedBy = {Player.class, ConsoleCommandSender.class})
public class CommandAbout extends AbstractCommand {
    public CommandAbout(Plugin plugin) {
        super(plugin);
        asynchronous = true;
    }

    @Override
    public void execute(Sender sender, Arguments args) {
        sender.sendMessage(Messages.Info.ABOUT_PLUGIN.format());
        sender.sendMessage(Messages.Info.LICENSE.format());
    }
}
