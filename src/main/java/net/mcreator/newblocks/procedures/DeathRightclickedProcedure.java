package net.mcreator.newblocks.procedures;

import net.minecraft.world.World;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.FireballEntity;
import net.minecraft.entity.projectile.DamagingProjectileEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class DeathRightclickedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure DeathRightclicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _shootFrom = entity;
			World projectileLevel = _shootFrom.world;
			if (!projectileLevel.isRemote()) {
				ProjectileEntity _entityToSpawn = new Object() {
					public ProjectileEntity getFireball(World world, Entity shooter) {
						DamagingProjectileEntity entityToSpawn = new FireballEntity(EntityType.FIREBALL, world);
						entityToSpawn.setShooter(shooter);
						return entityToSpawn;
					}
				}.getFireball(projectileLevel, entity);
				_entityToSpawn.setPosition(_shootFrom.getPosX(), _shootFrom.getPosYEye() - 0.1, _shootFrom.getPosZ());
				_entityToSpawn.shoot(_shootFrom.getLookVec().x, _shootFrom.getLookVec().y, _shootFrom.getLookVec().z, 3, 0);
				projectileLevel.addEntity(_entityToSpawn);
			}
		}
	}
}
