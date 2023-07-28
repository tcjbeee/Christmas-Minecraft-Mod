package net.tcjbeee.christmasminecraftmod.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tcjbeee.christmasminecraftmod.ChristmasMinecraftMod;
import net.tcjbeee.christmasminecraftmod.item.custom.MetalDetectorItem;
import net.tcjbeee.christmasminecraftmod.item.custom.MetalPipe;
import net.tcjbeee.christmasminecraftmod.item.custom.ModFoods;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ChristmasMinecraftMod.MODID);


    // CREATE ITEMS WITH THESE LINES
    // AFTER CREATION, ADD TO:
    // ModCreativeModeTabs.java
    // /assets/../lang/en_us.json
    // /assets/../models/item (NEW FILE itemname.json)
    // /assets/../textures/item (name must match itemname)

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",() -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",() -> new Item(new Item.Properties()));

    // FOODS
    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry",() -> new Item(new Item.Properties().food(ModFoods.STRAWBERRY)));
    public static final RegistryObject<Item> CHOCOLATE_ORANGE = ITEMS.register("chocolate_orange",() -> new Item(new Item.Properties().food(ModFoods.CHOCOLATE_ORANGE)));
    public static final RegistryObject<Item> CARBONARA = ITEMS.register("carbonara",() -> new Item(new Item.Properties().food(ModFoods.CARBONARA)));
    public static final RegistryObject<Item> AFTER_EIGHTS = ITEMS.register("after_eights",() -> new Item(new Item.Properties().food(ModFoods.AFTER_EIGHTS)));
    public static final RegistryObject<Item> BRUSSEL_SPROUT = ITEMS.register("brussel_sprout",() -> new Item(new Item.Properties().food(ModFoods.BRUSSEL_SPROUT)));
    public static final RegistryObject<Item> CANDYCANE = ITEMS.register("candycane",() -> new Item(new Item.Properties().food(ModFoods.CANDYCANE)));
    public static final RegistryObject<Item> CHRISTMAS_PUDDING = ITEMS.register("christmas_pudding",() -> new Item(new Item.Properties().food(ModFoods.CHRISTMAS_PUDDING)));
    public static final RegistryObject<Item> COOKED_BACON = ITEMS.register("cooked_bacon",() -> new Item(new Item.Properties().food(ModFoods.COOKED_BACON)));
    public static final RegistryObject<Item> COOKED_SAUSAGE = ITEMS.register("cooked_sausage",() -> new Item(new Item.Properties().food(ModFoods.COOKED_SAUSAGE)));
    public static final RegistryObject<Item> COOKED_TURKEY = ITEMS.register("cooked_turkey",() -> new Item(new Item.Properties().food(ModFoods.COOKED_TURKEY)));
    public static final RegistryObject<Item> CRANBERRY_SAUCE = ITEMS.register("cranberry_sauce",() -> new Item(new Item.Properties().food(ModFoods.CRANBERRY_SAUCE)));
    public static final RegistryObject<Item> FLAMING_CHRISTMAS_PUDDING = ITEMS.register("flaming_christmas_pudding",() -> new Item(new Item.Properties().food(ModFoods.FLAMING_CHRISTMAS_PUDDING)));
    public static final RegistryObject<Item> GOLDEN_TURKEY = ITEMS.register("golden_turkey",() -> new Item(new Item.Properties().food(ModFoods.GOLDEN_TURKEY)));
    public static final RegistryObject<Item> PIGS_IN_BLANKETS = ITEMS.register("pigs_in_blankets",() -> new Item(new Item.Properties().food(ModFoods.PIGS_IN_BLANKETS)));
    public static final RegistryObject<Item> RAW_BACON = ITEMS.register("raw_bacon",() -> new Item(new Item.Properties().food(ModFoods.RAW_BACON)));
    public static final RegistryObject<Item> RAW_PIGS_IN_BLANKETS = ITEMS.register("raw_pigs_in_blankets",() -> new Item(new Item.Properties().food(ModFoods.RAW_PIGS_IN_BLANKETS)));
    public static final RegistryObject<Item> RAW_SAUSAGE = ITEMS.register("raw_sausage",() -> new Item(new Item.Properties().food(ModFoods.RAW_SAUSAGE)));
    public static final RegistryObject<Item> RAW_TURKEY = ITEMS.register("raw_turkey",() -> new Item(new Item.Properties().food(ModFoods.RAW_TURKEY)));
    public static final RegistryObject<Item> SOAKED_CHRISTMAS_PUDDING = ITEMS.register("soaked_christmas_pudding",() -> new Item(new Item.Properties().food(ModFoods.SOAKED_CHRISTMAS_PUDDING)));
    public static final RegistryObject<Item> STUFFING = ITEMS.register("stuffing",() -> new Item(new Item.Properties().food(ModFoods.STUFFING)));
    public static final RegistryObject<Item> YORKSHIRE_PUDDING = ITEMS.register("yorkshire_pudding",() -> new Item(new Item.Properties().food(ModFoods.YORKSHIRE_PUDDING)));
    public static final RegistryObject<Item> BLUE_QUALITY_STREET = ITEMS.register("blue_quality_street",() -> new Item(new Item.Properties().food(ModFoods.BLUE_QUALITY_STREET)));
    public static final RegistryObject<Item> CYAN_QUALITY_STREET = ITEMS.register("cyan_quality_street",() -> new Item(new Item.Properties().food(ModFoods.BLUE_QUALITY_STREET)));
    public static final RegistryObject<Item> LIME_QUALITY_STREET = ITEMS.register("lime_quality_street",() -> new Item(new Item.Properties().food(ModFoods.BLUE_QUALITY_STREET)));
    public static final RegistryObject<Item> ORANGE_QUALITY_STREET = ITEMS.register("orange_quality_street",() -> new Item(new Item.Properties().food(ModFoods.BLUE_QUALITY_STREET)));
    public static final RegistryObject<Item> PINK_QUALITY_STREET = ITEMS.register("pink_quality_street",() -> new Item(new Item.Properties().food(ModFoods.BLUE_QUALITY_STREET)));
    public static final RegistryObject<Item> PURPLE_QUALITY_STREET = ITEMS.register("purple_quality_street",() -> new Item(new Item.Properties().food(ModFoods.BLUE_QUALITY_STREET)));
    public static final RegistryObject<Item> RED_QUALITY_STREET = ITEMS.register("red_quality_street",() -> new Item(new Item.Properties().food(ModFoods.BLUE_QUALITY_STREET)));
    public static final RegistryObject<Item> YELLOW_QUALITY_STREET = ITEMS.register("yellow_quality_street",() -> new Item(new Item.Properties().food(ModFoods.BLUE_QUALITY_STREET)));
    public static final RegistryObject<Item> GREEN_QUALITY_STREET = ITEMS.register("green_quality_street",() -> new Item(new Item.Properties().food(ModFoods.BLUE_QUALITY_STREET)));
    public static final RegistryObject<Item> QUALITY_STREET_BOX = ITEMS.register("quality_street_box",() -> new Item(new Item.Properties().food(ModFoods.QUALITY_STREET_BOX).rarity(Rarity.RARE)));

    // CUSTOM ITEMS
    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(100)));

    public static final RegistryObject<Item> METAL_PIPE = ITEMS.register("metal_pipe",
            () -> new MetalPipe(Tiers.IRON, new Item.Properties().durability(100)));

    public static void register(IEventBus eventBus) {
    ITEMS.register(eventBus);
    }
}
