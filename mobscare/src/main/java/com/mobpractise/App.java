package com.mobpractise;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import com.mobpractise.Events.OnPlayerEvent;

public class App extends JavaPlugin {

    public static App plugin;
    private FileConfiguration config = getConfig();

    @Override
    public void onEnable() {

        plugin = this;
        config.addDefault("entityName", "John");
        config.addDefault("entityType", "COW");
        config.options().copyDefaults(true);
        saveConfig();

        getServer().getPluginManager().registerEvents(new OnPlayerEvent(), this);
    }

    public String getCustomName() {
        return config.getString("entityName");
    }
    public String getCustomEntity(){
        return config.getString("entityType");
    }

}

