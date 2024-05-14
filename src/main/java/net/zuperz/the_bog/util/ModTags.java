package net.zuperz.the_bog.util;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.entity.EntityType;
import net.zuperz.the_bog.The_Bog;

import static net.minecraft.tags.TagEntry.tag;

public class ModTags {

    public static class Items {
        public static final TagKey<Item> BOG_LEATHER = tag("bog_leather");
        public static final TagKey<Item> SILVER_DIAMOND = tag("silver_diamond");

        public static final TagKey<Item> MUD_STONE = tag("mud_stone");

        public static final TagKey<Item> ORES_SILVER = tag("ores/silver");
        public static final TagKey<Item> ORES_URANIUM = tag("ores/uranium");
        public static final TagKey<Item> ORES_TITANIUM = tag("ores/titanium");

        private static TagKey<Item> tag(String name) {
            return TagKey.create(Registries.ITEM, new ResourceLocation(The_Bog.MOD_ID, name));
        }

        private static TagKey<Item> moddedTag(String modid, String name) {
            return TagKey.create(Registries.ITEM, new ResourceLocation(modid, name));
        }
    }

    public static class Blocks {
        public static final TagKey<Block> PORTAL_FRAME_BLOCKS = tag("portal_frame_blocks");
        public static final TagKey<Block> BOG_DIRT = tag("bog_dirt");
        public static final TagKey<Block> NEEDS_MUDSTONE_TOOL = tag("needs_mudstone_tool");
        public static final TagKey<Block> NEEDS_BOGGANIUM_TOOL = tag("needs_bogganium_tool");
        public static final TagKey<Block> NEEDS_SILVER_TOOL = tag("needs_silver_tool");
        public static final TagKey<Block> NEEDS_SILVER_DIAMOND_TOOL = tag("needs_silver_diamond_tool");
        public static final TagKey<Block> NEEDS_TITANIUM_TOOL = tag("needs_titanium_tool");
        public static final TagKey<Block> PAXEL_MINEABLE = tag("mineable/paxel");

        public static final TagKey<Block> ORES_SILVER = tag("ores/silver");
        public static final TagKey<Block> ORES_URANIUM = tag("ores/uranium");
        public static final TagKey<Block> ORES_TITANIUM = tag("ores/titanium");


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(The_Bog.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Entities {
        public static final TagKey<EntityType<?>> BOG_MOBS = tag("bog_mobs");

        private static TagKey<EntityType<?>> tag(String name) {
            return TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation(The_Bog.MOD_ID, name));
        }
    }
}
