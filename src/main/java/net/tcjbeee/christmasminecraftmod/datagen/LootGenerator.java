package net.tcjbeee.christmasminecraftmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.tcjbeee.christmasminecraftmod.loot.modifiers.ModLootTables;

import java.util.List;
import java.util.Map;

public class LootGenerator extends LootTableProvider {
    public LootGenerator(PackOutput pOutput) {
        super(pOutput, ModLootTables.allBuiltIn(), List.of(
                new LootTableProvider.SubProviderEntry(ModEntityLootTables::new, LootContextParamSets.ENTITY),
                new LootTableProvider.SubProviderEntry(ModBlockLootTables::new, LootContextParamSets.BLOCK)
                // Will need to copy these for Chest & Empty (only if special loot)
        ));
    }

    @Override
    protected void validate(Map<ResourceLocation, LootTable> map, ValidationContext validationcontext) {

    }
}
