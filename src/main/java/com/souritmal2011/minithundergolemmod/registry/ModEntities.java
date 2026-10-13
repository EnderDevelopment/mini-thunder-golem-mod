package com.souritmal2011.minithundergolemmod.registry;

import com.souritmal2011.minithundergolemmod.entity.ElectricBallEntity;
import com.souritmal2011.minithundergolemmod.entity.MiniThunderGolemEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, "minithundergolemmod");

    public static final RegistryObject<EntityType<MiniThunderGolemEntity>> MINI_THUNDER_GOLEM = ENTITIES.register("mini_thunder_golem",
            () -> EntityType.Builder.of(MiniThunderGolemEntity::new, MobCategory.CREATURE)
                    .sized(0.6f, 1.8f)
                    .build("mini_thunder_golem"));

    public static final RegistryObject<EntityType<ElectricBallEntity>> ELECTRIC_BALL = ENTITIES.register("electric_ball",
            () -> EntityType.Builder.<ElectricBallEntity>of(ElectricBallEntity::new, MobCategory.MISC)
                    .sized(0.25f, 0.25f)
                    .build("electric_ball"));
}
