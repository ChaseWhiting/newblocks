package net.mcreator.newblocks.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.block.Blocks;

import net.mcreator.newblocks.block.RootsBlock;
import net.mcreator.newblocks.block.RootedDirtBlock;
import net.mcreator.newblocks.block.MossBlock;
import net.mcreator.newblocks.block.HangingRootsBlock;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class MakeRootsProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure MakeRoots!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure MakeRoots!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure MakeRoots!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure MakeRoots!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		boolean found = false;
		double ycoord = 0;
		double ycoord2 = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (Blocks.CAVE_AIR == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
			if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
					.contains((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock())) {
				if (Math.random() < 0.8) {
					world.setBlockState(new BlockPos(x, y - 1, z), RootedDirtBlock.block.getDefaultState(), 3);
				} else {
					world.setBlockState(new BlockPos(x, y - 1, z), RootedDirtBlock.block.getDefaultState(), 3);
					if (0.04 >= Math.random()) {
						world.setBlockState(new BlockPos(x, y - 2, z), Blocks.COARSE_DIRT.getDefaultState(), 3);
					} else if (0.04 >= Math.random()) {
						world.setBlockState(new BlockPos(x, y - 2, z), RootedDirtBlock.block.getDefaultState(), 3);
					}
				}
				if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
						.contains((world.getBlockState(new BlockPos(x, y - 2, z))).getBlock())) {
					if (0.04 >= Math.random()) {
						world.setBlockState(new BlockPos(x, y - 2, z), Blocks.DIRT.getDefaultState(), 3);
					} else {
						world.setBlockState(new BlockPos(x, y - 2, z), RootedDirtBlock.block.getDefaultState(), 3);
					}
				}
				if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
						.contains((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock())) {
					world.setBlockState(new BlockPos(x, y + 1, z), RootedDirtBlock.block.getDefaultState(), 3);
					if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
							.contains((world.getBlockState(new BlockPos(x, y + 2, z))).getBlock())) {
						world.setBlockState(new BlockPos(x, y + 2, z), RootedDirtBlock.block.getDefaultState(), 3);
						if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
								.contains((world.getBlockState(new BlockPos(x, y + 3, z))).getBlock())) {
							world.setBlockState(new BlockPos(x, y + 3, z), RootedDirtBlock.block.getDefaultState(), 3);
							if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
									.contains((world.getBlockState(new BlockPos(x, y + 4, z))).getBlock())) {
								world.setBlockState(new BlockPos(x, y + 4, z), RootedDirtBlock.block.getDefaultState(), 3);
								if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
										.contains((world.getBlockState(new BlockPos(x, y + 5, z))).getBlock())) {
									world.setBlockState(new BlockPos(x, y + 5, z), Blocks.GRASS_BLOCK.getDefaultState(), 3);
								}
							}
						}
					}
				}
				if (0.04 >= Math.random()) {
					world.setBlockState(new BlockPos(x, y, z), RootsBlock.block.getDefaultState(), 3);
				} else if (0.1 >= Math.random()) {
					world.setBlockState(new BlockPos(x, y, z), RootsBlock.block.getDefaultState(), 3);
				} else if (0.1 >= Math.random()) {
					world.setBlockState(new BlockPos(x, y - 1, z), Blocks.DIRT.getDefaultState(), 3);
				} else if (0.1 >= Math.random()) {
					world.setBlockState(new BlockPos(x, y, z), RootsBlock.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos(x, y - 1, z), Blocks.DIRT.getDefaultState(), 3);
				} else if (0.1 >= Math.random()) {
					world.setBlockState(new BlockPos(x, y - 1, z), Blocks.COARSE_DIRT.getDefaultState(), 3);
				} else {
					world.setBlockState(new BlockPos(x, y, z), Blocks.CAVE_AIR.getDefaultState(), 3);
				}
			} else if (0.1 >= Math.random() && BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
					.contains((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock())) {
				if (0.1 >= Math.random()) {
					world.setBlockState(new BlockPos(x, y + 1, z), RootedDirtBlock.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos(x, y, z), HangingRootsBlock.block.getDefaultState(), 3);
				}
			} else if (0.1 >= Math.random() && BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
					.contains((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock())) {
				if (Math.random() < 0.7) {
					world.setBlockState(new BlockPos(x, y + 1, z), MossBlock.block.getDefaultState(), 3);
				} else {
					world.setBlockState(new BlockPos(x, y + 1, z), Blocks.COARSE_DIRT.getDefaultState(), 3);
				}
				world.setBlockState(new BlockPos(x, y, z), HangingRootsBlock.block.getDefaultState(), 3);
			} else {
				if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
						.contains((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock())) {
					world.setBlockState(new BlockPos(x, y + 1, z), RootedDirtBlock.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos(x, y, z), Blocks.CAVE_AIR.getDefaultState(), 3);
				}
			}
		}
	}
}
