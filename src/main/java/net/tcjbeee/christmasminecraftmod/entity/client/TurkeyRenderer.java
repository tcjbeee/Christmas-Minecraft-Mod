package net.tcjbeee.christmasminecraftmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.tcjbeee.christmasminecraftmod.ChristmasMinecraftMod;
import net.tcjbeee.christmasminecraftmod.entity.custom.TurkeyEntity;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class TurkeyRenderer extends GeoEntityRenderer<TurkeyEntity> {
    public TurkeyRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new TurkeyModel());
    }

    @Override
    public ResourceLocation getTextureLocation(TurkeyEntity animatable) {
        return new ResourceLocation(ChristmasMinecraftMod.MODID, "textures/entity/turkey.png");
    }

    @Override
    public void render(TurkeyEntity entity, float entityYaw, float partialTick, PoseStack poseStack, MultiBufferSource bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }


        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
