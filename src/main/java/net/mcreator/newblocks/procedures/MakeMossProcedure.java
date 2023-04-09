package net.mcreator.newblocks.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.block.Blocks;

import net.mcreator.newblocks.block.SporeBlossomBlock;
import net.mcreator.newblocks.block.MossBlock;
import net.mcreator.newblocks.block.FloweringAzaleaBlock;
import net.mcreator.newblocks.block.CavePlantBlock;
import net.mcreator.newblocks.block.BigDripleafBlock;
import net.mcreator.newblocks.block.AzaleaBlock;
import net.mcreator.newblocks.NewBlocksModVariables;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class MakeMossProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure MakeMoss!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure MakeMoss!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure MakeMoss!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure MakeMoss!");
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
		if (Blocks.CAVE_AIR == (world.getBlockState(new BlockPos(x, y, z))).getBlock()
				|| Blocks.AIR == (world.getBlockState(new BlockPos(x, y, z))).getBlock()) {
			if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
					.contains((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock())) {
				if (Math.random() < 0.8) {
					world.setBlockState(new BlockPos(x, y - 1, z), MossBlock.block.getDefaultState(), 3);
				} else {
					world.setBlockState(new BlockPos(x, y - 1, z), MossBlock.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos(x, y - 2, z), Blocks.CLAY.getDefaultState(), 3);
				}
				if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
						.contains((world.getBlockState(new BlockPos(x, y - 2, z))).getBlock())) {
					if (0.04 >= Math.random()) {
						world.setBlockState(new BlockPos(x, y - 2, z), MossBlock.block.getDefaultState(), 3);
					} else {
						world.setBlockState(new BlockPos(x, y - 2, z), Blocks.CLAY.getDefaultState(), 3);
					}
				}
				if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
						.contains((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock())) {
					world.setBlockState(new BlockPos(x, y + 1, z), MossBlock.block.getDefaultState(), 3);
					if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
							.contains((world.getBlockState(new BlockPos(x, y + 2, z))).getBlock())) {
						world.setBlockState(new BlockPos(x, y + 2, z), MossBlock.block.getDefaultState(), 3);
						if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
								.contains((world.getBlockState(new BlockPos(x, y + 3, z))).getBlock())) {
							world.setBlockState(new BlockPos(x, y + 3, z), MossBlock.block.getDefaultState(), 3);
							if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
									.contains((world.getBlockState(new BlockPos(x, y + 4, z))).getBlock())) {
								world.setBlockState(new BlockPos(x, y + 4, z), MossBlock.block.getDefaultState(), 3);
								if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
										.contains((world.getBlockState(new BlockPos(x, y + 5, z))).getBlock())) {
									world.setBlockState(new BlockPos(x, y + 5, z), MossBlock.block.getDefaultState(), 3);
								}
							}
						}
					}
				}
				if (0.04 >= Math.random()) {
					world.setBlockState(new BlockPos(x, y, z), FloweringAzaleaBlock.block.getDefaultState(), 3);
				} else if (0.1 >= Math.random()) {
					world.setBlockState(new BlockPos(x, y, z), AzaleaBlock.block.getDefaultState(), 3);
				} else if (0.1 >= Math.random()) {
					if (0.2 >= Math.random()) {
						new Object() {
							private int ticks = 0;
							private float waitTicks;
							private IWorld world;

							public void start(IWorld world, int waitTicks) {
								this.waitTicks = waitTicks;
								MinecraftForge.EVENT_BUS.register(this);
								this.world = world;
							}

							@SubscribeEvent
							public void tick(TickEvent.ServerTickEvent event) {
								if (event.phase == TickEvent.Phase.END) {
									this.ticks += 1;
									if (this.ticks >= this.waitTicks)
										run();
								}
							}

							private void run() {
								world.setBlockState(new BlockPos(x, y - 1, z), Blocks.WATER.getDefaultState(), 3);
								if (world.getBlockState(new BlockPos(x - 1, y - 1, z)).isSolid()) {
									if (Blocks.CAVE_AIR == (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock()) {
										if (0.1 >= Math.random()) {
											world.setBlockState(new BlockPos(x - 1, y - 1, z), Blocks.WATER.getDefaultState(), 3);
										}
									}
								}
								if (world.getBlockState(new BlockPos(x + 1, y - 1, z)).isSolid()) {
									if (Blocks.CAVE_AIR == (world.getBlockState(new BlockPos(x + 1, y, z))).getBlock()) {
										if (0.1 >= Math.random()) {
											world.setBlockState(new BlockPos(x + 1, y - 1, z), Blocks.WATER.getDefaultState(), 3);
										}
									}
								}
								if (world.getBlockState(new BlockPos(x, y - 1, z + 1)).isSolid()) {
									if (Blocks.CAVE_AIR == (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock()) {
										if (0.1 >= Math.random()) {
											world.setBlockState(new BlockPos(x, y - 1, z + 1), Blocks.WATER.getDefaultState(), 3);
										}
									}
								}
								if (world.getBlockState(new BlockPos(x, y - 1, z - 1)).isSolid()) {
									if (Blocks.CAVE_AIR == (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock()) {
										if (0.1 >= Math.random()) {
											world.setBlockState(new BlockPos(x, y - 1, z - 1), Blocks.WATER.getDefaultState(), 3);
										}
									}
								}
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, (int) 5);
					}
				} else if (0.1 >= Math.random()) {
					world.setBlockState(new BlockPos(x, y, z), Blocks.GRASS.getDefaultState(), 3);
					world.setBlockState(new BlockPos(x, y - 1, z), MossBlock.block.getDefaultState(), 3);
				} else if (0.1 >= Math.random()) {
					new Object() {
						private int ticks = 0;
						private float waitTicks;
						private IWorld world;

						public void start(IWorld world, int waitTicks) {
							this.waitTicks = waitTicks;
							MinecraftForge.EVENT_BUS.register(this);
							this.world = world;
						}

						@SubscribeEvent
						public void tick(TickEvent.ServerTickEvent event) {
							if (event.phase == TickEvent.Phase.END) {
								this.ticks += 1;
								if (this.ticks >= this.waitTicks)
									run();
							}
						}

						private void run() {
							NewBlocksModVariables.WorldVariables.get(world).numberx = (-6);
							NewBlocksModVariables.WorldVariables.get(world).syncData(world);
							NewBlocksModVariables.WorldVariables.get(world).found = (false);
							NewBlocksModVariables.WorldVariables.get(world).syncData(world);
							for (int index0 = 0; index0 < (int) (12); index0++) {
								NewBlocksModVariables.WorldVariables.get(world).numbery = (-6);
								NewBlocksModVariables.WorldVariables.get(world).syncData(world);
								for (int index1 = 0; index1 < (int) (12); index1++) {
									NewBlocksModVariables.WorldVariables.get(world).numbery = (-6);
									NewBlocksModVariables.WorldVariables.get(world).syncData(world);
									for (int index2 = 0; index2 < (int) (12); index2++) {
										if ((world.getBlockState(new BlockPos(x + NewBlocksModVariables.WorldVariables.get(world).numberx,
												y + NewBlocksModVariables.WorldVariables.get(world).numbery,
												z + NewBlocksModVariables.WorldVariables.get(world).numberz))).getBlock() == Blocks.WATER
												|| (world.getBlockState(new BlockPos(x + NewBlocksModVariables.WorldVariables.get(world).numberx,
														y + NewBlocksModVariables.WorldVariables.get(world).numbery,
														z + NewBlocksModVariables.WorldVariables.get(world).numberz))).getBlock() == Blocks.WATER) {
											NewBlocksModVariables.WorldVariables.get(world).found = (true);
											NewBlocksModVariables.WorldVariables.get(world).syncData(world);
										}
										NewBlocksModVariables.WorldVariables
												.get(world).ReturnZValue = (NewBlocksModVariables.WorldVariables.get(world).ReturnZValue + 1);
										NewBlocksModVariables.WorldVariables.get(world).syncData(world);
									}
									NewBlocksModVariables.WorldVariables
											.get(world).ReturnYValue = (NewBlocksModVariables.WorldVariables.get(world).ReturnYValue + 1);
									NewBlocksModVariables.WorldVariables.get(world).syncData(world);
								}
								NewBlocksModVariables.WorldVariables
										.get(world).ReturnXValue = (NewBlocksModVariables.WorldVariables.get(world).ReturnXValue + 1);
								NewBlocksModVariables.WorldVariables.get(world).syncData(world);
							}
							if (NewBlocksModVariables.WorldVariables.get(world).found == true) {
								if (0.12 >= Math.random()) {
									world.setBlockState(new BlockPos(x, y, z), BigDripleafBlock.block.getDefaultState(), 3);
								}
							}
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, (int) 28);
				} else {
					world.setBlockState(new BlockPos(x, y, z), Blocks.CAVE_AIR.getDefaultState(), 3);
				}
			} else if (0.1 >= Math.random() && BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
					.contains((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock())) {
				if (0.1 >= Math.random()) {
					world.setBlockState(new BlockPos(x, y + 1, z), MossBlock.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos(x, y, z), SporeBlossomBlock.block.getDefaultState(), 3);
				}
			} else if (0.08 >= Math.random() && BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
					.contains((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock())) {
				world.setBlockState(new BlockPos(x, y + 1, z), MossBlock.block.getDefaultState(), 3);
				world.setBlockState(new BlockPos(x, y, z), CavePlantBlock.block.getDefaultState(), 3);
			} else {
				if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
						.contains((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock())) {
					world.setBlockState(new BlockPos(x, y + 1, z), MossBlock.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos(x, y, z), Blocks.CAVE_AIR.getDefaultState(), 3);
				}
			}
		}
	}
}
