package net.mcreator.newblocks.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.entity.passive.CatEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Comparator;
import java.util.Collections;

public class PlayerMorphTickProcedure {
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
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure PlayerMorphTick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure PlayerMorphTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure PlayerMorphTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure PlayerMorphTick!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure PlayerMorphTick!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (entity.getPersistentData().getBoolean("isCat") == true) {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"team add 1");
				}
			}
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.INVISIBILITY, (int) 20, (int) 1, (false), (false)));
			{
				List<Entity> _entfound = world
						.getEntitiesWithinAABB(Entity.class,
								new AxisAlignedBB(x - (6 / 2d), y - (6 / 2d), z - (6 / 2d), x + (6 / 2d), y + (6 / 2d), z + (6 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if ((entityiterator.getUniqueID().toString()).equals("0000000b-0000-000b-0000-000b0000000b")) {
						{
							Entity _ent = entityiterator;
							_ent.setPositionAndUpdate((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()));
							if (_ent instanceof ServerPlayerEntity) {
								((ServerPlayerEntity) _ent).connection.setPlayerLocation((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()),
										_ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
							}
						}
						entity.fallDistance = (float) (0);
						entityiterator.fallDistance = (float) (0);
						entityiterator.rotationYaw = (float) ((entity.rotationYaw));
						entity.setRenderYawOffset(entity.rotationYaw);
						entity.prevRotationYaw = entity.rotationYaw;
						if (entity instanceof LivingEntity) {
							((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
							((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
							((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
						}
						entityiterator.rotationPitch = (float) ((entity.rotationPitch));
					}
					if (entityiterator instanceof CatEntity) {
						{
							Entity _ent = entity;
							if (!_ent.world.isRemote && _ent.world.getServer() != null) {
								_ent.world.getServer().getCommandManager()
										.handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "team join 1");
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.world.isRemote && _ent.world.getServer() != null) {
								_ent.world.getServer().getCommandManager().handleCommand(
										_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "team modify 1 collisionRule never");
							}
						}
						{
							Entity _ent = entityiterator;
							if (!_ent.world.isRemote && _ent.world.getServer() != null) {
								_ent.world.getServer().getCommandManager()
										.handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "team join 1");
							}
						}
						entityiterator.rotationYaw = (float) ((entity.rotationYaw));
						entity.setRenderYawOffset(entity.rotationYaw);
						entity.prevRotationYaw = entity.rotationYaw;
						if (entity instanceof LivingEntity) {
							((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
							((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
							((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
						}
						entityiterator.rotationPitch = (float) ((entity.rotationPitch));
					}
				}
			}
		} else if (entity.getPersistentData().getBoolean("isCow") == true) {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"team add 1");
				}
			}
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.INVISIBILITY, (int) 20, (int) 1, (false), (false)));
			{
				List<Entity> _entfound = world
						.getEntitiesWithinAABB(Entity.class,
								new AxisAlignedBB(x - (6 / 2d), y - (6 / 2d), z - (6 / 2d), x + (6 / 2d), y + (6 / 2d), z + (6 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if ((entityiterator.getUniqueID().toString()).equals("0000000b-0000-000b-0000-000b0000000b")) {
						{
							Entity _ent = entityiterator;
							_ent.setPositionAndUpdate((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()));
							if (_ent instanceof ServerPlayerEntity) {
								((ServerPlayerEntity) _ent).connection.setPlayerLocation((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()),
										_ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
							}
						}
						entity.fallDistance = (float) (0);
						entityiterator.fallDistance = (float) (0);
						entityiterator.rotationYaw = (float) ((entity.rotationYaw));
						entity.setRenderYawOffset(entity.rotationYaw);
						entity.prevRotationYaw = entity.rotationYaw;
						if (entity instanceof LivingEntity) {
							((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
							((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
							((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
						}
						entityiterator.rotationPitch = (float) ((entity.rotationPitch));
					}
					if (entityiterator instanceof CowEntity) {
						{
							Entity _ent = entity;
							if (!_ent.world.isRemote && _ent.world.getServer() != null) {
								_ent.world.getServer().getCommandManager()
										.handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "team join 1");
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.world.isRemote && _ent.world.getServer() != null) {
								_ent.world.getServer().getCommandManager().handleCommand(
										_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "team modify 1 collisionRule never");
							}
						}
						{
							Entity _ent = entityiterator;
							if (!_ent.world.isRemote && _ent.world.getServer() != null) {
								_ent.world.getServer().getCommandManager()
										.handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "team join 1");
							}
						}
						entityiterator.rotationYaw = (float) ((entity.rotationYaw));
						entity.setRenderYawOffset(entity.rotationYaw);
						entity.prevRotationYaw = entity.rotationYaw;
						if (entity instanceof LivingEntity) {
							((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
							((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
							((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
						}
						entityiterator.rotationPitch = (float) ((entity.rotationPitch));
					}
				}
			}
		} else if (entity.getPersistentData().getBoolean("isRageWarden") == true) {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"team add 1");
				}
			}
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.INVISIBILITY, (int) 20, (int) 1, (false), (false)));
			{
				List<Entity> _entfound = world
						.getEntitiesWithinAABB(Entity.class,
								new AxisAlignedBB(x - (6 / 2d), y - (6 / 2d), z - (6 / 2d), x + (6 / 2d), y + (6 / 2d), z + (6 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if ((entityiterator.getUniqueID().toString()).equals("0000000b-0000-000b-0000-000b0000000b")) {
						{
							Entity _ent = entityiterator;
							_ent.setPositionAndUpdate((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()));
							if (_ent instanceof ServerPlayerEntity) {
								((ServerPlayerEntity) _ent).connection.setPlayerLocation((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()),
										_ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
							}
						}
						entity.fallDistance = (float) (0);
						entityiterator.fallDistance = (float) (0);
						entityiterator.rotationYaw = (float) ((entity.rotationYaw));
						entity.setRenderYawOffset(entity.rotationYaw);
						entity.prevRotationYaw = entity.rotationYaw;
						if (entity instanceof LivingEntity) {
							((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
							((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
							((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
						}
						entityiterator.rotationPitch = (float) ((entity.rotationPitch));
						{
							Entity _ent = entity;
							if (!_ent.world.isRemote && _ent.world.getServer() != null) {
								_ent.world.getServer().getCommandManager()
										.handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "team join 1");
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.world.isRemote && _ent.world.getServer() != null) {
								_ent.world.getServer().getCommandManager().handleCommand(
										_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "team modify 1 collisionRule never");
							}
						}
						{
							Entity _ent = entityiterator;
							if (!_ent.world.isRemote && _ent.world.getServer() != null) {
								_ent.world.getServer().getCommandManager()
										.handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "team join 1");
							}
						}
					}
				}
			}
		} else if (entity.getPersistentData().getBoolean("isRabbit") == true) {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"team add 1");
				}
			}
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.INVISIBILITY, (int) 20, (int) 1, (false), (false)));
			{
				List<Entity> _entfound = world
						.getEntitiesWithinAABB(Entity.class,
								new AxisAlignedBB(x - (6 / 2d), y - (6 / 2d), z - (6 / 2d), x + (6 / 2d), y + (6 / 2d), z + (6 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if ((entityiterator.getUniqueID().toString()).equals("0000000b-0000-000b-0000-000b0000000b")) {
						{
							Entity _ent = entityiterator;
							_ent.setPositionAndUpdate((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()));
							if (_ent instanceof ServerPlayerEntity) {
								((ServerPlayerEntity) _ent).connection.setPlayerLocation((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()),
										_ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
							}
						}
						entity.fallDistance = (float) (0);
						entityiterator.fallDistance = (float) (0);
						entityiterator.rotationYaw = (float) ((entity.rotationYaw));
						entity.setRenderYawOffset(entity.rotationYaw);
						entity.prevRotationYaw = entity.rotationYaw;
						if (entity instanceof LivingEntity) {
							((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
							((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
							((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
						}
						entityiterator.rotationPitch = (float) ((entity.rotationPitch));
						{
							Entity _ent = entity;
							if (!_ent.world.isRemote && _ent.world.getServer() != null) {
								_ent.world.getServer().getCommandManager()
										.handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "team join 1");
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.world.isRemote && _ent.world.getServer() != null) {
								_ent.world.getServer().getCommandManager().handleCommand(
										_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "team modify 1 collisionRule never");
							}
						}
						{
							Entity _ent = entityiterator;
							if (!_ent.world.isRemote && _ent.world.getServer() != null) {
								_ent.world.getServer().getCommandManager()
										.handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "team join 1");
							}
						}
						if (Math.random() < 0.7) {
							if (Math.random() < 0.7) {
								if (Math.random() < 0.7) {
									if (Math.random() < 0.7) {
										if (Math.random() < 0.7) {
											{
												Entity _ent = entityiterator;
												_ent.setPositionAndUpdate((entity.getPosX()), (entity.getPosY() + 0.5), (entity.getPosZ()));
												if (_ent instanceof ServerPlayerEntity) {
													((ServerPlayerEntity) _ent).connection.setPlayerLocation((entity.getPosX()),
															(entity.getPosY() + 0.5), (entity.getPosZ()), _ent.rotationYaw, _ent.rotationPitch,
															Collections.emptySet());
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
		} else if (entity.getPersistentData().getBoolean("isPanda") == true) {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"team add 1");
				}
			}
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.INVISIBILITY, (int) 20, (int) 1, (false), (false)));
			{
				List<Entity> _entfound = world
						.getEntitiesWithinAABB(Entity.class,
								new AxisAlignedBB(x - (6 / 2d), y - (6 / 2d), z - (6 / 2d), x + (6 / 2d), y + (6 / 2d), z + (6 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if ((entityiterator.getUniqueID().toString()).equals("0000000b-0000-000b-0000-000b0000000b")) {
						{
							Entity _ent = entityiterator;
							_ent.setPositionAndUpdate((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()));
							if (_ent instanceof ServerPlayerEntity) {
								((ServerPlayerEntity) _ent).connection.setPlayerLocation((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()),
										_ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
							}
						}
						entity.fallDistance = (float) (0);
						entityiterator.fallDistance = (float) (0);
						entityiterator.rotationYaw = (float) ((entity.rotationYaw));
						entity.setRenderYawOffset(entity.rotationYaw);
						entity.prevRotationYaw = entity.rotationYaw;
						if (entity instanceof LivingEntity) {
							((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
							((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
							((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
						}
						entityiterator.rotationPitch = (float) ((entity.rotationPitch));
						{
							Entity _ent = entity;
							if (!_ent.world.isRemote && _ent.world.getServer() != null) {
								_ent.world.getServer().getCommandManager()
										.handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "team join 1");
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.world.isRemote && _ent.world.getServer() != null) {
								_ent.world.getServer().getCommandManager().handleCommand(
										_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "team modify 1 collisionRule never");
							}
						}
						{
							Entity _ent = entityiterator;
							if (!_ent.world.isRemote && _ent.world.getServer() != null) {
								_ent.world.getServer().getCommandManager()
										.handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "team join 1");
							}
						}
					}
				}
			}
		} else if (entity.getPersistentData().getBoolean("isWolf") == true) {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"team add 1");
				}
			}
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.INVISIBILITY, (int) 20, (int) 1, (false), (false)));
			{
				List<Entity> _entfound = world
						.getEntitiesWithinAABB(Entity.class,
								new AxisAlignedBB(x - (6 / 2d), y - (6 / 2d), z - (6 / 2d), x + (6 / 2d), y + (6 / 2d), z + (6 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if ((entityiterator.getUniqueID().toString()).equals("0000000b-0000-000b-0000-000b0000000b")) {
						{
							Entity _ent = entityiterator;
							_ent.setPositionAndUpdate((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()));
							if (_ent instanceof ServerPlayerEntity) {
								((ServerPlayerEntity) _ent).connection.setPlayerLocation((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()),
										_ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
							}
						}
						entity.fallDistance = (float) (0);
						entityiterator.fallDistance = (float) (0);
						entityiterator.rotationYaw = (float) ((entity.rotationYaw));
						entity.setRenderYawOffset(entity.rotationYaw);
						entity.prevRotationYaw = entity.rotationYaw;
						if (entity instanceof LivingEntity) {
							((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
							((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
							((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
						}
						entityiterator.rotationPitch = (float) ((entity.rotationPitch));
						{
							Entity _ent = entity;
							if (!_ent.world.isRemote && _ent.world.getServer() != null) {
								_ent.world.getServer().getCommandManager()
										.handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "team join 1");
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.world.isRemote && _ent.world.getServer() != null) {
								_ent.world.getServer().getCommandManager().handleCommand(
										_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "team modify 1 collisionRule never");
							}
						}
						{
							Entity _ent = entityiterator;
							if (!_ent.world.isRemote && _ent.world.getServer() != null) {
								_ent.world.getServer().getCommandManager()
										.handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "team join 1");
							}
						}
					}
				}
			}
		} else if (entity.getPersistentData().getBoolean("isWither") == true) {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"team add 1");
				}
			}
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.INVISIBILITY, (int) 20, (int) 1, (false), (false)));
			{
				List<Entity> _entfound = world
						.getEntitiesWithinAABB(Entity.class,
								new AxisAlignedBB(x - (6 / 2d), y - (6 / 2d), z - (6 / 2d), x + (6 / 2d), y + (6 / 2d), z + (6 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if ((entityiterator.getUniqueID().toString()).equals("0000000b-0000-000b-0000-000b0000000b")) {
						{
							Entity _ent = entityiterator;
							_ent.setPositionAndUpdate((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()));
							if (_ent instanceof ServerPlayerEntity) {
								((ServerPlayerEntity) _ent).connection.setPlayerLocation((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()),
										_ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
							}
						}
						entity.fallDistance = (float) (0);
						entityiterator.fallDistance = (float) (0);
						entityiterator.rotationYaw = (float) ((entity.rotationYaw));
						entity.setRenderYawOffset(entity.rotationYaw);
						entity.prevRotationYaw = entity.rotationYaw;
						if (entity instanceof LivingEntity) {
							((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
							((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
							((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
						}
						entityiterator.rotationPitch = (float) ((entity.rotationPitch));
						{
							Entity _ent = entity;
							if (!_ent.world.isRemote && _ent.world.getServer() != null) {
								_ent.world.getServer().getCommandManager()
										.handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "team join 1");
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.world.isRemote && _ent.world.getServer() != null) {
								_ent.world.getServer().getCommandManager().handleCommand(
										_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "team modify 1 collisionRule never");
							}
						}
						{
							Entity _ent = entityiterator;
							if (!_ent.world.isRemote && _ent.world.getServer() != null) {
								_ent.world.getServer().getCommandManager()
										.handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "team join 1");
							}
						}
					}
				}
			}
		} else if (entity.getPersistentData().getBoolean("isEnderDragon") == true) {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"team add 1");
				}
			}
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.INVISIBILITY, (int) 20, (int) 1, (false), (false)));
			{
				List<Entity> _entfound = world
						.getEntitiesWithinAABB(Entity.class,
								new AxisAlignedBB(x - (6 / 2d), y - (6 / 2d), z - (6 / 2d), x + (6 / 2d), y + (6 / 2d), z + (6 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if ((entityiterator.getUniqueID().toString()).equals("0000000b-0000-000b-0000-000b0000000b")) {
						{
							Entity _ent = entityiterator;
							_ent.setPositionAndUpdate((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()));
							if (_ent instanceof ServerPlayerEntity) {
								((ServerPlayerEntity) _ent).connection.setPlayerLocation((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()),
										_ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
							}
						}
						entity.fallDistance = (float) (0);
						entityiterator.fallDistance = (float) (0);
						entityiterator.rotationYaw = (float) ((entity.rotationYaw));
						entity.setRenderYawOffset(entity.rotationYaw);
						entity.prevRotationYaw = entity.rotationYaw;
						if (entity instanceof LivingEntity) {
							((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
							((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
							((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
						}
						entityiterator.rotationPitch = (float) ((entity.rotationPitch));
						{
							Entity _ent = entity;
							if (!_ent.world.isRemote && _ent.world.getServer() != null) {
								_ent.world.getServer().getCommandManager()
										.handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "team join 1");
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.world.isRemote && _ent.world.getServer() != null) {
								_ent.world.getServer().getCommandManager().handleCommand(
										_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "team modify 1 collisionRule never");
							}
						}
						{
							Entity _ent = entityiterator;
							if (!_ent.world.isRemote && _ent.world.getServer() != null) {
								_ent.world.getServer().getCommandManager()
										.handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "team join 1");
							}
						}
					}
				}
			}
		} else if (entity.getPersistentData().getBoolean("isSalmon") == true) {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"team add 1");
				}
			}
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.INVISIBILITY, (int) 20, (int) 1, (false), (false)));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.WATER_BREATHING, (int) 20, (int) 1, (false), (false)));
			{
				List<Entity> _entfound = world
						.getEntitiesWithinAABB(Entity.class,
								new AxisAlignedBB(x - (6 / 2d), y - (6 / 2d), z - (6 / 2d), x + (6 / 2d), y + (6 / 2d), z + (6 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if ((entityiterator.getUniqueID().toString()).equals("0000000b-0000-000b-0000-000b0000000b")) {
						{
							Entity _ent = entityiterator;
							_ent.setPositionAndUpdate((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()));
							if (_ent instanceof ServerPlayerEntity) {
								((ServerPlayerEntity) _ent).connection.setPlayerLocation((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()),
										_ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
							}
						}
						entity.fallDistance = (float) (0);
						entityiterator.fallDistance = (float) (0);
						entityiterator.rotationYaw = (float) ((entity.rotationYaw));
						entity.setRenderYawOffset(entity.rotationYaw);
						entity.prevRotationYaw = entity.rotationYaw;
						if (entity instanceof LivingEntity) {
							((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
							((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
							((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
						}
						entityiterator.rotationPitch = (float) ((entity.rotationPitch));
						{
							Entity _ent = entity;
							if (!_ent.world.isRemote && _ent.world.getServer() != null) {
								_ent.world.getServer().getCommandManager()
										.handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "team join 1");
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.world.isRemote && _ent.world.getServer() != null) {
								_ent.world.getServer().getCommandManager().handleCommand(
										_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "team modify 1 collisionRule never");
							}
						}
						{
							Entity _ent = entityiterator;
							if (!_ent.world.isRemote && _ent.world.getServer() != null) {
								_ent.world.getServer().getCommandManager()
										.handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "team join 1");
							}
						}
					}
				}
			}
		} else if (entity.getPersistentData().getBoolean("isCod") == true) {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"team add 1");
				}
			}
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.INVISIBILITY, (int) 20, (int) 1, (false), (false)));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.WATER_BREATHING, (int) 20, (int) 1, (false), (false)));
			{
				List<Entity> _entfound = world
						.getEntitiesWithinAABB(Entity.class,
								new AxisAlignedBB(x - (6 / 2d), y - (6 / 2d), z - (6 / 2d), x + (6 / 2d), y + (6 / 2d), z + (6 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if ((entityiterator.getUniqueID().toString()).equals("0000000b-0000-000b-0000-000b0000000b")) {
						{
							Entity _ent = entityiterator;
							_ent.setPositionAndUpdate((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()));
							if (_ent instanceof ServerPlayerEntity) {
								((ServerPlayerEntity) _ent).connection.setPlayerLocation((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()),
										_ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
							}
						}
						entity.fallDistance = (float) (0);
						entityiterator.fallDistance = (float) (0);
						entityiterator.rotationYaw = (float) ((entity.rotationYaw));
						entity.setRenderYawOffset(entity.rotationYaw);
						entity.prevRotationYaw = entity.rotationYaw;
						if (entity instanceof LivingEntity) {
							((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
							((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
							((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
						}
						entityiterator.rotationPitch = (float) ((entity.rotationPitch));
						{
							Entity _ent = entity;
							if (!_ent.world.isRemote && _ent.world.getServer() != null) {
								_ent.world.getServer().getCommandManager()
										.handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "team join 1");
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.world.isRemote && _ent.world.getServer() != null) {
								_ent.world.getServer().getCommandManager().handleCommand(
										_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "team modify 1 collisionRule never");
							}
						}
						{
							Entity _ent = entityiterator;
							if (!_ent.world.isRemote && _ent.world.getServer() != null) {
								_ent.world.getServer().getCommandManager()
										.handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "team join 1");
							}
						}
					}
				}
			}
		} else if (entity.getPersistentData().getBoolean("isSkeleton") == true) {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"team add 1");
				}
			}
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.INVISIBILITY, (int) 20, (int) 1, (false), (false)));
			{
				List<Entity> _entfound = world
						.getEntitiesWithinAABB(Entity.class,
								new AxisAlignedBB(x - (6 / 2d), y - (6 / 2d), z - (6 / 2d), x + (6 / 2d), y + (6 / 2d), z + (6 / 2d)), null)
						.stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
							}
						}.compareDistOf(x, y, z)).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if ((entityiterator.getUniqueID().toString()).equals("0000000b-0000-000b-0000-000b0000000b")) {
						{
							Entity _ent = entityiterator;
							_ent.setPositionAndUpdate((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()));
							if (_ent instanceof ServerPlayerEntity) {
								((ServerPlayerEntity) _ent).connection.setPlayerLocation((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()),
										_ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
							}
						}
						entity.fallDistance = (float) (0);
						entityiterator.fallDistance = (float) (0);
						if (entityiterator instanceof LivingEntity)
							((LivingEntity) entityiterator)
									.addPotionEffect(new EffectInstance(Effects.FIRE_RESISTANCE, (int) 20, (int) 1, (false), (false)));
						entityiterator.rotationYaw = (float) ((entity.rotationYaw));
						entity.setRenderYawOffset(entity.rotationYaw);
						entity.prevRotationYaw = entity.rotationYaw;
						if (entity instanceof LivingEntity) {
							((LivingEntity) entity).prevRenderYawOffset = entity.rotationYaw;
							((LivingEntity) entity).rotationYawHead = entity.rotationYaw;
							((LivingEntity) entity).prevRotationYawHead = entity.rotationYaw;
						}
						entityiterator.rotationPitch = (float) ((entity.rotationPitch));
						{
							Entity _ent = entity;
							if (!_ent.world.isRemote && _ent.world.getServer() != null) {
								_ent.world.getServer().getCommandManager()
										.handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "team join 1");
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.world.isRemote && _ent.world.getServer() != null) {
								_ent.world.getServer().getCommandManager().handleCommand(
										_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "team modify 1 collisionRule never");
							}
						}
						{
							Entity _ent = entityiterator;
							if (!_ent.world.isRemote && _ent.world.getServer() != null) {
								_ent.world.getServer().getCommandManager()
										.handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "team join 1");
							}
						}
					}
				}
			}
		}
	}
}
