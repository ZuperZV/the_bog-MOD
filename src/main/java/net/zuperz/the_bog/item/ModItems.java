package net.zuperz.the_bog.item;

import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zuperz.the_bog.The_Bog;
import net.zuperz.the_bog.item.costom.boggy_keystone;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, The_Bog.MOD_ID);

    public static final RegistryObject<Item> BOGGY_KEYSTONE = ITEMS.register("boggy_keystone",
            boggy_keystone::new);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
