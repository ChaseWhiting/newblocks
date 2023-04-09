package net.mcreator.newblocks.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.entity.BabyGoatEntity;
import net.mcreator.newblocks.NewBlocksModVariables;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class GoatOnEntityTickUpdateProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure GoatOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure GoatOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure GoatOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure GoatOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure GoatOnEntityTickUpdate!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (Math.random() < 0.7) {
			if (Math.random() < 0.7 + NewBlocksModVariables.WorldVariables.get(world).goatJumpChanceModifier) {
				if (Math.random() < 0.7 + NewBlocksModVariables.WorldVariables.get(world).goatJumpChanceModifier) {
					if (Math.random() < 0.7 + NewBlocksModVariables.WorldVariables.get(world).goatJumpChanceModifier) {
						if (Math.random() < 0.7 + NewBlocksModVariables.WorldVariables.get(world).goatJumpChanceModifier) {
							if (Math.random() < 0.7) {
								if (Math.random() < 0.7 + NewBlocksModVariables.WorldVariables.get(world).goatJumpChanceModifier) {
									if (Math.random() < 0.7) {
										if (Math.random() < 0.7) {
											if (Math.random() < 0.7) {
												if (Math.random() < 0.7 + NewBlocksModVariables.WorldVariables.get(world).goatJumpChanceModifier) {
													if (Math.random() < 0.7) {
														if (Math.random() < 0.7
																+ NewBlocksModVariables.WorldVariables.get(world).goatJumpChanceModifier) {
															if (Math.random() < 0.7) {
																if (Math.random() < 0.4) {
																	if (Math.random() < 0.3) {
																		if (Math.random() < 0.7) {
																			if (Math.random() < 0.7) {
																				if (Math.random() < 0.7 + NewBlocksModVariables.WorldVariables
																						.get(world).goatJumpChanceModifier) {
																					if (Math.random() < 0.7) {
																						if (Math.random() < 0.7) {
																							if (Math.random() < 0.7
																									+ NewBlocksModVariables.WorldVariables
																											.get(world).goatJumpChanceModifier) {
																								if (Math.random() < 0.7) {
																									if (Math.random() < 0.7
																											+ NewBlocksModVariables.WorldVariables
																													.get(world).goatJumpChanceModifier) {
																										if (Math.random() < 0.7) {
																											entity.setMotion(
																													(0 - Math.sin(entity.rotationYaw
																															* (Math.PI / 180))),
																													0.62, Math.cos(entity.rotationYaw
																															* (Math.PI / 180)));
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
									}
								}
							}
						}
					}
				}
			}
		}
		if ((entity instanceof LivingEntity) ? ((LivingEntity) entity).isChild() : false) {
			if (!entity.world.isRemote())
				entity.remove();
			if (world instanceof ServerWorld) {
				Entity entityToSpawn = new BabyGoatEntity.CustomEntity(BabyGoatEntity.entity, (World) world);
				entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
				entityToSpawn.setRenderYawOffset((float) 0);
				entityToSpawn.setRotationYawHead((float) 0);
				entityToSpawn.setMotion(0, 0, 0);
				if (entityToSpawn instanceof MobEntity)
					((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
							SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
				world.addEntity(entityToSpawn);
			}
		}
	}
}
