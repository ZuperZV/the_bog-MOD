package net.zuperz.the_bog.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zuperz.the_bog.The_Bog;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, The_Bog.MOD_ID);

    public static final RegistryObject<MobEffect> STONE_WALL_EFFECT = MOB_EFFECTS.register("stone_wall_effect",
            () -> new StoneWallEffect(MobEffectCategory.NEUTRAL, 0x423a3a)
                    .addAttributeModifier(Attributes.MOVEMENT_SPEED,
                    "7107DE5E-7CE8-4030-940E-514C1F160890", -1.0f, AttributeModifier.Operation.MULTIPLY_TOTAL));
                    //.addAttributeModifier(Attributes.KNOCKBACK_RESISTANCE,
                    //"89383ae8-2a9f-4bd2-a38e-66ecd792d7bb", -0.8f, AttributeModifier.Operation.MULTIPLY_TOTAL)
                    //.addAttributeModifier(Attributes.JUMP_STRENGTH,
                    //"0cd23ca3-0a9f-47a1-b44c-742ff14d9901", 3.0f, AttributeModifier.Operation.MULTIPLY_TOTAL));

    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}
