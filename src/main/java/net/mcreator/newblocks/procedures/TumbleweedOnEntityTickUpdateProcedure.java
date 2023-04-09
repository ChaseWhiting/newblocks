package net.mcreator.newblocks.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class TumbleweedOnEntityTickUpdateProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure TumbleweedOnEntityTickUpdate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (Math.random() < 0.7) {
			if (Math.random() < 0.7) {
				if (Math.random() < 0.7) {
					if (Math.random() < 0.7) {
						if (Math.random() < 0.7) {
							if (Math.random() < 0.7) {
								if (Math.random() < 0.7) {
									if (Math.random() < 0.7) {
										entity.setMotion(0.3, 0, 0.1);
									}
								}
							}
						}
					}
				}
			}
		}
		if (Math.random() < 0.7) {
			if (Math.random() < 0.7) {
				if (Math.random() < 0.7) {
					if (Math.random() < 0.7) {
						if (Math.random() < 0.7) {
							if (Math.random() < 0.7) {
								if (Math.random() < 0.7) {
									if (Math.random() < 0.7) {
										if (entity.isOnGround()) {
											entity.setMotion(0, 0.5, 0);
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
