package net.zuperz.the_bog.entity.client.Sumpget;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.zuperz.the_bog.The_Bog;
import net.zuperz.the_bog.entity.custom.SumpgetEntity;
import net.zuperz.the_bog.entity.layers.ModModelLayers;

public class SumpgetRenderer extends MobRenderer<SumpgetEntity, SumpgetModel<SumpgetEntity>> {
    private static final ResourceLocation SUMPGET_LOCATION = new ResourceLocation(The_Bog.MOD_ID,"textures/entity/sumpget/sumpget.png");

    public SumpgetRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new SumpgetModel<>(pContext.bakeLayer(ModModelLayers.SUMPGET_LAYER)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(SumpgetEntity pEntity) {
        return SUMPGET_LOCATION;
    }

    @Override
    public void render(SumpgetEntity pEntity, float pEntityYaw, float pPartialTicks,
                       PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()) {
            pMatrixStack.scale(0.45f, 0.45f, 0.45f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}