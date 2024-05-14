package net.zuperz.the_bog.datagen;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.zuperz.the_bog.The_Bog;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.zuperz.the_bog.block.ModBlocks;
import net.zuperz.the_bog.item.ModItems;
import net.zuperz.the_bog.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

import static net.minecraftforge.common.Tags.Blocks.ORES_DIAMOND;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, The_Bog.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {


        this.tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.WEEPING_WILLOW_SLAB.get())
                .add(ModBlocks.WEEPING_WILLOW_STAIRS.get())
                .add(ModBlocks.WEEPING_WILLOW_PLANKS.get())
                .add(ModBlocks.WEEPING_WILLOW_LOG.get())
                .add(ModBlocks.WEEPING_WILLOW_WOOD.get())
                .add(ModBlocks.STRIPPED_WEEPING_WILLOW_LOG.get())
                .add(ModBlocks.STRIPPED_WEEPING_WILLOW_WOOD.get())
                .add(ModBlocks.WEEPING_WILLOW_PRESSURE_PLATE.get())
                .add(ModBlocks.WEEPING_WILLOW_BUTTON.get())
                .add(ModBlocks.WEEPING_WILLOW_FENCE.get())
                .add(ModBlocks.WEEPING_WILLOW_FENCE_GATE.get())

                .add(ModBlocks.LUMINA.get());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.MUD_STONE.get())
                .add(ModBlocks.MOSSY_MUD_STONE_BRICKS.get())
                .add(ModBlocks.MUD_STONE_BRICKS.get())
                .add(ModBlocks.ANDESITE_MUD_STONE.get())

                .add(ModBlocks.SMALL_MUD_BRICKS.get())
                .add(ModBlocks.SMALL_MUD_BRICKS_PILLAR.get())
                .add(ModBlocks.SMALL_LUMINA_MUD_BRICKS_PILLAR.get())
                .add(ModBlocks.SMALL_MUD_BRICKS_COLUMN.get())
                .add(ModBlocks.SMALL_MUD_BRICKS_STAIRS.get())
                .add(ModBlocks.SMALL_MUD_BRICKS_SLAB.get())
                .add(ModBlocks.SMALL_MUD_BRICKS_WALL.get())

                .add(ModBlocks.MUD_LODESTONE.get())
                .add(ModBlocks.REINFORCED_MUD_BRICKS.get())
                .add(ModBlocks.MOSSY_REINFORCED_MUD_BRICKS.get())
                .add(ModBlocks.REINFORCED_MUD.get())

                .add(ModBlocks.DEEPSLATE_URANIUM_ORE.get())
                .add(ModBlocks.END_STONE_URANIUM_ORE.get())
                .add(ModBlocks.URANIUM_ORE.get())
                .add(ModBlocks.URANIUM_BLOCK.get())
                .add(ModBlocks.RAW_URANIUM_BLOCK.get())

                .add(ModBlocks.DEEPSLATE_SILVER_ORE.get())
                .add(ModBlocks.SILVER_ORE.get())
                .add(ModBlocks.SILVER_BLOCK.get())
                .add(ModBlocks.RAW_SILVER_BLOCK.get())

                .add(ModBlocks.DEEPSLATE_TITANIUM_ORE.get())
                .add(ModBlocks.TITANIUM_ORE.get())
                .add(ModBlocks.TITANIUM_BLOCK.get())
                .add(ModBlocks.RAW_TITANIUM_BLOCK.get());

        this.tag(ModTags.Blocks.PORTAL_FRAME_BLOCKS)
                .add(ModBlocks.MUD_STONE.get())
                .add(ModBlocks.MUD_STONE_BRICKS.get())
                .add(ModBlocks.ANDESITE_MUD_STONE.get())
                .add(ModBlocks.MUD_STONE.get())
                .add(Blocks.MUD);

        this.tag(ModTags.Blocks.BOG_DIRT)
                .add(ModBlocks.MUD_STONE.get())
                .add(ModBlocks.MOSSY_MUD_STONE_BRICKS.get())
                .add(ModBlocks.MUD_STONE_BRICKS.get())
                .add(ModBlocks.ANDESITE_MUD_STONE.get());

        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.WEEPING_WILLOW_LOG.get())
                .add(ModBlocks.WEEPING_WILLOW_WOOD.get())
                .add(ModBlocks.STRIPPED_WEEPING_WILLOW_LOG.get())
                .add(ModBlocks.STRIPPED_WEEPING_WILLOW_WOOD.get());

        this.tag(ModTags.Blocks.PAXEL_MINEABLE)
                .addTag(BlockTags.MINEABLE_WITH_PICKAXE)
                .addTag(BlockTags.MINEABLE_WITH_SHOVEL)
                .addTag(BlockTags.MINEABLE_WITH_AXE);

        this.tag(BlockTags.PLANKS)
                .add(ModBlocks.WEEPING_WILLOW_PLANKS.get());

        this.tag(BlockTags.FENCES)
                .add(ModBlocks.WEEPING_WILLOW_FENCE.get());

        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.WEEPING_WILLOW_FENCE_GATE.get());

        this.tag(BlockTags.WALLS)
                .add(ModBlocks.SMALL_MUD_BRICKS_WALL.get());

        this.tag(ModTags.Blocks.ORES_SILVER)
                .add(ModBlocks.SILVER_ORE.get())
                .add(ModBlocks.DEEPSLATE_SILVER_ORE.get());

        this.tag(ModTags.Blocks.ORES_URANIUM)
                .add(ModBlocks.URANIUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_URANIUM_ORE.get());

        this.tag(ModTags.Blocks.ORES_TITANIUM)
                .add(ModBlocks.TITANIUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_TITANIUM_ORE.get());
    }

    @Override
    public String getName() {
        return "Block Tags";
    }
}