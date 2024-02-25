package net.zuperz.the_bog.item.costom;

import net.zuperz.the_bog.The_Bog;
import net.minecraft.ChatFormatting;
import net.minecraft.Util;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.SmithingTemplateItem;

import java.util.List;

public class ModSmithingTemplateItem extends SmithingTemplateItem {

    private static final ChatFormatting TITLE_FORMAT = ChatFormatting.GRAY;
    private static final ChatFormatting DESCRIPTION_FORMAT = ChatFormatting.BLUE;


    private static final Component BOGGANIUM_UPGRADE = Component.translatable(Util.makeDescriptionId("upgrade",
            new ResourceLocation(The_Bog.MOD_ID, "bogganium_upgrade"))).withStyle(TITLE_FORMAT);

    private static final Component BOGGANIUM_UPGRADE_APPLIES_TO = Component.translatable(Util.makeDescriptionId("item",
            new ResourceLocation(The_Bog.MOD_ID, "smithing_template.bogganium_upgrade.applies_to"))).withStyle(DESCRIPTION_FORMAT);

    private static final Component BOGGANIUM_UPGRADE_INGREDIENTS = Component.translatable(Util.makeDescriptionId("item",
            new ResourceLocation(The_Bog.MOD_ID, "smithing_template.bogganium_upgrade.ingredients"))).withStyle(DESCRIPTION_FORMAT);

    private static final Component BOGGANIUM_UPGRADE_BASE_SLOT_DESCRIPTION = Component.translatable(Util.makeDescriptionId("item",
            new ResourceLocation(The_Bog.MOD_ID, "smithing_template.bogganium_upgrade.base_slot_description")));

    private static final Component BOGGANIUM_UPGRADE_ADDITIONS_SLOT_DESCRIPTION = Component.translatable(Util.makeDescriptionId("item",
            new ResourceLocation(The_Bog.MOD_ID, "smithing_template.bogganium_upgrade.additions_slot_description")));


    private static final ResourceLocation EMPTY_SLOT_INGOT = new ResourceLocation("item/empty_slot_ingot");
    private static final ResourceLocation EMPTY_SLOT_HELMET = new ResourceLocation("item/empty_armor_slot_helmet");
    private static final ResourceLocation EMPTY_SLOT_BOOTS = new ResourceLocation("item/empty_armor_slot_boots");
    private static final ResourceLocation EMPTY_SLOT_HOE = new ResourceLocation("item/empty_slot_hoe");
    private static final ResourceLocation EMPTY_SLOT_CHESTPLATE = new ResourceLocation("item/empty_armor_slot_chestplate");
    private static final ResourceLocation EMPTY_SLOT_SHOVEL = new ResourceLocation("item/empty_slot_shovel");
    private static final ResourceLocation EMPTY_SLOT_AXE = new ResourceLocation("item/empty_slot_axe");
    private static final ResourceLocation EMPTY_SLOT_SWORD = new ResourceLocation("item/empty_slot_sword");
    private static final ResourceLocation EMPTY_SLOT_LEGGINGS = new ResourceLocation("item/empty_armor_slot_leggings");
    private static final ResourceLocation EMPTY_SLOT_PICKAXE = new ResourceLocation("item/empty_slot_pickaxe");


    public ModSmithingTemplateItem(Component p_266834_, Component p_267043_, Component p_267048_, Component p_267278_, Component p_267090_, List<ResourceLocation> p_266755_, List<ResourceLocation> p_267060_) {
        super(p_266834_, p_267043_, p_267048_, p_267278_, p_267090_, p_266755_, p_267060_);
    }

    public static SmithingTemplateItem createBogganiumUpgradeTemplate() {
        return new SmithingTemplateItem(BOGGANIUM_UPGRADE_APPLIES_TO, BOGGANIUM_UPGRADE_INGREDIENTS, BOGGANIUM_UPGRADE, BOGGANIUM_UPGRADE_BASE_SLOT_DESCRIPTION, BOGGANIUM_UPGRADE_ADDITIONS_SLOT_DESCRIPTION, createBogganiumUpgradeIconList(), createBogganiumUpgradeMaterialList());
    }

    private static List<ResourceLocation> createBogganiumUpgradeIconList() {
        return List.of(EMPTY_SLOT_HELMET, EMPTY_SLOT_SWORD, EMPTY_SLOT_CHESTPLATE, EMPTY_SLOT_PICKAXE, EMPTY_SLOT_LEGGINGS, EMPTY_SLOT_AXE, EMPTY_SLOT_BOOTS, EMPTY_SLOT_HOE, EMPTY_SLOT_SHOVEL);
    }

    private static List<ResourceLocation> createBogganiumUpgradeMaterialList() {
        return List.of(EMPTY_SLOT_INGOT);
    }
}