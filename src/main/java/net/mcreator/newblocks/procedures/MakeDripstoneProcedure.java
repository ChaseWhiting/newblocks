package net.mcreator.newblocks.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.block.Blocks;

import net.mcreator.newblocks.block.DripstoneUpTipBlock;
import net.mcreator.newblocks.block.DripstoneUpMiddleBlock;
import net.mcreator.newblocks.block.DripstoneUpFrustrumBlock;
import net.mcreator.newblocks.block.DripstoneDownTipBlock;
import net.mcreator.newblocks.block.DripstoneDownFrustrumBlock;
import net.mcreator.newblocks.block.DripstoneBlockBlock;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class MakeDripstoneProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure MakeDripstone!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure MakeDripstone!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure MakeDripstone!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure MakeDripstone!");
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
					world.setBlockState(new BlockPos(x, y - 1, z), DripstoneBlockBlock.block.getDefaultState(), 3);
				} else {
					world.setBlockState(new BlockPos(x, y - 1, z), DripstoneBlockBlock.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos(x, y - 2, z), DripstoneBlockBlock.block.getDefaultState(), 3);
				}
				if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
						.contains((world.getBlockState(new BlockPos(x, y - 2, z))).getBlock())) {
					if (0.04 >= Math.random()) {
						world.setBlockState(new BlockPos(x, y - 2, z), Blocks.WATER.getDefaultState(), 3);
					} else {
						world.setBlockState(new BlockPos(x, y - 2, z), DripstoneBlockBlock.block.getDefaultState(), 3);
					}
				}
				if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
						.contains((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock())) {
					world.setBlockState(new BlockPos(x, y + 1, z), DripstoneBlockBlock.block.getDefaultState(), 3);
					if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
							.contains((world.getBlockState(new BlockPos(x, y + 2, z))).getBlock())) {
						world.setBlockState(new BlockPos(x, y + 2, z), DripstoneBlockBlock.block.getDefaultState(), 3);
						if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
								.contains((world.getBlockState(new BlockPos(x, y + 3, z))).getBlock())) {
							world.setBlockState(new BlockPos(x, y + 3, z), DripstoneBlockBlock.block.getDefaultState(), 3);
							if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
									.contains((world.getBlockState(new BlockPos(x, y + 4, z))).getBlock())) {
								world.setBlockState(new BlockPos(x, y + 4, z), DripstoneBlockBlock.block.getDefaultState(), 3);
								if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
										.contains((world.getBlockState(new BlockPos(x, y + 5, z))).getBlock())) {
									world.setBlockState(new BlockPos(x, y + 5, z), DripstoneBlockBlock.block.getDefaultState(), 3);
								}
							}
						}
					}
				}
				if (0.04 >= Math.random()) {
					world.setBlockState(new BlockPos(x, y, z), DripstoneUpTipBlock.block.getDefaultState(), 3);
				} else if (0.1 >= Math.random()) {
					world.setBlockState(new BlockPos(x, y, z), DripstoneUpFrustrumBlock.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos(x, y + 1, z), DripstoneUpTipBlock.block.getDefaultState(), 3);
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
					world.setBlockState(new BlockPos(x, y, z), DripstoneUpMiddleBlock.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos(x, y + 1, z), DripstoneUpFrustrumBlock.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos(x, y + 2, z), DripstoneUpTipBlock.block.getDefaultState(), 3);
				} else if (0.1 >= Math.random()) {
					world.setBlockState(new BlockPos(x, y, z), DripstoneUpMiddleBlock.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos(x, y + 1, z), DripstoneUpMiddleBlock.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos(x, y + 2, z), DripstoneUpFrustrumBlock.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos(x, y + 3, z), DripstoneUpTipBlock.block.getDefaultState(), 3);
				} else {
					world.setBlockState(new BlockPos(x, y, z), Blocks.CAVE_AIR.getDefaultState(), 3);
				}
			} else if (0.1 >= Math.random() && BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
					.contains((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock())) {
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
						if (0.1 >= Math.random()) {
							world.setBlockState(new BlockPos(x, y + 1, z), DripstoneBlockBlock.block.getDefaultState(), 3);
							world.setBlockState(new BlockPos(x, y, z), DripstoneDownTipBlock.block.getDefaultState(), 3);
						} else {
							world.setBlockState(new BlockPos(x, y + 1, z), DripstoneBlockBlock.block.getDefaultState(), 3);
							world.setBlockState(new BlockPos(x, y, z), DripstoneDownFrustrumBlock.block.getDefaultState(), 3);
							world.setBlockState(new BlockPos(x, y - 1, z), DripstoneDownTipBlock.block.getDefaultState(), 3);
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, (int) 20);
			} else if (0.08 >= Math.random() && BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
					.contains((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock())) {
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
						world.setBlockState(new BlockPos(x, y + 1, z), DripstoneBlockBlock.block.getDefaultState(), 3);
						world.setBlockState(new BlockPos(x, y, z), DripstoneDownTipBlock.block.getDefaultState(), 3);
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, (int) 20);
			} else {
				if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:stones"))
						.contains((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock())) {
					world.setBlockState(new BlockPos(x, y + 1, z), DripstoneBlockBlock.block.getDefaultState(), 3);
					world.setBlockState(new BlockPos(x, y, z), Blocks.CAVE_AIR.getDefaultState(), 3);
				}
			}
		}
	}
}
