
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.github.capedkarnage.goremod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import com.github.capedkarnage.goremod.client.particle.Hit4Particle;
import com.github.capedkarnage.goremod.client.particle.Hit3Particle;
import com.github.capedkarnage.goremod.client.particle.Hit2Particle;
import com.github.capedkarnage.goremod.client.particle.Hit1Particle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class GoremodModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(GoremodModParticleTypes.HIT_1.get(), Hit1Particle::provider);
		event.registerSpriteSet(GoremodModParticleTypes.HIT_2.get(), Hit2Particle::provider);
		event.registerSpriteSet(GoremodModParticleTypes.HIT_3.get(), Hit3Particle::provider);
		event.registerSpriteSet(GoremodModParticleTypes.HIT_4.get(), Hit4Particle::provider);
	}
}
