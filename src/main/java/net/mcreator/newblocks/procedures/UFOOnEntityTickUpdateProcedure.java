package net.mcreator.newblocks.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.entity.UFOLIGHTEntity;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class UFOOnEntityTickUpdateProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure UFOOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure UFOOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure UFOOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure UFOOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure UFOOnEntityTickUpdate!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (entity.getPosY() < world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) + 8) {
			entity.setMotion((entity.getMotion().getX()), 0.3, (entity.getMotion().getZ()));
		}
		if (entity.getPosY() > world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) + 11) {
			entity.setMotion((entity.getMotion().getX()), (-0.22), (entity.getMotion().getZ()));
		}
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
												if (Math.random() < 0.7) {
													if (Math.random() < 0.7) {
														if (Math.random() < 0.7) {
															if (Math.random() < 0.7) {
																if (world instanceof ServerWorld) {
																	Entity entityToSpawn = new UFOLIGHTEntity.CustomEntity(UFOLIGHTEntity.entity,
																			(World) world);
																	entityToSpawn.setLocationAndAngles(x, (y - 10), z, (float) 0, (float) 0);
																	entityToSpawn.setRenderYawOffset((float) 0);
																	entityToSpawn.setRotationYawHead((float) 0);
																	entityToSpawn.setMotion(0, 0, 0);
																	if (entityToSpawn instanceof MobEntity)
																		((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
																				world.getDifficultyForLocation(entityToSpawn.getPosition()),
																				SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
																				(CompoundNBT) null);
																	world.addEntity(entityToSpawn);
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
			}
		}
	}
}
