package net.zuperz.the_bog.datagen;

import net.zuperz.the_bog.The_Bog;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;
import net.zuperz.the_bog.item.ModItems;
import net.zuperz.the_bog.loot.AddItemModifier;

public class ModGlobalLootModifierProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifierProvider(PackOutput output) {
        super(output, The_Bog.MOD_ID);
    }

    @Override
    protected void start() {
        //add("mudstone_shard_from_simple_dungeon", new AddItemModifier(new LootItemCondition[] {
        //        new LootTableIdCondition.Builder(new ResourceLocation("chests/simple_dungeon")).build(),
        //        LootItemRandomChanceCondition.randomChance(0.45f).build() }, ModItems.MUDSTONE_SHARD.get()));
    }
}