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
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DUCK_FEATHER.get()))
                    .title(Component.translatable("creativetab.bog_tab"))
                    .displayItems((displayParameters, output) -> {

                        output.accept(ModItems.DUCK_FEATHER.get());
                        output.accept(ModItems.RAW_DUCK.get());
                        output.accept(ModItems.COOKED_DUCK.get());
                        output.accept(ModItems.DUCK_EGG.get());
                        output.accept(ModItems.DUCK_SPAWN_EGG.get());
                        output.accept(ModItems.SUMPGET_SPAWN_EGG.get());
                        output.accept(ModItems.BOGSKIN.get());
                        output.accept(ModItems.BOGGANIUM_INGOT.get());
                        output.accept(ModItems.BOGGANIUM_UPGRADE_SMITHING_TEMPLATE.get());

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
                        output.accept(ModBlocks.MUD_STONE.get());

                        output.accept(ModBlocks.THE_BOG_PORTAL.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> BOG_ARMOR_TAB = CREATIVE_MODE_TABS.register("bog_armor_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BOGGANIUM_CHESTPLATE.get()))
                    .title(Component.translatable("creativetab.bog_armor_tab"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ModItems.BOGGANIUM_HELMET.get());
                        output.accept(ModItems.BOGWALKER_HELMET.get());

                        output.accept(ModItems.BOGGANIUM_CHESTPLATE.get());
                        output.accept(ModItems.BOGWALKER_CHESTPLATE.get());

                        output.accept(ModItems.BOGGANIUM_LEGGINGS.get());
                        output.accept(ModItems.BOGWALKER_LEGGINGS.get());

                        output.accept(ModItems.BOGGANIUM_BOOTS.get());
                        output.accept(ModItems.BOGWALKER_BOOTS.get());
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
