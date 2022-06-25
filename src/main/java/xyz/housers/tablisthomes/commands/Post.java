package xyz.housers.tablisthomes.commands;

import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.awt.*;

import static org.bukkit.Bukkit.broadcast;

public class Post implements CommandExecutor {
    @Override

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){

        final TextComponent broadcast = new net.md_5.bungee.api.chat.TextComponent();

        Player player = (Player) sender;

        return true;
    }

}
