package net.mcreator.newblocks.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.newblocks.entity.AntEntity;
import net.mcreator.newblocks.block.AntMoundBlockBlock;
import net.mcreator.newblocks.block.AntDirtBlockBlock;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class AntMoundBlockUpdateTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure AntMoundBlockUpdateTick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure AntMoundBlockUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure AntMoundBlockUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure AntMoundBlockUpdateTick!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (Math.random() < 0.1) {
			if (Math.random() < 0.4) {
				if (world.isAirBlock(new BlockPos(x, y + 1, z))) {
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new AntEntity.CustomEntity(AntEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles((x + 0.5), (y + 1), (z + 0.5), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
				} else if (world.isAirBlock(new BlockPos(x + 1, y, z))) {
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new AntEntity.CustomEntity(AntEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles((x + 1 + 0.5), y, (z + 0.5), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
				} else if (world.isAirBlock(new BlockPos(x - 1, y, z))) {
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new AntEntity.CustomEntity(AntEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles((x - (1 - 0.5)), y, (z - 0.5), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
				} else if (world.isAirBlock(new BlockPos(x, y - 1, z))) {
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new AntEntity.CustomEntity(AntEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles((x + 0.5), (y - 1), (z + 0.5), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
				} else if (world.isAirBlock(new BlockPos(x, y, z + 1))) {
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new AntEntity.CustomEntity(AntEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles((x + 0.5), y, (z + 1), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
				} else if (world.isAirBlock(new BlockPos(x, y, z - 1))) {
					if (world instanceof ServerWorld) {
						Entity entityToSpawn = new AntEntity.CustomEntity(AntEntity.entity, (World) world);
						entityToSpawn.setLocationAndAngles((x - 0.5), y, (z - 1.5), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof MobEntity)
							((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
									world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
									(CompoundNBT) null);
						world.addEntity(entityToSpawn);
					}
				}
			}
		}
		if (Math.random() < 0.3) {
			if (Math.random() < 0.1) {
				if (BlockTags.getCollection().getTagByID(new ResourceLocation("minecraft:base_stone_overworld"))
						.contains((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock())) {
					if (Math.random() < 0.3) {
						if (Math.random() < 0.3) {
							world.setBlockState(new BlockPos(x + 1, y, z), Blocks.AIR.getDefaultState(), 3);
						} else if (Math.random() < 0.3) {
							world.setBlockState(new BlockPos(x + 1, y, z), AntMoundBlockBlock.block.getDefaultState(), 3);
						}
					}
				}
			}
			if (Math.random() < 0.1) {
				if (BlockTags.getCollection().getTagByID(new ResourceLocation("minecraft:base_stone_overworld"))
						.contains((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock())) {
					if (Math.random() < 0.3) {
						if (Math.random() < 0.3) {
							world.setBlockState(new BlockPos(x - 1, y, z), Blocks.AIR.getDefaultState(), 3);
						} else if (Math.random() < 0.3) {
							world.setBlockState(new BlockPos(x - 1, y, z), AntMoundBlockBlock.block.getDefaultState(), 3);
						}
					}
				}
			}
			if (Math.random() < 0.1) {
				if (BlockTags.getCollection().getTagByID(new ResourceLocation("minecraft:base_stone_overworld"))
						.contains((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock())) {
					if (Math.random() < 0.3) {
						if (Math.random() < 0.3) {
							world.setBlockState(new BlockPos(x, y, z + 1), Blocks.AIR.getDefaultState(), 3);
						} else if (Math.random() < 0.3) {
							world.setBlockState(new BlockPos(x, y, z + 1), AntMoundBlockBlock.block.getDefaultState(), 3);
						}
					}
				}
			}
			if (Math.random() < 0.1) {
				if (BlockTags.getCollection().getTagByID(new ResourceLocation("minecraft:base_stone_overworld"))
						.contains((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock())) {
					if (Math.random() < 0.3) {
						if (Math.random() < 0.3) {
							world.setBlockState(new BlockPos(x, y, z - 1), Blocks.AIR.getDefaultState(), 3);
						} else if (Math.random() < 0.3) {
							world.setBlockState(new BlockPos(x, y, z - 1), AntMoundBlockBlock.block.getDefaultState(), 3);
						}
					}
				}
			}
			if (Math.random() < 0.1) {
				if (BlockTags.getCollection().getTagByID(new ResourceLocation("minecraft:base_stone_overworld"))
						.contains((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock())) {
					if (Math.random() < 0.3) {
						if (Math.random() < 0.3) {
							world.setBlockState(new BlockPos(x, y - 1, z), Blocks.AIR.getDefaultState(), 3);
						} else if (Math.random() < 0.3) {
							world.setBlockState(new BlockPos(x, y - 1, z), AntMoundBlockBlock.block.getDefaultState(), 3);
						}
					}
				}
			}
			if (Math.random() < 0.1) {
				if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.DIRT) {
					if (Math.random() < 0.3) {
						if (Math.random() < 0.3) {
							world.setBlockState(new BlockPos(x, y + 1, z), Blocks.COARSE_DIRT.getDefaultState(), 3);
						} else if (Math.random() < 0.3) {
							world.setBlockState(new BlockPos(x, y + 1, z), AntDirtBlockBlock.block.getDefaultState(), 3);
						}
					}
				}
			}
		}
	}
}
