
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

    private static final List<ItemLike> SILVER_SMELTABLES = List.of(ModItems.RAW_SILVER.get(),
            ModBlocks.SILVER_ORE.get(), ModBlocks.DEEPSLATE_SILVER_ORE.get());


    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        nineBlockStorageRecipes(pWriter, RecipeCategory.MISC, ModItems.RAW_SILVER.get(), RecipeCategory.MISC, ModBlocks.RAW_SILVER_BLOCK.get(),
                "the_bog:raw_silver", "silver","the_bog:raw_silver_block", "silver");

        nineBlockStorageRecipes(pWriter, RecipeCategory.MISC, ModItems.SILVER.get(), RecipeCategory.MISC, ModBlocks.SILVER_BLOCK.get(),
                "the_bog:silver", "silver","the_bog:silver_block", "silver");

        oreSmelting(pWriter, SILVER_SMELTABLES, RecipeCategory.MISC, ModItems.SILVER.get(), 0.25f, 200, "silver");
        oreBlasting(pWriter, SILVER_SMELTABLES, RecipeCategory.MISC, ModItems.SILVER.get(), 0.25f, 100, "silver");


        SimpleCookingRecipeBuilder.smelting (Ingredient.of(ModItems.RAW_DUCK.get()), RecipeCategory.MISC , ModItems.COOKED_DUCK.get(), 0.15f , 100)
                .unlockedBy("has_raw_duck",inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RAW_DUCK.get()).build()))
                .save(pWriter, new ResourceLocation(The_Bog.MOD_ID, "raw_duck"));

        SimpleCookingRecipeBuilder.smoking (Ingredient.of(ModItems.RAW_DUCK.get()), RecipeCategory.MISC , ModItems.COOKED_DUCK.get(), 0.15f , 200)
                .unlockedBy("has_raw_duck",inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RAW_DUCK.get()).build()))
                .save(pWriter, new ResourceLocation(The_Bog.MOD_ID, "raw_duck_smoking"));

        SimpleCookingRecipeBuilder.smelting (Ingredient.of(ModItems.BOGGY_CHOPS.get()), RecipeCategory.MISC , ModItems.COOKED_BOGGY_CHOPS.get(), 0.15f , 100)
                .unlockedBy("has_boggy_chops",inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.BOGGY_CHOPS.get()).build()))
                .save(pWriter, new ResourceLocation(The_Bog.MOD_ID, "boggy_chops"));

        SimpleCookingRecipeBuilder.smoking (Ingredient.of(ModItems.BOGGY_CHOPS.get()), RecipeCategory.MISC , ModItems.COOKED_BOGGY_CHOPS.get(), 0.15f , 200)
                .unlockedBy("has_boggy_chops",inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.BOGGY_CHOPS.get()).build()))
                .save(pWriter, new ResourceLocation(The_Bog.MOD_ID, "boggy_chops_smoking"));

        SimpleCookingRecipeBuilder.smelting (Ingredient.of(ModItems.MARSH_LURKER_FLESH.get()), RecipeCategory.MISC , ModItems.COOKED_MARSH_LURKER_FLESH.get(), 0.15f , 100)
                .unlockedBy("has_marsh_lurker_flesh",inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.MARSH_LURKER_FLESH.get()).build()))
                .save(pWriter, new ResourceLocation(The_Bog.MOD_ID, "marsh_lurker_flesh"));

        SimpleCookingRecipeBuilder.smoking (Ingredient.of(ModItems.MARSH_LURKER_FLESH.get()), RecipeCategory.MISC , ModItems.COOKED_MARSH_LURKER_FLESH.get(), 0.15f , 200)
                .unlockedBy("has_marsh_lurker_flesh",inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.MARSH_LURKER_FLESH.get()).build()))
                .save(pWriter, new ResourceLocation(The_Bog.MOD_ID, "marsh_lurker_flesh_smoking"));

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
                .define('A', ModTags.Items.BOG_LEATHER)
                .unlockedBy("has_bogleather", has(ModTags.Items.BOG_LEATHER))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.BOGWALKER_CHESTPLATE.get())
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModTags.Items.BOG_LEATHER)
                .unlockedBy("has_bogleather", has(ModTags.Items.BOG_LEATHER))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.BOGWALKER_LEGGINGS.get())
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .define('A', ModTags.Items.BOG_LEATHER)
                .unlockedBy("has_bogleather", has(ModTags.Items.BOG_LEATHER))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.BOGWALKER_BOOTS.get())
                .pattern("A A")
                .pattern("A A")
                .define('A', ModTags.Items.BOG_LEATHER)
                .unlockedBy("has_bogleather", has(ModTags.Items.BOG_LEATHER))
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

        nineBlockStorageRecipesWithCustomPacking(pWriter, RecipeCategory.MISC, ModItems.MUDSTONE_SHARD_FRAGMENT.get(), RecipeCategory.MISC, ModItems.MUDSTONE_SHARD.get(),  "mudstone_shard_from_mudstone_shard_fragment", "mudstone");
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MUD_STONE.get())
                .pattern("AA")
                .pattern("AA")
                .define('A', ModItems.MUDSTONE_SHARD.get())
                .unlockedBy("has_mudstone_shard", has(ModItems.MUDSTONE_SHARD.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.BOGGANIUM_INGOT.get(), 2)
                .pattern("ABA")
                .pattern("BAB")
                .pattern("ABA")
                .define('A', ModItems.SILVER.get())
                .define('B', ModItems.BOGGANIUM_WATER_BUCKET.get())
                .unlockedBy("has_bogganium_bucket", has(ModItems.BOGGANIUM_WATER_BUCKET.get()))
                .save(pWriter, new ResourceLocation(The_Bog.MOD_ID, "bogganium_ingot"));

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.BOGGANIUM_INGOT.get(), 2)
                .pattern("BAB")
                .pattern("AAA")
                .pattern("BAB")
                .define('A', ModItems.SILVER.get())
                .define('B', ModItems.BOGGANIUM_WATER_BUCKET.get())
                .unlockedBy("has_bogganium_bucket", has(ModItems.BOGGANIUM_WATER_BUCKET.get()))
                .save(pWriter, new ResourceLocation(The_Bog.MOD_ID, "bogganium_ingot_2"));


        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.SILVER_HELMET.get())
                .pattern("AAA")
                .pattern("A A")
                .define('A', ModItems.SILVER.get())
                .unlockedBy("has_silver", has(ModItems.SILVER.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.SILVER_CHESTPLATE.get())
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.SILVER.get())
                .unlockedBy("has_silver", has(ModItems.SILVER.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.SILVER_LEGGINGS.get())
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .define('A', ModItems.SILVER.get())
                .unlockedBy("has_silver", has(ModItems.SILVER.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.SILVER_BOOTS.get())
                .pattern("A A")
                .pattern("A A")
                .define('A', ModItems.SILVER.get())
                .unlockedBy("has_silver", has(ModItems.SILVER.get()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.SILVER_DIAMOND_HELMET.get())
                .pattern("AAA")
                .pattern("B B")
                .define('A', ModItems.SILVER.get())
                .define('B', Items.DIAMOND)
                .unlockedBy("has_silver_diamond", has(ModTags.Items.SILVER_DIAMOND))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.SILVER_DIAMOND_CHESTPLATE.get())
                .pattern("A A")
                .pattern("BAB")
                .pattern("BAB")
                .define('A', ModItems.SILVER.get())
                .define('B', Items.DIAMOND)
                .unlockedBy("has_silver_diamond", has(ModTags.Items.SILVER_DIAMOND))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.SILVER_DIAMOND_LEGGINGS.get())
                .pattern("AAA")
                .pattern("A A")
                .pattern("B B")
                .define('A', ModItems.SILVER.get())
                .define('B', Items.DIAMOND)
                .unlockedBy("has_silver_diamond", has(ModTags.Items.SILVER_DIAMOND))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.SILVER_DIAMOND_BOOTS.get())
                .pattern("A A")
                .pattern("B B")
                .define('A', ModItems.SILVER.get())
                .define('B', Items.DIAMOND)
                .unlockedBy("has_silver_diamond", has(ModTags.Items.SILVER_DIAMOND))
                .save(pWriter);


        /* Tools */

        /* Silver */
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.SILVER_SWORD.get())
                .pattern("B")
                .pattern("B")
                .pattern("A")
                .define('A', Items.STICK)
                .define('B', ModItems.SILVER.get())
                .unlockedBy("has_silver", has(ModItems.SILVER.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.SILVER_PICKAXE.get())
                .pattern("BBB")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', Items.STICK)
                .define('B', ModItems.SILVER.get())
                .unlockedBy("has_silver", has(ModItems.SILVER.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.SILVER_AXE.get())
                .pattern("BB")
                .pattern("BA")
                .pattern(" A")
                .define('A', Items.STICK)
                .define('B', ModItems.SILVER.get())
                .unlockedBy("has_silver", has(ModItems.SILVER.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.SILVER_HOE.get())
                .pattern("BB")
                .pattern(" A")
                .pattern(" A")
                .define('A', Items.STICK)
                .define('B', ModItems.SILVER.get())
                .unlockedBy("has_silver", has(ModItems.SILVER.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.SILVER_PAXEL.get())
                .pattern("BBB")
                .pattern("BA ")
                .pattern(" A ")
                .define('A', Items.STICK)
                .define('B', ModItems.SILVER.get())
                .unlockedBy("has_silver", has(ModItems.SILVER.get()))
                .save(pWriter);

        /* MudStone */
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.MUDSTONE_SWORD.get())
                .pattern("B")
                .pattern("B")
                .pattern("A")
                .define('A', Items.STICK)
                .define('B', ModItems.MUDSTONE_SHARD.get())
                .unlockedBy("has_silver", has(ModItems.MUDSTONE_SHARD.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.MUDSTONE_PICKAXE.get())
                .pattern("BBB")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', Items.STICK)
                .define('B', ModItems.MUDSTONE_SHARD.get())
                .unlockedBy("has_silver", has(ModItems.MUDSTONE_SHARD.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.MUDSTONE_AXE.get())
                .pattern("BB")
                .pattern("BA")
                .pattern(" A")
                .define('A', Items.STICK)
                .define('B', ModItems.MUDSTONE_SHARD.get())
                .unlockedBy("has_silver", has(ModItems.MUDSTONE_SHARD.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.MUDSTONE_HOE.get())
                .pattern("BB")
                .pattern(" A")
                .pattern(" A")
                .define('A', Items.STICK)
                .define('B', ModItems.MUDSTONE_SHARD.get())
                .unlockedBy("has_silver", has(ModItems.MUDSTONE_SHARD.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.MUDSTONE_PAXEL.get())
                .pattern("BBB")
                .pattern("BA ")
                .pattern(" A ")
                .define('A', Items.STICK)
                .define('B', ModItems.MUDSTONE_SHARD.get())
                .unlockedBy("has_silver", has(ModItems.MUDSTONE_SHARD.get()))
                .save(pWriter);

        /* Silver Dimond */
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.SILVER_DIAMOND_SWORD.get())
                .pattern("C")
                .pattern("B")
                .pattern("A")
                .define('A', Items.STICK)
                .define('C', Items.DIAMOND)
                .define('B', ModItems.SILVER.get())
                .unlockedBy("has_silver", has(ModTags.Items.SILVER_DIAMOND))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.SILVER_DIAMOND_PICKAXE.get())
                .pattern("BBC")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', Items.STICK)
                .define('C', Items.DIAMOND)
                .define('B', ModItems.SILVER.get())
                .unlockedBy("has_silver", has(ModTags.Items.SILVER_DIAMOND))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.SILVER_DIAMOND_AXE.get())
                .pattern("CB")
                .pattern("BA")
                .pattern(" A")
                .define('A', Items.STICK)
                .define('C', Items.DIAMOND)
                .define('B', ModItems.SILVER.get())
                .unlockedBy("has_silver", has(ModTags.Items.SILVER_DIAMOND))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.SILVER_DIAMOND_HOE.get())
                .pattern("BC")
                .pattern(" A")
                .pattern(" A")
                .define('A', Items.STICK)
                .define('C', Items.DIAMOND)
                .define('B', ModItems.SILVER.get())
                .unlockedBy("has_silver", has(ModTags.Items.SILVER_DIAMOND))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.SILVER_DIAMOND_PAXEL.get())
                .pattern("CBC")
                .pattern("BA ")
                .pattern(" A ")
                .define('A', Items.STICK)
                .define('C', Items.DIAMOND)
                .define('B', ModItems.SILVER.get())
                .unlockedBy("has_silver", has(ModTags.Items.SILVER_DIAMOND))
                .save(pWriter);

        /* Bogganium */
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(ModItems.BOGGANIUM_UPGRADE_SMITHING_TEMPLATE.get()), Ingredient.of(Items.DIAMOND_SWORD),
                        Ingredient.of(ModItems.BOGGANIUM_INGOT.get()), RecipeCategory.COMBAT, ModItems.BOGGANIUM_SWORD.get()).
                unlocks("has_bogganium_ingot", has(ModItems.BOGGANIUM_INGOT.get())).save(pWriter, new ResourceLocation(The_Bog.MOD_ID, "boggaium_sword"));

        SmithingTransformRecipeBuilder.smithing(Ingredient.of(ModItems.BOGGANIUM_UPGRADE_SMITHING_TEMPLATE.get()), Ingredient.of(Items.DIAMOND_PICKAXE),
                        Ingredient.of(ModItems.BOGGANIUM_INGOT.get()), RecipeCategory.COMBAT, ModItems.BOGGANIUM_PICKAXE.get()).
                unlocks("has_bogganium_ingot", has(ModItems.BOGGANIUM_INGOT.get())).save(pWriter, new ResourceLocation(The_Bog.MOD_ID, "boggaium_pickaxe"));

        SmithingTransformRecipeBuilder.smithing(Ingredient.of(ModItems.BOGGANIUM_UPGRADE_SMITHING_TEMPLATE.get()), Ingredient.of(Items.DIAMOND_AXE),
                        Ingredient.of(ModItems.BOGGANIUM_INGOT.get()), RecipeCategory.COMBAT, ModItems.BOGGANIUM_AXE.get()).
                unlocks("has_bogganium_ingot", has(ModItems.BOGGANIUM_INGOT.get())).save(pWriter, new ResourceLocation(The_Bog.MOD_ID, "boggaium_axe"));

        SmithingTransformRecipeBuilder.smithing(Ingredient.of(ModItems.BOGGANIUM_UPGRADE_SMITHING_TEMPLATE.get()), Ingredient.of(Items.DIAMOND_SHOVEL),
                        Ingredient.of(ModItems.BOGGANIUM_INGOT.get()), RecipeCategory.COMBAT, ModItems.BOGGANIUM_SHOVEL.get()).
                unlocks("has_bogganium_ingot", has(ModItems.BOGGANIUM_INGOT.get())).save(pWriter, new ResourceLocation(The_Bog.MOD_ID, "boggaium_shovel"));

        SmithingTransformRecipeBuilder.smithing(Ingredient.of(ModItems.BOGGANIUM_UPGRADE_SMITHING_TEMPLATE.get()), Ingredient.of(Items.DIAMOND_HOE),
                        Ingredient.of(ModItems.BOGGANIUM_INGOT.get()), RecipeCategory.COMBAT, ModItems.BOGGANIUM_HOE.get()).
                unlocks("has_bogganium_ingot", has(ModItems.BOGGANIUM_INGOT.get())).save(pWriter, new ResourceLocation(The_Bog.MOD_ID, "boggaium_hoe"));

        SmithingTransformRecipeBuilder.smithing(Ingredient.of(ModItems.BOGGANIUM_UPGRADE_SMITHING_TEMPLATE.get()), Ingredient.of(ModItems.DIAMOND_PAXEL.get()),
                        Ingredient.of(ModItems.BOGGANIUM_INGOT.get()), RecipeCategory.COMBAT, ModItems.BOGGANIUM_PAXEL.get()).
                unlocks("has_bogganium_ingot", has(ModItems.BOGGANIUM_INGOT.get())).save(pWriter, new ResourceLocation(The_Bog.MOD_ID, "boggaium_paxel"));

        /* Misc */
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.DIAMOND_PAXEL.get())
                .pattern("BBB")
                .pattern("BA ")
                .pattern(" A ")
                .define('A', Items.STICK)
                .define('B', Items.DIAMOND)
                .unlockedBy("has_diamond", has(Items.DIAMOND))
                .save(pWriter);
        }
    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer,
                                     List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime,
                            pCookingSerializer).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, The_Bog.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
