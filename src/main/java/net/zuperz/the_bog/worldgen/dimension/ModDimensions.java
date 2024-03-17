package net.zuperz.the_bog.worldgen.dimension;

import net.zuperz.the_bog.The_Bog;
import com.mojang.datafixers.util.Pair;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.*;
import net.minecraft.world.level.dimension.BuiltinDimensionTypes;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.zuperz.the_bog.worldgen.biome.ModBiomes;

import java.util.List;
import java.util.OptionalLong;

public class ModDimensions {
    public static final ResourceKey<LevelStem> THE_BOG_KEY = ResourceKey.create(Registries.LEVEL_STEM,
            new ResourceLocation(The_Bog.MOD_ID, "the_bog"));
    public static final ResourceKey<Level> THE_BOG_LEVEL_KEY = ResourceKey.create(Registries.DIMENSION,
            new ResourceLocation(The_Bog.MOD_ID, "the_bog"));
    public static final ResourceKey<DimensionType> THE_BOG_TYPE = ResourceKey.create(Registries.DIMENSION_TYPE,
            new ResourceLocation(The_Bog.MOD_ID, "the_bog_type"));

    public static void bootstrapType(BootstapContext<DimensionType> context) {
        context.register(THE_BOG_TYPE, new DimensionType(
                OptionalLong.of(12000), // fixedTime
                true, // hasSkylight
                false, // hasCeiling
                false, // ultraWarm
                true, // natural
                1.0, // coordinateScale
                true, // bedWorks
                false, // respawnAnchorWorks
                -64, // minY
                256, // height
                256, // logicalHeight
                BlockTags.INFINIBURN_OVERWORLD, // infiniburn
                BuiltinDimensionTypes.OVERWORLD_EFFECTS, // effectsLocation
                0.1f, // ambientLight
                new DimensionType.MonsterSettings(false, true, ConstantInt.of(0), 5)));
    }

    public static void bootstrapStem(BootstapContext<LevelStem> context) {
        HolderGetter<Biome> biomeRegistry = context.lookup(Registries.BIOME);
        HolderGetter<DimensionType> dimTypes = context.lookup(Registries.DIMENSION_TYPE);
        HolderGetter<NoiseGeneratorSettings> noiseGenSettings = context.lookup(Registries.NOISE_SETTINGS);

        NoiseBasedChunkGenerator wrappedChunkGenerator = new NoiseBasedChunkGenerator(
                new FixedBiomeSource(biomeRegistry.getOrThrow(ModBiomes.BOG_WETLANDS)),
                noiseGenSettings.getOrThrow(NoiseGeneratorSettings.OVERWORLD));

        NoiseBasedChunkGenerator noiseBasedChunkGenerator = new NoiseBasedChunkGenerator(
                MultiNoiseBiomeSource.createFromList(
                        new Climate.ParameterList<>(List.of(
                                Pair.of(Climate.parameters(-1F, -1.4F, -1.2F, -1F, -1F, 0.0F, 0.0F), biomeRegistry.getOrThrow(ModBiomes.SLIME_PLAINS)),
                                Pair.of(Climate.parameters(-0.15F, -1F, -0.45F, -1F, 0.0F, -1.8F, 0.0F), biomeRegistry.getOrThrow(ModBiomes.SUPERIOR_LAKES)),
                                Pair.of(Climate.parameters(0.2F, 0.3F, 0.03F, -1F, 1F, -0.05F, 0.0F), biomeRegistry.getOrThrow(ModBiomes.BOG_WETLANDS)),
                                Pair.of(Climate.parameters(-0.3F, -1F, 0.3F, -1.2F, -1F, -1.7F, 0.0F), biomeRegistry.getOrThrow(ModBiomes.ERODED_VALLEYS)),
                                Pair.of(Climate.parameters(0.15F, 1F, 0.7F, 0.78F, 1F, 0.2F, 0.0F), biomeRegistry.getOrThrow(ModBiomes.WARPED_CAVERNS)),
                                Pair.of(Climate.parameters(-0.16F, 1.05F, 0.6F, 0.76F, 1F, 0.2F, 0.0F), biomeRegistry.getOrThrow(ModBiomes.SWAMP_FOREST)),
                                Pair.of(Climate.parameters(-0.19F, 1.03F, 0.7F, 0.59F, 1F, 0.269F, 0.0F), biomeRegistry.getOrThrow(ModBiomes.MIRE_MARSH))
                        ))),
                noiseGenSettings.getOrThrow(NoiseGeneratorSettings.OVERWORLD));

        LevelStem stem = new LevelStem(dimTypes.getOrThrow(ModDimensions.THE_BOG_TYPE), noiseBasedChunkGenerator);

        context.register(THE_BOG_KEY, stem);
    }
}
