package net.zuperz.the_bog.event;

import net.minecraft.client.model.BoatModel;
import net.minecraft.client.model.ChestBoatModel;
import net.minecraft.client.renderer.blockentity.HangingSignRenderer;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.zuperz.the_bog.The_Bog;
import net.zuperz.the_bog.block.custom.entity.ModBlockEntities;
import net.zuperz.the_bog.entity.ModEntities;
import net.zuperz.the_bog.entity.client.Duck.DuckModel;
import net.zuperz.the_bog.entity.custom.DuckEntity;
import net.zuperz.the_bog.entity.layers.ModModelLayers;

@Mod.EventBusSubscriber(modid = The_Bog.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvensts {
    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.DUCK_LAYER, DuckModel::createBodyLayer);

        event.registerLayerDefinition(ModModelLayers.WEEPING_WILLOW_BOAT_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(ModModelLayers.WEEPING_CHEST_WILLOW_BOAT_LAYER, ChestBoatModel::createBodyModel);
    }
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.DUCK.get(), DuckEntity.createAttributes().build());
    }

    @SubscribeEvent
    public static void registerBER(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(ModBlockEntities.MOD_SIGN.get(), SignRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.MOD_HANGING_SIGN.get(), HangingSignRenderer::new);
    }
}
