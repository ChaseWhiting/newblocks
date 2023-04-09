package net.mcreator.newblocks.procedures;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.potion.RadiationPoisoningPotionEffect;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class HazmatSuitBodyTickEventProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure HazmatSuitBodyTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(RadiationPoisoningPotionEffect.potion);
		}
	}
}
