package net.mcreator.newblocks.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;

import net.mcreator.newblocks.block.FarLogBlock;
import net.mcreator.newblocks.block.DeepDarkLeavesBlock;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class SculkSprouterUpdateTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure SculkSprouterUpdateTick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure SculkSprouterUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure SculkSprouterUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure SculkSprouterUpdateTick!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (Math.random() < 0.1) {
			if (Math.random() < 0.31) {
				world.setBlockState(new BlockPos(x, y, z), FarLogBlock.block.getDefaultState(), 3);
				if (world.isAirBlock(new BlockPos(x, y + 1, z))) {
					world.setBlockState(new BlockPos(x, y + 1, z), DeepDarkLeavesBlock.block.getDefaultState(), 3);
				}
				if (world.isAirBlock(new BlockPos(x + 1, y, z))) {
					world.setBlockState(new BlockPos(x + 1, y, z), DeepDarkLeavesBlock.block.getDefaultState(), 3);
				}
				if (world.isAirBlock(new BlockPos(x - 1, y, z))) {
					world.setBlockState(new BlockPos(x - 1, y, z), DeepDarkLeavesBlock.block.getDefaultState(), 3);
				}
				if (world.isAirBlock(new BlockPos(x, y, z + 1))) {
					world.setBlockState(new BlockPos(x, y, z + 1), DeepDarkLeavesBlock.block.getDefaultState(), 3);
				}
				if (world.isAirBlock(new BlockPos(x, y, z - 1))) {
					world.setBlockState(new BlockPos(x, y, z - 1), DeepDarkLeavesBlock.block.getDefaultState(), 3);
				}
			}
		}
	}
}
