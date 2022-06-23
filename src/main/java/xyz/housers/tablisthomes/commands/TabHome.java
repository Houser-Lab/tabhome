package xyz.housers.tablisthomes.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import java.util.Objects;

public class TabHome implements CommandExecutor {
    @Override

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage("This command is only for players silly!");
            return true;
        }

        Player player = (Player) sender;

        if (args.length == 0){
            player.sendMessage("§c§lPlease specify <set>, or <del> to modify your homes.");
            return false;
        }

/**
 * please watch this video to finish persistent storage of the homes on the player NBT data
 * https://www.youtube.com/watch?v=wz8oKcPUzHY
 * https://www.youtube.com/watch?v=wz8oKcPUzHYhttps://www.youtube.com/watch?v=wz8oKcPUzHY
 * https://www.youtube.com/watch?v=wz8oKcPUzHY
 * https://www.youtube.com/watch?v=wz8oKcPUzHY
 *
 */
        if (Objects.equals(args[0], "set")){
                player.sendMessage("§lyou chose to set");

        } else if (Objects.equals(args[0], "del")) {
                player.sendMessage("§lyou chose to delete");

        } else {
            player.sendMessage("§c§lPlease specify <set>, or <del> to modify your homes.");
            return false;
        }



        return true;

    }
}
