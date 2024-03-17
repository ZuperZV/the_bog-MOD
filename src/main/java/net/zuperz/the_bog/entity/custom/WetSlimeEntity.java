package net.zuperz.the_bog.entity.custom;

import com.google.common.annotations.VisibleForTesting;
import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.BiomeTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.TagKey;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.Difficulty;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.monster.MagmaCube;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Slime;
import net.minecraft.world.entity.npc.AbstractVillager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.*;
import net.minecraft.world.level.levelgen.WorldgenRandom;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.zuperz.the_bog.effect.ModEffects;
import net.zuperz.the_bog.entity.ai.BogeAttackGoal;
import net.zuperz.the_bog.entity.variant.BogeVariant;

import javax.annotation.Nullable;
import java.util.EnumSet;
import java.util.function.Predicate;

public class WetSlimeEntity extends Slime {
    public WetSlimeEntity(EntityType<? extends Slime> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes().add(Attributes.MOVEMENT_SPEED, (double)0.2F);
    }

    public boolean checkSpawnObstruction(LevelReader pLevel) {
        return pLevel.isUnobstructed(this) && !pLevel.containsAnyLiquid(this.getBoundingBox());
    }

    public void setSize(int pSize, boolean pResetHealth) {
        super.setSize(pSize, pResetHealth);
        this.getAttribute(Attributes.ARMOR).setBaseValue((double)(pSize * 3));
    }

    public float getLightLevelDependentMagicValue() {
        return 1.0F;
    }

    protected ParticleOptions getParticleType() {
        return ParticleTypes.ITEM_SLIME;
        //return ModParticles.WETSLIME_PARTICLES.get();
    }

    /**
     * Returns {@code true} if the entity is on fire. Used by render to add the fire effect on rendering.
     */
    public boolean isOnFire() {
        return false;
    }

    /**
     * Gets the amount of time the slime needs to wait between jumps.
     */
    protected int getJumpDelay() {
        return super.getJumpDelay() * 4;
    }

    protected void decreaseSquish() {
        this.targetSquish *= 0.9F;
    }

    /**
     * Causes this entity to do an upwards motion (jumping).
     */
    protected void jumpFromGround() {
        Vec3 vec3 = this.getDeltaMovement();
        float f = (float)this.getSize() * 0.1F;
        this.setDeltaMovement(vec3.x, (double)(this.getJumpPower() + f), vec3.z);
        this.hasImpulse = true;
        net.minecraftforge.common.ForgeHooks.onLivingJump(this);
    }

    @Deprecated // FORGE: use jumpInFluid instead
    protected void jumpInLiquid(TagKey<Fluid> pFluidTag) {
        this.jumpInLiquidInternal(() -> pFluidTag == FluidTags.WATER, () -> super.jumpInLiquid(pFluidTag));
    }

    private void jumpInLiquidInternal(java.util.function.BooleanSupplier isLava, Runnable onSuper) {
        if (isLava.getAsBoolean()) {
            Vec3 vec3 = this.getDeltaMovement();
            this.setDeltaMovement(vec3.x, (double)(0.22F + (float)this.getSize() * 0.05F), vec3.z);
            this.hasImpulse = true;
        } else {
            onSuper.run();
        }
    }

    @Override
    public boolean hurt(DamageSource damagesource, float amount) {
        if (damagesource.is(DamageTypes.FALL))
            return false;
        return super.hurt(damagesource, amount);
    }


    @Override
    public void jumpInFluid(net.minecraftforge.fluids.FluidType type) {
        this.jumpInLiquidInternal(() -> type == ForgeMod.WATER_TYPE.get(), () -> super.jumpInFluid(type));
    }

    /**
     * Indicates weather the slime is able to damage the player (based upon the slime's size)
     */
    protected boolean isDealsDamage() {
        return this.isEffectiveAi();
    }

    protected float getAttackDamage() {
        return super.getAttackDamage() + 2.0F;
    }

    protected SoundEvent getHurtSound(DamageSource pDamageSource) {
        return this.isTiny() ? SoundEvents.SLIME_HURT_SMALL : SoundEvents.SLIME_HURT;
    }

    protected SoundEvent getDeathSound() {
        return this.isTiny() ? SoundEvents.SLIME_DEATH_SMALL : SoundEvents.SLIME_DEATH;
    }

    protected SoundEvent getSquishSound() {
        return this.isTiny() ? SoundEvents.SLIME_SQUISH_SMALL : SoundEvents.SLIME_SQUISH;
    }

    protected SoundEvent getJumpSound() {
        return SoundEvents.SLIME_JUMP;
    }
}

