package net.tcjbeee.christmasminecraftmod.entity.client;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.tcjbeee.christmasminecraftmod.ChristmasMinecraftMod;
import net.tcjbeee.christmasminecraftmod.entity.custom.TurkeyEntity;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class TurkeyModel extends GeoModel<TurkeyEntity> {
    @Override
    public ResourceLocation getModelResource(TurkeyEntity animatable) {
        return new ResourceLocation(ChristmasMinecraftMod.MODID, "geo/turkey.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(TurkeyEntity animatable) {
        return new ResourceLocation(ChristmasMinecraftMod.MODID, "textures/entity/turkey.png");
    }

    @Override
    public ResourceLocation getAnimationResource(TurkeyEntity animatable) {
        return new ResourceLocation(ChristmasMinecraftMod.MODID, "animations/turkey.animation.json");
    }

    @Override
    public void setCustomAnimations(TurkeyEntity animatable, long instanceId, AnimationState<TurkeyEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("head");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);

            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
        }
    }
}
