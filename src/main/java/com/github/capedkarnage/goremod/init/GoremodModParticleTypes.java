
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
}
