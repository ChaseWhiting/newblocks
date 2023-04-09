package net.mcreator.newblocks.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.DamageSource;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.entity.ZhoemnixEntity;
import net.mcreator.newblocks.entity.PhoenixBabyEntity;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class PhoenixOnEntityTickUpdateProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure PhoenixOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure PhoenixOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure PhoenixOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure PhoenixOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure PhoenixOnEntityTickUpdate!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (entity.isBeingRidden()) {
			if (entity.isInLava()) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 40, (int) 0, (false), (false)));
			} else {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 40, (int) 2, (false), (false)));
			}
		}
		if (entity.isInLava()) {
			entity.setMotion((entity.getMotion().getX()), (entity.getMotion().getY() + 0.03), (entity.getMotion().getZ()));
		}
		if ((entity instanceof LivingEntity) ? ((LivingEntity) entity).isChild() : false) {
			if (world instanceof ServerWorld) {
				Entity entityToSpawn = new PhoenixBabyEntity.CustomEntity(PhoenixBabyEntity.entity, (World) world);
				entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof MobEntity)
					((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
							SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
				world.addEntity(entityToSpawn);
			}
			if (!entity.world.isRemote())
				entity.remove();
		}
		if (entity.isInWaterRainOrBubbleColumn()) {
			if (Math.random() < 0.7) {
				if (Math.random() < 0.7) {
					if (Math.random() < 0.7) {
						entity.attackEntityFrom(DamageSource.DROWN, (float) 2);
					}
				}
			}
		}
		if ((entity.world.getDimensionKey()) == (World.THE_NETHER)) {
			entity.getPersistentData().putDouble("ticksBeforeZombification", 0);
		} else {
			entity.getPersistentData().putDouble("ticksBeforeZombification", (entity.getPersistentData().getDouble("ticksBeforeZombification") + 1));
			if (entity.getPersistentData().getDouble("ticksBeforeZombification") > 700) {
				if (entity.isAlive()) {
					entity.getPersistentData().putDouble("ticksBeforeZombification", 0);
					if (!entity.world.isRemote())
						entity.remove();
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new ZhoemnixEntity.CustomEntity(ZhoemnixEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
						entityToSpawn.setRenderYawOffset((float) 0);
						entityToSpawn.setRotationYawHead((float) 0);
						entityToSpawn.setMotion(0, 0, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
				}
			}
		}
		if ((world
				.getBlockState(
						new BlockPos(
								entity.world
										.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y
														* 5, entity.getLook(1f).z * 5),
												RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity))
										.getPos().getX(),
								entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getLook(1f).x * 10, entity.getLook(1f).y * 10,
												entity.getLook(1f).z * 10),
										RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity)).getPos().getY() - 1,
								entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5, entity.getLook(1f).z * 5),
										RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity)).getPos().getZ())))
				.getMaterial() == net.minecraft.block.material.Material.LAVA
				|| (world
						.getBlockState(
								new BlockPos(
										entity.world.rayTraceBlocks(new RayTraceContext(
												entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
														entity.getLook(1f).z * 5),
												RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity)).getPos().getX(),
										entity.world
												.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
														entity.getEyePosition(1f).add(entity.getLook(1f).x * 10, entity.getLook(1f).y * 10,
																entity.getLook(1f).z * 10),
														RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity))
												.getPos().getY() - 2,
										entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
														entity.getLook(1f).z * 5),
												RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity)).getPos().getZ())))
						.getMaterial() == net.minecraft.block.material.Material.LAVA
				|| (world
						.getBlockState(
								new BlockPos(
										entity.world.rayTraceBlocks(new RayTraceContext(
												entity.getEyePosition(1f), entity
														.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
																entity.getLook(1f).z * 5),
												RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity)).getPos().getX(),
										entity.world
												.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
														entity.getEyePosition(1f).add(entity.getLook(1f).x * 10, entity.getLook(1f).y * 10,
																entity.getLook(1f).z * 10),
														RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity))
												.getPos().getY() - 3,
										entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
														entity.getLook(1f).z * 5),
												RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity)).getPos().getZ())))
						.getMaterial() == net.minecraft.block.material.Material.LAVA
				|| (world
						.getBlockState(
								new BlockPos(
										entity.world.rayTraceBlocks(new RayTraceContext(
												entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
														entity.getLook(1f).z * 5),
												RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity)).getPos().getX(),
										entity.world
												.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
														entity.getEyePosition(1f).add(entity.getLook(1f).x * 10, entity.getLook(1f).y * 10,
																entity.getLook(1f).z * 10),
														RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity))
												.getPos().getY() - 4,
										entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
														entity.getLook(1f).z * 5),
												RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity)).getPos().getZ())))
						.getMaterial() == net.minecraft.block.material.Material.LAVA
				|| (world
						.getBlockState(
								new BlockPos(
										entity.world.rayTraceBlocks(new RayTraceContext(
												entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
														entity.getLook(1f).z * 5),
												RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity)).getPos().getX(),
										entity.world
												.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
														entity.getEyePosition(1f).add(entity.getLook(1f).x * 10, entity.getLook(1f).y * 10,
																entity.getLook(1f).z * 10),
														RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity))
												.getPos().getY() - 5,
										entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
														entity.getLook(1f).z * 5),
												RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity)).getPos().getZ())))
						.getMaterial() == net.minecraft.block.material.Material.LAVA
				|| (world
						.getBlockState(
								new BlockPos(
										entity.world.rayTraceBlocks(new RayTraceContext(
												entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
														entity.getLook(1f).z * 5),
												RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity)).getPos().getX(),
										entity.world
												.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
														entity.getEyePosition(1f).add(entity.getLook(1f).x * 10, entity.getLook(1f).y * 10,
																entity.getLook(1f).z * 10),
														RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity))
												.getPos().getY() - 6,
										entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
														entity.getLook(1f).z * 5),
												RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.ANY, entity)).getPos().getZ())))
						.getMaterial() == net.minecraft.block.material.Material.LAVA) {
			if (entity.isBeingRidden()) {
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
														entity.setMotion((0 - Math.sin(entity.rotationYaw * (Math.PI / 180))), 0.09,
																Math.cos(entity.rotationYaw * (Math.PI / 180)));
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
																			entity.setMotion((0 - Math.sin(entity.rotationYaw * (Math.PI / 180))),
																					0.09, Math.cos(entity.rotationYaw * (Math.PI / 180)));
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
