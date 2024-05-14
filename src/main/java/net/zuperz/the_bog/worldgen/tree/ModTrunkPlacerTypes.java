package net.zuperz.the_bog.worldgen.tree;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.zuperz.the_bog.The_Bog;
import net.zuperz.the_bog.worldgen.tree.custom.WeepingWillowPlacer;

public class ModTrunkPlacerTypes {
    public static final DeferredRegister<TrunkPlacerType<?>> TRUNK_PLACERS =
            DeferredRegister.create(Registries.TRUNK_PLACER_TYPE, The_Bog.MOD_ID);

    public static final RegistryObject<TrunkPlacerType<WeepingWillowPlacer>> WEEPINGWILLOW_TRUNK_PLACER =
            TRUNK_PLACERS.register("weepingwillow_trunk_placer", () -> new TrunkPlacerType<>(WeepingWillowPlacer.CODEC));

    public static void register(IEventBus eventBus) {
        TRUNK_PLACERS.register(eventBus);
    }
}