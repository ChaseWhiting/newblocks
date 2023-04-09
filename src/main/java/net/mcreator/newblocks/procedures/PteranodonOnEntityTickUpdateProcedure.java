package net.mcreator.newblocks.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.entity.PteranodonFlyingEntity;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class PteranodonOnEntityTickUpdateProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure PteranodonOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure PteranodonOnEntityTickUpdate!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null) instanceof LivingEntity) {
			if (entity.isOnGround()) {
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
															entity.setMotion(0, (entity.getMotion().getY() + 0.8), 0);
															new Object() {
																private int ticks = 0;
																private float waitTicks;
																private IWorld world;

																public void start(IWorld world, int waitTicks) {
																	this.waitTicks = waitTicks;
																	MinecraftForge.EVENT_BUS.register(this);
																	this.world = world;
																}

																@SubscribeEvent
																public void tick(TickEvent.ServerTickEvent event) {
																	if (event.phase == TickEvent.Phase.END) {
																		this.ticks += 1;
																		if (this.ticks >= this.waitTicks)
																			run();
																	}
																}

																private void run() {
																	if (world instanceof ServerWorld) {
																		Entity entityToSpawn = new PteranodonFlyingEntity.CustomEntity(
																				PteranodonFlyingEntity.entity, (World) world);
																		entityToSpawn.setLocationAndAngles((entity.getPosX()), (entity.getPosY()),
																				(entity.getPosZ()), (float) 0, (float) 0);
																		entityToSpawn.setRenderYawOffset((float) 0);
																		entityToSpawn.setRotationYawHead((float) 0);
																		if (entityToSpawn instanceof MobEntity)
																			((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
																					world.getDifficultyForLocation(entityToSpawn.getPosition()),
																					SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
																					(CompoundNBT) null);
																		world.addEntity(entityToSpawn);
																	}
																	if (!entity.world.isRemote())
																		entity.remove();
																	MinecraftForge.EVENT_BUS.unregister(this);
																}
															}.start(world, (int) 15);
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
		} else {
			if (entity.isOnGround()) {
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
																	if (Math.random() < 0.7) {
																		if (Math.random() < 0.7) {
																			if (Math.random() < 0.7) {
																				if (Math.random() < 0.7) {
																					if (Math.random() < 0.7) {
																						entity.setMotion(0, (entity.getMotion().getY() + 0.8), 0);
																						new Object() {
																							private int ticks = 0;
																							private float waitTicks;
																							private IWorld world;

																							public void start(IWorld world, int waitTicks) {
																								this.waitTicks = waitTicks;
																								MinecraftForge.EVENT_BUS.register(this);
																								this.world = world;
																							}

																							@SubscribeEvent
																							public void tick(TickEvent.ServerTickEvent event) {
																								if (event.phase == TickEvent.Phase.END) {
																									this.ticks += 1;
																									if (this.ticks >= this.waitTicks)
																										run();
																								}
																							}

																							private void run() {
																								if (world instanceof ServerWorld) {
																									Entity entityToSpawn = new PteranodonFlyingEntity.CustomEntity(
																											PteranodonFlyingEntity.entity,
																											(World) world);
																									entityToSpawn.setLocationAndAngles(
																											(entity.getPosX()), (entity.getPosY()),
																											(entity.getPosZ()), (float) 0, (float) 0);
																									entityToSpawn.setRenderYawOffset((float) 0);
																									entityToSpawn.setRotationYawHead((float) 0);
																									if (entityToSpawn instanceof MobEntity)
																										((MobEntity) entityToSpawn).onInitialSpawn(
																												(ServerWorld) world,
																												world.getDifficultyForLocation(
																														entityToSpawn.getPosition()),
																												SpawnReason.MOB_SUMMONED,
																												(ILivingEntityData) null,
																												(CompoundNBT) null);
																									world.addEntity(entityToSpawn);
																								}
																								if (!entity.world.isRemote())
																									entity.remove();
																								MinecraftForge.EVENT_BUS.unregister(this);
																							}
																						}.start(world, (int) 15);
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
