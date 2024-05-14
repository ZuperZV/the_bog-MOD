package net.zuperz.the_bog.event;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.zuperz.the_bog.The_Bog;
import net.zuperz.the_bog.block.ModBlocks;
import net.zuperz.the_bog.item.ModItems;
import net.zuperz.the_bog.util.ModTags;
import net.zuperz.the_bog.villager.ModVillagers;
import net.minecraft.client.renderer.blockentity.BrushableBlockRenderer;

import java.util.List;

@Mod.EventBusSubscriber(modid = The_Bog.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModEvent {


    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
        if(event.getType() == ModVillagers.PORTAL_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.SILVER.get(), 4);

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.SILVER.get(), 2),
                    new ItemStack(ModItems.RUBY.get(), 2), stack, 5, 3, 0.06f
            ));

        }

        if(event.getType() == ModVillagers.PORTAL_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.RAW_SILVER.get(), 3);

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.RUBY.get(), 2), stack, 5, 4, 0.03f
            ));
        }

        if(event.getType() == ModVillagers.PORTAL_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.COAL, 7);

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.RUBY.get(), 3), stack, 4, 3, 0.03f
            ));
        }

        if(event.getType() == ModVillagers.PORTAL_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.SILVER.get(), 4);

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.COAL, 32), stack, 5, 4, 0.03f
            ));
        }

        if(event.getType() == ModVillagers.PORTAL_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.RAW_SILVER.get(), 6);

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.SILVER_DIAMOND_BOOTS.get()), stack, 5, 15, 0.0f
            ));
        }

        if(event.getType() == ModVillagers.PORTAL_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.RUBY.get(), 8);

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.NAME_TAG, 1), stack, 5, 3, 0.03f
            ));
        }

        if(event.getType() == ModVillagers.PORTAL_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.SILVER.get(), 6);

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.SILVER_DIAMOND_BOOTS.get()), stack, 5, 3, 0.03f
            ));
        }

        if(event.getType() == ModVillagers.PORTAL_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.BOGGY_CHOPS.get(), 8);

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.BOGGANIUM_INGOT.get(), 1), stack, 9, 35, 0.04f
            ));
        }

        if(event.getType() == ModVillagers.PORTAL_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.BOGSKIN.get(), 9);

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.RAW_SILVER.get(), 3), stack, 8, 4, 0.04f
            ));
        }

        if(event.getType() == ModVillagers.PORTAL_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.DUCK_EGG.get(), 6);

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.RAW_SILVER.get(), 8), stack, 8, 2, 0.04f
            ));
        }

        if(event.getType() == ModVillagers.PORTAL_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.SILVER_DIAMOND_PICKAXE.get(), 1);

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.RUBY.get(), 3), stack, 7, 3, 0.04f
            ));
        }

        if(event.getType() == ModVillagers.PORTAL_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.SLIMY_PIECE_OF_SKIN.get(), 6);

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.RAW_SILVER.get(), 2), stack, 8, 8, 0.04f
            ));
        }

        if(event.getType() == ModVillagers.PORTAL_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.RAW_SILVER.get(), 4);

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.MUDSTONE_SHARD.get(), 1), stack, 2, 3, 0.05f
            ));

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.MUDSTONE_SHARD.get(), 2), stack, 5, 8, 0.04f
            ));
        }

        if(event.getType() == ModVillagers.PORTAL_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.RAW_SILVER.get(), 5);

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.MUDSTONE_SHARD.get(), 2), stack, 10, 8, 0.04f
            ));
        }

        if(event.getType() == ModVillagers.PORTAL_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.RUBY.get(), 5);

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.BOGBLOSSOM_BOW.get(), 1), stack, 2, 2, 0.0f
            ));
        }

        if(event.getType() == ModVillagers.PORTAL_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.BOGSKIN.get(), 1);

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.SILVER.get(), 2),
                    new ItemStack(ModItems.RUBY.get(), 3), stack, 8, 5, 0.03f
            ));
        }

        if(event.getType() == ModVillagers.PORTAL_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Blocks.BELL, 1);

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.RUBY.get(), 32), stack, 9, 4, 0.03f
            ));
        }

        if(event.getType() == ModVillagers.PORTAL_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.MUDSTONE_PAXEL.get(), 1);

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.SILVER.get(), 1),
                    new ItemStack(ModItems.RUBY.get(), 23), stack, 4, 6, 0.03f
            ));
        }

        if(event.getType() == ModVillagers.PORTAL_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.MUDSTONE_SHARD.get(), 6);

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.RUBY.get(), 4), stack, 2, 8, 0.03f
            ));
        }

        if(event.getType() == ModVillagers.PORTAL_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.MUDSTONE_SHARD_FRAGMENT.get(), 6);

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.SILVER.get(), 1),
                    new ItemStack(ModItems.RUBY.get(), 5), stack, 5, 7, 0.03f
            ));
        }

        if(event.getType() == ModVillagers.PORTAL_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Items.BREAD, 5);

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.WHEAT_SEEDS, 4),
                    new ItemStack(ModItems.RUBY.get(), 4), stack, 6, 5, 0.03f
            ));
        }


        if(event.getType() == ModVillagers.PORTAL_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.BOGBLOSSOM_BOW.get(), 1);

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.SILVER.get(), 1),
                    new ItemStack(ModItems.RUBY.get(), 12), stack, 1, 3, 0.04f
            ));
        }


        if(event.getType() == ModVillagers.PORTAL_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.DIAMOND_BOGBLOSSOM_BOW.get(), 1);

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.RUBY.get(), 23), stack, 1, 3, 0.04f
            ));
        }


        if(event.getType() == ModVillagers.PORTAL_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.SILVER_CHESTPLATE.get(), 1);

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.SILVER.get(), 1),
                    new ItemStack(ModItems.RUBY.get(), 4), stack, 2, 7, 0.03f
            ));
        }

        if(event.getType() == ModVillagers.PORTAL_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.RAW_DUCK.get(), 3);

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.DUCK_FEATHER.get(), 9), stack, 2, 4, 0.03f
            ));
        }

        if(event.getType() == ModVillagers.PORTAL_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.BOGGANIUM_WATER_BUCKET.get(), 1);

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.SILVER.get(), 4),
                    new ItemStack(ModItems.RUBY.get(), 10), stack, 2, 7, 0.05f
            ));
        }


        if(event.getType() == ModVillagers.PORTAL_MASTER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                ItemStack stack = new ItemStack(ModItems.MUDSTONE_SHARD.get(), 1);

                trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                        new ItemStack(ModItems.RUBY.get(), 3),
                        new ItemStack(ModItems.MUDSTONE_SHARD_FRAGMENT.get(), 7), stack, 1, 25, 0.03f
                ));
        }

        if(event.getType() == ModVillagers.PORTAL_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.RAW_SILVER.get(), 9);

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.SILVER.get(), 8), stack, 2, 4, 0.03f
            ));
        }

        if(event.getType() == ModVillagers.PORTAL_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.SILVER_AXE.get(), 1);

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.RAW_SILVER.get(), 4), stack, 4, 6, 0.03f
            ));

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.MUDSTONE_SHARD.get(), 2), stack, 4, 6, 0.03f
            ));
        }

        if(event.getType() == ModVillagers.PORTAL_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.RAW_SILVER.get(), 10);

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.SILVER.get(), 8), stack, 2, 4, 0.03f
            ));

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.IRON_INGOT, 2), stack, 4, 6, 0.03f
            ));
        }

        if(event.getType() == ModVillagers.PORTAL_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.RAW_SILVER.get(), 4);

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.SILVER.get(), 8), stack, 2, 4, 0.03f
            ));

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.IRON_INGOT, 2), stack, 4, 6, 0.03f
            ));
        }

        if(event.getType() == ModVillagers.PORTAL_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.RUBY.get(), 6);

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.MUDSTONE_SHARD_FRAGMENT.get(), 7), stack, 1, 25, 0.03f
            ));

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.MUDSTONE_SHARD.get(), 2), stack, 2, 18, 0.03f
            ));
        }

        if(event.getType() == ModVillagers.PORTAL_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.RUBY.get(), 6);

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.BOGGANIUM_INGOT.get(), 1), stack, 4, 6, 0.03f
            ));
        }

        if(event.getType() == ModVillagers.PORTAL_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(Blocks.MUD, 1);

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.RUBY.get(), 37),
                    new ItemStack(ModItems.MUDSTONE_SHARD_FRAGMENT.get(), 7), stack, 1, 25, 0.03f
            ));
        }

        if(event.getType() == ModVillagers.PORTAL_MASTER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            ItemStack stack = new ItemStack(ModItems.HOME_STONE_SHARD.get(), 1);

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItems.BOGGANIUM_INGOT.get(), 3),
                    new ItemStack(ModItems.MUDSTONE_SHARD.get(), 8), stack, 1, 30, 0.03f
            ));
        }

    }
}
