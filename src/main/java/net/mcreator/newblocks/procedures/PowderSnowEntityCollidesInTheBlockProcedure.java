package net.mcreator.newblocks.procedures;

import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class PowderSnowEntityCollidesInTheBlockProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure PowderSnowEntityCollidesInTheBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (Math.random() < 0.7) {
			if (Math.random() < 0.7) {
				if (Math.random() < 0.7) {
					if (Math.random() < 0.7) {
						if (Math.random() < 0.7) {
							entity.setMotionMultiplier(Blocks.AIR.getDefaultState(), new Vector3d(0.25D, (double) 0.05F, 0.25D));
						}
					}
				}
			}
		}
		entity.getPersistentData().putDouble("ticksInPowderSnow", (entity.getPersistentData().getDouble("ticksInPowderSnow") + 1));
		if (entity.getPersistentData().getDouble("ticksInPowderSnow") > 140) {
			if (Math.random() < 0.7) {
				if (Math.random() < 0.7) {
					if (Math.random() < 0.7) {
						if (Math.random() < 0.7) {
							if (Math.random() < 0.7) {
								if (Math.random() < 0.7) {
									if (Math.random() < 0.7) {
										if (Math.random() < 0.7) {
											if (Math.random() < 0.7) {
												if (entity instanceof LivingEntity) {
													((LivingEntity) entity)
															.attackEntityFrom(new DamageSource("froze_to_death").setDamageBypassesArmor(), (float) 2);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
