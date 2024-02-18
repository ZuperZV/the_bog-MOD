package net.zuperz.the_bog.entity.client.Duck;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.zuperz.the_bog.The_Bog;
import net.zuperz.the_bog.entity.custom.DuckEntity;
import net.zuperz.the_bog.entity.layers.ModModelLayers;

public class DuckRenderer extends MobRenderer<DuckEntity, DuckModel<DuckEntity>> {
    private static final ResourceLocation DUCK_LOCATION = new ResourceLocation(The_Bog.MOD_ID,"textures/entity/duck.png");

    public DuckRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new DuckModel<>(pContext.bakeLayer(ModModelLayers.DUCK_LAYER)), 0.7f);
    }

    @Override
    public ResourceLocation getTextureLocation(DuckEntity pEntity) {
        return DUCK_LOCATION;
    }

    @Override
    public void render(DuckEntity pEntity, float pEntityYaw, float pPartialTicks,
                       PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()) {
            pMatrixStack.scale(0.45f, 0.45f, 0.45f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}