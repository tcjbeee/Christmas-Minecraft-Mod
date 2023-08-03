package net.tcjbeee.christmasminecraftmod.loot.modifiers;

import com.google.common.collect.Sets;
import net.minecraft.resources.ResourceLocation;
import net.tcjbeee.christmasminecraftmod.ChristmasMinecraftMod;

import java.util.Collections;
import java.util.Set;

public class ModLootTables {

    private static final Set<ResourceLocation> MOD_LOOT_TABLES = Sets.newHashSet();


    //public static final ResourceLocation TURKEY = register("entities/turkey");


    private static ResourceLocation register(String id) {
        return register(ChristmasMinecraftMod.prefix(id));
    }

    private static ResourceLocation register(ResourceLocation id) {
        if (MOD_LOOT_TABLES.add(id)) {
            return id;
        } else {
            throw new IllegalArgumentException(id + " is already a registered built-in loot table");
        }
    }

    public static Set<ResourceLocation> allBuiltIn() {
        return Collections.unmodifiableSet(MOD_LOOT_TABLES);
    }
}
