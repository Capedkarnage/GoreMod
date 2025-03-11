package com.github.capedkarnage.goremod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.monster.WitherSkeleton;
import net.minecraft.world.entity.monster.Spider;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.monster.MagmaCube;
import net.minecraft.world.entity.monster.Endermite;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.monster.CaveSpider;
import net.minecraft.world.entity.monster.Blaze;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.animal.Squid;
import net.minecraft.world.entity.GlowSquid;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class EntityHitProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getSource(), event.getEntity(), event.getAmount());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, DamageSource damagesource, Entity entity, double amount) {
		execute(null, world, x, y, z, damagesource, entity, amount);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, DamageSource damagesource, Entity entity, double amount) {
		if (damagesource == null || entity == null)
			return;
		if (!(damagesource.is(DamageTypes.DROWN) && damagesource.is(DamageTypes.DRY_OUT) && damagesource.is(DamageTypes.FREEZE) && damagesource.is(DamageTypes.IN_FIRE) && damagesource.is(DamageTypes.HOT_FLOOR) && damagesource.is(DamageTypes.LAVA)
				&& damagesource.is(DamageTypes.LIGHTNING_BOLT) && damagesource.is(DamageTypes.MAGIC) && damagesource.is(DamageTypes.STARVE))) {
			if (entity instanceof Skeleton) {
				SkeletonHitProcedure.execute(world, x, y, z, entity, amount);
			} else if (entity instanceof Spider || entity instanceof CaveSpider) {
				SpiderHitProcedure.execute(world, x, y, z, entity, amount);
			} else if (entity instanceof Creeper || entity instanceof WitherSkeleton) {
				CreeperHitProcedure.execute(world, x, y, z, entity, amount);
			} else if (entity instanceof Blaze || entity instanceof MagmaCube) {
				RegularHitProcedure.execute(world, x, y, z, entity, amount);
			} else if (entity instanceof EnderMan || entity instanceof Endermite || entity instanceof EnderDragon) {
				EnderHitProcedure.execute(world, x, y, z, entity, amount);
			} else if (entity instanceof Squid) {
				RegularHitProcedure.execute(world, x, y, z, entity, amount);
			} else if (entity instanceof GlowSquid) {
				RegularHitProcedure.execute(world, x, y, z, entity, amount);
			} else {
				RegularHitProcedure.execute(world, x, y, z, entity, amount);
			}
		}
	}
}
