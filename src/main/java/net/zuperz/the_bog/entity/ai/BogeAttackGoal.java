package net.zuperz.the_bog.entity.ai;

import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.zuperz.the_bog.entity.custom.BogEntity;

public class BogeAttackGoal extends MeleeAttackGoal {
    private final BogEntity bog;
    private int raiseArmTicks;

    public BogeAttackGoal(BogEntity pBog, double pSpeedModifier, boolean pFollowingTargetEvenIfNotSeen) {
        super(pBog, pSpeedModifier, pFollowingTargetEvenIfNotSeen);
        this.bog = pBog;
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    public void start() {
        super.start();
        this.raiseArmTicks = 0;
    }

    /**
     * Reset the task's internal state. Called when this task is interrupted by another one
     */
    public void stop() {
        super.stop();
        this.bog.setAggressive(false);
    }

    /**
     * Keep ticking a continuous task that has already been started
     */
    public void tick() {
        super.tick();
        ++this.raiseArmTicks;
        if (this.raiseArmTicks >= 5 && this.getTicksUntilNextAttack() < this.getAttackInterval() / 2) {
            this.bog.setAggressive(true);
        } else {
            this.bog.setAggressive(false);
        }

    }
}
