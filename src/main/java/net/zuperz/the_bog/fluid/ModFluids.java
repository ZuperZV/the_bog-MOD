package net.zuperz.the_bog.fluid;

import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zuperz.the_bog.The_Bog;
import net.zuperz.the_bog.block.ModBlocks;
import net.zuperz.the_bog.item.ModItems;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, The_Bog.MOD_ID);

    public static final RegistryObject<FlowingFluid> SOURCE_BOGGANIUM_WATER = FLUIDS.register("bogganium_water_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.BOGGANIUM_WATER_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_BOGGANIUM_WATER = FLUIDS.register("flowing_bogganium_water_fluid",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.BOGGANIUM_WATER_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties BOGGANIUM_WATER_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.BOGGANIUM_WATER_FLUID_TYPE, SOURCE_BOGGANIUM_WATER, FLOWING_BOGGANIUM_WATER)
            .slopeFindDistance(4).levelDecreasePerBlock(3).block(ModBlocks.BOGGANIUM_WATER_BLOCK)
            .bucket(ModItems.BOGGANIUM_WATER_BUCKET);

    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}