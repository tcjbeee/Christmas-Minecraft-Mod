package net.tcjbeee.christmasminecraftmod.datagen;

import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.tcjbeee.christmasminecraftmod.block.ModBlocks;
import net.tcjbeee.christmasminecraftmod.item.ModItems;
import net.minecraft.data.recipes.*;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        oreSmelting(consumer, List.of(ModItems.RAW_SAPPHIRE.get()), RecipeCategory.MISC,
                ModItems.SAPPHIRE.get(), 0.7f, 200, "sapphire");

        // SHAPELESS RECIPE

//        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SAPPHIRE.get())
//                .requires(ModBlocks.SAPPHIRE_BLOCK.get())
//                .unlockedBy("has_sapphire_block",inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(ModBlocks.SAPPHIRE_BLOCK.get()).build()))
//                .save(consumer);
//
        // SHAPED RECIPE

//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SAPPHIRE_BLOCK.get())
//                .define('S', ModItems.SAPPHIRE.get())
//                .pattern("SSS")
//                .pattern("SSS")
//                .pattern("SSS")
//                .unlockedBy("has_sapphire", inventoryTrigger(ItemPredicate.Builder.item()
//                        .of(ModItems.SAPPHIRE.get()).build()))
//                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SAPPHIRE_BLOCK.get())
                .define('S', ModItems.SAPPHIRE.get())
              .pattern("SSS")
              .pattern("SSS")
              .pattern("SSS")
              .unlockedBy("has_sapphire", inventoryTrigger(ItemPredicate.Builder.item()
                     .of(ModItems.SAPPHIRE.get()).build()))
              .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_SAPPHIRE_BLOCK.get())
                .define('S', ModItems.RAW_SAPPHIRE.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .unlockedBy("has_raw_sapphire", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.RAW_SAPPHIRE.get()).build()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.RAW_SAUSAGE.get(), 3)
                .define('P', Items.PORKCHOP)
                .pattern(" P ")
                .pattern(" P ")
                .pattern(" P ")
                .unlockedBy("has_porkchop", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.PORKCHOP).build()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.RAW_BACON.get(), 3)
                .define('P', Items.PORKCHOP)
                .pattern("   ")
                .pattern("PPP")
                .pattern("   ")
                .unlockedBy("has_porkchop", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.PORKCHOP).build()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.METAL_PIPE.get())
                .define('I', Items.IRON_INGOT)
                .pattern(" I ")
                .pattern(" I ")
                .pattern(" I ")
                .unlockedBy("has_iron_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_INGOT).build()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.BLUE_QUALITY_STREET.get())
                .define('C', Items.COCOA_BEANS)
                .define('P', Items.BLUE_DYE)
                .define('D', Items.DIAMOND)
                .pattern("CPC")
                .pattern("PDP")
                .pattern("CPC")
                .unlockedBy("has_cocoa_beans", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.COCOA_BEANS).build()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.CYAN_QUALITY_STREET.get())
                .define('C', Items.COCOA_BEANS)
                .define('P', Items.CYAN_DYE)
                .define('D', Items.DIAMOND)
                .pattern("CPC")
                .pattern("PDP")
                .pattern("CPC")
                .unlockedBy("has_cocoa_beans", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.COCOA_BEANS).build()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.GREEN_QUALITY_STREET.get())
                .define('C', Items.COCOA_BEANS)
                .define('P', Items.GREEN_DYE)
                .define('D', Items.DIAMOND)
                .pattern("CPC")
                .pattern("PDP")
                .pattern("CPC")
                .unlockedBy("has_cocoa_beans", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.COCOA_BEANS).build()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.LIME_QUALITY_STREET.get())
                .define('C', Items.COCOA_BEANS)
                .define('P', Items.LIME_DYE)
                .define('D', Items.DIAMOND)
                .pattern("CPC")
                .pattern("PDP")
                .pattern("CPC")
                .unlockedBy("has_cocoa_beans", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.COCOA_BEANS).build()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.ORANGE_QUALITY_STREET.get())
                .define('C', Items.COCOA_BEANS)
                .define('P', Items.ORANGE_DYE)
                .define('D', Items.DIAMOND)
                .pattern("CPC")
                .pattern("PDP")
                .pattern("CPC")
                .unlockedBy("has_cocoa_beans", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.COCOA_BEANS).build()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.PINK_QUALITY_STREET.get())
                .define('C', Items.COCOA_BEANS)
                .define('P', Items.PINK_DYE)
                .define('D', Items.DIAMOND)
                .pattern("CPC")
                .pattern("PDP")
                .pattern("CPC")
                .unlockedBy("has_cocoa_beans", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.COCOA_BEANS).build()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.PURPLE_QUALITY_STREET.get())
                .define('C', Items.COCOA_BEANS)
                .define('P', Items.PURPLE_DYE)
                .define('D', Items.DIAMOND)
                .pattern("CPC")
                .pattern("PDP")
                .pattern("CPC")
                .unlockedBy("has_cocoa_beans", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.COCOA_BEANS).build()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.RED_QUALITY_STREET.get())
                .define('C', Items.COCOA_BEANS)
                .define('P', Items.RED_DYE)
                .define('D', Items.DIAMOND)
                .pattern("CPC")
                .pattern("PDP")
                .pattern("CPC")
                .unlockedBy("has_cocoa_beans", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.COCOA_BEANS).build()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.YELLOW_QUALITY_STREET.get())
                .define('C', Items.COCOA_BEANS)
                .define('P', Items.YELLOW_DYE)
                .define('D', Items.DIAMOND)
                .pattern("CPC")
                .pattern("PDP")
                .pattern("CPC")
                .unlockedBy("has_cocoa_beans", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.COCOA_BEANS).build()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.QUALITY_STREET_BOX.get())
                .requires(ModItems.BLUE_QUALITY_STREET.get())
                .requires(ModItems.CYAN_QUALITY_STREET.get())
                .requires(ModItems.GREEN_QUALITY_STREET.get())
                .requires(ModItems.LIME_QUALITY_STREET.get())
                .requires(ModItems.ORANGE_QUALITY_STREET.get())
                .requires(ModItems.PINK_QUALITY_STREET.get())
                .requires(ModItems.PURPLE_QUALITY_STREET.get())
                .requires(ModItems.RED_QUALITY_STREET.get())
                .requires(ModItems.YELLOW_QUALITY_STREET.get())
                .unlockedBy("has_quality_street",inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BLUE_QUALITY_STREET.get()).build()))
                .save(consumer);


    }
}
