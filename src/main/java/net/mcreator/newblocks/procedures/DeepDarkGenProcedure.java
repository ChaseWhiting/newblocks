package net.mcreator.newblocks.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

public class DeepDarkGenProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure DeepDarkGen!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure DeepDarkGen!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure DeepDarkGen!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure DeepDarkGen!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		world.setBlockState(new BlockPos(x, y, z), Blocks.AIR.getDefaultState(), 3);
		if (world instanceof World)
			((World) world).notifyNeighborsOfStateChange(new BlockPos(x + 1, y, z),
					((World) world).getBlockState(new BlockPos(x + 1, y, z)).getBlock());
		if (world instanceof World)
			((World) world).notifyNeighborsOfStateChange(new BlockPos(x - 1, y, z),
					((World) world).getBlockState(new BlockPos(x - 1, y, z)).getBlock());
		if (world instanceof World)
			((World) world).notifyNeighborsOfStateChange(new BlockPos(x - 2, y, z),
					((World) world).getBlockState(new BlockPos(x - 2, y, z)).getBlock());
		if (world instanceof World)
			((World) world).notifyNeighborsOfStateChange(new BlockPos(x + 2, y, z),
					((World) world).getBlockState(new BlockPos(x + 2, y, z)).getBlock());
		if (world instanceof World)
			((World) world).notifyNeighborsOfStateChange(new BlockPos(x + 2, y, z),
					((World) world).getBlockState(new BlockPos(x + 2, y, z)).getBlock());
		if (world instanceof World)
			((World) world).notifyNeighborsOfStateChange(new BlockPos(x + 1, y, z + 1),
					((World) world).getBlockState(new BlockPos(x + 1, y, z + 1)).getBlock());
		if (world instanceof World)
			((World) world).notifyNeighborsOfStateChange(new BlockPos(x + 2, y, z + 1),
					((World) world).getBlockState(new BlockPos(x + 2, y, z + 1)).getBlock());
		if (world instanceof World)
			((World) world).notifyNeighborsOfStateChange(new BlockPos(x + 2, y, z + 2),
					((World) world).getBlockState(new BlockPos(x + 2, y, z + 2)).getBlock());
		if (world instanceof World)
			((World) world).notifyNeighborsOfStateChange(new BlockPos(x + 1, y, z + 2),
					((World) world).getBlockState(new BlockPos(x + 1, y, z + 2)).getBlock());
		if (world instanceof World)
			((World) world).notifyNeighborsOfStateChange(new BlockPos(x - 1, y, z + 1),
					((World) world).getBlockState(new BlockPos(x - 1, y, z + 1)).getBlock());
		if (world instanceof World)
			((World) world).notifyNeighborsOfStateChange(new BlockPos(x + 1, y, z - 1),
					((World) world).getBlockState(new BlockPos(x + 1, y, z - 1)).getBlock());
		if (world instanceof World)
			((World) world).notifyNeighborsOfStateChange(new BlockPos(x + 2, y, z - 1),
					((World) world).getBlockState(new BlockPos(x + 2, y, z - 1)).getBlock());
		if (world instanceof World)
			((World) world).notifyNeighborsOfStateChange(new BlockPos(x + 1, y, z - 2),
					((World) world).getBlockState(new BlockPos(x + 1, y, z - 2)).getBlock());
		if (world instanceof World)
			((World) world).notifyNeighborsOfStateChange(new BlockPos(x, y + 1, z),
					((World) world).getBlockState(new BlockPos(x, y + 1, z)).getBlock());
		if (world instanceof World)
			((World) world).notifyNeighborsOfStateChange(new BlockPos(x, y - 1, z),
					((World) world).getBlockState(new BlockPos(x, y - 1, z)).getBlock());
		if (Math.random() < 0.5) {
			GrimstoneBlockAddedProcedure.executeProcedure(Stream
					.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x), new AbstractMap.SimpleEntry<>("y", y),
							new AbstractMap.SimpleEntry<>("z", z))
					.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			if (Math.random() < 0.5) {
				GrimstoneBlockAddedProcedure.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
				if (Math.random() < 0.5) {
					GrimstoneBlockAddedProcedure.executeProcedure(Stream
							.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
									new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
							.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
				}
			}
		}
	}
}
