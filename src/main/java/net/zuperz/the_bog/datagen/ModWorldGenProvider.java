package net.zuperz.the_bog.datagen;

import net.zuperz.the_bog.The_Bog;
import net.zuperz.the_bog.worldgen.ModBiomeModifiers;
import net.zuperz.the_bog.worldgen.ModConfiguredFeatures;
import net.zuperz.the_bog.worldgen.ModPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.registries.ForgeRegistries;
import net.zuperz.the_bog.worldgen.dimension.ModDimensions;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ModWorldGenProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, ModPlacedFeatures::bootstrap)
            .add(ForgeRegistries.Keys.BIOME_MODIFIERS, ModBiomeModifiers::bootstrap)

            .add(Registries.LEVEL_STEM, ModDimensions::bootstrapStem)
            .add(Registries.DIMENSION_TYPE, ModDimensions::bootstrapType);

    public ModWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(The_Bog.MOD_ID));
    }
}
