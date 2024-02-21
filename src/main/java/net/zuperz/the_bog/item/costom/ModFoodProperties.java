package net.zuperz.the_bog.item.costom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties RAW_DUCK = new FoodProperties.Builder().nutrition(2).saturationMod(0.35f)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.3F).build();

}
