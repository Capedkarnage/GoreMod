
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.github.capedkarnage.goremod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import com.github.capedkarnage.goremod.GoremodMod;

public class GoremodModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, GoremodMod.MODID);
	public static final RegistryObject<SimpleParticleType> HIT_1 = REGISTRY.register("hit_1", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> HIT_2 = REGISTRY.register("hit_2", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> HIT_3 = REGISTRY.register("hit_3", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> HIT_4 = REGISTRY.register("hit_4", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> SKELETON_HIT_1 = REGISTRY.register("skeleton_hit_1", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> SKELETON_HIT_2 = REGISTRY.register("skeleton_hit_2", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> SKELETON_HIT_3 = REGISTRY.register("skeleton_hit_3", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> SKELETON_HIT_4 = REGISTRY.register("skeleton_hit_4", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> CREEPER_HIT_1 = REGISTRY.register("creeper_hit_1", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> CREEPER_HIT_2 = REGISTRY.register("creeper_hit_2", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> CREEPER_HIT_3 = REGISTRY.register("creeper_hit_3", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> CREEPER_HIT_4 = REGISTRY.register("creeper_hit_4", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> SPIDER_HIT_1 = REGISTRY.register("spider_hit_1", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> SPIDER_HIT_2 = REGISTRY.register("spider_hit_2", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> SPIDER_HIT_3 = REGISTRY.register("spider_hit_3", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> SPIDER_HIT_4 = REGISTRY.register("spider_hit_4", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> ENDER_HIT_1 = REGISTRY.register("ender_hit_1", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> ENDER_HIT_2 = REGISTRY.register("ender_hit_2", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> ENDER_HIT_3 = REGISTRY.register("ender_hit_3", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> ENDER_HIT_4 = REGISTRY.register("ender_hit_4", () -> new SimpleParticleType(false));
}
