package net.zuperz.the_bog.item;

import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zuperz.the_bog.The_Bog;
import net.zuperz.the_bog.entity.ModEntities;
import net.zuperz.the_bog.item.costom.DuckEggItem;
import net.zuperz.the_bog.item.costom.ThrownDuckEgg;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, The_Bog.MOD_ID);


    public static final RegistryObject<Item> DUCK_SPAWN_EGG = ITEMS.register("duck_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.DUCK, 0x544124, 0xecd8ba,
                    new Item.Properties()));

    public static final RegistryObject<Item> DUCK_EGG = ITEMS.register("duck_egg",
            () -> new DuckEggItem((new Item.Properties()).stacksTo(16)));

    public static final RegistryObject<Item> DUCK_FEATHER = ITEMS.register("duck_feather",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
