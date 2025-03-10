package com.github.capedkarnage.goremod.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class ConfigConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;

	public static final ForgeConfigSpec.ConfigValue<Double> BLOODMULT;
	static {
		BUILDER.push("Visual Settings");
		BLOODMULT = BUILDER.comment("Multiplies the amount of blood caused by damage").define("Blood Multiplier", (double) 1);
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}
