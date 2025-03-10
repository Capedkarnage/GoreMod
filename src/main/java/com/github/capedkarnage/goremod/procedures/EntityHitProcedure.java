package com.github.capedkarnage.goremod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.monster.WitherSkeleton;
import net.minecraft.world.entity.monster.Spider;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.monster.CaveSpider;
import net.minecraft.world.entity.monster.Blaze;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class EntityHitProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(), event.getAmount());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, double amount) {
		execute(null, world, x, y, z, entity, amount);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, double amount) {
		if (entity == null)
			return;
		if (entity instanceof Skeleton) {
			SkeletonHitProcedure.execute(world, x, y, z, amount);
		} else if (entity instanceof Spider) {
			RegularHitProcedure.execute(world, x, y, z, amount);
		} else if (entity instanceof CaveSpider) {
			RegularHitProcedure.execute(world, x, y, z, amount);
		} else if (entity instanceof Creeper || entity instanceof WitherSkeleton) {
			CreeperHitProcedure.execute(world, x, y, z, amount);
		} else if (entity instanceof Blaze) {
			RegularHitProcedure.execute(world, x, y, z, amount);
		} else {
			RegularHitProcedure.execute(world, x, y, z, amount);
		}
	}
}
