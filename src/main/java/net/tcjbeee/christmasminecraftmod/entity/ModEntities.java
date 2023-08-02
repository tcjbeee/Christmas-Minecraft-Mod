package net.tcjbeee.christmasminecraftmod.entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tcjbeee.christmasminecraftmod.ChristmasMinecraftMod;
import net.tcjbeee.christmasminecraftmod.entity.custom.TurkeyEntity;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ChristmasMinecraftMod.MODID);

    public static final RegistryObject<EntityType<TurkeyEntity>> TURKEY =
            ENTITY_TYPES.register("turkey",
                    () -> EntityType.Builder.of(TurkeyEntity::new, MobCategory.CREATURE)
                    .sized(1f, 1.25f)
                    .build(new ResourceLocation(ChristmasMinecraftMod.MODID, "turkey").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
