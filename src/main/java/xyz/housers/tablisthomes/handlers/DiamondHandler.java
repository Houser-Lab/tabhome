package xyz.housers.tablisthomes.handlers;

import net.kyori.adventure.text.serializer.plain.PlainTextComponentSerializer;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import xyz.housers.tablisthomes.TablistHomes;

import static org.bukkit.Bukkit.getLogger;

public class DiamondHandler implements Listener {
    public DiamondHandler(TablistHomes plugin) {
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onDiamondPlace(BlockBreakEvent event) {
        Block block = event.getBlock();

        if (block.getType() == Material.DIAMOND_ORE) {
            Player player = event.getPlayer();
            getLogger().warning(PlainTextComponentSerializer.plainText().serialize(player.displayName()) + " just mined a diamond!");
            player.sendMessage("YOU JUST MINED A DIAMOND THAT'S AMAZING!");
        }
        else if (block.getType() == Material.DEEPSLATE_DIAMOND_ORE) {
            Player player = event.getPlayer();
            getLogger().warning(PlainTextComponentSerializer.plainText().serialize(player.displayName()) + " just mined a diamond way down deep!");
            player.sendMessage("YOU JUST MINED A DEEP DOWN DIAMOND THAT'S AMAZING!");
        }
        return;

    }
}
