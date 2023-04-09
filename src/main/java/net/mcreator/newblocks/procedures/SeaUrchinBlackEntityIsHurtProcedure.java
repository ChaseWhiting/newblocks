package net.mcreator.newblocks.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Random;
import java.util.Map;

public class SeaUrchinBlackEntityIsHurtProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency sourceentity for procedure SeaUrchinBlackEntityIsHurt!");
			return;
		}
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (Math.random() < 0.7) {
			if (sourceentity instanceof LivingEntity) {
				((LivingEntity) sourceentity).attackEntityFrom(new DamageSource("poked_by_urchin").setDamageBypassesArmor(),
						(float) (2 + new Random().nextInt(2 + 1)));
			}
		}
		if (sourceentity instanceof LivingEntity)
			((LivingEntity) sourceentity).addPotionEffect(new EffectInstance(Effects.POISON, (int) 45, (int) 0, (false), (true)));
	}
}
