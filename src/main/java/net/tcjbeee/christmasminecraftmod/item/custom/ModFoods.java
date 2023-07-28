package net.tcjbeee.christmasminecraftmod.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties STRAWBERRY = new FoodProperties.Builder().nutrition(2)
            .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200), 0.1f).build();

    public static final FoodProperties CHOCOLATE_ORANGE = new FoodProperties.Builder().nutrition(5)
            .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200), 0.1f).build();

    public static final FoodProperties CARBONARA = new FoodProperties.Builder().nutrition(10)
            .saturationMod(0.5f).effect(() -> new MobEffectInstance(MobEffects.POISON, 200), 0.05f).build();

    public static final FoodProperties AFTER_EIGHTS = new FoodProperties.Builder().nutrition(2)
            .saturationMod(0.5f).fast().build();

    public static final FoodProperties BRUSSEL_SPROUT = new FoodProperties.Builder().nutrition(10)
            .saturationMod(0.5f).effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 200), 0.05f).build();

    public static final FoodProperties CANDYCANE = new FoodProperties.Builder().nutrition(2)
            .saturationMod(0.5f).fast().effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200), 0.5f).build();

    public static final FoodProperties CHRISTMAS_PUDDING = new FoodProperties.Builder().nutrition(6)
            .saturationMod(0.5f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 200), 0.3f).build();

    public static final FoodProperties COOKED_BACON = new FoodProperties.Builder().nutrition(6)
            .saturationMod(0.5f).build();

    public static final FoodProperties COOKED_SAUSAGE = new FoodProperties.Builder().nutrition(7)
            .saturationMod(0.5f).build();

    public static final FoodProperties COOKED_TURKEY = new FoodProperties.Builder().nutrition(6)
            .saturationMod(0.5f).build();

    public static final FoodProperties CRANBERRY_SAUCE = new FoodProperties.Builder().nutrition(4)
            .saturationMod(0.5f).build();

    public static final FoodProperties FLAMING_CHRISTMAS_PUDDING = new FoodProperties.Builder().nutrition(6)
            .saturationMod(0.5f).effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1200), 1f).build();

    public static final FoodProperties GOLDEN_TURKEY = new FoodProperties.Builder().nutrition(10)
            .saturationMod(0.75f).effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 200), 1f).build();

    public static final FoodProperties PIGS_IN_BLANKETS = new FoodProperties.Builder().nutrition(8)
            .saturationMod(0.75f).build();

    public static final FoodProperties RAW_BACON = new FoodProperties.Builder().nutrition(2)
            .saturationMod(0.1f).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600), 0.3f).build();

    public static final FoodProperties RAW_PIGS_IN_BLANKETS = new FoodProperties.Builder().nutrition(3)
            .saturationMod(0.1f).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600), 0.3f).build();

    public static final FoodProperties RAW_SAUSAGE = new FoodProperties.Builder().nutrition(2)
            .saturationMod(0.1f).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600), 0.3f).build();

    public static final FoodProperties RAW_TURKEY = new FoodProperties.Builder().nutrition(3)
            .saturationMod(0.1f).effect(() -> new MobEffectInstance(MobEffects.POISON, 600), 0.3f).build();

    public static final FoodProperties SOAKED_CHRISTMAS_PUDDING = new FoodProperties.Builder().nutrition(7)
            .saturationMod(0.5f).effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 200), 0.3f).build();

    public static final FoodProperties STUFFING = new FoodProperties.Builder().nutrition(4)
            .saturationMod(0.6f).build();

    public static final FoodProperties YORKSHIRE_PUDDING = new FoodProperties.Builder().nutrition(4)
            .saturationMod(0.6f).build();

    public static final FoodProperties BLUE_QUALITY_STREET = new FoodProperties.Builder().nutrition(2)
            .saturationMod(0.5f).build();

    public static final FoodProperties CYAN_QUALITY_STREET = new FoodProperties.Builder().nutrition(2)
            .saturationMod(0.5f).build();

    public static final FoodProperties LIME_QUALITY_STREET = new FoodProperties.Builder().nutrition(2)
            .saturationMod(0.5f).build();

    public static final FoodProperties ORANGE_QUALITY_STREET = new FoodProperties.Builder().nutrition(2)
            .saturationMod(0.5f).build();

    public static final FoodProperties PINK_QUALITY_STREET = new FoodProperties.Builder().nutrition(2)
            .saturationMod(0.5f).build();

    public static final FoodProperties PURPLE_QUALITY_STREET = new FoodProperties.Builder().nutrition(2)
            .saturationMod(0.5f).build();

    public static final FoodProperties RED_QUALITY_STREET = new FoodProperties.Builder().nutrition(2)
            .saturationMod(0.5f).build();

    public static final FoodProperties YELLOW_QUALITY_STREET = new FoodProperties.Builder().nutrition(2)
            .saturationMod(0.5f).build();

    public static final FoodProperties GREEN_QUALITY_STREET = new FoodProperties.Builder().nutrition(2)
            .saturationMod(0.5f).build();

    public static final FoodProperties QUALITY_STREET_BOX = new FoodProperties.Builder().nutrition(18)
            .saturationMod(0.9f).effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 1200), 1f).build();

}
