package com.mobpractise.Events;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class onPlayerJoinEvent implements Listener {
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		player.getWorld().spawnEntity(player.getLocation().add(player.getLocation().getDirection().setY(0).normalize().multiply(2)), EntityType.COW);
	}
}
