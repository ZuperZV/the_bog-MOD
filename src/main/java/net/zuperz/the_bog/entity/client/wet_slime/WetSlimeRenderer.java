package net.zuperz.the_bog.entity.client.wet_slime;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.SlimeOuterLayer;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.monster.MagmaCube;
import net.minecraft.world.entity.monster.Slime;
import net.zuperz.the_bog.The_Bog;
import net.zuperz.the_bog.entity.client.Sumpget.SumpgetModel;
import net.zuperz.the_bog.entity.custom.SumpgetEntity;
import net.zuperz.the_bog.entity.custom.WetSlimeEntity;
import net.zuperz.the_bog.entity.layers.ModModelLayers;

public class WetSlimeRenderer extends MobRenderer<WetSlimeEntity, wetslimeModel<WetSlimeEntity>> {
    private static final ResourceLocation WETSLIME_LOCATION = new ResourceLocation(The_Bog.MOD_ID,"textures/entity/wet_slime.png");

    public WetSlimeRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new wetslimeModel<>(pContext.bakeLayer(ModModelLayers.WETSLIME_LAYER)), 0.25F);
        this.addLayer(new WetSlimeOuterLayer<>(this, pContext.getModelSet()));
    }

    protected int getBlockLightLevel(WetSlimeEntity pEntity, BlockPos pPos) {
        return 15;
    }


    public void render(WetSlimeEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
        this.shadowRadius = 0.25F * (float)pEntity.getSize();
        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }

    protected void scale(WetSlimeEntity pLivingEntity, PoseStack pPoseStack, float pPartialTickTime) {
        int i = pLivingEntity.getSize();
        float f = Mth.lerp(pPartialTickTime, pLivingEntity.oSquish, pLivingEntity.squish) / ((float)i * 0.5F + 1.0F);
        float f1 = 1.0F / (f + 1.0F);
        pPoseStack.scale(f1 * (float)i, 1.0F / f1 * (float)i, f1 * (float)i);
    }

    public ResourceLocation getTextureLocation(WetSlimeEntity pEntity) {
        return WETSLIME_LOCATION;
    }
}