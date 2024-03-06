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
import net.zuperz.the_bog.fluid.ModFluids;
import net.zuperz.the_bog.item.costom.*;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, The_Bog.MOD_ID);


    public static final RegistryObject<Item> DUCK_SPAWN_EGG = ITEMS.register("duck_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.DUCK, 0x544124, 0xecd8ba,
                    new Item.Properties()));

    public static final RegistryObject<Item> SUMPGET_SPAWN_EGG = ITEMS.register("sumpget_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.SUMPGET, 0xa4a4a4, 0x787878,
                    new Item.Properties()));

    public static final RegistryObject<Item> MARSH_LURKER_SPAWN_EGG = ITEMS.register("marsh_lurker_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.MARSH_LURKER, 0x828f7d, 0x6e736c,
                    new Item.Properties()));

    public static final RegistryObject<Item> DUCK_EGG = ITEMS.register("duck_egg",
            () -> new DuckEggItem((new Item.Properties()).stacksTo(16)));

    public static final RegistryObject<Item> DUCK_FEATHER = ITEMS.register("duck_feather",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_DUCK = ITEMS.register("raw_duck",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RAW_DUCK)));

    public static final RegistryObject<Item> COOKED_BOGGY_CHOPS = ITEMS.register("cooked_boggy_chops",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COOKED_BOGGY_CHOPS)));

    public static final RegistryObject<Item> BOGGY_CHOPS = ITEMS.register("boggy_chops",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BOGGY_CHOPS)));

    public static final RegistryObject<Item> COOKED_DUCK = ITEMS.register("cooked_duck",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COOKED_DUCK)));

    public static final RegistryObject<Item> MARSH_LURKER_FLESH = ITEMS.register("marsh_lurker_flesh",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MARSH_LURKER_FLESH)));

    public static final RegistryObject<Item> COOKED_MARSH_LURKER_FLESH = ITEMS.register("cooked_marsh_lurker_flesh",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COOKED_MARSH_LURKER_FLESH)));

    public static final RegistryObject<Item> SILVER = ITEMS.register("silver",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SLIMY_PIECE_OF_SKIN = ITEMS.register("slimy_piece_of_skin",
            () -> new Item(new Item.Properties()));

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

    public static final RegistryObject<Item> MUDSTONE_SHARD_FRAGMENT = ITEMS.register("mudstone_shard_fragment",
            () -> new BowItem(new Item.Properties()));

    public static final RegistryObject<Item> MUDSTONE_SHARD = ITEMS.register("mudstone_shard",
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

    public static final RegistryObject<Item> SILVER_HELMET = ITEMS.register("silver_helmet",
            () -> new ArmorItem(ModArmorMaterials.SILVER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_CHESTPLATE = ITEMS.register("silver_chestplate",
            () -> new ArmorItem(ModArmorMaterials.SILVER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_LEGGINGS = ITEMS.register("silver_leggings",
            () -> new ArmorItem(ModArmorMaterials.SILVER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_BOOTS = ITEMS.register("silver_boots",
            () -> new ArmorItem(ModArmorMaterials.SILVER, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> SILVER_DIAMOND_HELMET = ITEMS.register("silver_diamond_helmet",
            () -> new ArmorItem(ModArmorMaterials.SILVER_DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_DIAMOND_CHESTPLATE = ITEMS.register("silver_diamond_chestplate",
            () -> new ArmorItem(ModArmorMaterials.SILVER_DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_DIAMOND_LEGGINGS = ITEMS.register("silver_diamond_leggings",
            () -> new ArmorItem(ModArmorMaterials.SILVER_DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> SILVER_DIAMOND_BOOTS = ITEMS.register("silver_diamond_boots",
            () -> new ArmorItem(ModArmorMaterials.SILVER_DIAMOND, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> SILVER_DIAMOND_SWORD = ITEMS.register("silver_diamond_sword",
            () -> new SwordItem(ModToolTiers.SILVER_DIAMOND_TOOL, 3, -2.4F, new Item.Properties().durability(2856)));
    public static final RegistryObject<Item> SILVER_DIAMOND_PICKAXE = ITEMS.register("silver_diamond_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SILVER_DIAMOND_TOOL, 1, -2.8F, new Item.Properties().durability(2856)));
    public static final RegistryObject<Item> SILVER_DIAMOND_SHOVEL = ITEMS.register("silver_diamond_shovel",
            () -> new ShovelItem(ModToolTiers.SILVER_DIAMOND_TOOL, 1.5F, -3.0F, new Item.Properties().durability(2856)));
    public static final RegistryObject<Item> SILVER_DIAMOND_AXE = ITEMS.register("silver_diamond_axe",
            () -> new AxeItem(ModToolTiers.SILVER_DIAMOND_TOOL, 5.0F, -3.0F, new Item.Properties().durability(2856)));
    public static final RegistryObject<Item> SILVER_DIAMOND_HOE = ITEMS.register("silver_diamond_hoe",
            () -> new HoeItem(ModToolTiers.SILVER_DIAMOND_TOOL, -4, 0.0F, new Item.Properties().durability(2856)));

    public static final RegistryObject<Item> SILVER_DIAMOND_PAXEL = ITEMS.register("silver_diamond_paxel",
            () -> new PaxelItem(ModToolTiers.SILVER_DIAMOND_TOOL, 2, 3, new Item.Properties().durability(2856)));


    public static final RegistryObject<Item> BOGGANIUM_SWORD = ITEMS.register("bogganium_sword",
            () -> new SwordItem(ModToolTiers.BOGGANIUM_TOOL, 3, -2.4F, new Item.Properties().durability(3256)));
    public static final RegistryObject<Item> BOGGANIUM_PICKAXE = ITEMS.register("bogganium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.BOGGANIUM_TOOL, 1, -2.8F, new Item.Properties().durability(3256)));
    public static final RegistryObject<Item> BOGGANIUM_SHOVEL = ITEMS.register("bogganium_shovel",
            () -> new ShovelItem(ModToolTiers.BOGGANIUM_TOOL, 1.5F, -3.0F, new Item.Properties().durability(3256)));
    public static final RegistryObject<Item> BOGGANIUM_AXE = ITEMS.register("bogganium_axe",
            () -> new AxeItem(ModToolTiers.BOGGANIUM_TOOL, 5.0F, -3.0F, new Item.Properties().durability(3256)));
    public static final RegistryObject<Item> BOGGANIUM_HOE = ITEMS.register("bogganium_hoe",
            () -> new HoeItem(ModToolTiers.BOGGANIUM_TOOL, -4, 0.0F, new Item.Properties().durability(3256)));

    public static final RegistryObject<Item> BOGGANIUM_PAXEL = ITEMS.register("bogganium_paxel",
            () -> new PaxelItem(ModToolTiers.BOGGANIUM_TOOL, 2, 3, new Item.Properties().durability(3256)));

    public static final RegistryObject<Item> DIAMOND_PAXEL = ITEMS.register("diamond_paxel",
            () -> new PaxelItem(Tiers.DIAMOND, 2, 3, new Item.Properties().durability(1256)));

    public static final RegistryObject<Item> MUDSTONE_SWORD = ITEMS.register("mudstone_sword",
            () -> new SwordItem(ModToolTiers.MUDSTONE_TOOL, 3, -2.4F, new Item.Properties().durability(2256)));
    public static final RegistryObject<Item> MUDSTONE_PICKAXE = ITEMS.register("mudstone_pickaxe",
            () -> new PickaxeItem(ModToolTiers.MUDSTONE_TOOL, 1, -2.8F, new Item.Properties().durability(2256)));
    public static final RegistryObject<Item> MUDSTONE_SHOVEL = ITEMS.register("mudstone_shovel",
            () -> new ShovelItem(ModToolTiers.MUDSTONE_TOOL, 1.5F, -3.0F, new Item.Properties().durability(2256)));
    public static final RegistryObject<Item> MUDSTONE_AXE = ITEMS.register("mudstone_axe",
            () -> new AxeItem(ModToolTiers.MUDSTONE_TOOL, 5.0F, -3.0F, new Item.Properties().durability(2256)));
    public static final RegistryObject<Item> MUDSTONE_HOE = ITEMS.register("mudstone_hoe",
            () -> new HoeItem(ModToolTiers.MUDSTONE_TOOL, -4, 0.0F, new Item.Properties().durability(2256)));

    public static final RegistryObject<Item> MUDSTONE_PAXEL = ITEMS.register("mudstone_paxel",
            () -> new PaxelItem(ModToolTiers.MUDSTONE_TOOL, 2, 3, new Item.Properties().durability(2256)));

    public static final RegistryObject<Item> SILVER_SWORD = ITEMS.register("silver_sword",
            () -> new SwordItem(ModToolTiers.SILVER_TOOL, 3, -2.4F, new Item.Properties().durability(2256)));
    public static final RegistryObject<Item> SILVER_PICKAXE = ITEMS.register("silver_pickaxe",
            () -> new PickaxeItem(ModToolTiers.SILVER_TOOL, 1, -2.8F, new Item.Properties().durability(2256)));
    public static final RegistryObject<Item> SILVER_SHOVEL = ITEMS.register("silver_shovel",
            () -> new ShovelItem(ModToolTiers.SILVER_TOOL, 1.5F, -3.0F, new Item.Properties().durability(2256)));
    public static final RegistryObject<Item> SILVER_AXE = ITEMS.register("silver_axe",
            () -> new AxeItem(ModToolTiers.SILVER_TOOL, 5.0F, -3.0F, new Item.Properties().durability(2256)));
    public static final RegistryObject<Item> SILVER_HOE = ITEMS.register("silver_hoe",
            () -> new HoeItem(ModToolTiers.SILVER_TOOL, -4, 0.0F, new Item.Properties().durability(2256)));

    public static final RegistryObject<Item> SILVER_PAXEL = ITEMS.register("silver_paxel",
            () -> new PaxelItem(ModToolTiers.SILVER_TOOL, 2, 3, new Item.Properties().durability(2256)));

    public static final RegistryObject<Item> BOGGANIUM_WATER_BUCKET = ITEMS.register("bogganium_water_bucket",
            () -> new ModBucketItem(ModFluids.SOURCE_BOGGANIUM_WATER.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
