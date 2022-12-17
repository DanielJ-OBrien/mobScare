package com.mobpractise;

import org.bukkit.plugin.java.JavaPlugin;
import com.mobpractise.Events.onPlayerEvent;

public class App extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new onPlayerEvent(), this);
    }
}
