package net.tcjbeee.christmasminecraftmod.event;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.tcjbeee.christmasminecraftmod.ChristmasMinecraftMod;
import net.tcjbeee.christmasminecraftmod.entity.ModEntities;
import net.tcjbeee.christmasminecraftmod.entity.custom.TurkeyEntity;

@Mod.EventBusSubscriber(modid = ChristmasMinecraftMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntities.TURKEY.get(), TurkeyEntity.setAttribute());
    }
}
