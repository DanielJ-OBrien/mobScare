package com.mobpractise.Events;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class OnPlayerEvent implements Listener {
	private Entity[] creatureArray = new Entity[10];
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		Entity spawnedEntity = player.getWorld().spawnEntity(player.getLocation().add(player.getLocation().getDirection().setY(0).normalize().multiply(2)), EntityType.COW);
		spawnedEntity.setCustomName("bruh");
		creatureArray[0] = (spawnedEntity);
	}
	@EventHandler
	public void onPlayerQuit(PlayerQuitEvent event) {
		Entity trueCreature = creatureArray[0];
		trueCreature.remove();
	}
}
//add config file lol
//use 'on enable' for crashes
//use onentityload to check for customNBT
//research set persisten variable