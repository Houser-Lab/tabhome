package xyz.housers.tablisthomes.handlers;

import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import xyz.housers.tablisthomes.TablistHomes;
import xyz.housers.tablisthomes.commands.TabHome;

public class JoinHandler implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e){

        Player p = e.getPlayer();

        PersistentDataContainer data = p.getPersistentDataContainer();

        if (!data.has(new NamespacedKey(TablistHomes.getPlugin(), "homecount"), PersistentDataType.INTEGER)){

            data.set(new NamespacedKey(TablistHomes.getPlugin(), "homecount"), PersistentDataType.INTEGER, 0);

        }
        if (!data.has(new NamespacedKey(TablistHomes.getPlugin(), "1Set"), PersistentDataType.INTEGER)){

            data.set(new NamespacedKey(TablistHomes.getPlugin(), "1Set"), PersistentDataType.INTEGER, 0);

        }
        if (!data.has(new NamespacedKey(TablistHomes.getPlugin(), "1Name"), PersistentDataType.STRING)){

            data.set(new NamespacedKey(TablistHomes.getPlugin(), "1Name"), PersistentDataType.STRING, " ");

        }
        if (!data.has(new NamespacedKey(TablistHomes.getPlugin(), "x1"), PersistentDataType.INTEGER)){

            data.set(new NamespacedKey(TablistHomes.getPlugin(), "x1"), PersistentDataType.INTEGER, 0);

        }
        if (!data.has(new NamespacedKey(TablistHomes.getPlugin(), "y1"), PersistentDataType.INTEGER)){

            data.set(new NamespacedKey(TablistHomes.getPlugin(), "y1"), PersistentDataType.INTEGER, 0);

        }
        if (!data.has(new NamespacedKey(TablistHomes.getPlugin(), "z1"), PersistentDataType.INTEGER)){

            data.set(new NamespacedKey(TablistHomes.getPlugin(), "z1"), PersistentDataType.INTEGER, 0);
        }
        if (!data.has(new NamespacedKey(TablistHomes.getPlugin(), "2Set"), PersistentDataType.INTEGER)){

            data.set(new NamespacedKey(TablistHomes.getPlugin(), "2Set"), PersistentDataType.INTEGER, 0);

        }
        if (!data.has(new NamespacedKey(TablistHomes.getPlugin(), "2Name"), PersistentDataType.STRING)){

            data.set(new NamespacedKey(TablistHomes.getPlugin(), "2Name"), PersistentDataType.STRING, " ");

        }
        if (!data.has(new NamespacedKey(TablistHomes.getPlugin(), "x2"), PersistentDataType.INTEGER)){

            data.set(new NamespacedKey(TablistHomes.getPlugin(), "x2"), PersistentDataType.INTEGER, 0);

        }
        if (!data.has(new NamespacedKey(TablistHomes.getPlugin(), "y2"), PersistentDataType.INTEGER)){

            data.set(new NamespacedKey(TablistHomes.getPlugin(), "y2"), PersistentDataType.INTEGER, 0);

        }
        if (!data.has(new NamespacedKey(TablistHomes.getPlugin(), "z2"), PersistentDataType.INTEGER)){

            data.set(new NamespacedKey(TablistHomes.getPlugin(), "z2"), PersistentDataType.INTEGER, 0);

        }

    }

}
