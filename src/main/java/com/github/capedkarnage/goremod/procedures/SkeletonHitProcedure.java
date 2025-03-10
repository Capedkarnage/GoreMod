package com.github.capedkarnage.goremod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import java.util.Random;

import com.github.capedkarnage.goremod.init.GoremodModParticleTypes;
import com.github.capedkarnage.goremod.configuration.ConfigConfiguration;

public class SkeletonHitProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, double amount) {
		double Random = 0;
		double Y = 0;
		double Random2 = 0;
		double AdjustedAmount = 0;
		Random = Mth.nextInt(RandomSource.create(), 1, 4);
		Random2 = Mth.nextInt(RandomSource.create(), 1, 4);
		AdjustedAmount = amount * 2 * (double) ConfigConfiguration.BLOODMULT.get();
		Y = y + 1;
		if (Random == 1) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (GoremodModParticleTypes.SKELETON_HIT_1.get()), x, Y, z, (int) (Mth.nextInt(RandomSource.create(), 4, 8) * AdjustedAmount), 0.25, 0.5, 0.25, 0.07);
		} else if (Random == 2) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (GoremodModParticleTypes.SKELETON_HIT_2.get()), x, Y, z, (int) (Mth.nextInt(RandomSource.create(), 6, 11) * AdjustedAmount), 0.25, 0.5, 0.25, 0.07);
		} else if (Random == 3) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (GoremodModParticleTypes.SKELETON_HIT_3.get()), x, Y, z, (int) (Mth.nextInt(RandomSource.create(), 2, 5) * AdjustedAmount), 0.25, 0.5, 0.25, 0.07);
		} else if (Random == 4) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (GoremodModParticleTypes.SKELETON_HIT_4.get()), x, Y, z, (int) (Mth.nextInt(RandomSource.create(), 3, 6) * AdjustedAmount), 0.25, 0.5, 0.25, 0.07);
		}
	}
}
