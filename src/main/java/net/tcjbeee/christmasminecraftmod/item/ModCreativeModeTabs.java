package net.tcjbeee.christmasminecraftmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.tcjbeee.christmasminecraftmod.ChristmasMinecraftMod;
import net.tcjbeee.christmasminecraftmod.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ChristmasMinecraftMod.MODID);

    public static final RegistryObject<CreativeModeTab> CHRISTMAS_TAB = CREATIVE_MODE_TABS.register("christmas_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.christmas_tab"))
                    .displayItems((pParameters, pOutput) -> {

                    // ADD ITEMS TO MOD CREATIVE TAB HERE WITH THESE LINES

                        // VALUABLES
                        pOutput.accept(ModItems.SAPPHIRE.get());
                        pOutput.accept(ModItems.RAW_SAPPHIRE.get());

                        // TOOLS & WEAPONS
                        pOutput.accept(ModItems.METAL_DETECTOR.get());
                        pOutput.accept(ModItems.METAL_PIPE.get());

                        // FOODS
                        pOutput.accept(ModItems.STRAWBERRY.get());
                        pOutput.accept(ModItems.CHOCOLATE_ORANGE.get());
                        pOutput.accept(ModItems.CARBONARA.get());
                        pOutput.accept(ModItems.AFTER_EIGHTS.get());
                        pOutput.accept(ModItems.BRUSSEL_SPROUT.get());
                        pOutput.accept(ModItems.CANDYCANE.get());
                        pOutput.accept(ModItems.CHRISTMAS_PUDDING.get());
                        pOutput.accept(ModItems.COOKED_BACON.get());
                        pOutput.accept(ModItems.COOKED_SAUSAGE.get());
                        pOutput.accept(ModItems.COOKED_TURKEY.get());
                        pOutput.accept(ModItems.CRANBERRY_SAUCE.get());
                        pOutput.accept(ModItems.FLAMING_CHRISTMAS_PUDDING.get());
                        pOutput.accept(ModItems.GOLDEN_TURKEY.get());
                        pOutput.accept(ModItems.PIGS_IN_BLANKETS.get());
                        pOutput.accept(ModItems.RAW_BACON.get());
                        pOutput.accept(ModItems.RAW_PIGS_IN_BLANKETS.get());
                        pOutput.accept(ModItems.RAW_SAUSAGE.get());
                        pOutput.accept(ModItems.RAW_TURKEY.get());
                        pOutput.accept(ModItems.SOAKED_CHRISTMAS_PUDDING.get());
                        pOutput.accept(ModItems.STUFFING.get());
                        pOutput.accept(ModItems.YORKSHIRE_PUDDING.get());
                        pOutput.accept(ModItems.BLUE_QUALITY_STREET.get());
                        pOutput.accept(ModItems.CYAN_QUALITY_STREET.get());
                        pOutput.accept(ModItems.GREEN_QUALITY_STREET.get());
                        pOutput.accept(ModItems.ORANGE_QUALITY_STREET.get());
                        pOutput.accept(ModItems.YELLOW_QUALITY_STREET.get());
                        pOutput.accept(ModItems.LIME_QUALITY_STREET.get());
                        pOutput.accept(ModItems.PINK_QUALITY_STREET.get());
                        pOutput.accept(ModItems.PURPLE_QUALITY_STREET.get());
                        pOutput.accept(ModItems.RED_QUALITY_STREET.get());
                        pOutput.accept(ModItems.QUALITY_STREET_BOX.get());

                        // BLOCKS
                        pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());

                        pOutput.accept(ModBlocks.SOUND_BLOCK.get());

                        pOutput.accept(ModBlocks.SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.END_SAPPHIRE_ORE.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register((eventBus));
    }
}
