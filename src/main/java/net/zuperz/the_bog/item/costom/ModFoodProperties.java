package net.zuperz.the_bog.item.costom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.zuperz.the_bog.effect.ModEffects;

public class ModFoodProperties {
    public static final FoodProperties RAW_DUCK = new FoodProperties.Builder().nutrition(2).saturationMod(0.35f)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.3F).build();
    public static final FoodProperties COOKED_DUCK = new FoodProperties.Builder().nutrition(6).saturationMod(0.6f).meat().build();

    public static final FoodProperties BOGGY_CHOPS = new FoodProperties.Builder().nutrition(10).saturationMod(0.9f).meat().build();
    public static final FoodProperties COOKED_BOGGY_CHOPS = new FoodProperties.Builder().nutrition(12).saturationMod(1.2f)
            .effect(() -> new MobEffectInstance(ModEffects.STONE_WALL_EFFECT.get(), 100, 0), 0.7F).build();

    public static final FoodProperties MARSH_LURKER_FLESH = new FoodProperties.Builder().nutrition(10).saturationMod(0.9f).meat()
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.7F).build();
    public static final FoodProperties COOKED_MARSH_LURKER_FLESH = new FoodProperties.Builder().nutrition(12).saturationMod(1.2f)
            .effect(() -> new MobEffectInstance(MobEffects.GLOWING, 40, 0), 0.2F).build();
}