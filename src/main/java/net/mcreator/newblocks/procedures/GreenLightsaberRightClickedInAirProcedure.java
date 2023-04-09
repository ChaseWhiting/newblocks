package net.mcreator.newblocks.procedures;

import net.minecraft.world.World;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.item.GreenLightsaberThrowItem;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class GreenLightsaberRightClickedInAirProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure GreenLightsaberRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _shootFrom = entity;
			World projectileLevel = _shootFrom.world;
			if (!projectileLevel.isRemote()) {
				ProjectileEntity _entityToSpawn = new Object() {
					public ProjectileEntity getArrow(World world, Entity shooter, float damage, int knockback) {
						AbstractArrowEntity entityToSpawn = new GreenLightsaberThrowItem.ArrowCustomEntity(GreenLightsaberThrowItem.arrow, world);
						entityToSpawn.setShooter(shooter);
						entityToSpawn.setDamage(damage);
						entityToSpawn.setKnockbackStrength(knockback);
						entityToSpawn.setSilent(true);

						return entityToSpawn;
					}
				}.getArrow(projectileLevel, entity, 3, (int) 0.2);
				_entityToSpawn.setPosition(_shootFrom.getPosX(), _shootFrom.getPosYEye() - 0.1, _shootFrom.getPosZ());
				_entityToSpawn.shoot(_shootFrom.getLookVec().x, _shootFrom.getLookVec().y, _shootFrom.getLookVec().z, 1, 0);
				projectileLevel.addEntity(_entityToSpawn);
			}
		}
	}
}
