package net.mcreator.newblocks.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;

import net.mcreator.newblocks.particle.SculkSoulParticle;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class FarLogUpdateTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure FarLogUpdateTick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure FarLogUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure FarLogUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure FarLogUpdateTick!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (Math.random() < 0.2) {
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(SculkSoulParticle.particle, x, y, z, (int) 3, 0.8, 0.8, 0.8, 0.11);
			}
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(SculkSoulParticle.particle, x, y, z, (int) 3, 1, 1, 1, 0.11);
			}
		}
		if (Math.random() < 0.2) {
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(SculkSoulParticle.particle, x, y, z, (int) 3, 0.8, 0.8, 0.8, 0.11);
			}
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(SculkSoulParticle.particle, x, y, z, (int) 3, 1, 1, 1, 0.11);
			}
		}
	}
}
