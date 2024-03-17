package net.zuperz.the_bog.datagen;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.zuperz.the_bog.The_Bog;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zuperz.the_bog.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, The_Bog.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.THE_BOG_PORTAL);
        blockWithItem(ModBlocks.THE_HOME_PORTAL);

        blockWithItem(ModBlocks.WEEPING_WILLOW_PLANKS);

        blockWithItem(ModBlocks.MUD_STONE);
        blockWithItem(ModBlocks.MOSSY_MUD_STONE_BRICKS);
        blockWithItem(ModBlocks.MUD_STONE_BRICKS);
        blockWithItem(ModBlocks.ANDESITE_MUD_STONE);

        blockWithItem(ModBlocks.SILVER_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_SILVER_ORE);

        blockWithItem(ModBlocks.RAW_SILVER_BLOCK);
        blockWithItem(ModBlocks.SILVER_BLOCK);

        simpleBlock(ModBlocks.BOG_GRASS.get(),
                models().cross(blockTexture(ModBlocks.BOG_GRASS.get()).getPath(), blockTexture(ModBlocks.BOG_GRASS.get())).renderType("cutout"));
        simpleBlock(ModBlocks.MISTVEIL_BLOSSOM.get(),
                models().cross(blockTexture(ModBlocks.MISTVEIL_BLOSSOM.get()).getPath(), blockTexture(ModBlocks.MISTVEIL_BLOSSOM.get())).renderType("cutout"));

        logBlock(((RotatedPillarBlock) ModBlocks.WEEPING_WILLOW_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.WEEPING_WILLOW_WOOD.get()), blockTexture(ModBlocks.WEEPING_WILLOW_LOG.get()), blockTexture(ModBlocks.WEEPING_WILLOW_LOG.get()));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_WEEPING_WILLOW_LOG.get(), new ResourceLocation(The_Bog.MOD_ID, "block/stripped_weeping_willow_log"),
                new ResourceLocation(The_Bog.MOD_ID, "block/stripped_weeping_willow_log_top"));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_WEEPING_WILLOW_WOOD.get(), new ResourceLocation(The_Bog.MOD_ID, "block/stripped_weeping_willow_log"),
                new ResourceLocation(The_Bog.MOD_ID, "block/stripped_weeping_willow_log"));

        stairsBlock((StairBlock) ModBlocks.WEEPING_WILLOW_STAIRS.get(), blockTexture(ModBlocks.WEEPING_WILLOW_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.WEEPING_WILLOW_SLAB.get()), blockTexture(ModBlocks.WEEPING_WILLOW_PLANKS.get()), blockTexture(ModBlocks.WEEPING_WILLOW_PLANKS.get()));

        pressurePlateBlock((PressurePlateBlock) ModBlocks.WEEPING_WILLOW_PRESSURE_PLATE.get(), blockTexture(ModBlocks.WEEPING_WILLOW_PLANKS.get()));
        buttonBlock((ButtonBlock) ModBlocks.WEEPING_WILLOW_BUTTON.get(), blockTexture(ModBlocks.WEEPING_WILLOW_PLANKS.get()));

        fenceBlock((FenceBlock) ModBlocks.WEEPING_WILLOW_FENCE.get(), blockTexture(ModBlocks.WEEPING_WILLOW_PLANKS.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.WEEPING_WILLOW_FENCE_GATE.get(), blockTexture(ModBlocks.WEEPING_WILLOW_PLANKS.get()));

        doorBlockWithRenderType((DoorBlock)ModBlocks.WEEPING_WILLOW_DOOR.get(), modLoc("block/weeping_willow_door_bottom"), modLoc("block/weeping_willow_door_top"), "cutout");
        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.WEEPING_WILLOW_TRAPDOOR.get(), modLoc("block/weeping_willow_trapdoor"), true, "cutout");

        blockItem(ModBlocks.WEEPING_WILLOW_LOG);
        blockItem(ModBlocks.WEEPING_WILLOW_WOOD);
        blockItem(ModBlocks.STRIPPED_WEEPING_WILLOW_LOG);
        blockItem(ModBlocks.STRIPPED_WEEPING_WILLOW_WOOD);


        leavesBlock(ModBlocks.WEEPING_WILLOW_LEAVES);
        saplingBlock(ModBlocks.WEEPING_WILLOW_SAPLING);

        blockItem(ModBlocks.WEEPING_WILLOW_STAIRS);
        blockItem(ModBlocks.WEEPING_WILLOW_SLAB);
        blockItem(ModBlocks.WEEPING_WILLOW_PRESSURE_PLATE);

        blockItem(ModBlocks.WEEPING_WILLOW_FENCE_GATE);
        blockItem(ModBlocks.WEEPING_WILLOW_TRAPDOOR, "_bottom");

        signBlock(((StandingSignBlock) ModBlocks.WEEPING_WILLOW_SIGN.get()), ((WallSignBlock) ModBlocks.WEEPING_WILLOW_WALL_SIGN.get()),
                blockTexture(ModBlocks.WEEPING_WILLOW_PLANKS.get()));

        hangingSignBlock(ModBlocks.WEEPING_WILLOW_HANGING_SIGN.get(), ModBlocks.WEEPING_WILLOW_WALL_HANGING_SIGN.get(),
                blockTexture(ModBlocks.WEEPING_WILLOW_PLANKS.get()));
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ResourceLocation texture) {
        ModelFile sign = models().sign(name(signBlock), texture);
        hangingSignBlock(signBlock, wallSignBlock, sign);
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ModelFile sign) {
        simpleBlock(signBlock, sign);
        simpleBlock(wallSignBlock, sign);
    }

    private String name(Block block) {
        return key(block).getPath();
    }

    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject, String appendix) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("the_bog:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath() + appendix));
    }

    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), new ResourceLocation("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("the_bog:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}