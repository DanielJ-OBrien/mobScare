package com.mobpractise;

import org.bukkit.plugin.java.JavaPlugin;
import com.mobpractise.Events.OnPlayerEvent;

public class App extends JavaPlugin {
    @Override
    public void onEnable() {
        this.saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new OnPlayerEvent(), this);
        //getServer().getWorlds().get(0).getLivingEntities()
    }
}
