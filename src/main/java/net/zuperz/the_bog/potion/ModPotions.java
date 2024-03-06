package net.zuperz.the_bog.potion;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zuperz.the_bog.The_Bog;
import net.zuperz.the_bog.effect.ModEffects;

public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS =
            DeferredRegister.create(ForgeRegistries.POTIONS, The_Bog.MOD_ID);

    public static final RegistryObject<Potion> STONE_WALL_POTION = POTIONS.register("stone_wall_potion",
            () -> new Potion(new MobEffectInstance(ModEffects.STONE_WALL_EFFECT.get(), 200, 0)));

    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }
}