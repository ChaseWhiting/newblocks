package net.mcreator.newblocks.procedures;

import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;
import java.util.Collections;

public class PillagerThrownEnderPearlProjectileHitsBlockProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure PillagerThrownEnderPearlProjectileHitsBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure PillagerThrownEnderPearlProjectileHitsBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure PillagerThrownEnderPearlProjectileHitsBlock!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency sourceentity for procedure PillagerThrownEnderPearlProjectileHitsBlock!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		{
			Entity _ent = sourceentity;
			_ent.setPositionAndUpdate((x + 0.5), (y + 0.3), (z + 0.5));
			if (_ent instanceof ServerPlayerEntity) {
				((ServerPlayerEntity) _ent).connection.setPlayerLocation((x + 0.5), (y + 0.3), (z + 0.5), _ent.rotationYaw, _ent.rotationPitch,
						Collections.emptySet());
			}
		}
	}
}
