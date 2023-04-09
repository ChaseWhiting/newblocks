package net.mcreator.newblocks.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;

import net.mcreator.newblocks.block.DripstoneUpTipBlock;
import net.mcreator.newblocks.block.DripstoneUpFrustrumBlock;
import net.mcreator.newblocks.block.DripstoneDownTipBlock;
import net.mcreator.newblocks.block.DripstoneDownFrustrumBlock;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class DripstoneUpTipBlockAddedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure DripstoneUpTipBlockAdded!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure DripstoneUpTipBlockAdded!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure DripstoneUpTipBlockAdded!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure DripstoneUpTipBlockAdded!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == DripstoneUpTipBlock.block) {
			world.setBlockState(new BlockPos(x, y - 1, z), DripstoneUpFrustrumBlock.block.getDefaultState(), 3);
		}
		if (world.getBlockState(new BlockPos(x, y + 1, z)).isSolid() && !world.getBlockState(new BlockPos(x, y - 1, z)).isSolid()
				&& !((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == DripstoneUpFrustrumBlock.block)) {
			world.setBlockState(new BlockPos(x, y, z), DripstoneDownTipBlock.block.getDefaultState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == DripstoneDownTipBlock.block) {
			world.setBlockState(new BlockPos(x, y + 1, z), DripstoneDownFrustrumBlock.block.getDefaultState(), 3);
		}
	}
}
