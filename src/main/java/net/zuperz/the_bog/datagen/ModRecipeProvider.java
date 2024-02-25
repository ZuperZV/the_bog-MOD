
package net.zuperz.the_bog.datagen;

import net.minecraft.world.item.crafting.*;
import net.minecraftforge.common.Tags;
import net.zuperz.the_bog.The_Bog;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.zuperz.the_bog.block.ModBlocks;
import net.zuperz.the_bog.item.ModItems;
import net.zuperz.the_bog.util.ModTags;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    private static final List<ItemLike> WEEPING_WILLOW_LOGS = List.of(ModBlocks.WEEPING_WILLOW_LOG.get(),
            ModBlocks.WEEPING_WILLOW_WOOD.get());

    private static final List<ItemLike> STRIPPED_WEEPING_WILLOW_LOGS = List.of(ModBlocks.STRIPPED_WEEPING_WILLOW_LOG.get(),
            ModBlocks.STRIPPED_WEEPING_WILLOW_WOOD.get());

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {


        SimpleCookingRecipeBuilder.smelting (Ingredient.of(ModItems.RAW_DUCK.get()), RecipeCategory.MISC , ModItems.COOKED_DUCK.get(), 0.15f , 100)
                .unlockedBy("has_raw_duck",inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RAW_DUCK.get()).build()))
                .save(pWriter, new ResourceLocation(The_Bog.MOD_ID, "raw_duck"));

        SimpleCookingRecipeBuilder.smoking (Ingredient.of(ModItems.RAW_DUCK.get()), RecipeCategory.MISC , ModItems.COOKED_DUCK.get(), 0.15f , 100)
                .unlockedBy("has_raw_duck",inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RAW_DUCK.get()).build()))
                .save(pWriter, new ResourceLocation(The_Bog.MOD_ID, "raw_duck_smoking"));

        woodFromLogs(pWriter, ModBlocks.WEEPING_WILLOW_WOOD.get(), ModBlocks.WEEPING_WILLOW_LOG.get());
        woodFromLogs(pWriter, ModBlocks.STRIPPED_WEEPING_WILLOW_WOOD.get(), ModBlocks.STRIPPED_WEEPING_WILLOW_LOG.get());

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WEEPING_WILLOW_SLAB.get(), Ingredient.of(ModBlocks.WEEPING_WILLOW_PLANKS.get()))
                .group("wooden_slab")
                .unlockedBy(getHasName(ModBlocks.WEEPING_WILLOW_PLANKS.get()), has(ModBlocks.WEEPING_WILLOW_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.WEEPING_WILLOW_SIGN.get(), 3)
                .group("wooden_sign")
                .pattern("AAA")
                .pattern("AAA")
                .pattern(" B ")
                .define('A', ModBlocks.WEEPING_WILLOW_PLANKS.get().asItem())
                .define('B', Tags.Items.RODS_WOODEN)
                .unlockedBy(getHasName(ModBlocks.WEEPING_WILLOW_PLANKS.get()), has(ModBlocks.WEEPING_WILLOW_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.WEEPING_WILLOW_HANGING_SIGN.get(), 6)
                .group("hanging_sign")
                .pattern("B B")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.STRIPPED_WEEPING_WILLOW_LOG.get())
                .define('B', Items.CHAIN)
                .unlockedBy("has_stripped_logs", has(ModBlocks.STRIPPED_WEEPING_WILLOW_LOG.get()))
                .save(pWriter);

        stairBuilder(ModBlocks.WEEPING_WILLOW_STAIRS.get(), Ingredient.of(ModBlocks.WEEPING_WILLOW_PLANKS.get()))
                .unlockedBy("has_weeping_willow_planks", has(ModBlocks.WEEPING_WILLOW_PRESSURE_PLATE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WEEPING_WILLOW_PRESSURE_PLATE.get())
                .pattern("AA")
                .define('A', ModBlocks.WEEPING_WILLOW_PLANKS.get())
                .unlockedBy("has_weeping_willow_planks", has(ModBlocks.WEEPING_WILLOW_PLANKS.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.WEEPING_WILLOW_BUTTON.get())
                .requires(ModBlocks.WEEPING_WILLOW_PLANKS.get())
                .unlockedBy("has_weeping_willow_planks", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEEPING_WILLOW_PLANKS.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WEEPING_WILLOW_FENCE.get(), 3)
                .pattern("ABA")
                .pattern("ABA")
                .define('A', ModBlocks.WEEPING_WILLOW_PLANKS.get())
                .define('B', Tags.Items.RODS_WOODEN)
                .unlockedBy("has_weeping_willow_planks", has(ModBlocks.WEEPING_WILLOW_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WEEPING_WILLOW_FENCE_GATE.get())
                .pattern("BAB")
                .pattern("BAB")
                .define('A', ModBlocks.WEEPING_WILLOW_PLANKS.get())
                .define('B', Tags.Items.RODS_WOODEN)
                .unlockedBy("has_weeping_willow_planks", has(ModBlocks.WEEPING_WILLOW_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WEEPING_WILLOW_TRAPDOOR.get(), 2)
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModBlocks.WEEPING_WILLOW_PLANKS.get())
                .unlockedBy("has_weeping_willow_planks", has(ModBlocks.WEEPING_WILLOW_PLANKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WEEPING_WILLOW_DOOR.get(), 3)
                .pattern("AA")
                .pattern("AA")
                .pattern("AA")
                .define('A', ModBlocks.WEEPING_WILLOW_PLANKS.get())
                .unlockedBy("has_weeping_willow_planks", has(ModBlocks.WEEPING_WILLOW_PLANKS.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.WEEPING_WILLOW_PLANKS.get(), 4)
                .requires(ModBlocks.WEEPING_WILLOW_LOG.get())
                .unlockedBy("has_weeping_willow_planks", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEEPING_WILLOW_LOG.get()).build()))
                .save(pWriter, new ResourceLocation(The_Bog.MOD_ID, "weeping_willow_planks_from_log"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.WEEPING_WILLOW_PLANKS.get(), 4)
                .requires(ModBlocks.WEEPING_WILLOW_WOOD.get())
                .unlockedBy("has_weeping_willow_planks", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.WEEPING_WILLOW_WOOD.get()).build()))
                .save(pWriter, new ResourceLocation(The_Bog.MOD_ID, "weeping_willow_planks_from_wood"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.WEEPING_WILLOW_PLANKS.get(), 3)
                .requires(ModBlocks.STRIPPED_WEEPING_WILLOW_LOG.get())
                .unlockedBy("has_weeping_willow_planks", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.STRIPPED_WEEPING_WILLOW_LOG.get()).build()))
                .save(pWriter, new ResourceLocation(The_Bog.MOD_ID, "stripped_weeping_willow_planks_from_log"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.WEEPING_WILLOW_PLANKS.get(), 3)
                .requires(ModBlocks.STRIPPED_WEEPING_WILLOW_WOOD.get())
                .unlockedBy("has_weeping_willow_planks", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModBlocks.STRIPPED_WEEPING_WILLOW_WOOD.get()).build()))
                .save(pWriter, new ResourceLocation(The_Bog.MOD_ID, "stripped_weeping_willow_planks_from_wood"));

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.WEEPING_WILLOW_BOAT.get())
                .pattern("A A")
                .pattern("AAA")
                .define('A', ModBlocks.WEEPING_WILLOW_PLANKS.get())
                .unlockedBy("has_weeping_willow_planks", has(ModBlocks.WEEPING_WILLOW_PLANKS.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.WEEPING_WILLOW_CHEST_BOAT.get())
                .requires(ModItems.WEEPING_WILLOW_BOAT.get())
                .requires(Blocks.CHEST)
                .unlockedBy("has_weeping_willow_boat", inventoryTrigger(ItemPredicate.Builder.item().
                        of(ModItems.WEEPING_WILLOW_BOAT.get()).build()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.BOGWALKER_HELMET.get())
                .pattern("AAA")
                .pattern("A A")
                .define('A', ModItems.BOGSKIN.get())
                .unlockedBy("has_bogskin", has(ModItems.BOGSKIN.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.BOGWALKER_CHESTPLATE.get())
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.BOGSKIN.get())
                .unlockedBy("has_bogskin", has(ModItems.BOGSKIN.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.BOGWALKER_LEGGINGS.get())
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .define('A', ModItems.BOGSKIN.get())
                .unlockedBy("has_bogskin", has(ModItems.BOGSKIN.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.BOGWALKER_BOOTS.get())
                .pattern("A A")
                .pattern("A A")
                .define('A', ModItems.BOGSKIN.get())
                .unlockedBy("has_bogskin", has(ModItems.BOGSKIN.get()))
                .save(pWriter);

        //SmithingTransformRecipeBuilder.smithing(template, item to upgrade, upgradeitem, category, result)
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(ModItems.BOGGANIUM_UPGRADE_SMITHING_TEMPLATE.get()), Ingredient.of(Items.DIAMOND_HELMET),
                        Ingredient.of(ModItems.BOGGANIUM_INGOT.get()), RecipeCategory.COMBAT, ModItems.BOGGANIUM_HELMET.get()).
                unlocks("has_netherite_ingot", has(ModItems.BOGGANIUM_INGOT.get())).save(pWriter, new ResourceLocation(The_Bog.MOD_ID, "boggaium_helmet"));

        SmithingTransformRecipeBuilder.smithing(Ingredient.of(ModItems.BOGGANIUM_UPGRADE_SMITHING_TEMPLATE.get()), Ingredient.of(Items.DIAMOND_CHESTPLATE),
                        Ingredient.of(ModItems.BOGGANIUM_INGOT.get()), RecipeCategory.COMBAT, ModItems.BOGGANIUM_CHESTPLATE.get()).
                unlocks("has_netherite_ingot", has(ModItems.BOGGANIUM_INGOT.get())).save(pWriter, new ResourceLocation(The_Bog.MOD_ID, "boggaium_chestplate"));

        SmithingTransformRecipeBuilder.smithing(Ingredient.of(ModItems.BOGGANIUM_UPGRADE_SMITHING_TEMPLATE.get()), Ingredient.of(Items.DIAMOND_LEGGINGS),
                        Ingredient.of(ModItems.BOGGANIUM_INGOT.get()), RecipeCategory.COMBAT, ModItems.BOGGANIUM_LEGGINGS.get()).
                unlocks("has_netherite_ingot", has(ModItems.BOGGANIUM_INGOT.get())).save(pWriter, new ResourceLocation(The_Bog.MOD_ID, "boggaium_leggings"));

        SmithingTransformRecipeBuilder.smithing(Ingredient.of(ModItems.BOGGANIUM_UPGRADE_SMITHING_TEMPLATE.get()), Ingredient.of(Items.DIAMOND_BOOTS),
                        Ingredient.of(ModItems.BOGGANIUM_INGOT.get()), RecipeCategory.COMBAT, ModItems.BOGGANIUM_BOOTS.get()).
                unlocks("has_netherite_ingot", has(ModItems.BOGGANIUM_INGOT.get())).save(pWriter, new ResourceLocation(The_Bog.MOD_ID, "boggaium_boots"));


        SmithingTransformRecipeBuilder.smithing(Ingredient.of(Blocks.AIR), Ingredient.of(ModItems.BOGBLOSSOM_BOW.get()),
                        Ingredient.of(Items.DIAMOND), RecipeCategory.COMBAT, ModItems.DIAMOND_BOGBLOSSOM_BOW.get()).
                unlocks("has_bogblossom", has(ModItems.BOGBLOSSOM_BOW.get())).save(pWriter, new ResourceLocation(The_Bog.MOD_ID, "diamond_bogblossom_bow"));
        }

    }
