package com.github.capedkarnage.goremod.init;

import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import com.github.capedkarnage.goremod.configuration.ConfigConfiguration;
import com.github.capedkarnage.goremod.GoremodMod;

@Mod.EventBusSubscriber(modid = GoremodMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GoremodModConfigs {
	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		event.enqueueWork(() -> {
			ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ConfigConfiguration.SPEC, "GoreMod.toml");
		});
	}
}
