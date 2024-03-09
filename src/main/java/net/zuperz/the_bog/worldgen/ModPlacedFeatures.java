package net.zuperz.the_bog.worldgen;

import com.google.common.collect.ImmutableList;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.LakeFeature;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.placement.*;
import net.zuperz.the_bog.The_Bog;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.zuperz.the_bog.block.ModBlocks;
import net.zuperz.the_bog.worldgen.biome.ModBiomes;

import java.util.List;

public class ModPlacedFeatures {

    public static final ResourceKey<PlacedFeature> BOG_GRASS_PLACED_KEY = registerKey("bog_grass_placed");
    public static final ResourceKey<PlacedFeature> BOG_FLOWER_PLACED_KEY = registerKey("bog_flower_placed");

    public static final ResourceKey<PlacedFeature> PLACED_LAKE_BOGGAIUM = registerKey("boggaium_lake");

    public static final ResourceKey<PlacedFeature> WEEPING_WILLOW_PLACED_KEY = registerKey("weeping_willow_placed");
    public static final ResourceKey<PlacedFeature> BOG_WEEPING_WILLOW_PLACED_KEY = registerKey("bog_weeping_willow_placed");

    public static final ResourceKey<PlacedFeature> SILVER_ORE_PLACED_KEY = registerKey("silver_ore_placed");


    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, BOG_GRASS_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BOG_GRASS_KEY),
                List.of(RarityFilter.onAverageOnceEvery(4), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, BOG_FLOWER_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BOG_FLOWER_KEY),
                List.of(RarityFilter.onAverageOnceEvery(23), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, WEEPING_WILLOW_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.WEEPING_WILLOW_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        ModBlocks.WEEPING_WILLOW_SAPLING.get()));

        register(context, BOG_WEEPING_WILLOW_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BOG_WEEPING_WILLOW_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(2, 0.1F, 1),
                        ModBlocks.WEEPING_WILLOW_SAPLING.get()));

        register(context, SILVER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SILVER_ORE_KEY),
                ModOrePlacement.commonOrePlacement(4,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

        context.register(PLACED_LAKE_BOGGAIUM, new PlacedFeature(configuredFeatures.getOrThrow(ModConfiguredFeatures.LAKE_BOGGAIUM),
                List.of(RarityFilter.onAverageOnceEvery(150),InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP,  BiomeFilter.biome())));
    }


    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(The_Bog.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
