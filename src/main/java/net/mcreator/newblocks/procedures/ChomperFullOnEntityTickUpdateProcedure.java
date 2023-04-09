package net.mcreator.newblocks.procedures;

import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class ChomperFullOnEntityTickUpdateProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure ChomperFullOnEntityTickUpdate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity.isOnGround()) {
			entity.setMotionMultiplier(Blocks.AIR.getDefaultState(), new Vector3d(0.25D, (double) 0.05F, 0.25D));
		}
	}
}
