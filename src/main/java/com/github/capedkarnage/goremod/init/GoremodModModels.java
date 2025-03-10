
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.github.capedkarnage.goremod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import com.github.capedkarnage.goremod.client.model.ModelBloodPoolEntity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class GoremodModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelBloodPoolEntity.LAYER_LOCATION, ModelBloodPoolEntity::createBodyLayer);
	}
}
