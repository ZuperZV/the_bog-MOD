package net.zuperz.the_bog.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zuperz.the_bog.The_Bog;
import net.zuperz.the_bog.entity.custom.*;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, The_Bog.MOD_ID);

    public static final RegistryObject<EntityType<DuckEntity>> DUCK =
            ENTITY_TYPES.register("duck", () -> EntityType.Builder.of(DuckEntity::new, MobCategory.CREATURE)
                    .sized(0.6f, 1.4f).build("duck"));

    public static final RegistryObject<EntityType<BogEntity>> BOGE =
            ENTITY_TYPES.register("boge", () -> EntityType.Builder.of(BogEntity::new, MobCategory.MONSTER)
                    .sized(0.6F, 1.95F).build("boge"));

    public static final RegistryObject<EntityType<MarshLurkerEntity>> MARSH_LURKER =
            ENTITY_TYPES.register("marsh_lurker", () -> EntityType.Builder.of(MarshLurkerEntity::new, MobCategory.MONSTER)
                    .sized(1.0f, 0.8f).build("marsh_lurker"));

    public static final RegistryObject<EntityType<SumpgetEntity>> SUMPGET =
            ENTITY_TYPES.register("sumpget", () -> EntityType.Builder.of(SumpgetEntity::new, MobCategory.CREATURE)
                    .sized(0.9F, 1.3F).build("sumpget"));

    public static final RegistryObject<EntityType<WetSlimeEntity>> WET_SLIME =
            ENTITY_TYPES.register("wet_slime", () -> EntityType.Builder.of(WetSlimeEntity::new, MobCategory.MONSTER)
                    .sized(1.9F, 1.9F).build("wet_slime"));

    public static final RegistryObject<EntityType<DarkskeletonEntity>> DARK_SKELETON =
            ENTITY_TYPES.register("dark_skeleton", () -> EntityType.Builder.of(DarkskeletonEntity::new, MobCategory.MONSTER)
                    .sized(0.6F, 1.99F).build("dark_skeleton"));



    public static final RegistryObject<EntityType<ModBoatEntity>> MOD_BOAT =
            ENTITY_TYPES.register("mod_boat", () -> EntityType.Builder.<ModBoatEntity>of(ModBoatEntity::new, MobCategory.MISC)
                    .sized(1.375f, 0.5625f).build("mod_boat"));

    public static final RegistryObject<EntityType<ModChestBoatEntity>> MOD_CHEST_BOAT =
            ENTITY_TYPES.register("mod_chest_boat", () -> EntityType.Builder.<ModChestBoatEntity>of(ModChestBoatEntity::new, MobCategory.MISC)
                    .sized(1.375f, 0.5625f).build("mod_chest_boat"));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
