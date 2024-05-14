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

        blockWithItem(ModBlocks.WEEPING_WILLOW_PLANKS);

        blockWithItem(ModBlocks.MUD_STONE);
        blockWithItem(ModBlocks.MOSSY_MUD_STONE_BRICKS);
        blockWithItem(ModBlocks.MUD_STONE_BRICKS);
        blockWithItem(ModBlocks.ANDESITE_MUD_STONE);

        blockWithItem(ModBlocks.SILVER_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_SILVER_ORE);
        blockWithItem(ModBlocks.RAW_SILVER_BLOCK);
        blockWithItem(ModBlocks.SILVER_BLOCK);

        blockWithItem(ModBlocks.TITANIUM_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_TITANIUM_ORE);
        blockWithItem(ModBlocks.RAW_TITANIUM_BLOCK);
        blockWithItem(ModBlocks.TITANIUM_BLOCK);

        blockWithItem(ModBlocks.URANIUM_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_URANIUM_ORE);
        blockWithItem(ModBlocks.RAW_URANIUM_BLOCK);
        blockWithItem(ModBlocks.URANIUM_BLOCK);
        blockWithItem(ModBlocks.END_STONE_URANIUM_ORE);

        simpleBlock(ModBlocks.STICK_GRASS.get(),
                models().cross(blockTexture(ModBlocks.STICK_GRASS.get()).getPath(), blockTexture(ModBlocks.STICK_GRASS.get())).renderType("cutout"));
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

        blockWithItem(ModBlocks.BLACK_SAND);

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



        logBlock(((RotatedPillarBlock) ModBlocks.REINFORCED_MUD.get()));
        blockItem(ModBlocks.REINFORCED_MUD);

        logBlock(((RotatedPillarBlock) ModBlocks.REINFORCED_MUD_BRICKS.get()));
        blockItem(ModBlocks.REINFORCED_MUD_BRICKS);

        logBlock(((RotatedPillarBlock) ModBlocks.MOSSY_REINFORCED_MUD_BRICKS.get()));
        blockItem(ModBlocks.MOSSY_REINFORCED_MUD_BRICKS);

        blockWithItem(ModBlocks.SMALL_MUD_BRICKS);
        blockWithItem(ModBlocks.LUMINA);

        stairsBlock((StairBlock) ModBlocks.SMALL_MUD_BRICKS_STAIRS.get(), blockTexture(ModBlocks.SMALL_MUD_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.SMALL_MUD_BRICKS_SLAB.get()), blockTexture(ModBlocks.SMALL_MUD_BRICKS.get()), blockTexture(ModBlocks.SMALL_MUD_BRICKS.get()));

        blockItem(ModBlocks.SMALL_MUD_BRICKS_STAIRS);
        blockItem(ModBlocks.SMALL_MUD_BRICKS_SLAB);

        logBlock(((RotatedPillarBlock) ModBlocks.SMALL_MUD_BRICKS_PILLAR.get()));
        blockItem(ModBlocks.SMALL_MUD_BRICKS_PILLAR);

        logBlock(((RotatedPillarBlock) ModBlocks.SMALL_LUMINA_MUD_BRICKS_PILLAR.get()));
        blockItem(ModBlocks.SMALL_LUMINA_MUD_BRICKS_PILLAR);

        logBlock(((RotatedPillarBlock) ModBlocks.SMALL_MUD_BRICKS_COLUMN.get()));
        blockItem(ModBlocks.SMALL_MUD_BRICKS_COLUMN);

        wallBlock((WallBlock) ModBlocks.SMALL_MUD_BRICKS_WALL.get(), blockTexture(ModBlocks.SMALL_MUD_BRICKS.get()));

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