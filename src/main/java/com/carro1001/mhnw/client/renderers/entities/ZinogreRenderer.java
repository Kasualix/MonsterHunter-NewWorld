package com.carro1001.mhnw.client.renderers.entities;

import com.carro1001.mhnw.client.models.entities.ZinogreModel;
import com.carro1001.mhnw.entities.ZinogreEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import static com.carro1001.mhnw.utils.MHNWReferences.MODID;
import static com.carro1001.mhnw.utils.MHNWReferences.ZINOGRE;

public class ZinogreRenderer extends GeoEntityRenderer<ZinogreEntity> {
    private static final ResourceLocation RESOURCE_LOCATION =  new ResourceLocation(MODID, "textures/entity/"+ ZINOGRE +".png");

    public ZinogreRenderer(EntityRendererProvider.Context context) {
        super(context, new ZinogreModel());
    }
    @Override
    public RenderType getRenderType(ZinogreEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        return RenderType.entityCutoutNoCull(getTextureLocation(animatable));
    }
    @Override
    public @NotNull ResourceLocation getTextureLocation(@NotNull ZinogreEntity pEntity) {
        return RESOURCE_LOCATION;
    }
}
