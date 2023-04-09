package net.mcreator.newblocks.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.item.ItemStack;
import net.minecraft.item.BlockItem;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class AtticstructurescriptProcedure {

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure Atticstructurescript!");
			return false;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure Atticstructurescript!");
			return false;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure Atticstructurescript!");
			return false;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure Atticstructurescript!");
			return false;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		ItemStack UnderSoil = ItemStack.EMPTY;
		ItemStack Air = ItemStack.EMPTY;
		ItemStack TopSoil = ItemStack.EMPTY;
		String AirTagName = "";
		String TopSoilTagName = "";
		String UnderSoilTagName = "";
		boolean EnableSoilReplacement = false;
		boolean DontSpawnStructure = false;
		boolean EnableTagSupport = false;
		double PositionX2 = 0;
		double PositionZ = 0;
		double PositionOffsetZ = 0;
		double PositionOffsetX = 0;
		double StructureSizeZ = 0;
		double StructureSizeX = 0;
		double PositionX = 0;
		EnableSoilReplacement = (false);
		EnableTagSupport = (true);
		AirTagName = "new_blocks:pillager_air_block";
		UnderSoilTagName = "new_blocks:pillager_dirt_block";
		TopSoilTagName = "new_blocks:pillager_grass_block";
		TopSoil = new ItemStack(Blocks.GRASS_BLOCK);
		UnderSoil = new ItemStack(Blocks.DIRT);
		Air = new ItemStack(Blocks.AIR);
		PositionOffsetX = (x + 0);
		PositionOffsetZ = (z + 0);
		StructureSizeX = 15;
		StructureSizeZ = 15;
		PositionX = 0;
		PositionZ = 0;
		PositionX2 = PositionX;
		DontSpawnStructure = (false);
		for (int index0 = 0; index0 < (int) (StructureSizeZ); index0++) {
			for (int index1 = 0; index1 < (int) (StructureSizeX); index1++) {
				if (EnableTagSupport) {
					if (BlockTags.getCollection().getTagByID(new ResourceLocation((AirTagName).toLowerCase(java.util.Locale.ENGLISH)))
							.contains((world.getBlockState(new BlockPos(PositionOffsetX + PositionX, y + 1, PositionOffsetZ + PositionZ))).getBlock())
							&& BlockTags.getCollection().getTagByID(new ResourceLocation((AirTagName).toLowerCase(java.util.Locale.ENGLISH)))
									.contains((world.getBlockState(new BlockPos(PositionOffsetX + PositionX, y, PositionOffsetZ + PositionZ)))
											.getBlock())
							&& BlockTags.getCollection().getTagByID(new ResourceLocation((TopSoilTagName).toLowerCase(java.util.Locale.ENGLISH)))
									.contains((world.getBlockState(new BlockPos(PositionOffsetX + PositionX, y - 1, PositionOffsetZ + PositionZ)))
											.getBlock())
							|| BlockTags.getCollection().getTagByID(new ResourceLocation((AirTagName).toLowerCase(java.util.Locale.ENGLISH)))
									.contains((world.getBlockState(new BlockPos(PositionOffsetX + PositionX, y + 1, PositionOffsetZ + PositionZ)))
											.getBlock())
									&& BlockTags.getCollection()
											.getTagByID(new ResourceLocation((TopSoilTagName).toLowerCase(java.util.Locale.ENGLISH)))
											.contains((world.getBlockState(new BlockPos(PositionOffsetX + PositionX, y, PositionOffsetZ + PositionZ)))
													.getBlock())
									&& BlockTags.getCollection()
											.getTagByID(new ResourceLocation((UnderSoilTagName).toLowerCase(java.util.Locale.ENGLISH)))
											.contains((world
													.getBlockState(new BlockPos(PositionOffsetX + PositionX, y - 1, PositionOffsetZ + PositionZ)))
													.getBlock())
							|| BlockTags.getCollection().getTagByID(new ResourceLocation((TopSoilTagName).toLowerCase(java.util.Locale.ENGLISH)))
									.contains((world.getBlockState(new BlockPos(PositionOffsetX + PositionX, y + 1, PositionOffsetZ + PositionZ)))
											.getBlock())
									&& BlockTags.getCollection()
											.getTagByID(new ResourceLocation((UnderSoilTagName).toLowerCase(java.util.Locale.ENGLISH)))
											.contains((world.getBlockState(new BlockPos(PositionOffsetX + PositionX, y, PositionOffsetZ + PositionZ)))
													.getBlock())
									&& BlockTags.getCollection()
											.getTagByID(new ResourceLocation((UnderSoilTagName).toLowerCase(java.util.Locale.ENGLISH)))
											.contains((world
													.getBlockState(new BlockPos(PositionOffsetX + PositionX, y - 1, PositionOffsetZ + PositionZ)))
													.getBlock())) {
						DontSpawnStructure = (false);
					} else {
						DontSpawnStructure = (true);
						break;
					}
				} else {
					if ((world.getBlockState(new BlockPos(PositionOffsetX + PositionX, y + 1, PositionOffsetZ + PositionZ)))
							.getBlock() == (new Object() {
								public BlockState toBlock(ItemStack _stk) {
									if (_stk.getItem() instanceof BlockItem) {
										return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
									}
									return Blocks.AIR.getDefaultState();
								}
							}.toBlock((Air))).getBlock()
							&& (world.getBlockState(new BlockPos(PositionOffsetX + PositionX, y, PositionOffsetZ + PositionZ)))
									.getBlock() == (new Object() {
										public BlockState toBlock(ItemStack _stk) {
											if (_stk.getItem() instanceof BlockItem) {
												return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
											}
											return Blocks.AIR.getDefaultState();
										}
									}.toBlock((Air))).getBlock()
							&& (world.getBlockState(new BlockPos(PositionOffsetX + PositionX, y - 1, PositionOffsetZ + PositionZ)))
									.getBlock() == (new Object() {
										public BlockState toBlock(ItemStack _stk) {
											if (_stk.getItem() instanceof BlockItem) {
												return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
											}
											return Blocks.AIR.getDefaultState();
										}
									}.toBlock((TopSoil))).getBlock()
							|| (world.getBlockState(new BlockPos(PositionOffsetX + PositionX, y + 1, PositionOffsetZ + PositionZ)))
									.getBlock() == (new Object() {
										public BlockState toBlock(ItemStack _stk) {
											if (_stk.getItem() instanceof BlockItem) {
												return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
											}
											return Blocks.AIR.getDefaultState();
										}
									}.toBlock((Air))).getBlock()
									&& (world.getBlockState(new BlockPos(PositionOffsetX + PositionX, y, PositionOffsetZ + PositionZ)))
											.getBlock() == (new Object() {
												public BlockState toBlock(ItemStack _stk) {
													if (_stk.getItem() instanceof BlockItem) {
														return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
													}
													return Blocks.AIR.getDefaultState();
												}
											}.toBlock((TopSoil))).getBlock()
									&& (world.getBlockState(new BlockPos(PositionOffsetX + PositionX, y - 1, PositionOffsetZ + PositionZ)))
											.getBlock() == (new Object() {
												public BlockState toBlock(ItemStack _stk) {
													if (_stk.getItem() instanceof BlockItem) {
														return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
													}
													return Blocks.AIR.getDefaultState();
												}
											}.toBlock((UnderSoil))).getBlock()
							|| (world.getBlockState(new BlockPos(PositionOffsetX + PositionX, y + 1, PositionOffsetZ + PositionZ)))
									.getBlock() == (new Object() {
										public BlockState toBlock(ItemStack _stk) {
											if (_stk.getItem() instanceof BlockItem) {
												return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
											}
											return Blocks.AIR.getDefaultState();
										}
									}.toBlock((TopSoil))).getBlock()
									&& (world.getBlockState(new BlockPos(PositionOffsetX + PositionX, y, PositionOffsetZ + PositionZ)))
											.getBlock() == (new Object() {
												public BlockState toBlock(ItemStack _stk) {
													if (_stk.getItem() instanceof BlockItem) {
														return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
													}
													return Blocks.AIR.getDefaultState();
												}
											}.toBlock((UnderSoil))).getBlock()
									&& (world.getBlockState(new BlockPos(PositionOffsetX + PositionX, y - 1, PositionOffsetZ + PositionZ)))
											.getBlock() == (new Object() {
												public BlockState toBlock(ItemStack _stk) {
													if (_stk.getItem() instanceof BlockItem) {
														return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
													}
													return Blocks.AIR.getDefaultState();
												}
											}.toBlock((UnderSoil))).getBlock()) {
						DontSpawnStructure = (false);
					} else {
						DontSpawnStructure = (true);
						break;
					}
				}
				PositionX = (PositionX + 1);
			}
			if (DontSpawnStructure) {
				break;
			}
			PositionX = PositionX2;
			PositionZ = (PositionZ + 1);
		}
		if (!DontSpawnStructure && EnableSoilReplacement) {
			PositionX = 0;
			PositionZ = 0;
			for (int index2 = 0; index2 < (int) (StructureSizeZ); index2++) {
				for (int index3 = 0; index3 < (int) (StructureSizeX); index3++) {
					if (EnableTagSupport) {
						if (BlockTags.getCollection().getTagByID(new ResourceLocation((TopSoilTagName).toLowerCase(java.util.Locale.ENGLISH)))
								.contains((world.getBlockState(new BlockPos(PositionOffsetX + PositionX, y - 1, PositionOffsetZ + PositionZ)))
										.getBlock())) {
							{
								BlockPos _bp = new BlockPos(PositionOffsetX + PositionX, y - 1, PositionOffsetZ + PositionZ);
								BlockState _bs = Blocks.GRASS_BLOCK.getDefaultState();
								world.setBlockState(_bp, _bs, 3);
							}
						}
					} else {
						if ((world.getBlockState(new BlockPos(PositionOffsetX + PositionX, y - 1, PositionOffsetZ + PositionZ)))
								.getBlock() == (new Object() {
									public BlockState toBlock(ItemStack _stk) {
										if (_stk.getItem() instanceof BlockItem) {
											return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
										}
										return Blocks.AIR.getDefaultState();
									}
								}.toBlock((TopSoil))).getBlock()) {
							{
								BlockPos _bp = new BlockPos(PositionOffsetX + PositionX, y - 1, PositionOffsetZ + PositionZ);
								BlockState _bs = (new Object() {
									public BlockState toBlock(ItemStack _stk) {
										if (_stk.getItem() instanceof BlockItem) {
											return ((BlockItem) _stk.getItem()).getBlock().getDefaultState();
										}
										return Blocks.AIR.getDefaultState();
									}
								}.toBlock((UnderSoil)));
								world.setBlockState(_bp, _bs, 3);
							}
						}
					}
					PositionX = (PositionX + 1);
				}
				PositionX = PositionX2;
				PositionZ = (PositionZ + 1);
			}
		}
		if (!DontSpawnStructure) {
			return true;
		}
		return false;
	}
}
