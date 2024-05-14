package net.zuperz.the_bog.entity.client.Marsh_Lurker;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.zuperz.the_bog.The_Bog;
import net.zuperz.the_bog.entity.custom.MarshLurkerEntity;
import net.zuperz.the_bog.entity.layers.ModModelLayers;

public class Marsh_LurkerRenderer extends MobRenderer<MarshLurkerEntity, Marsh_LurkerModel<MarshLurkerEntity>> {
    private static final ResourceLocation MARSH_LURKER_LOCATION = new ResourceLocation(The_Bog.MOD_ID,"textures/entity/marsh_lurker.png");

    public Marsh_LurkerRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new Marsh_LurkerModel<>(pContext.bakeLayer(ModModelLayers.MARSH_LURKER_LAYER)), 0.7f);
    }

    @Override
    public ResourceLocation getTextureLocation(MarshLurkerEntity pEntity) {
        return MARSH_LURKER_LOCATION;
    }

    @Override
    public void render(MarshLurkerEntity pEntity, float pEntityYaw, float pPartialTicks,
                       PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()) {
            pMatrixStack.scale(0.45f, 0.45f, 0.45f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}