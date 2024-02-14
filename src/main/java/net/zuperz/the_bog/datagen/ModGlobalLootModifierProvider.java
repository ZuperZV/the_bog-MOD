package net.zuperz.the_bog.datagen;

import net.zuperz.the_bog.The_Bog;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

public class ModGlobalLootModifierProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifierProvider(PackOutput output) {
        super(output, The_Bog.MOD_ID);
    }

    @Override
    protected void start() {
        //add("soul_stone_sword_from_jungle_temple", new AddItemModifier(new LootItemCondition[] {
        //        new LootTableIdCondition.Builder(new ResourceLocation("chests/jungle_temple")).build(),
        //        LootItemRandomChanceCondition.randomChance(0.40f).build() }, ModItems.SOUL_STONE_SWORD.get()));

    }
}