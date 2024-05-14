package net.zuperz.the_bog.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.zuperz.the_bog.The_Bog;
import net.zuperz.the_bog.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, The_Bog.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BOG_TAB = CREATIVE_MODE_TABS.register("bog_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MUD_STONE_AND_STEEL.get()))
                    .title(Component.translatable("creativetab.bog_tab"))
                    .displayItems((displayParameters, output) -> {

                        output.accept(ModItems.MUD_STONE_AND_STEEL.get());

                        output.accept(ModItems.DUCK_FEATHER.get());
                        output.accept(ModItems.RAW_DUCK.get());
                        output.accept(ModItems.COOKED_DUCK.get());
                        output.accept(ModItems.BOGGY_CHOPS.get());
                        output.accept(ModItems.COOKED_BOGGY_CHOPS.get());
                        output.accept(ModItems.DUCK_EGG.get());
                        output.accept(ModItems.DARK_SKELETON_SPAWN_EGG.get());
                        output.accept(ModItems.DUCK_SPAWN_EGG.get());
                        output.accept(ModItems.SUMPGET_SPAWN_EGG.get());
                        output.accept(ModItems.MARSH_LURKER_SPAWN_EGG.get());
                        output.accept(ModItems.BOGE_SPAWN_EGG.get());
                        output.accept(ModItems.WET_SLIME_SPAWN_EGG.get());
                        output.accept(ModItems.WET_SLIME_BALL.get());
                        output.accept(ModBlocks.WET_SLIME_BLOCK.get());
                        output.accept(ModItems.BOGSKIN.get());
                        output.accept(ModItems.RUBY.get());
                        output.accept(ModItems.RAW_SILVER.get());
                        output.accept(ModItems.SILVER.get());
                        output.accept(ModBlocks.SILVER_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_SILVER_ORE.get());
                        output.accept(ModBlocks.RAW_SILVER_BLOCK.get());
                        output.accept(ModBlocks.SILVER_BLOCK.get());

                        output.accept(ModItems.RAW_URANIUM.get());
                        output.accept(ModItems.URANIUM.get());
                        output.accept(ModBlocks.URANIUM_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_URANIUM_ORE.get());
                        output.accept(ModBlocks.RAW_URANIUM_BLOCK.get());
                        output.accept(ModBlocks.URANIUM_BLOCK.get());

                        output.accept(ModItems.RAW_TITANIUM.get());
                        output.accept(ModItems.TITANIUM.get());
                        output.accept(ModBlocks.TITANIUM_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_TITANIUM_ORE.get());
                        output.accept(ModBlocks.RAW_TITANIUM_BLOCK.get());
                        output.accept(ModBlocks.TITANIUM_BLOCK.get());

                        output.accept(ModItems.BOGGANIUM_INGOT.get());
                        output.accept(ModItems.BOGGANIUM_UPGRADE_SMITHING_TEMPLATE.get());
                        output.accept(ModItems.MUDSTONE_SHARD.get());
                        output.accept(ModItems.MUDSTONE_SHARD_FRAGMENT.get());
                        output.accept(ModItems.BOGGANIUM_WATER_BUCKET.get());

                        output.accept(ModBlocks.WEEPING_WILLOW_LOG.get());
                        output.accept(ModBlocks.WEEPING_WILLOW_WOOD.get());
                        output.accept(ModBlocks.WEEPING_WILLOW_PLANKS.get());
                        output.accept(ModBlocks.STRIPPED_WEEPING_WILLOW_LOG.get());
                        output.accept(ModBlocks.STRIPPED_WEEPING_WILLOW_WOOD.get());

                        output.accept(ModBlocks.WEEPING_WILLOW_STAIRS.get());
                        output.accept(ModBlocks.WEEPING_WILLOW_SLAB.get());
                        output.accept(ModBlocks.WEEPING_WILLOW_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.WEEPING_WILLOW_BUTTON.get());
                        output.accept(ModBlocks.WEEPING_WILLOW_FENCE.get());
                        output.accept(ModBlocks.WEEPING_WILLOW_FENCE_GATE.get());
                        output.accept(ModBlocks.WEEPING_WILLOW_TRAPDOOR.get());
                        output.accept(ModBlocks.WEEPING_WILLOW_DOOR.get());
                        output.accept(ModItems.WEEPING_WILLOW_SIGN.get());
                        output.accept(ModItems.WEEPING_WILLOW_HANGING_SIGN.get());

                        output.accept(ModBlocks.WEEPING_WILLOW_LEAVES.get());
                        output.accept(ModBlocks.WEEPING_WILLOW_SAPLING.get());

                        output.accept(ModItems.WEEPING_WILLOW_BOAT.get());
                        output.accept(ModItems.WEEPING_WILLOW_CHEST_BOAT.get());

                        output.accept(ModItems.BOGBLOSSOM_BOW.get());
                        output.accept(ModItems.DIAMOND_BOGBLOSSOM_BOW.get());

                        output.accept(ModBlocks.MISTVEIL_BLOSSOM.get());
                        output.accept(ModBlocks.BOG_GRASS.get());
                        output.accept(ModBlocks.STICK_GRASS.get());
                        output.accept(ModBlocks.MUD_STONE.get());
                        output.accept(ModBlocks.MUD_STONE_BRICKS.get());
                        output.accept(ModBlocks.MOSSY_MUD_STONE_BRICKS.get());
                        output.accept(ModBlocks.ANDESITE_MUD_STONE.get());

                        output.accept(ModBlocks.MUD_LODESTONE.get());
                        output.accept(ModBlocks.REINFORCED_MUD_BRICKS.get());
                        output.accept(ModBlocks.MOSSY_REINFORCED_MUD_BRICKS.get());
                        output.accept(ModBlocks.REINFORCED_MUD.get());
                        output.accept(ModBlocks.SMALL_MUD_BRICKS.get());
                        output.accept(ModBlocks.SMALL_MUD_BRICKS_PILLAR.get());
                        output.accept(ModBlocks.SMALL_LUMINA_MUD_BRICKS_PILLAR.get());
                        output.accept(ModBlocks.SMALL_MUD_BRICKS_COLUMN.get());
                        output.accept(ModBlocks.LUMINA.get());
                        output.accept(ModBlocks.SMALL_MUD_BRICKS_STAIRS.get());
                        output.accept(ModBlocks.SMALL_MUD_BRICKS_SLAB.get());
                        output.accept(ModBlocks.SMALL_MUD_BRICKS_WALL.get());

                        output.accept(ModItems.MARSH_LURKER_FLESH.get());
                        output.accept(ModItems.COOKED_MARSH_LURKER_FLESH.get());
                        output.accept(ModItems.SLIMY_PIECE_OF_SKIN.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> BOG_ARMOR_TAB = CREATIVE_MODE_TABS.register("bog_armor_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BOGGANIUM_CHESTPLATE.get()))
                    .title(Component.translatable("creativetab.bog_armor_tab"))
                    .displayItems((displayParameters, output) -> {

                        /* Tools */
                        output.accept(ModItems.MUDSTONE_SWORD.get());
                        output.accept(ModItems.SILVER_SWORD.get());
                        output.accept(ModItems.SILVER_DIAMOND_SWORD.get());
                        output.accept(ModItems.BOGGANIUM_SWORD.get());
                        output.accept(ModItems.URANIUM_SWORD.get());
                        output.accept(ModItems.TITANIUM_SWORD.get());

                        output.accept(ModItems.MUDSTONE_PICKAXE.get());
                        output.accept(ModItems.SILVER_PICKAXE.get());
                        output.accept(ModItems.SILVER_DIAMOND_PICKAXE.get());
                        output.accept(ModItems.BOGGANIUM_PICKAXE.get());
                        output.accept(ModItems.URANIUM_PICKAXE.get());
                        output.accept(ModItems.TITANIUM_PICKAXE.get());

                        output.accept(ModItems.MUDSTONE_AXE.get());
                        output.accept(ModItems.SILVER_AXE.get());
                        output.accept(ModItems.SILVER_DIAMOND_AXE.get());
                        output.accept(ModItems.BOGGANIUM_AXE.get());
                        output.accept(ModItems.URANIUM_AXE.get());
                        output.accept(ModItems.TITANIUM_AXE.get());

                        output.accept(ModItems.MUDSTONE_SHOVEL.get());
                        output.accept(ModItems.SILVER_SHOVEL.get());
                        output.accept(ModItems.SILVER_DIAMOND_SHOVEL.get());
                        output.accept(ModItems.BOGGANIUM_SHOVEL.get());
                        output.accept(ModItems.URANIUM_SHOVEL.get());
                        output.accept(ModItems.TITANIUM_SHOVEL.get());

                        output.accept(ModItems.MUDSTONE_HOE.get());
                        output.accept(ModItems.SILVER_HOE.get());
                        output.accept(ModItems.SILVER_DIAMOND_HOE.get());
                        output.accept(ModItems.BOGGANIUM_HOE.get());
                        output.accept(ModItems.URANIUM_HOE.get());
                        output.accept(ModItems.TITANIUM_HOE.get());

                        output.accept(ModItems.MUDSTONE_PAXEL.get());
                        output.accept(ModItems.SILVER_PAXEL.get());
                        output.accept(ModItems.SILVER_DIAMOND_PAXEL.get());
                        output.accept(ModItems.BOGGANIUM_PAXEL.get());


                        /* Armor */
                        output.accept(ModItems.BOGWALKER_HELMET.get());
                        output.accept(ModItems.SILVER_HELMET.get());
                        output.accept(ModItems.SILVER_DIAMOND_HELMET.get());
                        output.accept(ModItems.BOGGANIUM_HELMET.get());
                        output.accept(ModItems.URANIUM_HELMET.get());
                        output.accept(ModItems.TITANIUM_HELMET.get());

                        output.accept(ModItems.BOGWALKER_CHESTPLATE.get());
                        output.accept(ModItems.SILVER_CHESTPLATE.get());
                        output.accept(ModItems.SILVER_DIAMOND_CHESTPLATE.get());
                        output.accept(ModItems.BOGGANIUM_CHESTPLATE.get());
                        output.accept(ModItems.URANIUM_CHESTPLATE.get());
                        output.accept(ModItems.TITANIUM_CHESTPLATE.get());

                        output.accept(ModItems.BOGWALKER_LEGGINGS.get());
                        output.accept(ModItems.SILVER_LEGGINGS.get());
                        output.accept(ModItems.SILVER_DIAMOND_LEGGINGS.get());
                        output.accept(ModItems.BOGGANIUM_LEGGINGS.get());
                        output.accept(ModItems.URANIUM_LEGGINGS.get());
                        output.accept(ModItems.TITANIUM_LEGGINGS.get());

                        output.accept(ModItems.BOGWALKER_BOOTS.get());
                        output.accept(ModItems.SILVER_BOOTS.get());
                        output.accept(ModItems.SILVER_DIAMOND_BOOTS.get());
                        output.accept(ModItems.BOGGANIUM_BOOTS.get());
                        output.accept(ModItems.URANIUM_BOOTS.get());
                        output.accept(ModItems.TITANIUM_BOOTS.get());

                        output.accept(ModItems.BOGWALKER_HORSE_ARMOR.get());
                        output.accept(ModItems.SILVER_HORSE_ARMOR.get());
                        output.accept(ModItems.SILVER_DIAMOND_HORSE_ARMOR.get());
                        output.accept(ModItems.BOGGANIUM_HORSE_ARMOR.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> THE_BOG_BOSS_TAB = CREATIVE_MODE_TABS.register("the_bog_boss_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DARK_SKELETON_SPAWN_EGG.get()))
                    .title(Component.translatable("creativetab.the_bog_boss_tab"))
                    .displayItems((displayParameters, output) -> {

                        output.accept(ModItems.DARK_SKELETON_SPAWN_EGG.get());

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
