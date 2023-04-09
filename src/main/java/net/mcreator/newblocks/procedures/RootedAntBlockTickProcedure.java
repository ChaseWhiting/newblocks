package net.mcreator.newblocks.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.newblocks.block.AntDirtBlockBlock;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class RootedAntBlockTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure RootedAntBlockTick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure RootedAntBlockTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure RootedAntBlockTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure RootedAntBlockTick!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (Math.random() < 0.3) {
			if (Math.random() < 0.1) {
				if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.DIRT
						|| (world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.GRASS_BLOCK) {
					if (Math.random() < 0.3) {
						if (Math.random() < 0.3) {
							world.setBlockState(new BlockPos(x + 1, y, z), AntDirtBlockBlock.block.getDefaultState(), 3);
						} else if (Math.random() < 0.3) {
							world.setBlockState(new BlockPos(x + 1, y, z), Blocks.COARSE_DIRT.getDefaultState(), 3);
						}
					}
				}
			}
			if (Math.random() < 0.1) {
				if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.DIRT
						|| (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.GRASS_BLOCK) {
					if (Math.random() < 0.3) {
						if (Math.random() < 0.3) {
							world.setBlockState(new BlockPos(x - 1, y, z), AntDirtBlockBlock.block.getDefaultState(), 3);
						} else if (Math.random() < 0.3) {
							world.setBlockState(new BlockPos(x - 1, y, z), Blocks.COARSE_DIRT.getDefaultState(), 3);
						}
					}
				}
			}
			if (Math.random() < 0.1) {
				if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.DIRT
						|| (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.GRASS_BLOCK) {
					if (Math.random() < 0.3) {
						if (Math.random() < 0.3) {
							world.setBlockState(new BlockPos(x, y, z + 1), AntDirtBlockBlock.block.getDefaultState(), 3);
						} else if (Math.random() < 0.3) {
							world.setBlockState(new BlockPos(x, y, z + 1), Blocks.COARSE_DIRT.getDefaultState(), 3);
						}
					}
				}
			}
			if (Math.random() < 0.1) {
				if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.DIRT
						|| (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.GRASS_BLOCK) {
					if (Math.random() < 0.3) {
						if (Math.random() < 0.3) {
							world.setBlockState(new BlockPos(x, y, z - 1), AntDirtBlockBlock.block.getDefaultState(), 3);
						} else if (Math.random() < 0.3) {
							world.setBlockState(new BlockPos(x, y, z - 1), Blocks.COARSE_DIRT.getDefaultState(), 3);
						}
					}
				}
			}
		}
	}
}
