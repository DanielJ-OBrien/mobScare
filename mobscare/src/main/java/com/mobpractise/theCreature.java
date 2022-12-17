package com.mobpractise;

import org.bukkit.entity.Entity;

public class theCreature {

    private Entity[] creatureArray = new Entity[10];

    public  void addCreature(Entity creatureId) {
        creatureArray[0] = creatureId;
    }

    public Entity returnTheCreature() {
        return creatureArray[0];
    }

}