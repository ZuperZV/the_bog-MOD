package net.zuperz.the_bog.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BrushableBlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zuperz.the_bog.The_Bog;
import net.zuperz.the_bog.block.custom.*;
import net.zuperz.the_bog.block.custom.sign.ModHangingSignBlock;
import net.zuperz.the_bog.block.custom.sign.ModStandingSignBlock;
import net.zuperz.the_bog.block.custom.sign.ModWallHangingSignBlock;
import net.zuperz.the_bog.block.custom.sign.ModWallSignBlock;
import net.zuperz.the_bog.fluid.ModFluids;
import net.zuperz.the_bog.item.ModItems;
import net.zuperz.the_bog.util.ModWoodTypes;
import net.zuperz.the_bog.worldgen.tree.WeepingWillowGrower;

import java.util.function.Supplier;

import static net.minecraft.world.level.block.Blocks.SAND;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, The_Bog.MOD_ID);
    public static final DeferredRegister<BlockEntityType<?>> ENTITY = DeferredRegister
            .create(ForgeRegistries.BLOCK_ENTITY_TYPES, The_Bog.MOD_ID);


    public static final RegistryObject<Block> THEBOG_PORTAL = registerBlock("thebog_portal",
            () -> new ThebogPortalBlock());



    /*public static final RegistryObject<Block> THE_BOG_PORTAL = registerBlock("the_bog_portal",
            () -> new TheBogPortal(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN).noOcclusion()));

    public static final RegistryObject<Block> THE_HOME_PORTAL = registerBlock("the_home_portal",
            () -> new TheBogPortalHome(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN).noOcclusion()));
     */

    public static final RegistryObject<Block> WET_SLIME_BLOCK = registerBlock("wet_slime_block",
            () -> new WetSlimeBlock(BlockBehaviour.Properties.copy(Blocks.SLIME_BLOCK).mapColor(MapColor.GRASS).friction(0.8F).sound(SoundType.SLIME_BLOCK).noOcclusion()));

    public static final RegistryObject<Block> MUD_STONE = registerBlock("mud_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));

    public static final RegistryObject<Block> MOSSY_MUD_STONE_BRICKS = registerBlock("mossy_mud_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)));

    public static final RegistryObject<Block> MUD_STONE_BRICKS = registerBlock("mud_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS)));

    public static final RegistryObject<Block> ANDESITE_MUD_STONE = registerBlock("andesite_mud_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));

    public static final RegistryObject<Block> MISTVEIL_BLOSSOM = registerBlock("mistveil_blossom",
            () -> new FlowerBlock(() -> MobEffects.ABSORPTION, 20, BlockBehaviour.Properties.copy(Blocks.ALLIUM)));
    public static final RegistryObject<Block> POTTED_MISTVEIL_BLOSSOM = BLOCKS.register("potted_mistveil_blossom",
            () -> new FlowerPotBlock((() -> (FlowerPotBlock)Blocks.FLOWER_POT), MISTVEIL_BLOSSOM, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM)));

    public static final RegistryObject<Block> SLIMEY_ROCKS = registerBlock("slimey_rocks",
            () -> new PinkPetalsBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().sound(SoundType.PINK_PETALS).pushReaction(PushReaction.DESTROY).noOcclusion()));

    public static final RegistryObject<Block> BOG_GRASS = registerBlock("bog_grass",
            () -> new FlowerBlock(() -> MobEffects.MOVEMENT_SLOWDOWN, 10, BlockBehaviour.Properties.copy(Blocks.ALLIUM)));

    public static final RegistryObject<Block> STICK_GRASS = registerBlock("stick_grass",
            () -> new FlowerBlock(() -> MobEffects.CONFUSION, 20, BlockBehaviour.Properties.copy(Blocks.GRASS)));

    public static final RegistryObject<Block> BLACK_SAND = registerBlock("black_sand",
            () -> new SandBlock(14406560, BlockBehaviour.Properties.of().mapColor(MapColor.SAND).instrument(NoteBlockInstrument.SNARE).strength(0.5F).sound(SoundType.SAND)));

    public static final RegistryObject<Block> SUSPICIOUS_BLACK_SAND = registerBlock("suspicious_black_sand",
            () -> new BrushableBlock(ModBlocks.BLACK_SAND.get(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.SNARE).strength(0.25F).sound(SoundType.SUSPICIOUS_SAND).pushReaction(PushReaction.DESTROY), SoundEvents.BRUSH_SAND, SoundEvents.BRUSH_SAND_COMPLETED));

    public static final RegistryObject<BlockEntityType<BrushableBlockEntity>> BRUSHABLE_BLOCK = ENTITY.register("brushable_block", () ->
            BlockEntityType.Builder.of(BrushableBlockEntity::new,
                    ModBlocks.SUSPICIOUS_BLACK_SAND.get()
            ).build(null)
    );

    public static final RegistryObject<Block> SILVER_BLOCK = registerBlock("silver_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)));
    public static final RegistryObject<Block> RAW_SILVER_BLOCK = registerBlock("raw_silver_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)));
    public static final RegistryObject<Block> SILVER_ORE = registerBlock("silver_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(3f).requiresCorrectToolForDrops(), UniformInt.of(1, 5)));
    public static final RegistryObject<Block> DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(3f).requiresCorrectToolForDrops(), UniformInt.of(1, 6)));


    public static final RegistryObject<Block> TITANIUM_BLOCK = registerBlock("titanium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)));
    public static final RegistryObject<Block> RAW_TITANIUM_BLOCK = registerBlock("raw_titanium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)));
    public static final RegistryObject<Block> TITANIUM_ORE = registerBlock("titanium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(3f).requiresCorrectToolForDrops(), UniformInt.of(1, 4)));
    public static final RegistryObject<Block> DEEPSLATE_TITANIUM_ORE = registerBlock("deepslate_titanium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(4f).requiresCorrectToolForDrops(), UniformInt.of(1, 3)));


    public static final RegistryObject<Block> URANIUM_BLOCK = registerBlock("uranium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)));
    public static final RegistryObject<Block> RAW_URANIUM_BLOCK = registerBlock("raw_uranium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)));
    public static final RegistryObject<Block> URANIUM_ORE = registerBlock("uranium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(3f).requiresCorrectToolForDrops(), UniformInt.of(1, 5)));
    public static final RegistryObject<Block> DEEPSLATE_URANIUM_ORE = registerBlock("deepslate_uranium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(4f).requiresCorrectToolForDrops(), UniformInt.of(1, 3)));

    public static final RegistryObject<Block> END_STONE_URANIUM_ORE = registerBlock("end_stone_uranium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE)
                    .strength(3f).requiresCorrectToolForDrops(), UniformInt.of(1, 5)));

    //public static final RegistryObject<Block> BOG_PORTAL = registerBlockWithoutBlockItem("bog_portal",
    //        TheBogPortal::new);

    /* Wood */
    public static final RegistryObject<Block> WEEPING_WILLOW_LOG = registerBlock("weeping_willow_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> WEEPING_WILLOW_WOOD = registerBlock("weeping_willow_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_WEEPING_WILLOW_LOG = registerBlock("stripped_weeping_willow_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_WEEPING_WILLOW_WOOD = registerBlock("stripped_weeping_willow_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));

    public static final RegistryObject<LiquidBlock> BOGGANIUM_WATER_BLOCK = BLOCKS.register("bogganium_water_block",
            () -> new LiquidBlock(ModFluids.SOURCE_BOGGANIUM_WATER, BlockBehaviour.Properties.copy(Blocks.LAVA).noLootTable()));

    public static final RegistryObject<Block> WEEPING_WILLOW_PLANKS = registerBlock("weeping_willow_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> WEEPING_WILLOW_LEAVES = registerBlock("weeping_willow_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> WEEPING_WILLOW_SAPLING = registerBlock("weeping_willow_sapling",
            () -> new SaplingBlock(new WeepingWillowGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> WEEPING_WILLOW_STAIRS = registerBlock("weeping_willow_stairs",
            () -> new StairBlock(() -> ModBlocks.WEEPING_WILLOW_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> WEEPING_WILLOW_SLAB = registerBlock("weeping_willow_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> WEEPING_WILLOW_PRESSURE_PLATE = registerBlock("weeping_willow_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS), BlockSetType.OAK){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> WEEPING_WILLOW_BUTTON = registerBlock("weeping_willow_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB), BlockSetType.OAK, 40 , true){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> WEEPING_WILLOW_FENCE = registerBlock("weeping_willow_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> WEEPING_WILLOW_FENCE_GATE = registerBlock("weeping_willow_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> WEEPING_WILLOW_DOOR = registerBlock("weeping_willow_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion(),  BlockSetType.OAK){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> WEEPING_WILLOW_TRAPDOOR = registerBlock("weeping_willow_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion(),  BlockSetType.OAK){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> WEEPING_WILLOW_SIGN = BLOCKS.register("weeping_willow_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).noOcclusion(), ModWoodTypes.WEEPING_WILLOW));

    public static final RegistryObject<Block> WEEPING_WILLOW_WALL_SIGN = BLOCKS.register("weeping_willow_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).noOcclusion(), ModWoodTypes.WEEPING_WILLOW));


    public static final RegistryObject<Block> WEEPING_WILLOW_HANGING_SIGN = BLOCKS.register("weeping_willow_hanging_sign",
            () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN).noOcclusion(), ModWoodTypes.WEEPING_WILLOW));

    public static final RegistryObject<Block> WEEPING_WILLOW_WALL_HANGING_SIGN = BLOCKS.register("weeping_willow_wall_hanging_sign",
            () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN).noOcclusion(), ModWoodTypes.WEEPING_WILLOW));


    public static final RegistryObject<Block> REINFORCED_MUD = registerBlock("reinforced_mud",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.MUD_BRICKS).strength(7.0F)));

    public static final RegistryObject<Block> MOSSY_REINFORCED_MUD_BRICKS = registerBlock("mossy_reinforced_mud_bricks",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(ModBlocks.REINFORCED_MUD.get())));

    public static final RegistryObject<Block> REINFORCED_MUD_BRICKS = registerBlock("reinforced_mud_bricks",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(ModBlocks.REINFORCED_MUD.get())));

    public static final RegistryObject<Block> MUD_LODESTONE = registerBlock("mud_lodestone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LODESTONE)));

    /*public static final RegistryObject<Block> SLIME_VINES = registerBlock("slime_vines",
            () -> new WeepingVinesBlock(BlockBehaviour.Properties.copy(Blocks.WEEPING_VINES)));

    public static final RegistryObject<Block> SLIME_VINES_PLANT = registerBlock("WEEPING_VINES_PLANT",
            () -> new WeepingVinesPlantBlock(BlockBehaviour.Properties.copy(Blocks.WEEPING_VINES_PLANT)));
     */

    public static final RegistryObject<Block> SMALL_MUD_BRICKS = registerBlock("small_mud_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MUD_BRICKS)));

    public static final RegistryObject<Block> SMALL_MUD_BRICKS_STAIRS = registerBlock("small_mud_bricks_stairs",
            () -> new StairBlock(() -> ModBlocks.SMALL_MUD_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.MUD_BRICK_STAIRS)));

    public static final RegistryObject<Block> SMALL_MUD_BRICKS_SLAB = registerBlock("small_mud_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MUD_BRICK_SLAB)));

    public static final RegistryObject<Block> SMALL_MUD_BRICKS_WALL = registerBlock("small_mud_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.MUD_BRICK_WALL)));

    public static final RegistryObject<Block> SMALL_MUD_BRICKS_PILLAR = registerBlock("small_mud_bricks_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.MUD_BRICKS)));

    public static final RegistryObject<Block> SMALL_LUMINA_MUD_BRICKS_PILLAR = registerBlock("small_lumina_mud_bricks_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.PEARLESCENT_FROGLIGHT)));

    public static final RegistryObject<Block> SMALL_MUD_BRICKS_COLUMN = registerBlock("small_mud_bricks_column",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.MUD_BRICKS)));

    public static final RegistryObject<Block> LUMINA = registerBlock("lumina",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.PEARLESCENT_FROGLIGHT)));


    public static final RegistryObject<Block> MIDNIGHT_LOG = registerBlock("midnight_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> MIDNIGHT_WOOD = registerBlock("midnight_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_MIDNIGHT_LOG = registerBlock("stripped_midnight_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_MIDNIGHT_WOOD = registerBlock("stripped_midnight_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));

    public static final RegistryObject<Block> MIDNIGHT_PLANKS = registerBlock("midnight_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 10;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> MIDNIGHT_LEAVES = registerBlock("midnight_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 10;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> MIDNIGHT_SAPLING = registerBlock("midnight_sapling",
            () -> new SaplingBlock(new WeepingWillowGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> MIDNIGHT_STAIRS = registerBlock("midnight_stairs",
            () -> new StairBlock(() -> ModBlocks.MIDNIGHT_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 10;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> MIDNIGHT_SLAB = registerBlock("midnight_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 10;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> MIDNIGHT_PRESSURE_PLATE = registerBlock("midnight_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS), BlockSetType.OAK){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 10;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> MIDNIGHT_BUTTON = registerBlock("midnight_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB), BlockSetType.OAK, 40 , true){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 10;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> MIDNIGHT_FENCE = registerBlock("midnight_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 10;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> MIDNIGHT_FENCE_GATE = registerBlock("midnight_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 10;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> MIDNIGHT_DOOR = registerBlock("midnight_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion(),  BlockSetType.OAK){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 10;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> MIDNIGHT_TRAPDOOR = registerBlock("midnight_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion(),  BlockSetType.OAK){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 10;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> MIDNIGHT_SIGN = BLOCKS.register("midnight_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).noOcclusion(), ModWoodTypes.MIDNIGHT));

    public static final RegistryObject<Block> MIDNIGHT_WALL_SIGN = BLOCKS.register("midnight_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).noOcclusion(), ModWoodTypes.MIDNIGHT));


    public static final RegistryObject<Block> MIDNIGHT_HANGING_SIGN = BLOCKS.register("midnight_hanging_sign",
            () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN).noOcclusion(), ModWoodTypes.MIDNIGHT));

    public static final RegistryObject<Block> MIDNIGHT_WALL_HANGING_SIGN = BLOCKS.register("midnight_wall_hanging_sign",
            () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN).noOcclusion(), ModWoodTypes.MIDNIGHT));


    //RotatedPillarBlock
    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
