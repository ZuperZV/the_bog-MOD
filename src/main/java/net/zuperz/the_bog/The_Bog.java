package net.zuperz.the_bog;

import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BrewingStandBlock;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.versions.forge.ForgeVersion;
import net.zuperz.the_bog.block.ModBlocks;
import net.zuperz.the_bog.block.custom.entity.ModBlockEntities;
import net.zuperz.the_bog.effect.ModEffects;
import net.zuperz.the_bog.entity.ModEntities;
import net.zuperz.the_bog.entity.client.Boge.BogeRenderer;
import net.zuperz.the_bog.entity.client.Duck.DuckRenderer;
import net.zuperz.the_bog.entity.client.Marsh_Lurker.Marsh_LurkerRenderer;
import net.zuperz.the_bog.entity.client.ModBoatRenderer;
import net.zuperz.the_bog.entity.client.Sumpget.SumpgetRenderer;
import net.zuperz.the_bog.fluid.ModFluidTypes;
import net.zuperz.the_bog.fluid.ModFluids;
import net.zuperz.the_bog.item.ModCreativeModeTabs;
import net.zuperz.the_bog.item.ModItemProperties;
import net.zuperz.the_bog.item.ModItems;
import net.zuperz.the_bog.potion.BetterBrewingRecipe;
import net.zuperz.the_bog.potion.ModPotions;
import net.zuperz.the_bog.util.ModWoodTypes;
import net.zuperz.the_bog.worldgen.biome.surface.ModSurfaceRules;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(The_Bog.MOD_ID)
public class The_Bog {
    public static final String MOD_ID = "the_bog";
    public static final Logger LOGGER = LogUtils.getLogger();

    public The_Bog() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModEntities.register(modEventBus);

        ModFluidTypes.register(modEventBus);
        ModFluids.register(modEventBus);

        ModCreativeModeTabs.register(modEventBus);
        ModBlockEntities.register(modEventBus);

        ModEffects.register(modEventBus);
        ModPotions.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            EntityRenderers.register(ModEntities.BOGE.get(), BogeRenderer::new);
            EntityRenderers.register(ModEntities.DUCK.get(), DuckRenderer::new);
            EntityRenderers.register(ModEntities.SUMPGET.get(), SumpgetRenderer::new);
            EntityRenderers.register(ModEntities.MARSH_LURKER.get(), Marsh_LurkerRenderer::new);

            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.MISTVEIL_BLOSSOM.getId(), ModBlocks.POTTED_MISTVEIL_BLOSSOM);

            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(Potions.AWKWARD, ModItems.COOKED_BOGGY_CHOPS.get(), ModPotions.STONE_WALL_POTION.get()));
        });
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = The_Bog.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            event.enqueueWork(() -> {
                Sheets.addWoodType(ModWoodTypes.WEEPING_WILLOW);

                ModItemProperties.addCustomItemProperties();

                EntityRenderers.register(ModEntities.DUCK.get(), DuckRenderer::new);
                EntityRenderers.register(ModEntities.BOGE.get(), BogeRenderer::new);
                EntityRenderers.register(ModEntities.SUMPGET.get(), SumpgetRenderer::new);
                EntityRenderers.register(ModEntities.MARSH_LURKER.get(), Marsh_LurkerRenderer::new);


                EntityRenderers.register(ModEntities.MOD_BOAT.get(), pContext -> new ModBoatRenderer(pContext, false));
                EntityRenderers.register(ModEntities.MOD_CHEST_BOAT.get(), pContext -> new ModBoatRenderer(pContext, true));

                ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_BOGGANIUM_WATER.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_BOGGANIUM_WATER.get(), RenderType.translucent());
            });
        }
    }
}
