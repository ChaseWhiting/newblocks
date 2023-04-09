package net.mcreator.newblocks.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class PogoStickOnEntityTickUpdateProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure PogoStickOnEntityTickUpdate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double Speed = 0;
		double YawState = 0;
		if (entity.isBeingRidden()) {
			if (entity.isOnGround()) {
				if (Math.random() < 0.7) {
					if (Math.random() < 0.7) {
						if (Math.random() < 0.7) {
							if (Math.random() < 0.7) {
								if (Math.random() < 0.7) {
									entity.setMotion((entity.getMotion().getX()), 0.5, (entity.getMotion().getZ()));
								} else {
									entity.setMotion((entity.getMotion().getX()), 0.6, (entity.getMotion().getZ()));
								}
							}
						}
					}
				}
			}
		}
	}
}
