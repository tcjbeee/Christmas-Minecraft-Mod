package net.tcjbeee.christmasminecraftmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.tcjbeee.christmasminecraftmod.ChristmasMinecraftMod;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ChristmasMinecraftMod.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // EXAMPLE    blockWithItem(ModBlocks.BLACK_OPAL_BLOCK);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
