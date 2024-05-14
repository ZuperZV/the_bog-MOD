package net.zuperz.the_bog.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.zuperz.the_bog.The_Bog;
import net.zuperz.the_bog.block.ModBlocks;
import net.zuperz.the_bog.util.ModTags;

import java.util.List;

public class ModToolTiers {
    public static final Tier MUDSTONE_TOOL = TierSortingRegistry.registerTier(
            new ForgeTier(1, 131, 4.0F, 1.0F, 5,
                    ModTags.Blocks.NEEDS_MUDSTONE_TOOL, () -> Ingredient.of(ModItems.MUDSTONE_SHARD.get())),
            new ResourceLocation(The_Bog.MOD_ID, "mud_stone"), List.of(Tiers.STONE), List.of());

    public static final Tier BOGGANIUM_TOOL = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2000, 14.5F, 4.4F, 13,
                    ModTags.Blocks.NEEDS_BOGGANIUM_TOOL, () -> Ingredient.of(ModItems.BOGGANIUM_INGOT.get())),
            new ResourceLocation(The_Bog.MOD_ID, "bogganium"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier SILVER_TOOL = TierSortingRegistry.registerTier(
            new ForgeTier(3, 320, 13.0F, 0.0F, 19,
                    ModTags.Blocks.NEEDS_SILVER_TOOL, () -> Ingredient.of(ModItems.SILVER.get())),
            new ResourceLocation(The_Bog.MOD_ID, "silver"), List.of(Tiers.GOLD), List.of());

    public static final Tier SILVER_DIAMOND_TOOL = TierSortingRegistry.registerTier(
            new ForgeTier(4, 1881, 12.0F, 3.3F, 19,
                    ModTags.Blocks.NEEDS_SILVER_DIAMOND_TOOL, () -> Ingredient.of(ModTags.Items.SILVER_DIAMOND)),
            new ResourceLocation(The_Bog.MOD_ID, "silver_diamond"), List.of(Tiers.DIAMOND), List.of());

    public static final Tier TITANIUM_TOOL = TierSortingRegistry.registerTier(
            new ForgeTier(4, 1881, 13.0F, 3.3F, 15,
                    ModTags.Blocks.NEEDS_TITANIUM_TOOL, () -> Ingredient.of(ModItems.TITANIUM.get())),
            new ResourceLocation(The_Bog.MOD_ID, "titanium"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier URANIUM_TOOL = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2000, 15.0F, 6.0F, 10,
                    ModTags.Blocks.NEEDS_TITANIUM_TOOL, () -> Ingredient.of(ModItems.URANIUM.get())),
            new ResourceLocation(The_Bog.MOD_ID, "uranium"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier DARK_BONE_TOOL = TierSortingRegistry.registerTier(
            new ForgeTier(5, 0, 15.0F, 9F, 20,
                    ModTags.Blocks.NEEDS_TITANIUM_TOOL, () -> Ingredient.of(ModItems.DARK_BONE.get())),
            new ResourceLocation(The_Bog.MOD_ID, "dark_bone"), List.of(Tiers.NETHERITE), List.of());
}