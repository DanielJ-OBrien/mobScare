package com.mobpractise;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import com.mobpractise.Events.onPlayerJoinEvent;

public class App extends JavaPlugin {
    FileConfiguration config = this.getConfig();
    @Override
    public void onEnable() {
        this.saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new onPlayerJoinEvent(), this);
    }
}
