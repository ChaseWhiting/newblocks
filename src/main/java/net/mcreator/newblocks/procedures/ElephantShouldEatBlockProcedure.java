package net.mcreator.newblocks.procedures;

import net.minecraft.world.IWorld;

import net.mcreator.newblocks.NewBlocksModVariables;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class ElephantShouldEatBlockProcedure {

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure ElephantShouldEatBlock!");
			return false;
		}
		IWorld world = (IWorld) dependencies.get("world");
		return NewBlocksModVariables.WorldVariables.get(world).isElephantHungry == true;
	}
}
