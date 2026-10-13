package com.souritmal2011.minithundergolemmod.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;

public class ElectricBallEntity extends ThrowableItemProjectile {
    public ElectricBallEntity(EntityType<? extends ThrowableItemProjectile> entityType, Level level) {
        super(entityType, level);
    }

    public ElectricBallEntity(Level level, double x, double y, double z) {
        super(EntityType.SNOWBALL, x, y, z, level);
    }

    @Override
    protected Item getDefaultItem() {
        return null; // Replace with your custom item
    }
}
