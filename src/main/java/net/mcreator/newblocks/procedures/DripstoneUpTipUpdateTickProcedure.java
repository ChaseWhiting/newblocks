package net.mcreator.newblocks.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Block;

import net.mcreator.newblocks.block.DripstoneUpTipMergeBlock;
import net.mcreator.newblocks.block.DripstoneUpTipBlock;
import net.mcreator.newblocks.block.DripstoneUpFrustrumBlock;
import net.mcreator.newblocks.block.DripstoneDownTipMergeBlock;
import net.mcreator.newblocks.block.DripstoneDownTipBlock;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class DripstoneUpTipUpdateTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure DripstoneUpTipUpdateTick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure DripstoneUpTipUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure DripstoneUpTipUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure DripstoneUpTipUpdateTick!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (!world.getBlockState(new BlockPos(x, y - 1, z)).isSolid()
				&& !((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == DripstoneUpFrustrumBlock.block)
				&& !((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == DripstoneUpTipBlock.block)) {
			if (world instanceof World) {
				Block.spawnDrops(world.getBlockState(new BlockPos(x, y, z)), (World) world, new BlockPos(x, y, z));
				world.destroyBlock(new BlockPos(x, y, z), false);
			}
		}
		if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == DripstoneDownTipBlock.block) {
			world.setBlockState(new BlockPos(x, y, z), DripstoneUpTipMergeBlock.block.getDefaultState(), 3);
			world.setBlockState(new BlockPos(x, y + 1, z), DripstoneDownTipMergeBlock.block.getDefaultState(), 3);
		}
	}
}
