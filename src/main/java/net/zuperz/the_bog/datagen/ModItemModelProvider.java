package net.zuperz.the_bog.datagen;

import net.zuperz.the_bog.The_Bog;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zuperz.the_bog.block.ModBlocks;
import net.zuperz.the_bog.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, The_Bog.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent(ModItems.DUCK_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

        simpleItem(ModItems.DUCK_FEATHER);
        simpleItem(ModItems.DUCK_EGG);
        simpleItem(ModItems.RAW_DUCK);

        simpleBlockItem(ModBlocks.MISTVEIL_BLOSSOM);
        simpleBlockItem(ModBlocks.BOG_GRASS);

        saplingItem(ModBlocks.WEEPING_WILLOW_SAPLING);

        buttonItem(ModBlocks.WEEPING_WILLOW_BUTTON, ModBlocks.WEEPING_WILLOW_PLANKS);
        fenceItem(ModBlocks.WEEPING_WILLOW_FENCE, ModBlocks.WEEPING_WILLOW_PLANKS);
        simpleBlockItem(ModBlocks.WEEPING_WILLOW_DOOR);

        simpleItem(ModItems.WEEPING_WILLOW_SIGN);
        simpleItem(ModItems.WEEPING_WILLOW_HANGING_SIGN);

        simpleItem(ModItems.WEEPING_WILLOW_BOAT);
        simpleItem(ModItems.WEEPING_WILLOW_CHEST_BOAT);
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(The_Bog.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(The_Bog.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation(The_Bog.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder saplingItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(The_Bog.MOD_ID,"block/" + item.getId().getPath()));
    }

    private ItemModelBuilder complexBlock(Block block) {
        return withExistingParent(ForgeRegistries.BLOCKS.getKey(block).getPath(), new ResourceLocation(The_Bog.MOD_ID,
                "block/" + ForgeRegistries.BLOCKS.getKey(block).getPath()));
    }
    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(The_Bog.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(The_Bog.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(The_Bog.MOD_ID,"item/" + item.getId().getPath()));
    }
}