package net.zuperz.the_bog.item.costom;

import net.minecraft.Util;
import net.minecraft.core.particles.ItemParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import net.zuperz.the_bog.entity.ModEntities;
import net.zuperz.the_bog.entity.custom.DuckEntity;
import net.zuperz.the_bog.entity.variant.DuckVariant;
import net.zuperz.the_bog.item.ModItems;
import org.jetbrains.annotations.Nullable;

public class ThrownDuckEgg extends ThrowableItemProjectile {
    public ThrownDuckEgg(EntityType<? extends net.minecraft.world.entity.projectile.ThrownEgg> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public ThrownDuckEgg(Level pLevel, LivingEntity pShooter) {
        super(EntityType.EGG, pShooter, pLevel);
    }

    public ThrownDuckEgg(Level pLevel, double pX, double pY, double pZ) {
        super(EntityType.EGG, pX, pY, pZ, pLevel);
    }

    /**
     * Handles an entity event received from a {@link net.minecraft.network.protocol.game.ClientboundEntityEventPacket}.
     */
    public void handleEntityEvent(byte pId) {
        if (pId == 3) {
            double d0 = 0.08D;

            for(int i = 0; i < 8; ++i) {
                this.level().addParticle(new ItemParticleOption(ParticleTypes.ITEM, this.getItem()), this.getX(), this.getY(), this.getZ(), ((double)this.random.nextFloat() - 0.5D) * 0.08D, ((double)this.random.nextFloat() - 0.5D) * 0.08D, ((double)this.random.nextFloat() - 0.5D) * 0.08D);
            }
        }

    }

    /**
     * Called when the arrow hits an entity
     */
    protected void onHitEntity(EntityHitResult pResult) {
        super.onHitEntity(pResult);
        pResult.getEntity().hurt(this.damageSources().thrown(this, this.getOwner()), 0.0F);
    }

    /**
     * Called when this EntityFireball hits a block or entity.
     */
    protected void onHit(HitResult pResult) {
        super.onHit(pResult);
        if (!this.level().isClientSide) {
            if (this.random.nextInt(8) == 0) {
                int i = 1;
                if (this.random.nextInt(32) == 0) {
                    i = 4;
                }

                for(int j = 0; j < i; ++j) {
                    DuckEntity duck = ModEntities.DUCK.get().create(this.level());
                    if (duck != null) {
                        duck.setAge(-24000);
                        duck.moveTo(this.getX(), this.getY(), this.getZ(), this.getYRot(), 0.0F);
                        this.level().addFreshEntity(duck);
                    }
                }
            }

            this.level().broadcastEntityEvent(this, (byte)3);
            this.discard();
        }

    }

    protected Item getDefaultItem() {
        return ModItems.DUCK_EGG.get();
    }
}