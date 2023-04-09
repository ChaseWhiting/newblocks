package net.mcreator.newblocks.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.newblocks.block.CorruptionBlockBlock;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class CorruptTheWOrldProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure CorruptTheWOrld!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure CorruptTheWOrld!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure CorruptTheWOrld!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure CorruptTheWOrld!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (!((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.AIR)
				&& !((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.FIRE)) {
			world.setBlockState(new BlockPos(x, y + 1, z), CorruptionBlockBlock.block.getDefaultState(), 3);
		}
		if (!((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.AIR)
				&& !((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.FIRE)) {
			world.setBlockState(new BlockPos(x, y - 1, z), CorruptionBlockBlock.block.getDefaultState(), 3);
		}
		if (!((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.AIR)
				&& !((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.FIRE)) {
			world.setBlockState(new BlockPos(x + 1, y, z), CorruptionBlockBlock.block.getDefaultState(), 3);
		}
		if (!((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.AIR)
				&& !((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.FIRE)) {
			world.setBlockState(new BlockPos(x - 1, y, z), CorruptionBlockBlock.block.getDefaultState(), 3);
		}
		if (!((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.AIR)
				&& !((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.FIRE)) {
			world.setBlockState(new BlockPos(x, y, z + 1), CorruptionBlockBlock.block.getDefaultState(), 3);
		}
		if (!((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.AIR)
				&& !((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.FIRE)) {
			world.setBlockState(new BlockPos(x, y, z - 1), CorruptionBlockBlock.block.getDefaultState(), 3);
		}
		if (!((world.getBlockState(new BlockPos(x - 1, y, z - 1))).getBlock() == Blocks.AIR)
				&& !((world.getBlockState(new BlockPos(x - 1, y, z - 1))).getBlock() == Blocks.FIRE)) {
			world.setBlockState(new BlockPos(x - 1, y, z - 1), CorruptionBlockBlock.block.getDefaultState(), 3);
		}
		if (!((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock() == Blocks.AIR)
				&& !((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock() == Blocks.FIRE)) {
			world.setBlockState(new BlockPos(x + 1, y, z + 1), CorruptionBlockBlock.block.getDefaultState(), 3);
		}
		if (!((world.getBlockState(new BlockPos(x + 1, y, z - 1))).getBlock() == Blocks.AIR)
				&& !((world.getBlockState(new BlockPos(x + 1, y, z - 1))).getBlock() == Blocks.FIRE)) {
			world.setBlockState(new BlockPos(x + 1, y, z - 1), CorruptionBlockBlock.block.getDefaultState(), 3);
		}
		if (!((world.getBlockState(new BlockPos(x - 1, y, z + 1))).getBlock() == Blocks.AIR)
				&& !((world.getBlockState(new BlockPos(x - 1, y, z + 1))).getBlock() == Blocks.FIRE)) {
			world.setBlockState(new BlockPos(x - 1, y, z + 1), CorruptionBlockBlock.block.getDefaultState(), 3);
		}
	}
}
