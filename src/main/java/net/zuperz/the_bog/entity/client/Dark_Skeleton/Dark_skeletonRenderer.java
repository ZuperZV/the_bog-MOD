package net.zuperz.the_bog.entity.client.Dark_Skeleton;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.zuperz.the_bog.The_Bog;
import net.zuperz.the_bog.entity.custom.DarkskeletonEntity;
import net.zuperz.the_bog.entity.layers.ModModelLayers;

public class Dark_skeletonRenderer extends MobRenderer<DarkskeletonEntity, Dark_skeletonModel<DarkskeletonEntity>> {
    private static final ResourceLocation DARK_SKELETON_LOCATION = new ResourceLocation(The_Bog.MOD_ID,"textures/entity/dark_skeleton.png");


    public Dark_skeletonRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new Dark_skeletonModel<>(pContext.bakeLayer(ModModelLayers.DARK_SKELETON_LAYER)), 0.5F);
        //this.addLayer(new ItemInHandLayer<>(this, pContext.getItemInHandRenderer()));
    }

    @Override
    public ResourceLocation getTextureLocation(DarkskeletonEntity pEntity) {
        return DARK_SKELETON_LOCATION;
    }

    @Override
    public void render(DarkskeletonEntity pEntity, float pEntityYaw, float pPartialTicks,
                       PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}