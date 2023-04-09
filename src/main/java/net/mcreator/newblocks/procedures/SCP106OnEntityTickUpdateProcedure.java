package net.mcreator.newblocks.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.block.CorrodedBlockBlock;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;
import java.util.Collections;

public class SCP106OnEntityTickUpdateProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure SCP106OnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure SCP106OnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure SCP106OnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure SCP106OnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure SCP106OnEntityTickUpdate!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null) instanceof PlayerEntity) {
			if (((((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null) instanceof LivingEntity)
					? ((LivingEntity) ((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null)).getHealth()
					: -1) > 5) {
				if (entity.getPersistentData().getDouble("ticksTillTeleport") == 0) {
					world.setBlockState(
							new BlockPos(((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null).getPosX(),
									((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null).getPosY() - 1,
									((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null).getPosZ()),
							CorrodedBlockBlock.block.getDefaultState(), 3);
					{
						Entity _ent = entity;
						_ent.setPositionAndUpdate((((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null).getPosX()),
								(((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null).getPosY() - 1),
								(((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null).getPosZ()));
						if (_ent instanceof ServerPlayerEntity) {
							((ServerPlayerEntity) _ent).connection.setPlayerLocation(
									(((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null).getPosX()),
									(((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null).getPosY() - 1),
									(((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null).getPosZ()), _ent.rotationYaw,
									_ent.rotationPitch, Collections.emptySet());
						}
					}
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
							{
								Entity _ent = entity;
								_ent.setPositionAndUpdate((((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null).getPosX()),
										(((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null).getPosY()),
										(((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null).getPosZ()));
								if (_ent instanceof ServerPlayerEntity) {
									((ServerPlayerEntity) _ent).connection.setPlayerLocation(
											(((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null).getPosX()),
											(((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null).getPosY()),
											(((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null).getPosZ()),
											_ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
								}
							}
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, (int) 10);
					entity.getPersistentData().putDouble("ticksTillTeleport", 300);
				} else {
					entity.getPersistentData().putDouble("ticksTillTeleport", (entity.getPersistentData().getDouble("ticksTillTeleport") - 1));
				}
			}
		}
		if (Math.random() < 0.7) {
			if (Math.random() < 0.7) {
				if (Math.random() < 0.7) {
					if (Math.random() < 0.7) {
						if (Math.random() < 0.7) {
							if (Math.random() < 0.7) {
								if (Math.random() < 0.7) {
									if (Math.random() < 0.7) {
										world.setBlockState(new BlockPos(x + 1, y - 1, z), CorrodedBlockBlock.block.getDefaultState(), 3);
									} else if (Math.random() < 0.7) {
										world.setBlockState(new BlockPos(x - 1, y - 1, z), CorrodedBlockBlock.block.getDefaultState(), 3);
									} else if (Math.random() < 0.7) {
										world.setBlockState(new BlockPos(x, y - 1, z + 1), CorrodedBlockBlock.block.getDefaultState(), 3);
									} else if (Math.random() < 0.7) {
										world.setBlockState(new BlockPos(x, y - 1, z - 1), CorrodedBlockBlock.block.getDefaultState(), 3);
									}
								}
							}
						}
					}
				}
			}
		}
		if (Math.random() < 0.7) {
			if (Math.random() < 0.7) {
				if (Math.random() < 0.7) {
					if (Math.random() < 0.7) {
						if (Math.random() < 0.7) {
							if (Math.random() < 0.7) {
								if (Math.random() < 0.7) {
									if (Math.random() < 0.7) {
										if (world
												.getBlockState(
														new BlockPos(
																entity.world
																		.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																				entity.getEyePosition(1f).add(entity.getLook(1f).x * 5,
																						entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
																				RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE,
																				entity))
																		.getPos().getX(),
																entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																		entity.getEyePosition(1f).add(entity.getLook(1f).x * 5,
																				entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
																		RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity))
																		.getPos().getY(),
																entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																		entity.getEyePosition(1f).add(entity.getLook(1f).x * 5,
																				entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
																		RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity))
																		.getPos().getZ()))
												.isSolid()) {
											world.setBlockState(
													new BlockPos(
															entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
																			entity.getLook(1f).z * 5),
																	RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity))
																	.getPos().getX(),
															entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
																			entity.getLook(1f).z * 5),
																	RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity))
																	.getPos().getY(),
															entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
																			entity.getLook(1f).z * 5),
																	RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity))
																	.getPos().getZ()),
													CorrodedBlockBlock.block.getDefaultState(), 3);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if (Math.random() < 0.7) {
			if (Math.random() < 0.7) {
				if (Math.random() < 0.7) {
					if (Math.random() < 0.7) {
						if (Math.random() < 0.7) {
							if (Math.random() < 0.7) {
								if (Math.random() < 0.7) {
									if (Math.random() < 0.7) {
										if (world
												.getBlockState(
														new BlockPos(
																entity.world
																		.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																				entity.getEyePosition(1f).add(entity.getLook(1f).x * 5,
																						entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
																				RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE,
																				entity))
																		.getPos().getX(),
																entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																		entity.getEyePosition(1f).add(entity.getLook(1f).x * 5,
																				entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
																		RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity))
																		.getPos().getY() - 1,
																entity.world
																		.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																				entity.getEyePosition(1f).add(entity.getLook(1f).x * 5,
																						entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
																				RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE,
																				entity))
																		.getPos().getZ()))
												.isSolid()) {
											world.setBlockState(
													new BlockPos(
															entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
																			entity.getLook(1f).z * 5),
																	RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity))
																	.getPos().getX(),
															entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
																			entity.getLook(1f).z * 5),
																	RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity))
																	.getPos().getY() - 1,
															entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
																			entity.getLook(1f).z * 5),
																	RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity))
																	.getPos().getZ()),
													CorrodedBlockBlock.block.getDefaultState(), 3);
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
