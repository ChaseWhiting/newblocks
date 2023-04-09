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
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;
import net.minecraft.block.Blocks;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

public class NothingProjectileHitsBlockProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure NothingProjectileHitsBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure NothingProjectileHitsBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure NothingProjectileHitsBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure NothingProjectileHitsBlock!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		double zs = 0;
		double ys = 0;
		double xs = 0;
		zs = (-18);
		for (int index0 = 0; index0 < (int) (32); index0++) {
			xs = (-18);
			for (int index1 = 0; index1 < (int) (32); index1++) {
				ys = (-18);
				for (int index2 = 0; index2 < (int) (32); index2++) {
					ys = (ys + 1);
					WraithReplaceBlocksProcedure.executeProcedure(Stream
							.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", (x + xs)),
									new AbstractMap.SimpleEntry<>("y", (y + ys)), new AbstractMap.SimpleEntry<>("z", (z + zs)))
							.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
				}
				xs = (xs + 1);
			}
			zs = (zs + 1);
		}
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
				if (Math.random() < 0.8) {
					if (world instanceof ServerWorld) {
						((World) world).getServer().getCommandManager().handleCommand(
								new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
										new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
								"setblock ~ ~1 ~ soul_fire");
					}
					if (Math.random() < 0.4) {
						if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.SOUL_SAND
								|| (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.SOUL_SOIL) {
							if (world instanceof ServerWorld) {
								((World) world).getServer().getCommandManager().handleCommand(
										new CommandSource(ICommandSource.DUMMY, new Vector3d((x - 1), y, z), Vector2f.ZERO, (ServerWorld) world, 4,
												"", new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
										"setblock ~ ~1 ~ soul_fire");
							}
						}
					}
					if (Math.random() < 0.4) {
						if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.SOUL_SAND
								|| (world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.SOUL_SOIL) {
							if (world instanceof ServerWorld) {
								((World) world).getServer().getCommandManager().handleCommand(
										new CommandSource(ICommandSource.DUMMY, new Vector3d((x + 1), y, z), Vector2f.ZERO, (ServerWorld) world, 4,
												"", new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
										"setblock ~ ~1 ~ soul_fire");
							}
						}
					}
					if (Math.random() < 0.4) {
						if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.SOUL_SAND
								|| (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.SOUL_SOIL) {
							if (world instanceof ServerWorld) {
								((World) world).getServer().getCommandManager().handleCommand(
										new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, (z - 1)), Vector2f.ZERO, (ServerWorld) world, 4,
												"", new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
										"setblock ~ ~1 ~ soul_fire");
							}
						}
					}
					if (Math.random() < 0.4) {
						if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.SOUL_SAND
								|| (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.SOUL_SOIL) {
							if (world instanceof ServerWorld) {
								((World) world).getServer().getCommandManager().handleCommand(
										new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, (z + 1)), Vector2f.ZERO, (ServerWorld) world, 4,
												"", new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
										"setblock ~ ~1 ~ soul_fire");
							}
						}
					}
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, (int) 15);
	}
}
