package net.zuperz.the_bog.worldgen.biome.surface;

import net.zuperz.the_bog.worldgen.biome.ModBiomes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.SurfaceRules;

public class ModSurfaceRules {
    private static final SurfaceRules.RuleSource DIRT = makeStateRule(Blocks.DIRT);
    private static final SurfaceRules.RuleSource GRASS_BLOCK = makeStateRule(Blocks.GRASS_BLOCK);
    private static final SurfaceRules.RuleSource MUD = makeStateRule(Blocks.MUD);
    private static final SurfaceRules.RuleSource STONE = makeStateRule(Blocks.STONE);
    private static final SurfaceRules.RuleSource AMETHYST_BLOCK = makeStateRule(Blocks.AMETHYST_BLOCK);
    private static final SurfaceRules.RuleSource NETHERITE_BLOCK = makeStateRule(Blocks.NETHERITE_BLOCK);

    public static SurfaceRules.RuleSource makeRules() {
        SurfaceRules.ConditionSource isAtOrAboveWaterLevel = SurfaceRules.waterBlockCheck(-1, 0);

        SurfaceRules.RuleSource grassSurface = SurfaceRules.sequence(SurfaceRules.ifTrue(isAtOrAboveWaterLevel, GRASS_BLOCK), DIRT);

        return SurfaceRules.sequence(
                SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.isBiome(ModBiomes.TEST_BIOME),
                                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, NETHERITE_BLOCK)),
                        SurfaceRules.ifTrue(SurfaceRules.ON_CEILING, STONE)),

                SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.isBiome(ModBiomes.TEST_BIOME_2),
                                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, NETHERITE_BLOCK)),
                        SurfaceRules.ifTrue(SurfaceRules.ON_CEILING, STONE)),

                SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.isBiome(ModBiomes.BOG_WETLANDS),
                                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, MUD)),
                        SurfaceRules.ifTrue(SurfaceRules.ON_CEILING, MUD)),


                // Default to a grass and dirt surface
                SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, grassSurface)
        );
    }

    private static SurfaceRules.RuleSource makeStateRule(Block block) {
        return SurfaceRules.state(block.defaultBlockState());
    }
}
