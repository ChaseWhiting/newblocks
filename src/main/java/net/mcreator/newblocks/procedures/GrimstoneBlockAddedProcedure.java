package net.mcreator.newblocks.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;

import net.mcreator.newblocks.block.SculkVineBlock;
import net.mcreator.newblocks.block.SculkSensorBlock;
import net.mcreator.newblocks.block.SculkBushBlock;
import net.mcreator.newblocks.block.BigSculkBushBlock;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class GrimstoneBlockAddedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure GrimstoneBlockAdded!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure GrimstoneBlockAdded!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure GrimstoneBlockAdded!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure GrimstoneBlockAdded!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (world.isAirBlock(new BlockPos(x, y + 1, z)) && world.isAirBlock(new BlockPos(x, y + 2, z))
				&& world.isAirBlock(new BlockPos(x, y + 3, z))) {
			if (Math.random() < 0.2) {
				if (Math.random() < 0.2) {
					if (Math.random() < 0.2) {
						world.setBlockState(new BlockPos(x, y + 1, z), SculkVineBlock.block.getDefaultState(), 3);
						if (Math.random() < 0.5) {
							world.setBlockState(new BlockPos(x, y + 2, z), SculkVineBlock.block.getDefaultState(), 3);
							if (Math.random() < 0.3) {
								world.setBlockState(new BlockPos(x, y + 3, z), SculkVineBlock.block.getDefaultState(), 3);
							}
						}
					}
				}
			}
		}
		if (world.isAirBlock(new BlockPos(x, y + 1, z + 1)) || world.isAirBlock(new BlockPos(x + 1, y + 1, z))) {
			if (Math.random() < 0.4) {
				world.setBlockState(new BlockPos(x, y + 1, z + 1), BigSculkBushBlock.block.getDefaultState(), 3);
			}
			if (Math.random() < 0.5) {
				world.setBlockState(new BlockPos(x + 1, y + 1, z), SculkBushBlock.block.getDefaultState(), 3);
			}
		}
		if (world.isAirBlock(new BlockPos(x, y + 1, z - 1)) || world.isAirBlock(new BlockPos(x - 1, y + 1, z))) {
			if (Math.random() < 0.3) {
				world.setBlockState(new BlockPos(x, y + 1, z - 1), BigSculkBushBlock.block.getDefaultState(), 3);
			}
			if (Math.random() < 0.4) {
				world.setBlockState(new BlockPos(x - 1, y + 1, z), SculkBushBlock.block.getDefaultState(), 3);
			}
		}
		if (world.isAirBlock(new BlockPos(x - 1, y + 1, z + 1)) || world.isAirBlock(new BlockPos(x - 1, y + 1, z))) {
			if (Math.random() < 0.4) {
				world.setBlockState(new BlockPos(x - 1, y + 1, z + 1), SculkBushBlock.block.getDefaultState(), 3);
			}
			if (Math.random() < 0.3) {
				world.setBlockState(new BlockPos(x - 1, y + 1, z), BigSculkBushBlock.block.getDefaultState(), 3);
			}
		}
		if (world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y, z))) != null
				&& world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y, z)))
						.equals(new ResourceLocation("new_blocks:sculk_vine_caves"))) {
			if (world.isAirBlock(new BlockPos(x, y + 1, z))) {
				if (SculkVineBlock.block.getDefaultState().isValidPosition(world, new BlockPos(x, y + 1, z))) {
					if (Math.random() < 0.9) {
						world.setBlockState(new BlockPos(x, y + 1, z), SculkVineBlock.block.getDefaultState(), 3);
						if (SculkVineBlock.block.getDefaultState().isValidPosition(world, new BlockPos(x, y + 2, z))) {
							if (Math.random() < 0.9) {
								world.setBlockState(new BlockPos(x, y + 2, z), SculkVineBlock.block.getDefaultState(), 3);
								if (SculkVineBlock.block.getDefaultState().isValidPosition(world, new BlockPos(x, y + 3, z))) {
									if (Math.random() < 0.9) {
										world.setBlockState(new BlockPos(x, y + 3, z), SculkVineBlock.block.getDefaultState(), 3);
										if (SculkVineBlock.block.getDefaultState().isValidPosition(world, new BlockPos(x, y + 4, z))) {
											if (Math.random() < 0.9) {
												world.setBlockState(new BlockPos(x, y + 4, z), SculkVineBlock.block.getDefaultState(), 3);
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if (world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y, z))) != null
				&& world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y, z)))
						.equals(new ResourceLocation("new_blocks:sculk_vine_caves"))) {
			if (world.isAirBlock(new BlockPos(x - 3, y + 1, z))) {
				if (SculkVineBlock.block.getDefaultState().isValidPosition(world, new BlockPos(x - 3, y + 1, z))) {
					world.setBlockState(new BlockPos(x - 3, y + 1, z), SculkVineBlock.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos(x - 3, y + 2, z), SculkVineBlock.block.getDefaultState(), 3);
					if (SculkVineBlock.block.getDefaultState().isValidPosition(world, new BlockPos(x - 3, y + 2, z))) {
						if (Math.random() < 0.9) {
							world.setBlockState(new BlockPos(x - 3, y + 2, z), SculkVineBlock.block.getDefaultState(), 3);
						}
					}
					if (SculkVineBlock.block.getDefaultState().isValidPosition(world, new BlockPos(x - 3, y + 3, z))) {
						if (Math.random() < 0.9) {
							world.setBlockState(new BlockPos(x - 3, y + 3, z), SculkVineBlock.block.getDefaultState(), 3);
							if (SculkVineBlock.block.getDefaultState().isValidPosition(world, new BlockPos(x - 3, y + 4, z))) {
								if (Math.random() < 0.9) {
									world.setBlockState(new BlockPos(x - 3, y + 4, z), SculkVineBlock.block.getDefaultState(), 3);
									if (SculkVineBlock.block.getDefaultState().isValidPosition(world, new BlockPos(x + 3, y + 1, z))) {
										if (Math.random() < 0.9) {
											world.setBlockState(new BlockPos(x + 1, y + 1, z), SculkVineBlock.block.getDefaultState(), 3);
											if (SculkVineBlock.block.getDefaultState().isValidPosition(world, new BlockPos(x + 1, y + 2, z))) {
												world.setBlockState(new BlockPos(x + 1, y + 2, z), SculkVineBlock.block.getDefaultState(), 3);
												if (SculkVineBlock.block.getDefaultState().isValidPosition(world, new BlockPos(x + 1, y + 3, z))) {
													world.setBlockState(new BlockPos(x + 1, y + 3, z), SculkVineBlock.block.getDefaultState(), 3);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if (world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y, z))) != null
				&& world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y, z)))
						.equals(new ResourceLocation("new_blocks:sculk_vine_caves"))) {
			if (SculkVineBlock.block.getDefaultState().isValidPosition(world, new BlockPos(x, y + 1, z))) {
				if (Math.random() < 0.7) {
					world.setBlockState(new BlockPos(x, y + 1, z), SculkVineBlock.block.getDefaultState(), 3);
				}
			}
		}
		if (world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y, z))) != null
				&& world.func_241828_r().getRegistry(Registry.BIOME_KEY).getKey(world.getBiome(new BlockPos(x, y, z)))
						.equals(new ResourceLocation("new_blocks:sculk_vine_caves"))) {
			if (SculkVineBlock.block.getDefaultState().isValidPosition(world, new BlockPos(x + 1, y + 1, z))) {
				if (Math.random() < 0.7) {
					world.setBlockState(new BlockPos(x + 1, y + 1, z), SculkVineBlock.block.getDefaultState(), 3);
				}
			}
			if (SculkVineBlock.block.getDefaultState().isValidPosition(world, new BlockPos(x + 1, y + 2, z))) {
				if (Math.random() < 0.7) {
					world.setBlockState(new BlockPos(x + 1, y + 2, z), SculkVineBlock.block.getDefaultState(), 3);
				}
			}
		}
		if (!world.isAirBlock(new BlockPos(x, y - 1, z))) {
			if (Math.random() < 0.7) {
				world.setBlockState(new BlockPos(x, y, z), SculkSensorBlock.block.getDefaultState(), 3);
			}
		}
	}
}
