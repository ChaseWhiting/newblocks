package net.mcreator.newblocks.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;
import java.util.HashMap;

public class MobRainCommandExecutedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure MobRainCommandExecuted!");
			return;
		}
		if (dependencies.get("cmdparams") == null) {
			if (!dependencies.containsKey("cmdparams"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency cmdparams for procedure MobRainCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		HashMap cmdparams = (HashMap) dependencies.get("cmdparams");
		if ((new Object() {
			public String getText() {
				String param = (String) cmdparams.get("0");
				if (param != null) {
					return param;
				}
				return "";
			}
		}.getText()).equals("skeleton")) {
			if (entity.getPersistentData().getBoolean("isSkeletonRain") == false) {
				entity.getPersistentData().putBoolean("IsSkeletonRain", (true));
			} else {
				entity.getPersistentData().putBoolean("IsSkeletonRain", (false));
			}
		}
		if ((new Object() {
			public String getText() {
				String param = (String) cmdparams.get("0");
				if (param != null) {
					return param;
				}
				return "";
			}
		}.getText()).equals("zombie")) {
			if (entity.getPersistentData().getBoolean("IsZombieRain") == false) {
				entity.getPersistentData().putBoolean("IsZombieRain", (true));
			} else {
				entity.getPersistentData().putBoolean("IsZombieRain", (false));
			}
		}
		if ((new Object() {
			public String getText() {
				String param = (String) cmdparams.get("0");
				if (param != null) {
					return param;
				}
				return "";
			}
		}.getText()).equals("creeper")) {
			if (entity.getPersistentData().getBoolean("IsCreeperRain") == false) {
				entity.getPersistentData().putBoolean("IsCreeperRain", (true));
			} else {
				entity.getPersistentData().putBoolean("IsCreeperRain", (false));
			}
		}
	}
}
