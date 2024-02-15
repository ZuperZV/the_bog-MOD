package net.zuperz.the_bog.item.costom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.zuperz.the_bog.block.ModBlocks;
import net.zuperz.the_bog.block.custom.MudStoneBlock;
import net.zuperz.the_bog.worldgen.dimension.ModDimensions;

public class boggy_keystone extends Item {
    public boggy_keystone() {
        super(new Properties()
                .stacksTo(1)
                .rarity(Rarity.RARE)
        );
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        if (context.getPlayer() != null) {
            if (context.getPlayer().level().dimension() == ModDimensions.THE_BOG_LEVEL_KEY || context.getPlayer().level().dimension() == Level.OVERWORLD) {
                for (Direction direction : Direction.Plane.VERTICAL) {
                    BlockPos framePos = context.getClickedPos().relative(direction);
                    if (((MudStoneBlock) ModBlocks.MUD_STONE.get()).trySpawnPortal(context.getLevel(), framePos)) {
                        //context.getLevel().playSound(context.getPlayer(), framePos, UGSoundEvents.UNDERGARDEN_PORTAL_ACTIVATE.get(), SoundSource.BLOCKS, 1.0F, 1.0F);
                        return InteractionResult.CONSUME;
                    } else return InteractionResult.FAIL;
                }
            }
        }
        return InteractionResult.FAIL;
    }
}
