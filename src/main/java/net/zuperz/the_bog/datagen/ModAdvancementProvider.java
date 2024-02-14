package net.zuperz.the_bog.datagen;

import net.zuperz.the_bog.The_Bog;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.DisplayInfo;
import net.minecraft.advancements.FrameType;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.core.HolderLookup;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeAdvancementProvider;

import java.util.function.Consumer;

public class ModAdvancementProvider  implements ForgeAdvancementProvider.AdvancementGenerator {
    @Override
    public void generate(HolderLookup.Provider registries, Consumer<Advancement> saver, ExistingFileHelper existingFileHelper) {

        /*Advancement rootAdvancement = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(ModBlocks.TOOL_STATION.get()),
                        Component.literal("The Tool beginning"), Component.literal("everything is begging tools"),
                        new ResourceLocation(Tool_Forge.MOD_ID, "textures/block/dark_stone.png"), FrameType.TASK,
                        true, true, false))
                .addCriterion("has_tool_station", InventoryChangeTrigger.TriggerInstance.hasItems(ModBlocks.TOOL_STATION.get()))
                .save(saver, new ResourceLocation(Tool_Forge.MOD_ID, "tool_forge"), existingFileHelper);

        Advancement bismuth_armor = Advancement.Builder.advancement()
                .display(new DisplayInfo(new ItemStack(ModItems.BISMUTH_CHESTPLATE.get()),
                        Component.literal("Armor is in the blood?"), Component.literal("you can feel all your blood getting stronger"),
                        null, FrameType.TASK,
                        true, true, false))
                .parent(Bismuth)
                .save(saver, new ResourceLocation(Tool_Forge.MOD_ID, "bismuth_armor"), existingFileHelper);

         */
    }
}