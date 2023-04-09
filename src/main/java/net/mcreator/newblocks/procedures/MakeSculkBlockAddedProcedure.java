package net.mcreator.newblocks.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;

import net.mcreator.newblocks.block.SkulkBlockBlock;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class MakeSculkBlockAddedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure MakeSculkBlockAdded!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure MakeSculkBlockAdded!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure MakeSculkBlockAdded!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure MakeSculkBlockAdded!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		world.setBlockState(new BlockPos(x, y, z), SkulkBlockBlock.block.getDefaultState(), 3);
		if (world.getBlockState(new BlockPos(x + 1, y, z)).isSolid()) {
			if (Math.random() < 0.4) {
				world.setBlockState(new BlockPos(x + 1, y, z), SkulkBlockBlock.block.getDefaultState(), 3);
				if (world.getBlockState(new BlockPos(x + 2, y, z)).isSolid()) {
					if (Math.random() < 0.4) {
						world.setBlockState(new BlockPos(x + 2, y, z), SkulkBlockBlock.block.getDefaultState(), 3);
						if (world.getBlockState(new BlockPos(x + 3, y, z)).isSolid()) {
							if (Math.random() < 0.4) {
								world.setBlockState(new BlockPos(x + 3, y, z), SkulkBlockBlock.block.getDefaultState(), 3);
							}
						}
					}
				}
			}
		}
		if (world.getBlockState(new BlockPos(x - 1, y, z)).isSolid()) {
			if (Math.random() < 0.4) {
				world.setBlockState(new BlockPos(x - 1, y, z), SkulkBlockBlock.block.getDefaultState(), 3);
				if (world.getBlockState(new BlockPos(x - 2, y, z)).isSolid()) {
					if (Math.random() < 0.4) {
						world.setBlockState(new BlockPos(x - 2, y, z), SkulkBlockBlock.block.getDefaultState(), 3);
						if (world.getBlockState(new BlockPos(x - 3, y, z)).isSolid()) {
							if (Math.random() < 0.4) {
								world.setBlockState(new BlockPos(x - 3, y, z), SkulkBlockBlock.block.getDefaultState(), 3);
							}
						}
					}
				}
			}
		}
		if (world.getBlockState(new BlockPos(x, y, z + 1)).isSolid()) {
			if (Math.random() < 0.4) {
				world.setBlockState(new BlockPos(x, y, z + 1), SkulkBlockBlock.block.getDefaultState(), 3);
				if (world.getBlockState(new BlockPos(x, y, z + 2)).isSolid()) {
					if (Math.random() < 0.4) {
						world.setBlockState(new BlockPos(x, y, z + 2), SkulkBlockBlock.block.getDefaultState(), 3);
						if (world.getBlockState(new BlockPos(x, y, z + 3)).isSolid()) {
							if (Math.random() < 0.4) {
								world.setBlockState(new BlockPos(x, y, z + 3), SkulkBlockBlock.block.getDefaultState(), 3);
							}
						}
					}
				}
			}
		}
		if (world.getBlockState(new BlockPos(x + 1, y, z + 1)).isSolid()) {
			if (Math.random() < 0.4) {
				world.setBlockState(new BlockPos(x + 1, y, z + 1), SkulkBlockBlock.block.getDefaultState(), 3);
				if (world.getBlockState(new BlockPos(x + 2, y, z + 2)).isSolid()) {
					if (Math.random() < 0.4) {
						world.setBlockState(new BlockPos(x + 2, y, z + 2), SkulkBlockBlock.block.getDefaultState(), 3);
						if (world.getBlockState(new BlockPos(x + 3, y, z + 3)).isSolid()) {
							if (Math.random() < 0.4) {
								world.setBlockState(new BlockPos(x + 3, y, z + 3), SkulkBlockBlock.block.getDefaultState(), 3);
							}
						}
					}
				}
			}
		}
		if (world.getBlockState(new BlockPos(x + 1, y, z - 1)).isSolid()) {
			if (Math.random() < 0.4) {
				world.setBlockState(new BlockPos(x + 1, y, z - 1), SkulkBlockBlock.block.getDefaultState(), 3);
				if (world.getBlockState(new BlockPos(x + 2, y, z - 2)).isSolid()) {
					if (Math.random() < 0.4) {
						world.setBlockState(new BlockPos(x + 2, y, z - 2), SkulkBlockBlock.block.getDefaultState(), 3);
						if (world.getBlockState(new BlockPos(x + 3, y, z - 3)).isSolid()) {
							if (Math.random() < 0.4) {
								world.setBlockState(new BlockPos(x + 3, y, z - 3), SkulkBlockBlock.block.getDefaultState(), 3);
							}
						}
					}
				}
			}
		}
		if (world.getBlockState(new BlockPos(x - 1, y, z + 1)).isSolid()) {
			if (Math.random() < 0.4) {
				world.setBlockState(new BlockPos(x - 1, y, z + 1), SkulkBlockBlock.block.getDefaultState(), 3);
				if (world.getBlockState(new BlockPos(x - 2, y, z + 2)).isSolid()) {
					if (Math.random() < 0.4) {
						world.setBlockState(new BlockPos(x - 2, y, z + 2), SkulkBlockBlock.block.getDefaultState(), 3);
						if (world.getBlockState(new BlockPos(x - 3, y, z + 3)).isSolid()) {
							if (Math.random() < 0.4) {
								world.setBlockState(new BlockPos(x - 3, y, z + 3), SkulkBlockBlock.block.getDefaultState(), 3);
							}
						}
					}
				}
			}
		}
	}
}
