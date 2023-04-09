package net.mcreator.newblocks.procedures;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.item.GreenLightsaberItem;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class GreenLightsaberThrowWhileProjectileFlyingTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure GreenLightsaberThrowWhileProjectileFlyingTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).getCooldownTracker().setCooldown(GreenLightsaberItem.block, (int) 30);
	}
}
