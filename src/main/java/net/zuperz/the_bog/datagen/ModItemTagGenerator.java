package net.zuperz.the_bog.datagen;

import net.zuperz.the_bog.The_Bog;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.zuperz.the_bog.block.ModBlocks;
import net.zuperz.the_bog.item.ModItems;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> future,
                               CompletableFuture<TagLookup<Block>> completableFuture, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, future, completableFuture, The_Bog.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.WEEPING_WILLOW_LOG.get().asItem())
                .add(ModBlocks.WEEPING_WILLOW_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_WEEPING_WILLOW_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_WEEPING_WILLOW_WOOD.get().asItem());

        this.tag(ItemTags.PLANKS)
                .add(ModBlocks.WEEPING_WILLOW_PLANKS.get().asItem());

        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.BOGGANIUM_HELMET.get())
                .add(ModItems.BOGGANIUM_CHESTPLATE.get())
                .add(ModItems.BOGGANIUM_LEGGINGS.get())
                .add(ModItems.BOGGANIUM_BOOTS.get())

                .add(ModItems.BOGWALKER_HELMET.get())
                .add(ModItems.BOGWALKER_CHESTPLATE.get())
                .add(ModItems.BOGWALKER_LEGGINGS.get())
                .add(ModItems.BOGWALKER_BOOTS.get());
    }

    @Override
    public String getName() {
        return "Item Tags";
    }
}