package net.zuperz.the_bog.entity.client.Duck;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.zuperz.the_bog.The_Bog;
import net.zuperz.the_bog.entity.custom.DuckEntity;
import net.zuperz.the_bog.entity.layers.ModModelLayers;
import net.zuperz.the_bog.entity.variant.DuckVariant;

import java.util.Map;

public class DuckRenderer extends MobRenderer<DuckEntity, DuckModel<DuckEntity>> {
    private static final Map<DuckVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(DuckVariant.class), map -> {
                map.put(DuckVariant.DEFAULT,
                        new ResourceLocation(The_Bog.MOD_ID,"textures/entity/duck/duck.png"));

                map.put(DuckVariant.MAN,
                        new ResourceLocation(The_Bog.MOD_ID,"textures/entity/duck/duck_man.png"));
            });

    public DuckRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new DuckModel<>(pContext.bakeLayer(ModModelLayers.DUCK_LAYER)), 0.4f);
    }

    @Override
    public ResourceLocation getTextureLocation(DuckEntity pEntity) {
        return LOCATION_BY_VARIANT.get(pEntity.getVariant());
    }

    @Override
    public void render(DuckEntity pEntity, float pEntityYaw, float pPartialTicks,
                       PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()) {
            pMatrixStack.scale(0.60f, 0.60f, 0.60f);
        }

        if(pEntity.getVariant().getId() == 1) {
            pMatrixStack.scale(1.1f, 1.1f, 1.1f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}