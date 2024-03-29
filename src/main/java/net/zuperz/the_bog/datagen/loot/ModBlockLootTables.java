package net.zuperz.the_bog.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraftforge.registries.RegistryObject;
import net.zuperz.the_bog.block.ModBlocks;
import net.zuperz.the_bog.item.ModItems;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.MUD_STONE.get());
        this.dropSelf(ModBlocks.MOSSY_MUD_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.MUD_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.ANDESITE_MUD_STONE.get());

        this.dropSelf(ModBlocks.WET_SLIME_BLOCK.get());

        this.dropSelf(ModBlocks.SLIMEY_ROCKS.get());

        this.dropSelf(ModBlocks.THE_BOG_PORTAL.get());
        this.dropSelf(ModBlocks.THE_HOME_PORTAL.get());

        this.dropSelf(ModBlocks.WEEPING_WILLOW_PLANKS.get());
        this.dropSelf(ModBlocks.WEEPING_WILLOW_LOG.get());
        this.dropSelf(ModBlocks.WEEPING_WILLOW_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_WEEPING_WILLOW_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_WEEPING_WILLOW_WOOD.get());
        this.dropSelf(ModBlocks.WEEPING_WILLOW_SAPLING.get());

        this.add(ModBlocks.WEEPING_WILLOW_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.WEEPING_WILLOW_LEAVES.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.dropSelf(ModBlocks.MISTVEIL_BLOSSOM.get());

        this.dropSelf(ModBlocks.MISTVEIL_BLOSSOM.get());
        this.add(ModBlocks.POTTED_MISTVEIL_BLOSSOM.get(),
                createPotFlowerItemTable(ModBlocks.POTTED_MISTVEIL_BLOSSOM.get()));

        this.dropSelf(ModBlocks.WEEPING_WILLOW_STAIRS.get());
        this.add(ModBlocks.WEEPING_WILLOW_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.WEEPING_WILLOW_SLAB.get()));
        this.dropSelf(ModBlocks.WEEPING_WILLOW_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.WEEPING_WILLOW_BUTTON.get());

        this.dropSelf(ModBlocks.WEEPING_WILLOW_FENCE.get());
        this.dropSelf(ModBlocks.WEEPING_WILLOW_FENCE_GATE.get());
        this.dropSelf(ModBlocks.WEEPING_WILLOW_TRAPDOOR.get());

        this.add(ModBlocks.SILVER_ORE.get(),
                block -> createOreDrop(ModBlocks.SILVER_ORE.get(), ModItems.RAW_SILVER.get()));
        this.add(ModBlocks.DEEPSLATE_SILVER_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_SILVER_ORE.get(), ModItems.RAW_SILVER.get()));

        this.dropSelf(ModBlocks.SILVER_BLOCK.get());
        this.dropSelf(ModBlocks.SILVER_ORE.get());
        this.dropSelf(ModBlocks.RAW_SILVER_BLOCK.get());


        this.add(ModBlocks.WEEPING_WILLOW_DOOR.get(),
                block -> createDoorTable(ModBlocks.WEEPING_WILLOW_DOOR.get()));

        this.add(ModBlocks.WEEPING_WILLOW_SIGN.get(), block ->
                createSingleItemTable(ModItems.WEEPING_WILLOW_SIGN.get()));
        this.add(ModBlocks.WEEPING_WILLOW_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.WEEPING_WILLOW_SIGN.get()));

        this.add(ModBlocks.WEEPING_WILLOW_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.WEEPING_WILLOW_HANGING_SIGN.get()));
        this.add(ModBlocks.WEEPING_WILLOW_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.WEEPING_WILLOW_HANGING_SIGN.get()));

        this.dropSelf(ModBlocks.BOG_GRASS.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
