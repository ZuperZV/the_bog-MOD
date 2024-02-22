
package net.zuperz.the_bog.datagen;

import net.minecraft.world.item.crafting.Recipe;
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
                .save(pWriter, new ResourceLocation(Tool_Forge.MOD_ID, "gilded_diamond_ingot"));
         */


    }

}