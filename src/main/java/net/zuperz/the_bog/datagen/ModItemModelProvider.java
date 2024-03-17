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
        withExistingParent(ModItems.SUMPGET_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.MARSH_LURKER_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.BOGE_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.WET_SLIME_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

        simpleItem(ModItems.DUCK_FEATHER);
        simpleItem(ModItems.DUCK_EGG);
        simpleItem(ModItems.RAW_DUCK);
        simpleItem(ModItems.COOKED_DUCK);

        simpleItem(ModItems.HOME_STONE_SHARD);
        simpleItem(ModItems.WET_SLIME_BALL);

        simpleItem(ModItems.RUBY);

        simpleItem(ModItems.BOGGANIUM_INGOT);
        simpleItem(ModItems.BOGSKIN);

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

        simpleItem(ModItems.BOGGANIUM_UPGRADE_SMITHING_TEMPLATE);

        simpleItem(ModItems.MUDSTONE_SHARD_FRAGMENT);
        simpleItem(ModItems.MUDSTONE_SHARD);

        simpleItem(ModItems.SILVER);
        simpleItem(ModItems.RAW_SILVER);

        simpleItem(ModItems.SLIMY_PIECE_OF_SKIN);
        simpleItem(ModItems.COOKED_MARSH_LURKER_FLESH);
        simpleItem(ModItems.MARSH_LURKER_FLESH);

        handheldItem(ModItems.MUDSTONE_SWORD);
        handheldItem(ModItems.MUDSTONE_PICKAXE);
        handheldItem(ModItems.MUDSTONE_AXE);
        handheldItem(ModItems.MUDSTONE_SHOVEL);
        handheldItem(ModItems.MUDSTONE_HOE);
        handheldItem(ModItems.MUDSTONE_PAXEL);

        handheldItem(ModItems.SILVER_SWORD);
        handheldItem(ModItems.SILVER_PICKAXE);
        handheldItem(ModItems.SILVER_AXE);
        handheldItem(ModItems.SILVER_SHOVEL);
        handheldItem(ModItems.SILVER_HOE);
        handheldItem(ModItems.SILVER_PAXEL);

        handheldItem(ModItems.SILVER_DIAMOND_SWORD);
        handheldItem(ModItems.SILVER_DIAMOND_PICKAXE);
        handheldItem(ModItems.SILVER_DIAMOND_AXE);
        handheldItem(ModItems.SILVER_DIAMOND_SHOVEL);
        handheldItem(ModItems.SILVER_DIAMOND_HOE);
        handheldItem(ModItems.SILVER_DIAMOND_PAXEL);

        handheldItem(ModItems.BOGGANIUM_SWORD);
        handheldItem(ModItems.BOGGANIUM_PICKAXE);
        handheldItem(ModItems.BOGGANIUM_AXE);
        handheldItem(ModItems.BOGGANIUM_SHOVEL);
        handheldItem(ModItems.BOGGANIUM_HOE);
        handheldItem(ModItems.BOGGANIUM_PAXEL);

        handheldItem(ModItems.DIAMOND_PAXEL);

        simpleItem(ModItems.BOGGANIUM_WATER_BUCKET);

        simpleItem(ModItems.BOGGY_CHOPS);
        simpleItem(ModItems.COOKED_BOGGY_CHOPS);
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