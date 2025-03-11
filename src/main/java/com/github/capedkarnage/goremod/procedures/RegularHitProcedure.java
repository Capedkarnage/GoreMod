package com.github.capedkarnage.goremod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import java.util.Random;

import com.github.capedkarnage.goremod.init.GoremodModParticleTypes;
import com.github.capedkarnage.goremod.configuration.ConfigConfiguration;

public class RegularHitProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, double amount) {
		if (entity == null)
			return;
		double Random = 0;
		double Y = 0;
		double Random2 = 0;
		double AdjustedAmount = 0;
		double MixRandom1 = 0;
		double MixRandom2 = 0;
		double MixRandom3 = 0;
		double MixRandom4 = 0;
		double ParticalHeight = 0;
		double ParticalWidth = 0;
		double ParticleSpeed = 0;
		Random = Mth.nextInt(RandomSource.create(), 1, 4);
		Random2 = Mth.nextInt(RandomSource.create(), 1, 4);
		MixRandom1 = Mth.nextInt(RandomSource.create(), 0, 1);
		MixRandom2 = Mth.nextInt(RandomSource.create(), 0, 1);
		MixRandom3 = Mth.nextInt(RandomSource.create(), 0, 1);
		MixRandom4 = Mth.nextInt(RandomSource.create(), 0, 1);
		AdjustedAmount = amount * 2 * entity.getBbWidth() * (double) ConfigConfiguration.BLOODMULT.get();
		Y = y + 1;
		ParticalHeight = entity.getBbHeight() / 4;
		ParticalWidth = entity.getBbWidth() / 4;
		ParticleSpeed = 0.07;
		if (!(MixRandom1 == 0 && MixRandom2 == 0 && MixRandom3 == 0 && MixRandom4 == 0)) {
			if (MixRandom1 == 1) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (GoremodModParticleTypes.HIT_1.get()), x, Y, z, (int) (Mth.nextInt(RandomSource.create(), 6, 8) * AdjustedAmount), ParticalWidth, ParticalHeight, ParticalWidth, ParticleSpeed);
			}
			if (MixRandom2 == 1) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (GoremodModParticleTypes.HIT_2.get()), x, Y, z, (int) (Mth.nextInt(RandomSource.create(), 2, 5) * AdjustedAmount), ParticalWidth, ParticalHeight, ParticalWidth, ParticleSpeed);
			}
			if (MixRandom3 == 1) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (GoremodModParticleTypes.HIT_3.get()), x, Y, z, (int) (Mth.nextInt(RandomSource.create(), 0, 3) * AdjustedAmount), ParticalWidth, ParticalHeight, ParticalWidth, ParticleSpeed);
			}
			if (MixRandom4 == 1) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (GoremodModParticleTypes.HIT_4.get()), x, Y, z, (int) (Mth.nextInt(RandomSource.create(), 0, 4) * AdjustedAmount), ParticalWidth, ParticalHeight, ParticalWidth, ParticleSpeed);
			}
		} else {
			if (Random == 1) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (GoremodModParticleTypes.HIT_1.get()), x, Y, z, (int) (Mth.nextInt(RandomSource.create(), 4, 8) * AdjustedAmount), ParticalWidth, ParticalHeight, ParticalWidth, ParticleSpeed);
			} else if (Random == 2) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (GoremodModParticleTypes.HIT_2.get()), x, Y, z, (int) (Mth.nextInt(RandomSource.create(), 6, 11) * AdjustedAmount), ParticalWidth, ParticalHeight, ParticalWidth, ParticleSpeed);
			} else if (Random == 3) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (GoremodModParticleTypes.HIT_3.get()), x, Y, z, (int) (Mth.nextInt(RandomSource.create(), 2, 5) * AdjustedAmount), ParticalWidth, ParticalHeight, ParticalWidth, ParticleSpeed);
			} else if (Random == 4) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (GoremodModParticleTypes.HIT_4.get()), x, Y, z, (int) (Mth.nextInt(RandomSource.create(), 3, 6) * AdjustedAmount), ParticalWidth, ParticalHeight, ParticalWidth, ParticleSpeed);
			}
		}
	}
}
