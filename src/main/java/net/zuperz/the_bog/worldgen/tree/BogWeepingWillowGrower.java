package net.zuperz.the_bog.worldgen.tree;

import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.zuperz.the_bog.worldgen.ModConfiguredFeatures;
import org.jetbrains.annotations.Nullable;

public class BogWeepingWillowGrower extends AbstractTreeGrower {
    @Nullable
    @Override
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource pRandom, boolean pHasFlowers) {
        return ModConfiguredFeatures.BOG_WEEPING_WILLOW_KEY;
    }
}
