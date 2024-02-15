package net.zuperz.the_bog.pois;

import com.google.common.collect.ImmutableSet;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zuperz.the_bog.The_Bog;
import net.zuperz.the_bog.block.ModBlocks;

public class ModPOIs {

    public static final DeferredRegister<PoiType> POI = DeferredRegister.create(ForgeRegistries.POI_TYPES, The_Bog.MOD_ID);

    public static final RegistryObject<PoiType> THE_BOG_PORTAL = POI.register("the_bog_portal", () -> new
            PoiType(ImmutableSet.copyOf(ModBlocks.THE_BOG_PORTAL.get().getStateDefinition().getPossibleStates()), 0, 1));

    public static void register(IEventBus eventBus) {
        POI.register(eventBus);
    }
}
