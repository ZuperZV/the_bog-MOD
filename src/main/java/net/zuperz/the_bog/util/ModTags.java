package net.zuperz.the_bog.util;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.entity.EntityType;
import net.zuperz.the_bog.The_Bog;

import static net.minecraft.tags.TagEntry.tag;

public class ModTags {

    public static class Blocks {
        public static final TagKey<Block> PORTAL_FRAME_BLOCKS = tag("portal_frame_blocks");
        public static final TagKey<Block> BLACKLIST_PORTAL_FRAME_BLOCKS = tag("blacklist_portal_frame_blocks");
        public static final TagKey<Block> BOG_DIRT = tag("bog_dirt");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(The_Bog.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Items {

        private static TagKey<Item> tagKey(String name) {
            return ItemTags.create(new ResourceLocation(The_Bog.MOD_ID, name));
        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Entities {

        public static final TagKey<EntityType<?>> BOG_MOBS = tag("bog_mobs");

        private static TagKey<EntityType<?>> tag(String name) {
            return TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation(The_Bog.MOD_ID, name));
        }
    }
}
