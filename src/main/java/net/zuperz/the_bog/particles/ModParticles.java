package net.zuperz.the_bog.particles;

import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zuperz.the_bog.The_Bog;

public class ModParticles {
    public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES =
            DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, The_Bog.MOD_ID);

    public static final RegistryObject<SimpleParticleType> WETSLIME_PARTICLES =
            PARTICLE_TYPES.register("wetslime_particles", () -> new SimpleParticleType(true));

    public static final RegistryObject<SimpleParticleType> BOG_PORTAL_PARTICLES =
            PARTICLE_TYPES.register("bog_portal_particles", () -> new SimpleParticleType(true));

    public static void register(IEventBus eventBus) {
        PARTICLE_TYPES.register(eventBus);
    }
}