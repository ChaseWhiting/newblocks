package net.mcreator.newblocks.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class CookedGiantOarfishFoodEatenProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure CookedGiantOarfishFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (Math.random() < 0.2) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.POISON, (int) 75, (int) 0, (false), (false)));
		}
	}
}
