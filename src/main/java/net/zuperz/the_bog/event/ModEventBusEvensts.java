package net.zuperz.the_bog.event;

import net.minecraft.client.model.BoatModel;
import net.minecraft.client.model.ChestBoatModel;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.blockentity.HangingSignRenderer;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.zuperz.the_bog.The_Bog;
import net.zuperz.the_bog.block.ModBlocks;
import net.zuperz.the_bog.block.custom.entity.ModBlockEntities;
import net.zuperz.the_bog.entity.ModEntities;
import net.zuperz.the_bog.entity.client.Boge.BogeModel;
import net.zuperz.the_bog.entity.client.Dark_Skeleton.Dark_skeletonModel;
import net.zuperz.the_bog.entity.client.Duck.DuckModel;
import net.zuperz.the_bog.entity.client.Marsh_Lurker.Marsh_LurkerModel;
import net.zuperz.the_bog.entity.client.Sumpget.SumpgetModel;
import net.zuperz.the_bog.entity.client.wet_slime.wetslimeModel;
import net.zuperz.the_bog.entity.custom.*;
import net.zuperz.the_bog.entity.layers.ModModelLayers;
import net.zuperz.the_bog.particles.ModParticles;
import net.zuperz.the_bog.particles.TheBogPortalParticle;
import net.zuperz.the_bog.particles.WetSlimeParticles;

@Mod.EventBusSubscriber(modid = The_Bog.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvensts {
    @SubscribeEvent
    public static void registerParticleFactories(RegisterParticleProvidersEvent event) {
        event.registerSpriteSet(ModParticles.WETSLIME_PARTICLES.get(), WetSlimeParticles.Provider::new);
        event.registerSpriteSet(ModParticles.BOG_PORTAL_PARTICLES.get(), TheBogPortalParticle.Provider::new);
    }

    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.DUCK_LAYER, DuckModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.SUMPGET_LAYER, SumpgetModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.MARSH_LURKER_LAYER, Marsh_LurkerModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BOGE_LAYER, BogeModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.WETSLIME_LAYER, wetslimeModel::createBodyLayer);

        event.registerLayerDefinition(ModModelLayers.DARK_SKELETON_LAYER, Dark_skeletonModel::createBodyLayer);

        event.registerLayerDefinition(ModModelLayers.WETSLIME_OUTER, wetslimeModel::createOuterBodyLayer);

        event.registerLayerDefinition(ModModelLayers.WEEPING_WILLOW_BOAT_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(ModModelLayers.WEEPING_WILLOW_CHEST_BOAT_LAYER, ChestBoatModel::createBodyModel);


        event.registerLayerDefinition(ModModelLayers.MIDNIGHT_BOAT_LAYER, BoatModel::createBodyModel);
        event.registerLayerDefinition(ModModelLayers.MIDNIGHT_CHEST_BOAT_LAYER, ChestBoatModel::createBodyModel);
    }
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.BOGE.get(), BogEntity.createAttributes().build());
        event.put(ModEntities.DUCK.get(), DuckEntity.createAttributes().build());
        event.put(ModEntities.SUMPGET.get(), SumpgetEntity.createAttributes().build());
        event.put(ModEntities.MARSH_LURKER.get(), MarshLurkerEntity.createAttributes().build());
        event.put(ModEntities.WET_SLIME.get(), WetSlimeEntity.createAttributes().build());

        event.put(ModEntities.DARK_SKELETON.get(), DarkskeletonEntity.createAttributes().build());
    }

    @SubscribeEvent
    public static void registerBER(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(ModBlockEntities.MOD_SIGN.get(), SignRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.MOD_HANGING_SIGN.get(), HangingSignRenderer::new);
    }

    @SubscribeEvent
    public static void registerColoredBlocks(RegisterColorHandlersEvent.Block event) {
        event.register((pState, pLevel, pPos, pTintIndex) -> pLevel != null &&
                pPos != null ? BiomeColors.getAverageFoliageColor(pLevel, pPos) : FoliageColor.getDefaultColor(), ModBlocks.WEEPING_WILLOW_LEAVES.get());
    }

    @SubscribeEvent
    public static void registerColoredItems(RegisterColorHandlersEvent.Item event) {
        event.register((pStack, pTintIndex) -> {
            BlockState state = ((BlockItem)pStack.getItem()).getBlock().defaultBlockState();
            return event.getBlockColors().getColor(state, null, null, pTintIndex);
        }, ModBlocks.WEEPING_WILLOW_LEAVES.get());
    }
}