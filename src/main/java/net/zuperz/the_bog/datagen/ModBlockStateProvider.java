package net.zuperz.the_bog.datagen;

import net.zuperz.the_bog.The_Bog;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, The_Bog.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        /*blockWithItem(ModBlocks.GILDED_GOLD_BLOCK);


        stairsBlock((StairBlock) ModBlocks.SOUL_STONE_STAIRS.get(), blockTexture(ModBlocks.SOUL_STONE.get()));


        slabBlock(((SlabBlock) ModBlocks.SOUL_STONE_SLAB.get()), blockTexture(ModBlocks.SOUL_STONE.get()), blockTexture(ModBlocks.SOUL_STONE.get()));
         */

    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("the_bog:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}