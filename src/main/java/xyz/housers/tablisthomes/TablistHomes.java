package xyz.housers.tablisthomes;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.housers.tablisthomes.commands.TabHome;
import xyz.housers.tablisthomes.handlers.DiamondHandler;

import java.io.File;

public final class TablistHomes extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        new DiamondHandler(this);

        getCommand("tabhome").setExecutor(new TabHome());


        if (!this.getDataFolder().exists())
            this.getDataFolder().mkdir();


        getLogger().warning("Startup Finished!");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
