package net.mcreator.newblocks.procedures;

import net.minecraft.entity.MobEntity;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.entity.ZhoemnixEntity;
import net.mcreator.newblocks.entity.ZhoemnixBabyEntity;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class IsNotAttackingSelfProcedure {

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure IsNotAttackingSelf!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		return !(((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null) instanceof ZhoemnixEntity.CustomEntity)
				|| !(((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null) instanceof ZhoemnixBabyEntity.CustomEntity);
	}
}
