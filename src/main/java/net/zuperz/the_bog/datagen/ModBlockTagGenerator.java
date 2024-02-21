package net.zuperz.the_bog.datagen;

import net.zuperz.the_bog.The_Bog;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.zuperz.the_bog.block.ModBlocks;
import net.zuperz.the_bog.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

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
                .add(ModBlocks.WEEPING_WILLOW_FENCE_GATE.get());

        this.tag(ModTags.Blocks.PORTAL_FRAME_BLOCKS)
                .add(ModBlocks.MUD_STONE.get());

        this.tag(ModTags.Blocks.BLACKLIST_PORTAL_FRAME_BLOCKS);

        this.tag(ModTags.Blocks.BOG_DIRT)
                .add(ModBlocks.MUD_STONE.get());

        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.WEEPING_WILLOW_LOG.get())
                .add(ModBlocks.WEEPING_WILLOW_WOOD.get())
                .add(ModBlocks.STRIPPED_WEEPING_WILLOW_LOG.get())
                .add(ModBlocks.STRIPPED_WEEPING_WILLOW_WOOD.get());

        this.tag(BlockTags.PLANKS)
                .add(ModBlocks.WEEPING_WILLOW_PLANKS.get());

        this.tag(BlockTags.FENCES)
                .add(ModBlocks.WEEPING_WILLOW_FENCE.get());

        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.WEEPING_WILLOW_FENCE_GATE.get());

    }

    @Override
    public String getName() {
        return "Block Tags";
    }
}