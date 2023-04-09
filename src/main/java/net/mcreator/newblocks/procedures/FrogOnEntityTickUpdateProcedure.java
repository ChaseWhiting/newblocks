package net.mcreator.newblocks.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.newblocks.entity.TadpoleEntity;
import net.mcreator.newblocks.block.FrogEggBlock;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Random;
import java.util.Map;

public class FrogOnEntityTickUpdateProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure FrogOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure FrogOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure FrogOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure FrogOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure FrogOnEntityTickUpdate!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (entity.getPersistentData().getBoolean("beingAttacked") == true) {
			if (Math.random() < 0.6) {
				if (Math.random() < 0.5) {
					if (Math.random() < 0.6) {
						if (entity.isOnGround() || entity.isInWater()) {
							if (Math.random() < 0.3) {
								entity.setMotion((entity.getMotion().getX()), (entity.getMotion().getY() + 0.4), (entity.getMotion().getZ()));
							} else if (Math.random() < 0.3) {
								entity.setMotion((entity.getMotion().getX()), (entity.getMotion().getY() + 0.6), (entity.getMotion().getZ()));
							} else if (Math.random() < 0.2) {
								entity.setMotion((entity.getMotion().getX()), (entity.getMotion().getY() + 0.55), (entity.getMotion().getZ()));
							} else if (Math.random() < 0.7) {
								entity.setMotion((0 - Math.sin(entity.rotationYaw * (Math.PI / 180))), 0.3,
										Math.cos(entity.rotationYaw * (Math.PI / 180)));
							} else if (Math.random() < 0.8) {
								entity.setMotion((0 - Math.sin(entity.rotationYaw * (Math.PI / 180))), 0.4,
										Math.cos(entity.rotationYaw * (Math.PI / 180)));
							}
						}
					}
				}
			}
		} else {
			if (Math.random() < 0.2) {
				if (Math.random() < 0.3) {
					if (Math.random() < 0.3) {
						if (Math.random() < 0.2) {
							entity.setMotion((entity.getMotion().getX()), (entity.getMotion().getY() + 0.4), (entity.getMotion().getZ()));
						} else if (Math.random() < 0.1) {
							entity.setMotion((entity.getMotion().getX()), (entity.getMotion().getY() + 0.6), (entity.getMotion().getZ()));
						} else if (Math.random() < 0.2) {
							entity.setMotion((entity.getMotion().getX()), (entity.getMotion().getY() + 0.55), (entity.getMotion().getZ()));
						} else if (Math.random() < 0.1) {
							entity.setMotion((0 - Math.sin(entity.rotationYaw * (Math.PI / 180))), 0.3,
									Math.cos(entity.rotationYaw * (Math.PI / 180)));
						} else if (Math.random() < 0.2) {
							entity.setMotion((0 - Math.sin(entity.rotationYaw * (Math.PI / 180))), 0.4,
									Math.cos(entity.rotationYaw * (Math.PI / 180)));
						}
					}
				}
			}
		}
		if ((entity instanceof LivingEntity) ? ((LivingEntity) entity).isChild() : false) {
			if (entity.isAlive()) {
				if (entity.isInWater()) {
					if (!entity.world.isRemote())
						entity.remove();
					System.out.println("Attempted to place a frog egg. Did it work?");
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos(x, y, z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.turtle.lay_egg")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.turtle.lay_egg")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					world.setBlockState(new BlockPos(x, y + 1, z), FrogEggBlock.block.getDefaultState(), 3);
				} else {
					sx = (-3);
					found = (false);
					for (int index0 = 0; index0 < (int) (5); index0++) {
						sy = (-3);
						for (int index1 = 0; index1 < (int) (5); index1++) {
							sz = (-3);
							for (int index2 = 0; index2 < (int) (5); index2++) {
								if ((world.getBlockState(new BlockPos(x + sx, y + sy, z + sz))).getBlock() == Blocks.WATER) {
									found = (true);
								}
								sz = (sz + 1);
							}
							sy = (sy + 1);
						}
						sx = (sx + 1);
					}
					if (found == true) {
						if (!entity.world.isRemote())
							entity.remove();
						for (int index3 = 0; index3 < (int) (new Random().nextInt(3 + 1)); index3++) {
							if (world instanceof ServerWorld) {
								Entity entityToSpawn = new TadpoleEntity.CustomEntity(TadpoleEntity.entity, (World) world);
								entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
								entityToSpawn.setRenderYawOffset((float) 0);
								entityToSpawn.setRotationYawHead((float) 0);
								if (entityToSpawn instanceof MobEntity)
									((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
											world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
											(ILivingEntityData) null, (CompoundNBT) null);
								world.addEntity(entityToSpawn);
							}
						}
					} else {
						if (!entity.world.isRemote())
							entity.remove();
					}
				}
			}
		}
		if (entity.getMotion().getY() < -0.8 && entity.getMotion().getY() > -1.4) {
			entity.fallDistance = (float) (4);
		} else if (entity.getMotion().getY() < -1.4 && entity.getMotion().getY() > -1.8) {
			entity.fallDistance = (float) (6.2);
		}
	}
}
