package net.mcreator.newblocks.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class BluePortalRightClickedOnEntityProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency sourceentity for procedure BluePortalRightClickedOnEntity!");
			return;
		}
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		{
			Entity _ent = sourceentity;
			if (!_ent.world.isRemote && _ent.world.getServer() != null) {
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						"tp @s 0000000b-0000-000b-0000-000b0000000b");
			}
		}
	}
}
