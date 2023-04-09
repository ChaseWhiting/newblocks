package net.mcreator.newblocks.procedures;

import net.minecraft.world.World;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class RobotSearcherOnEntityTickUpdateProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure RobotSearcherOnEntityTickUpdate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null) instanceof LivingEntity) {
			if (Math.random() < 0.1) {
				if (Math.random() < 0.4) {
					{
						Entity _shootFrom = entity;
						World projectileLevel = _shootFrom.world;
						if (!projectileLevel.isRemote()) {
							ProjectileEntity _entityToSpawn = new Object() {
								public ProjectileEntity getArrow(World world, Entity shooter, float damage, int knockback) {
									AbstractArrowEntity entityToSpawn = new ArrowEntity(EntityType.ARROW, world);
									entityToSpawn.setShooter(shooter);
									entityToSpawn.setDamage(damage);
									entityToSpawn.setKnockbackStrength(knockback);

									return entityToSpawn;
								}
							}.getArrow(projectileLevel, entity, 1, (int) 0.12);
							_entityToSpawn.setPosition(_shootFrom.getPosX(), _shootFrom.getPosYEye() - 0.1, _shootFrom.getPosZ());
							_entityToSpawn.shoot(_shootFrom.getLookVec().x, _shootFrom.getLookVec().y, _shootFrom.getLookVec().z, (float) 0.9, 0);
							projectileLevel.addEntity(_entityToSpawn);
						}
					}
				}
			}
		}
	}
}
