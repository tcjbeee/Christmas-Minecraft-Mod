package net.tcjbeee.christmasminecraftmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.tcjbeee.christmasminecraftmod.ChristmasMinecraftMod;
import net.tcjbeee.christmasminecraftmod.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ChristmasMinecraftMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        // Valuables
        simpleItem(ModItems.SAPPHIRE);
        simpleItem(ModItems.RAW_SAPPHIRE);

        // Mob Spawn Eggs
        withExistingParent(ModItems.TURKEY_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));


        // Foods
        simpleItem(ModItems.AFTER_EIGHTS);
        simpleItem(ModItems.BRUSSEL_SPROUT);
        simpleItem(ModItems.CANDYCANE);
        simpleItem(ModItems.CARBONARA);
        simpleItem(ModItems.CHOCOLATE_ORANGE);
        simpleItem(ModItems.CHRISTMAS_PUDDING);
        simpleItem(ModItems.COOKED_BACON);
        simpleItem(ModItems.COOKED_SAUSAGE);
        simpleItem(ModItems.COOKED_TURKEY);
        simpleItem(ModItems.CRANBERRY_SAUCE);
        simpleItem(ModItems.FLAMING_CHRISTMAS_PUDDING);
        simpleItem(ModItems.GOLDEN_TURKEY);
        simpleItem(ModItems.PIGS_IN_BLANKETS);
        simpleItem(ModItems.RAW_BACON);
        simpleItem(ModItems.RAW_PIGS_IN_BLANKETS);
        simpleItem(ModItems.RAW_SAUSAGE);
        simpleItem(ModItems.RAW_TURKEY);
        simpleItem(ModItems.SOAKED_CHRISTMAS_PUDDING);
        simpleItem(ModItems.STRAWBERRY);
        simpleItem(ModItems.STUFFING);
        simpleItem(ModItems.YORKSHIRE_PUDDING);
        simpleItem(ModItems.BLUE_QUALITY_STREET);
        simpleItem(ModItems.CYAN_QUALITY_STREET);
        simpleItem(ModItems.GREEN_QUALITY_STREET);
        simpleItem(ModItems.LIME_QUALITY_STREET);
        simpleItem(ModItems.ORANGE_QUALITY_STREET);
        simpleItem(ModItems.PINK_QUALITY_STREET);
        simpleItem(ModItems.PURPLE_QUALITY_STREET);
        simpleItem(ModItems.RED_QUALITY_STREET);
        simpleItem(ModItems.YELLOW_QUALITY_STREET);
        simpleItem(ModItems.QUALITY_STREET_BOX);

        // Tools

        handheldItem(ModItems.METAL_PIPE);
        handheldItem(ModItems.METAL_DETECTOR);

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ChristmasMinecraftMod.MODID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(ChristmasMinecraftMod.MODID, "item/" + item.getId().getPath()));
    }
}
