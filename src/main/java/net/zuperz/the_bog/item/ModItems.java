package net.zuperz.the_bog.item;

import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zuperz.the_bog.The_Bog;
import net.zuperz.the_bog.block.ModBlocks;
import net.zuperz.the_bog.entity.ModEntities;
import net.zuperz.the_bog.entity.custom.ModBoatEntity;
import net.zuperz.the_bog.item.costom.DuckEggItem;
import net.zuperz.the_bog.item.costom.ModBoatItem;
import net.zuperz.the_bog.item.costom.ModFoodProperties;
import net.zuperz.the_bog.item.costom.ModSmithingTemplateItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, The_Bog.MOD_ID);


    public static final RegistryObject<Item> DUCK_SPAWN_EGG = ITEMS.register("duck_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.DUCK, 0x544124, 0xecd8ba,
                    new Item.Properties()));

    public static final RegistryObject<Item> SUMPGET_SPAWN_EGG = ITEMS.register("sumpget_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.SUMPGET, 0xa4a4a4, 0x787878,
                    new Item.Properties()));

    public static final RegistryObject<Item> DUCK_EGG = ITEMS.register("duck_egg",
            () -> new DuckEggItem((new Item.Properties()).stacksTo(16)));

    public static final RegistryObject<Item> DUCK_FEATHER = ITEMS.register("duck_feather",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_DUCK = ITEMS.register("raw_duck",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RAW_DUCK)));

    public static final RegistryObject<Item> COOKED_DUCK = ITEMS.register("cooked_duck",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COOKED_DUCK)));

    public static final RegistryObject<Item> WEEPING_WILLOW_SIGN = ITEMS.register("weeping_willow_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.WEEPING_WILLOW_SIGN.get(), ModBlocks.WEEPING_WILLOW_WALL_SIGN.get()));

    public static final RegistryObject<Item> WEEPING_WILLOW_HANGING_SIGN = ITEMS.register("weeping_willow_hanging_sign",
            () -> new HangingSignItem(ModBlocks.WEEPING_WILLOW_HANGING_SIGN.get(), ModBlocks.WEEPING_WILLOW_WALL_HANGING_SIGN.get(),
                    new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> WEEPING_WILLOW_BOAT = ITEMS.register("weeping_willow_boat",
            () -> new ModBoatItem(false, ModBoatEntity.Type.WEEPING_WILLOW, new Item.Properties()));

    public static final RegistryObject<Item> WEEPING_WILLOW_CHEST_BOAT = ITEMS.register("weeping_willow_chest_boat",
            () -> new ModBoatItem(true, ModBoatEntity.Type.WEEPING_WILLOW, new Item.Properties()));

    public static final RegistryObject<Item> BOGBLOSSOM_BOW = ITEMS.register("bogblossom_bow",
            () -> new BowItem(new Item.Properties().durability(650)));

    public static final RegistryObject<Item> DIAMOND_BOGBLOSSOM_BOW = ITEMS.register("diamond_bogblossom_bow",
            () -> new BowItem(new Item.Properties().durability(2650)));

    public static final RegistryObject<Item> BOGGANIUM_INGOT = ITEMS.register("bogganium_ingot",
            () -> new BowItem(new Item.Properties()));

    public static final RegistryObject<Item> BOGSKIN = ITEMS.register("bogskin",
            () -> new BowItem(new Item.Properties()));

    public static final RegistryObject<Item> BOGGANIUM_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("bogganium_upgrade_smithing_template",
            () -> ModSmithingTemplateItem.createBogganiumUpgradeTemplate());

    public static final RegistryObject<Item> BOGGANIUM_HELMET = ITEMS.register("bogganium_helmet",
            () -> new ArmorItem(ModArmorMaterials.BOGGANIUM, ArmorItem.Type.HELMET, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> BOGGANIUM_CHESTPLATE = ITEMS.register("bogganium_chestplate",
            () -> new ArmorItem(ModArmorMaterials.BOGGANIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> BOGGANIUM_LEGGINGS = ITEMS.register("bogganium_leggings",
            () -> new ArmorItem(ModArmorMaterials.BOGGANIUM, ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> BOGGANIUM_BOOTS = ITEMS.register("bogganium_boots",
            () -> new ArmorItem(ModArmorMaterials.BOGGANIUM, ArmorItem.Type.BOOTS, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> BOGWALKER_HELMET = ITEMS.register("bogwalker_helmet",
            () -> new ArmorItem(ModArmorMaterials.BOGWALKER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> BOGWALKER_CHESTPLATE = ITEMS.register("bogwalker_chestplate",
            () -> new ArmorItem(ModArmorMaterials.BOGWALKER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> BOGWALKER_LEGGINGS = ITEMS.register("bogwalker_leggings",
            () -> new ArmorItem(ModArmorMaterials.BOGWALKER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> BOGWALKER_BOOTS = ITEMS.register("bogwalker_boots",
            () -> new ArmorItem(ModArmorMaterials.BOGWALKER, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
