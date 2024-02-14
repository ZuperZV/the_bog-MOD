
package net.zuperz.the_bog.datagen;

import net.zuperz.the_bog.The_Bog;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        /*ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GILDED_GOLD.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.GILDED_GOLD_NUGGET.get())
                .unlockedBy("has_gilded_gold_nugget", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.GILDED_GOLD_NUGGET.get()).build()))
                .save(pWriter);

            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GILDED_NETHERITE_INGOT.get())
                    .pattern("AAA")
                    .pattern("ABC")
                    .pattern("BC ")
                    .define('A', ModItems.GILDED_GOLD.get())
                    .define('B', Items.NETHERITE_INGOT)
                    .define('C', Items.GOLD_INGOT)
                    .unlockedBy("has_gilded_netherite_ingot", inventoryTrigger(ItemPredicate.Builder.item().
                            of(ModItems.GILDED_GOLD_NUGGET.get()).build()))
                    .save(pWriter, new ResourceLocation(Tool_Forge.MOD_ID, "gilded_diamond_ingot"));

        oreSmelting(pWriter, COBEL_SOUL_STONE, RecipeCategory.MISC, ModItems.SOUL_STONE_INGOT.get(), 0.50f, 250, "SOUL_STONE");

        nineBlockStorageRecipes(pWriter, RecipeCategory.MISC, ModItems.LILLIUM.get(), RecipeCategory.MISC, ModBlocks.LILLIUM_BLOCK.get());

        oreBlasting(pWriter, GILDED_ORES, RecipeCategory.MISC, ModItems.GILDED_GOLD_NUGGET.get(), 0.50f, 100, "GILDED_GOLD_NUGGET");

        stonecutting(Ingredient.of(Blocks.GILDED_BLACKSTONE)
                ,RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_GILDED_GOLD.get())
                .unlockedBy(getHasName(Blocks.GILDED_BLACKSTONE), has(Blocks.GILDED_BLACKSTONE))
                .save(pWriter, new ResourceLocation(Tool_Forge.MOD_ID, "raw_gilded_gold_from_stone_cutting"));

        SmithingTransformRecipeBuilder.smithing(Ingredient.of(ModItems.ENDIUM_UPGRADE_SMITHING_TEMPLATE.get()), Ingredient.of(Items.NETHERITE_BOOTS),
                        Ingredient.of(ModItems.ENDIUM_INGOT.get()), RecipeCategory.COMBAT, ModItems.ENDIUM_BOOTS.get()).
                unlocks("has_netherite_ingot", has(Items.NETHERITE_INGOT)).save(pWriter, new ResourceLocation(Tool_Forge.MOD_ID, "endium_boots"));
    }
    public static SingleItemRecipeBuilder stonecutting(Ingredient pIngredient, RecipeCategory pCategory, ItemLike pResult) {
        return new SingleItemRecipeBuilder(pCategory, RecipeSerializer.STONECUTTER, pIngredient, pResult, 1);
         */
    }

}