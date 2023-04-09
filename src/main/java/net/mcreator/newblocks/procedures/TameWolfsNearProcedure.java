package net.mcreator.newblocks.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.passive.CatEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.function.Function;
import java.util.Map;
import java.util.HashMap;
import java.util.Comparator;

public class TameWolfsNearProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onEntityTick(LivingEvent.LivingUpdateEvent event) {
			Entity entity = event.getEntityLiving();
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

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure TameWolfsNear!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure TameWolfsNear!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure TameWolfsNear!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure TameWolfsNear!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure TameWolfsNear!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof WolfEntity) {
			if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
				if (Math.random() < 0.7) {
					if (Math.random() < 0.7) {
						if (Math.random() < 0.7) {
							if (Math.random() < 0.7) {
								if (Math.random() < 0.7) {
									if (Math.random() < 0.7) {
										if (Math.random() < 0.7) {
											if (Math.random() < 0.7) {
												if (Math.random() < 0.7) {
													if (Math.random() < 0.7) {
														if (entity.isAlive()) {
															if (((Entity) world
																	.getEntitiesWithinAABB(PlayerEntity.class,
																			new AxisAlignedBB(x - (15 / 2d), y - (15 / 2d), z - (15 / 2d),
																					x + (15 / 2d), y + (15 / 2d), z + (15 / 2d)),
																			null)
																	.stream().sorted(new Object() {
																		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																			return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd
																					.getDistanceSq(_x, _y, _z)));
																		}
																	}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null) {
																if (((entity instanceof MobEntity)
																		? ((MobEntity) entity).getAttackTarget()
																		: null) instanceof LivingEntity) {
																	{
																		Entity _ent = entity;
																		if (!_ent.world.isRemote && _ent.world.getServer() != null) {
																			_ent.world.getServer().getCommandManager().handleCommand(
																					_ent.getCommandSource().withFeedbackDisabled()
																							.withPermissionLevel(4),
																					"execute as @s run data modify entity @s Sitting set value 0");
																		}
																	}
																} else {
																	{
																		Entity _ent = entity;
																		if (!_ent.world.isRemote && _ent.world.getServer() != null) {
																			_ent.world.getServer().getCommandManager().handleCommand(
																					_ent.getCommandSource().withFeedbackDisabled()
																							.withPermissionLevel(4),
																					"execute as @s run data modify entity @s Sitting set value 1");
																		}
																	}
																}
															} else {
																{
																	Entity _ent = entity;
																	if (!_ent.world.isRemote && _ent.world.getServer() != null) {
																		_ent.world.getServer().getCommandManager().handleCommand(
																				_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
																				"execute as @s run data modify entity @s Sitting set value 0");
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
						}
					}
				}
			}
		} else if (entity instanceof CatEntity) {
			if ((entity instanceof TameableEntity) ? ((TameableEntity) entity).isTamed() : false) {
				if (Math.random() < 0.7) {
					if (Math.random() < 0.7) {
						if (Math.random() < 0.7) {
							if (Math.random() < 0.7) {
								if (Math.random() < 0.7) {
									if (Math.random() < 0.7) {
										if (Math.random() < 0.7) {
											if (Math.random() < 0.7) {
												if (Math.random() < 0.7) {
													if (Math.random() < 0.7) {
														if (entity.isAlive()) {
															if (((Entity) world
																	.getEntitiesWithinAABB(PlayerEntity.class, new AxisAlignedBB(x - (9 / 2d),
																			y - (9 / 2d), z - (9 / 2d), x + (9 / 2d), y + (9 / 2d), z + (9 / 2d)),
																			null)
																	.stream().sorted(new Object() {
																		Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																			return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd
																					.getDistanceSq(_x, _y, _z)));
																		}
																	}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null) {
																{
																	Entity _ent = entity;
																	if (!_ent.world.isRemote && _ent.world.getServer() != null) {
																		_ent.world.getServer().getCommandManager().handleCommand(
																				_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
																				"execute as @s run data modify entity @s Sitting set value 1");
																	}
																}
															} else {
																{
																	Entity _ent = entity;
																	if (!_ent.world.isRemote && _ent.world.getServer() != null) {
																		_ent.world.getServer().getCommandManager().handleCommand(
																				_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
																				"execute as @s run data modify entity @s Sitting set value 0");
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
						}
					}
				}
			}
		}
	}
}
