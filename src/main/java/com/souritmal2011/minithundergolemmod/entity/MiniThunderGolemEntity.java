package com.souritmal2011.minithundergolemmod.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;

public class MiniThunderGolemEntity extends TamableAnimal {
    protected MiniThunderGolemEntity(EntityType<? extends TamableAnimal> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    public void tick() {
        super.tick();
        // Custom behavior code here
    }
}
