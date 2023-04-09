package net.mcreator.newblocks.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class SCP173PlayerCollidesWithThisEntityProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency sourceentity for procedure SCP173PlayerCollidesWithThisEntity!");
			return;
		}
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (sourceentity instanceof LivingEntity) {
			((LivingEntity) sourceentity).attackEntityFrom(new DamageSource("necksnapped").setDamageBypassesArmor(), (float) 50);
		}
	}
}
