package net.zuperz.the_bog.entity.client.Boge;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.Util;
import net.minecraft.client.model.ZombieModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.zuperz.the_bog.The_Bog;
import net.zuperz.the_bog.entity.custom.BogEntity;
import net.zuperz.the_bog.entity.layers.ModModelLayers;
import net.zuperz.the_bog.entity.variant.BogeVariant;

import java.util.Map;

public class BogeRenderer extends MobRenderer<BogEntity, BogeModel<BogEntity>> {
    private static final Map<BogeVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(BogeVariant.class), map -> {
                map.put(BogeVariant.DEFAULT,
                        new ResourceLocation(The_Bog.MOD_ID,"textures/entity/boge/boge.png"));

                map.put(BogeVariant.ALEX,
                        new ResourceLocation(The_Bog.MOD_ID,"textures/entity/boge/boge_alex.png"));
            });

    public BogeRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new BogeModel<>(pContext.bakeLayer(ModModelLayers.BOGE_LAYER)), 0.4f);
    }

    @Override
    public ResourceLocation getTextureLocation(BogEntity pEntity) {
        return LOCATION_BY_VARIANT.get(pEntity.getVariant());
    }

    @Override
    public void render(BogEntity pEntity, float pEntityYaw, float pPartialTicks,
                       PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()) {
            pMatrixStack.scale(0.60f, 0.60f, 0.60f);
        }

        if(pEntity.getVariant().getId() == 1) {
            pMatrixStack.scale(0.9f, 0.9f, 0.9f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }

}