package net.mcreator.newblocks.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.newblocks.block.Tomato1Block;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class TomatoSeedsUpdateTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure TomatoSeedsUpdateTick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure TomatoSeedsUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure TomatoSeedsUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure TomatoSeedsUpdateTick!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		sx = (-3);
		found = (false);
		for (int index0 = 0; index0 < (int) (6); index0++) {
			sy = (-3);
			for (int index1 = 0; index1 < (int) (6); index1++) {
				sz = (-3);
				for (int index2 = 0; index2 < (int) (6); index2++) {
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
			if (Math.random() < 0.5) {
				world.setBlockState(new BlockPos(x, y, z), Tomato1Block.block.getDefaultState(), 3);
			} else if (Math.random() < 0.4) {
				world.setBlockState(new BlockPos(x, y, z), Tomato1Block.block.getDefaultState(), 3);
			}
		}
	}
}
