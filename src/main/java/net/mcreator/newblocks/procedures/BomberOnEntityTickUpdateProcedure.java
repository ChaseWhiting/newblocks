package net.mcreator.newblocks.procedures;

import net.minecraft.world.World;
import net.minecraft.util.Hand;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.item.GrenadeItem;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class BomberOnEntityTickUpdateProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure BomberOnEntityTickUpdate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		boolean sz = false;
		if (((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null) instanceof LivingEntity) {
			if (Math.random() < 0.7) {
				if (Math.random() < 0.7) {
					if (Math.random() < 0.7) {
						if (Math.random() < 0.7) {
							if (Math.random() < 0.7) {
								if (Math.random() < 0.7) {
									if (Math.random() < 0.7) {
										if (Math.random() < 0.7) {
											if (Math.random() < 0.7) {
												{
													Entity _shootFrom = entity;
													World projectileLevel = _shootFrom.world;
													if (!projectileLevel.isRemote()) {
														ProjectileEntity _entityToSpawn = new Object() {
															public ProjectileEntity getArrow(World world, Entity shooter, float damage,
																	int knockback) {
																AbstractArrowEntity entityToSpawn = new GrenadeItem.ArrowCustomEntity(
																		GrenadeItem.arrow, world);
																entityToSpawn.setShooter(shooter);
																entityToSpawn.setDamage(damage);
																entityToSpawn.setKnockbackStrength(knockback);
																entityToSpawn.setSilent(true);

																return entityToSpawn;
															}
														}.getArrow(projectileLevel, entity, 4, 0);
														_entityToSpawn.setPosition(_shootFrom.getPosX(), _shootFrom.getPosYEye() - 0.1,
																_shootFrom.getPosZ());
														_entityToSpawn.shoot(_shootFrom.getLookVec().x, _shootFrom.getLookVec().y,
																_shootFrom.getLookVec().z, (float) 0.5, 0);
														projectileLevel.addEntity(_entityToSpawn);
													}
												}
												if (entity instanceof LivingEntity) {
													((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
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
