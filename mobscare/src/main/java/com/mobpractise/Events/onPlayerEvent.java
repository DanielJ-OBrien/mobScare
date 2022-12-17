package com.mobpractise.Events;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import com.mobpractise.theCreature;

public class onPlayerEvent implements Listener {
	theCreature creature = new theCreature();
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		Entity spawnedEntity = player.getWorld().spawnEntity(player.getLocation().add(player.getLocation().getDirection().setY(0).normalize().multiply(2)), EntityType.COW);
		spawnedEntity.setCustomName("bruh");
		creature.addCreature(spawnedEntity);
	}
	@EventHandler
	public void onPlayerQuit(PlayerQuitEvent event) {
		Entity trueCreature = creature.returnTheCreature();
		trueCreature.remove();
		}
}
