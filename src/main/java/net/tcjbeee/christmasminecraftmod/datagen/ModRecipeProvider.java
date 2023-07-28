package net.tcjbeee.christmasminecraftmod.datagen;

import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
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
    }
}
