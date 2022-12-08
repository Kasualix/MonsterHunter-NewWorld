package com.carro1001.mhnw.entities.ai;

import com.carro1001.mhnw.entities.DragonEntity;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.util.LandRandomPos;
import net.minecraft.world.phys.Vec3;

import javax.annotation.Nullable;
import java.util.EnumSet;

public class DragonWalkGoal extends RandomStrollGoal {
    protected final double probability;
    public DragonEntity entity;

    public DragonWalkGoal(DragonEntity pMob, double pSpeedModifier, double pProbability) {
        super(pMob, pSpeedModifier);
        this.probability = pProbability;
        this.entity = pMob;
        this.setFlags(EnumSet.of(Goal.Flag.MOVE));
    }

    @Override
    public boolean canUse() {
        return entity.getStateDir() == 0 || entity.getStateDir() == 2;
    }

    @Override
    public boolean canContinueToUse() {
        return entity.getStateDir() == 2;
    }

    @Override
    public void start() {
        entity.setStateDir(2);
        super.start();
    }

    @Override
    public void stop() {
        entity.setStateDir(0);
        super.stop();
    }

    @Nullable
    protected Vec3 getPosition() {
        if (this.mob.isInWaterOrBubble()) {
            Vec3 vec3 = LandRandomPos.getPos(this.mob, 50, 17);
            return vec3 == null ? super.getPosition() : vec3;
        } else {
            return this.mob.getRandom().nextDouble() >= this.probability ? LandRandomPos.getPos(this.mob, 150, 25) : super.getPosition();
        }
    }
}
