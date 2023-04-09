package net.mcreator.newblocks.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;
import net.minecraft.block.Blocks;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class WraithReplaceBlocksProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure WraithReplaceBlocks!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure WraithReplaceBlocks!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure WraithReplaceBlocks!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure WraithReplaceBlocks!");
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
		if ((world instanceof World ? (((World) world).getDimensionKey()) : World.OVERWORLD) == (World.THE_NETHER)) {
			if (BlockTags.getCollection().getTagByID(new ResourceLocation("new_blocks:wraith_replaceable"))
					.contains((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock())) {
				if (Math.random() < 0.8) {
					world.setBlockState(new BlockPos(x, y - 1, z), Blocks.SOUL_SAND.getDefaultState(), 3);
					if (Math.random() < 0.2) {
						if (Math.random() < 0.4) {
							if (Math.random() < 0.2) {
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
										if (world.isAirBlock(new BlockPos(x, y, z))) {
											if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.SOUL_SAND) {
												if (world instanceof ServerWorld) {
													((World) world).getServer().getCommandManager().handleCommand(
															new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO,
																	(ServerWorld) world, 4, "", new StringTextComponent(""),
																	((World) world).getServer(), null).withFeedbackDisabled(),
															"setblock ~ ~ ~ soul_fire");
												}
											}
										}
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 2);
							}
						}
					}
				} else {
					world.setBlockState(new BlockPos(x, y - 1, z), Blocks.SOUL_SAND.getDefaultState(), 3);
					if (Math.random() < 0.2) {
						if (Math.random() < 0.4) {
							if (Math.random() < 0.2) {
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
										if (world.isAirBlock(new BlockPos(x, y, z))) {
											if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.SOUL_SAND) {
												if (world instanceof ServerWorld) {
													((World) world).getServer().getCommandManager().handleCommand(
															new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO,
																	(ServerWorld) world, 4, "", new StringTextComponent(""),
																	((World) world).getServer(), null).withFeedbackDisabled(),
															"setblock ~ ~ ~ soul_fire");
												}
											}
										}
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 2);
							}
						}
					}
				}
				if (BlockTags.getCollection().getTagByID(new ResourceLocation("new_blocks:wraith_replaceable"))
						.contains((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock())) {
					world.setBlockState(new BlockPos(x, y + 1, z), Blocks.SOUL_SAND.getDefaultState(), 3);
				}
			} else if (0.1 >= Math.random() && BlockTags.getCollection().getTagByID(new ResourceLocation("new_blocks:wraith_replaceable"))
					.contains((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock())) {
				if (0.1 >= Math.random()) {
					world.setBlockState(new BlockPos(x, y + 1, z), Blocks.SOUL_SAND.getDefaultState(), 3);
					if (0.1 >= Math.random()) {
						world.setBlockState(new BlockPos(x, y - 1, z), Blocks.SOUL_SAND.getDefaultState(), 3);
					}
				}
			} else if (0.1 >= Math.random() && BlockTags.getCollection().getTagByID(new ResourceLocation("new_blocks:wraith_replaceable"))
					.contains((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock())) {
				world.setBlockState(new BlockPos(x, y + 1, z), Blocks.SOUL_SAND.getDefaultState(), 3);
			} else {
				if (BlockTags.getCollection().getTagByID(new ResourceLocation("new_blocks:replaceable"))
						.contains((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock())) {
					world.setBlockState(new BlockPos(x, y + 1, z), Blocks.SOUL_SAND.getDefaultState(), 3);
					if (0.1 >= Math.random()) {
						world.setBlockState(new BlockPos(x, y - 1, z), Blocks.SOUL_SAND.getDefaultState(), 3);
					}
				}
			}
		}
	}
}
