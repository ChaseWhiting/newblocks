package net.mcreator.newblocks.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;
import java.util.HashMap;

public class PlayerMobRainProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
			if (event.phase == TickEvent.Phase.END) {
				Entity entity = event.player;
				World world = entity.world;
				double i = entity.getPosX();
				double j = entity.getPosY();
				double k = entity.getPosZ();
				Map<String, Object> dependencies = new HashMap<>();
				dependencies.put("x", i);
				dependencies.put("y", j);
				dependencies.put("z", k);
				dependencies.put("world", world);
				dependencies.put("entity", entity);
				dependencies.put("event", event);
				executeProcedure(dependencies);
			}
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure PlayerMobRain!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure PlayerMobRain!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure PlayerMobRain!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure PlayerMobRain!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure PlayerMobRain!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		boolean LaunchStatus = false;
		double RandomZ = 0;
		double RandomX = 0;
		double Y = 0;
		double Level = 0;
		if (Math.random() < 0.1) {
			if (Math.random() < 0.1) {
				if (entity.getPersistentData().getBoolean("IsSkeletonRain") == true) {
					LaunchStatus = (false);
					while (LaunchStatus == false) {
						if (Math.random() < 0.01) {
							if (Math.random() < 0.01) {
								LaunchStatus = (true);
							}
						}
					}
					if (LaunchStatus == true) {
						if (Math.random() < 0.5) {
							Level = 2;
						} else {
							Level = 1;
						}
						for (int index1 = 0; index1 < (int) (10 * Level); index1++) {
							if (Math.random() < 0.5) {
								RandomX = (x + Math.random() * 60);
							} else {
								RandomX = (x - Math.random() * 60);
							}
							if (Math.random() < 0.5) {
								RandomZ = (z + Math.random() * 60);
							} else {
								RandomZ = (z - Math.random() * 60);
							}
							Y = (y + 40);
							if (world instanceof ServerWorld) {
								((World) world).getServer().getCommandManager().handleCommand(
										new CommandSource(ICommandSource.DUMMY, new Vector3d(RandomX, Y, RandomZ), Vector2f.ZERO, (ServerWorld) world,
												4, "", new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
										"summon skeleton ~ ~ ~ {HandItems:[{id:\"minecraft:bow\",Count:1b},{}],ActiveEffects:[{Id:28b,Amplifier:1b,Duration:320,ShowParticles:0b}]}");
							}
						}
						for (int index2 = 0; index2 < (int) (7 * Level); index2++) {
							if (Math.random() < 0.5) {
								RandomX = (x + Math.random() * 40);
							} else {
								RandomX = (x - Math.random() * 40);
							}
							if (Math.random() < 0.5) {
								RandomZ = (z + Math.random() * 40);
							} else {
								RandomZ = (z - Math.random() * 40);
							}
							Y = (y + 40);
							if (world instanceof ServerWorld) {
								((World) world).getServer().getCommandManager().handleCommand(
										new CommandSource(ICommandSource.DUMMY, new Vector3d(RandomX, Y, RandomZ), Vector2f.ZERO, (ServerWorld) world,
												4, "", new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
										"summon skeleton ~ ~ ~ {HandItems:[{id:\"minecraft:bow\",Count:1b},{}],ActiveEffects:[{Id:28b,Amplifier:1b,Duration:320,ShowParticles:0b}]}");
							}
						}
						for (int index3 = 0; index3 < (int) (4 * Level); index3++) {
							if (Math.random() < 0.5) {
								RandomX = (x + Math.random() * 40);
							} else {
								RandomX = (x - Math.random() * 40);
							}
							if (Math.random() < 0.5) {
								RandomZ = (z + Math.random() * 40);
							} else {
								RandomZ = (z - Math.random() * 40);
							}
							Y = (y + 40);
							if (world instanceof ServerWorld) {
								((World) world).getServer().getCommandManager().handleCommand(
										new CommandSource(ICommandSource.DUMMY, new Vector3d(RandomX, Y, RandomZ), Vector2f.ZERO, (ServerWorld) world,
												4, "", new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
										"summon skeleton ~ ~ ~ {HandItems:[{id:\"minecraft:bow\",Count:1b},{}],ActiveEffects:[{Id:28b,Amplifier:1b,Duration:320,ShowParticles:0b}]}");
							}
						}
					}
				}
			}
		}
		if (Math.random() < 0.1) {
			if (Math.random() < 0.1) {
				if (entity.getPersistentData().getBoolean("IsZombieRain") == true) {
					LaunchStatus = (false);
					while (LaunchStatus == false) {
						if (Math.random() < 0.01) {
							if (Math.random() < 0.01) {
								LaunchStatus = (true);
							}
						}
					}
					if (LaunchStatus == true) {
						if (Math.random() < 0.5) {
							Level = 2;
						} else {
							Level = 1;
						}
						for (int index5 = 0; index5 < (int) (10 * Level); index5++) {
							if (Math.random() < 0.5) {
								RandomX = (x + Math.random() * 60);
							} else {
								RandomX = (x - Math.random() * 60);
							}
							if (Math.random() < 0.5) {
								RandomZ = (z + Math.random() * 60);
							} else {
								RandomZ = (z - Math.random() * 60);
							}
							Y = (y + 40);
							if (world instanceof ServerWorld) {
								((World) world).getServer().getCommandManager().handleCommand(
										new CommandSource(ICommandSource.DUMMY, new Vector3d(RandomX, Y, RandomZ), Vector2f.ZERO, (ServerWorld) world,
												4, "", new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
										"summon zombie ~ ~ ~ {HandItems:[{id:\"minecraft:bow\",Count:1b},{}],ActiveEffects:[{Id:28b,Amplifier:1b,Duration:320,ShowParticles:0b}]}");
							}
						}
						for (int index6 = 0; index6 < (int) (7 * Level); index6++) {
							if (Math.random() < 0.5) {
								RandomX = (x + Math.random() * 40);
							} else {
								RandomX = (x - Math.random() * 40);
							}
							if (Math.random() < 0.5) {
								RandomZ = (z + Math.random() * 40);
							} else {
								RandomZ = (z - Math.random() * 40);
							}
							Y = (y + 40);
							if (world instanceof ServerWorld) {
								((World) world).getServer().getCommandManager().handleCommand(
										new CommandSource(ICommandSource.DUMMY, new Vector3d(RandomX, Y, RandomZ), Vector2f.ZERO, (ServerWorld) world,
												4, "", new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
										"summon zombie ~ ~ ~ {HandItems:[{id:\"minecraft:bow\",Count:1b},{}],ActiveEffects:[{Id:28b,Amplifier:1b,Duration:320,ShowParticles:0b}]}");
							}
						}
						for (int index7 = 0; index7 < (int) (4 * Level); index7++) {
							if (Math.random() < 0.5) {
								RandomX = (x + Math.random() * 40);
							} else {
								RandomX = (x - Math.random() * 40);
							}
							if (Math.random() < 0.5) {
								RandomZ = (z + Math.random() * 40);
							} else {
								RandomZ = (z - Math.random() * 40);
							}
							Y = (y + 40);
							if (world instanceof ServerWorld) {
								((World) world).getServer().getCommandManager().handleCommand(
										new CommandSource(ICommandSource.DUMMY, new Vector3d(RandomX, Y, RandomZ), Vector2f.ZERO, (ServerWorld) world,
												4, "", new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
										"summon zombie ~ ~ ~ {HandItems:[{id:\"minecraft:bow\",Count:1b},{}],ActiveEffects:[{Id:28b,Amplifier:1b,Duration:320,ShowParticles:0b}]}");
							}
						}
					}
				}
			}
		}
		if (Math.random() < 0.1) {
			if (Math.random() < 0.1) {
				if (entity.getPersistentData().getBoolean("IsCreeperRain") == true) {
					LaunchStatus = (false);
					while (LaunchStatus == false) {
						if (Math.random() < 0.01) {
							if (Math.random() < 0.01) {
								LaunchStatus = (true);
							}
						}
					}
					if (LaunchStatus == true) {
						if (Math.random() < 0.5) {
							Level = 2;
						} else {
							Level = 1;
						}
						for (int index9 = 0; index9 < (int) (10 * Level); index9++) {
							if (Math.random() < 0.5) {
								RandomX = (x + Math.random() * 60);
							} else {
								RandomX = (x - Math.random() * 60);
							}
							if (Math.random() < 0.5) {
								RandomZ = (z + Math.random() * 60);
							} else {
								RandomZ = (z - Math.random() * 60);
							}
							Y = (y + 40);
							if (world instanceof ServerWorld) {
								((World) world).getServer().getCommandManager().handleCommand(
										new CommandSource(ICommandSource.DUMMY, new Vector3d(RandomX, Y, RandomZ), Vector2f.ZERO, (ServerWorld) world,
												4, "", new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
										"summon creeper ~ ~ ~ {HandItems:[{id:\"minecraft:bow\",Count:1b},{}],ActiveEffects:[{Id:28b,Amplifier:1b,Duration:320,ShowParticles:0b}]}");
							}
						}
						for (int index10 = 0; index10 < (int) (7 * Level); index10++) {
							if (Math.random() < 0.5) {
								RandomX = (x + Math.random() * 40);
							} else {
								RandomX = (x - Math.random() * 40);
							}
							if (Math.random() < 0.5) {
								RandomZ = (z + Math.random() * 40);
							} else {
								RandomZ = (z - Math.random() * 40);
							}
							Y = (y + 40);
							if (world instanceof ServerWorld) {
								((World) world).getServer().getCommandManager().handleCommand(
										new CommandSource(ICommandSource.DUMMY, new Vector3d(RandomX, Y, RandomZ), Vector2f.ZERO, (ServerWorld) world,
												4, "", new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
										"summon creeper ~ ~ ~ {HandItems:[{id:\"minecraft:bow\",Count:1b},{}],ActiveEffects:[{Id:28b,Amplifier:1b,Duration:320,ShowParticles:0b}]}");
							}
						}
						for (int index11 = 0; index11 < (int) (4 * Level); index11++) {
							if (Math.random() < 0.5) {
								RandomX = (x + Math.random() * 40);
							} else {
								RandomX = (x - Math.random() * 40);
							}
							if (Math.random() < 0.5) {
								RandomZ = (z + Math.random() * 40);
							} else {
								RandomZ = (z - Math.random() * 40);
							}
							Y = (y + 40);
							if (world instanceof ServerWorld) {
								((World) world).getServer().getCommandManager().handleCommand(
										new CommandSource(ICommandSource.DUMMY, new Vector3d(RandomX, Y, RandomZ), Vector2f.ZERO, (ServerWorld) world,
												4, "", new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
										"summon creeper ~ ~ ~ {HandItems:[{id:\"minecraft:bow\",Count:1b},{}],ActiveEffects:[{Id:28b,Amplifier:1b,Duration:320,ShowParticles:0b}]}");
							}
						}
					}
				}
			}
		}
	}
}
