package net.zuperz.the_bog.worldgen;

import com.google.common.collect.ImmutableList;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.util.valueproviders.WeightedListInt;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.LakeFeature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.CherryFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.treedecorators.LeaveVineDecorator;
import net.minecraft.world.level.levelgen.feature.trunkplacers.BendingTrunkPlacer;
import net.zuperz.the_bog.The_Bog;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.zuperz.the_bog.block.ModBlocks;
import net.zuperz.the_bog.worldgen.tree.custom.WeepingWillowPlacer;

import java.util.List;

public class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> BOG_GRASS_KEY = registerKey("bog_grass");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BOG_FLOWER_KEY = registerKey("bog_flower");
    public static final ResourceKey<ConfiguredFeature<?, ?>> STICK_GRASS_KEY = registerKey("stick_grass");

    public static final ResourceKey<ConfiguredFeature<?, ?>> LAKE_BOGGAIUM = registerKey("boggaium_lake");

    public static final ResourceKey<ConfiguredFeature<?, ?>> WEEPING_WILLOW_KEY = registerKey("weeping_willow_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BOG_WEEPING_WILLOW_KEY = registerKey("bog_weeping_willow_key");

    public static final ResourceKey<ConfiguredFeature<?, ?>> SILVER_ORE_KEY = registerKey("silver_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> URANIUM_ORE_KEY = registerKey("uranium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_URANIUM_ORE_KEY = registerKey("end_uranium_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> TITANIUM_ORE_KEY = registerKey("titanium_ore");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceabeles = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceabeles = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        RuleTest endstoneReplaceabele = new BlockMatchTest(Blocks.END_STONE);

        List<OreConfiguration.TargetBlockState> silverOres = List.of(OreConfiguration.target(stoneReplaceabeles,
                        ModBlocks.SILVER_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceabeles, ModBlocks.DEEPSLATE_SILVER_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> uraniumOres = List.of(OreConfiguration.target(stoneReplaceabeles,
                        ModBlocks.URANIUM_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceabeles, ModBlocks.DEEPSLATE_URANIUM_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> titaniumOres = List.of(OreConfiguration.target(stoneReplaceabeles,
                        ModBlocks.TITANIUM_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceabeles, ModBlocks.DEEPSLATE_TITANIUM_ORE.get().defaultBlockState()));


        register(context, BOG_GRASS_KEY, Feature.FLOWER,
                new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.BOG_GRASS.get())))));

        register(context, STICK_GRASS_KEY, Feature.FLOWER,
                new RandomPatchConfiguration(42, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.STICK_GRASS.get())))));

        register(context, BOG_FLOWER_KEY, Feature.FLOWER,
                new RandomPatchConfiguration(13, 8, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.MISTVEIL_BLOSSOM.get())))));

        register(context, WEEPING_WILLOW_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.WEEPING_WILLOW_LOG.get()),
                new WeepingWillowPlacer(5, 4, 3),
                BlockStateProvider.simple(ModBlocks.WEEPING_WILLOW_LEAVES.get()),
                new CherryFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(5), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, BOG_WEEPING_WILLOW_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.WEEPING_WILLOW_LOG.get()),
                new BendingTrunkPlacer (4, 2, 0, 3, UniformInt.of(1, 2)),
                BlockStateProvider.simple(ModBlocks.WEEPING_WILLOW_LEAVES.get()),
                new CherryFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(5), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 2)).decorators(ImmutableList.of(new LeaveVineDecorator(0.25F))).build());


        register(context, SILVER_ORE_KEY, Feature.ORE, new OreConfiguration(silverOres, 8));

        register(context, URANIUM_ORE_KEY, Feature.ORE, new OreConfiguration(uraniumOres, 3));
        register(context, END_URANIUM_ORE_KEY, Feature.ORE, new OreConfiguration(endstoneReplaceabele,
                ModBlocks.END_STONE_URANIUM_ORE.get().defaultBlockState(), 4));

        register(context, TITANIUM_ORE_KEY, Feature.ORE, new OreConfiguration(titaniumOres, 4));

        context.register(LAKE_BOGGAIUM, new ConfiguredFeature<>(Feature.LAKE, new LakeFeature.Configuration(BlockStateProvider.simple(ModBlocks.BOGGANIUM_WATER_BLOCK.get()), BlockStateProvider.simple(Blocks.STONE))));

    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(The_Bog.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
