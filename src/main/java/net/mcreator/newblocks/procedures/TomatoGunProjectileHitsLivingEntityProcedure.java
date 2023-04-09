package net.mcreator.newblocks.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.MathHelper;
import net.minecraft.potion.EffectInstance;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.potion.SyrupyPotionEffect;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Random;
import java.util.Map;

public class TomatoGunProjectileHitsLivingEntityProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure TomatoGunProjectileHitsLivingEntity!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure TomatoGunProjectileHitsLivingEntity!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure TomatoGunProjectileHitsLivingEntity!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure TomatoGunProjectileHitsLivingEntity!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency sourceentity for procedure TomatoGunProjectileHitsLivingEntity!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (!(entity == sourceentity)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(
						new EffectInstance(SyrupyPotionEffect.potion, (int) (MathHelper.nextDouble(new Random(), 40, 70)), (int) 0, (false), (true)));
			for (int index0 = 0; index0 < (int) (20); index0++) {
				if (world instanceof ServerWorld) {
					((ServerWorld) world).spawnParticle(ParticleTypes.FALLING_HONEY, x, (MathHelper.nextInt(new Random(), (int) (-0.6), (int) 0.5)),
							z, (int) 2, 0.1, 0.1, 0.1, 1);
				}
			}
		}
	}
}
