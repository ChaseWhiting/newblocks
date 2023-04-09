package net.mcreator.newblocks.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class IfIsRiddenAttackProcedure {

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure IfIsRiddenAttack!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		return entity.isBeingRidden();
	}
}
