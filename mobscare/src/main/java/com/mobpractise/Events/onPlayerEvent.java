package com.mobpractise.Events;

import com.mobpractise.App;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class OnPlayerEvent implements Listener {

	private App plugin;
	private Entity[] creatureArray = new Entity[10];

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		
		plugin = App.plugin;
		String customName = plugin.getCustomName();
		String customEntity = plugin.getCustomEntity();

		Player player = event.getPlayer();
		Entity spawnedEntity = player.getWorld().spawnEntity(player.getLocation().add(player.getLocation().getDirection().setY(0).normalize().multiply(2)), EntityType.valueOf(customEntity));
		spawnedEntity.setCustomName(customName);
		spawnedEntity.setPersistent(false);
		creatureArray[0] = (spawnedEntity);
	}
	@EventHandler
	public void onPlayerQuit(PlayerQuitEvent event) {
		Entity trueCreature = creatureArray[0];
		trueCreature.remove();
	}
}
