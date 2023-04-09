package net.mcreator.newblocks.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Hand;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.monster.VindicatorEntity;
import net.minecraft.entity.monster.RavagerEntity;
import net.minecraft.entity.monster.PillagerEntity;
import net.minecraft.entity.monster.EvokerEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.newblocks.item.PillagerThrownEnderPearlItem;
import net.mcreator.newblocks.item.GoatHornItem;
import net.mcreator.newblocks.entity.SwordsmanEntity;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Comparator;
import java.util.Collection;

public class PillagerSoundGoatHornProcedure {
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
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure PillagerSoundGoatHorn!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure PillagerSoundGoatHorn!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure PillagerSoundGoatHorn!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure PillagerSoundGoatHorn!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure PillagerSoundGoatHorn!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PillagerEntity) {
			if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY).getItem() == GoatHornItem.block) {
				if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) < 12) {
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
															if (entity instanceof LivingEntity) {
																ItemStack _setstack = new ItemStack(Blocks.AIR);
																_setstack.setCount((int) 1);
																((LivingEntity) entity).setHeldItem(Hand.OFF_HAND, _setstack);
																if (entity instanceof ServerPlayerEntity)
																	((ServerPlayerEntity) entity).inventory.markDirty();
															}
															if (world instanceof World && !world.isRemote()) {
																((World) world).playSound(null, new BlockPos(x, y, z),
																		(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																				.getValue(new ResourceLocation("new_blocks:horn_2")),
																		SoundCategory.HOSTILE, (float) 30, (float) 1);
															} else {
																((World) world).playSound(x, y, z,
																		(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																				.getValue(new ResourceLocation("new_blocks:horn_2")),
																		SoundCategory.HOSTILE, (float) 30, (float) 1, false);
															}
															if (world instanceof ServerWorld) {
																Entity entityToSpawn = new PillagerEntity(EntityType.PILLAGER, (World) world);
																entityToSpawn.setLocationAndAngles((x + 1), y, z,
																		world.getRandom().nextFloat() * 360F, 0);
																if (entityToSpawn instanceof MobEntity)
																	((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
																			world.getDifficultyForLocation(entityToSpawn.getPosition()),
																			SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
																world.addEntity(entityToSpawn);
															}
															if (world instanceof ServerWorld) {
																Entity entityToSpawn = new PillagerEntity(EntityType.PILLAGER, (World) world);
																entityToSpawn.setLocationAndAngles((x - 1), y, z,
																		world.getRandom().nextFloat() * 360F, 0);
																if (entityToSpawn instanceof MobEntity)
																	((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
																			world.getDifficultyForLocation(entityToSpawn.getPosition()),
																			SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
																world.addEntity(entityToSpawn);
															}
															if (world instanceof ServerWorld) {
																Entity entityToSpawn = new PillagerEntity(EntityType.PILLAGER, (World) world);
																entityToSpawn.setLocationAndAngles(x, y, (z + 1),
																		world.getRandom().nextFloat() * 360F, 0);
																if (entityToSpawn instanceof MobEntity)
																	((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
																			world.getDifficultyForLocation(entityToSpawn.getPosition()),
																			SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
																world.addEntity(entityToSpawn);
															}
															if (world instanceof ServerWorld) {
																Entity entityToSpawn = new PillagerEntity(EntityType.PILLAGER, (World) world);
																entityToSpawn.setLocationAndAngles(x, y, (z - 1),
																		world.getRandom().nextFloat() * 360F, 0);
																if (entityToSpawn instanceof MobEntity)
																	((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
																			world.getDifficultyForLocation(entityToSpawn.getPosition()),
																			SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
																world.addEntity(entityToSpawn);
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
			if (((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null) instanceof LivingEntity) {
				{
					List<Entity> _entfound = world
							.getEntitiesWithinAABB(Entity.class,
									new AxisAlignedBB(x - (2 / 2d), y - (2 / 2d), z - (2 / 2d), x + (2 / 2d), y + (2 / 2d), z + (2 / 2d)), null)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf(x, y, z)).collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof RavagerEntity) {
							if (!entityiterator.isBeingRidden()) {
								if (Math.random() < 0.7) {
									if (Math.random() < 0.7) {
										if (Math.random() < 0.7) {
											if (Math.random() < 0.7) {
												if (Math.random() < 0.7) {
													if (Math.random() < 0.7) {
														if (Math.random() < 0.7) {
															entity.startRiding(entityiterator);
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
				{
					List<Entity> _entfound = world
							.getEntitiesWithinAABB(Entity.class,
									new AxisAlignedBB(x - (12 / 2d), y - (12 / 2d), z - (12 / 2d), x + (12 / 2d), y + (12 / 2d), z + (12 / 2d)), null)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf(x, y, z)).collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (!(entityiterator == ((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null))) {
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
																	if (Math.random() < 0.7) {
																		if (Math.random() < 0.7) {
																			if (Math.random() < 0.7) {
																				if (Math.random() < 0.7) {
																					if (((entity instanceof LivingEntity)
																							? ((LivingEntity) entity).getHeldItemOffhand()
																							: ItemStack.EMPTY).getItem() == Items.ENDER_PEARL) {
																						{
																							Entity _shootFrom = entity;
																							World projectileLevel = _shootFrom.world;
																							if (!projectileLevel.isRemote()) {
																								ProjectileEntity _entityToSpawn = new Object() {
																									public ProjectileEntity getArrow(World world,
																											Entity shooter, float damage,
																											int knockback) {
																										AbstractArrowEntity entityToSpawn = new PillagerThrownEnderPearlItem.ArrowCustomEntity(
																												PillagerThrownEnderPearlItem.arrow,
																												world);
																										entityToSpawn.setShooter(shooter);
																										entityToSpawn.setDamage(damage);
																										entityToSpawn.setKnockbackStrength(knockback);
																										entityToSpawn.setSilent(true);

																										return entityToSpawn;
																									}
																								}.getArrow(projectileLevel, entity, 0, 0);
																								_entityToSpawn.setPosition(_shootFrom.getPosX(),
																										_shootFrom.getPosYEye() - 0.1,
																										_shootFrom.getPosZ());
																								_entityToSpawn.shoot(_shootFrom.getLookVec().x,
																										_shootFrom.getLookVec().y,
																										_shootFrom.getLookVec().z, (float) 0.78, 0);
																								projectileLevel.addEntity(_entityToSpawn);
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
					}
				}
			}
			if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY).getItem() == Blocks.AIR
					.asItem()) {
				if (entity.getPersistentData().getBoolean("drinking") == false) {
					if (((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null) instanceof PlayerEntity) {
						{
							List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
									new AxisAlignedBB(x - (15 / 2d), y - (15 / 2d), z - (15 / 2d), x + (15 / 2d), y + (15 / 2d), z + (15 / 2d)), null)
									.stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
										}
									}.compareDistOf(x, y, z)).collect(Collectors.toList());
							for (Entity entityiterator : _entfound) {
								if (!(new Object() {
									boolean check(Entity _entity) {
										if (_entity instanceof LivingEntity) {
											Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
											for (EffectInstance effect : effects) {
												if (effect.getPotion() == Effects.SPEED)
													return true;
											}
										}
										return false;
									}
								}.check(entity))) {
									if (!(entityiterator == entity)) {
										if (!(entityiterator == ((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null))) {
											if (!(entityiterator instanceof EvokerEntity)) {
												if (!(entityiterator instanceof AnimalEntity)) {
													if (!(entityiterator instanceof VindicatorEntity)) {
														if (Math.random() < 0.7) {
															if (Math.random() < 0.7) {
																if (Math.random() < 0.7) {
																	if (Math.random() < 0.7) {
																		if (Math.random() < 0.7) {
																			if (Math.random() < 0.7) {
																				if (Math.random() < 0.7) {
																					if (Math.random() < 0.7) {
																						entity.getPersistentData().putBoolean("drinking", (true));
																						if (entity instanceof LivingEntity)
																							((LivingEntity) entity).addPotionEffect(
																									new EffectInstance(Effects.SLOWNESS, (int) 35,
																											(int) 6, (false), (false)));
																						{
																							Entity _ent = entity;
																							if (!_ent.world.isRemote
																									&& _ent.world.getServer() != null) {
																								_ent.world.getServer().getCommandManager()
																										.handleCommand(
																												_ent.getCommandSource()
																														.withFeedbackDisabled()
																														.withPermissionLevel(4),
																												"replaceitem entity @s weapon.offhand potion{Potion:\"minecraft:swiftness\"} 1");
																							}
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
																								if (world instanceof World && !world.isRemote()) {
																									((World) world).playSound(null,
																											new BlockPos(x, y, z),
																											(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																													.getValue(new ResourceLocation(
																															"entity.generic.drink")),
																											SoundCategory.HOSTILE, (float) 1,
																											(float) 1);
																								} else {
																									((World) world).playSound(x, y, z,
																											(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																													.getValue(new ResourceLocation(
																															"entity.generic.drink")),
																											SoundCategory.HOSTILE, (float) 1,
																											(float) 1, false);
																								}
																								MinecraftForge.EVENT_BUS.unregister(this);
																							}
																						}.start(world, (int) 15);
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
																								if (entity instanceof LivingEntity)
																									((LivingEntity) entity).addPotionEffect(
																											new EffectInstance(Effects.SPEED,
																													(int) 2400, (int) 0, (false),
																													(false)));
																								MinecraftForge.EVENT_BUS.unregister(this);
																							}
																						}.start(world, (int) 35);
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
																								entity.getPersistentData().putBoolean("drinking",
																										(false));
																								{
																									Entity _ent = entity;
																									if (!_ent.world.isRemote
																											&& _ent.world.getServer() != null) {
																										_ent.world.getServer().getCommandManager()
																												.handleCommand(_ent.getCommandSource()
																														.withFeedbackDisabled()
																														.withPermissionLevel(4),
																														"replaceitem entity @s weapon.offhand air");
																									}
																								}
																								MinecraftForge.EVENT_BUS.unregister(this);
																							}
																						}.start(world, (int) 48);
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
					if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) < 12) {
						if (Math.random() < 0.7) {
							if (Math.random() < 0.7) {
								if (Math.random() < 0.7) {
									if (Math.random() < 0.7) {
										if (Math.random() < 0.7) {
											if (Math.random() < 0.7) {
												if (Math.random() < 0.7) {
													if (Math.random() < 0.7) {
														entity.getPersistentData().putBoolean("drinking", (true));
														if (entity instanceof LivingEntity)
															((LivingEntity) entity).addPotionEffect(
																	new EffectInstance(Effects.SLOWNESS, (int) 35, (int) 6, (false), (false)));
														{
															Entity _ent = entity;
															if (!_ent.world.isRemote && _ent.world.getServer() != null) {
																_ent.world.getServer().getCommandManager().handleCommand(
																		_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
																		"replaceitem entity @s weapon.offhand potion{Potion:\"minecraft:healing\"} 1");
															}
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
																if (world instanceof World && !world.isRemote()) {
																	((World) world).playSound(null, new BlockPos(x, y, z),
																			(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																					.getValue(new ResourceLocation("entity.generic.drink")),
																			SoundCategory.HOSTILE, (float) 1, (float) 1);
																} else {
																	((World) world).playSound(x, y, z,
																			(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																					.getValue(new ResourceLocation("entity.generic.drink")),
																			SoundCategory.HOSTILE, (float) 1, (float) 1, false);
																}
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, (int) 15);
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
																if (entity instanceof LivingEntity)
																	((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.INSTANT_HEALTH,
																			(int) 1, (int) 0, (false), (false)));
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, (int) 35);
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
																entity.getPersistentData().putBoolean("drinking", (false));
																{
																	Entity _ent = entity;
																	if (!_ent.world.isRemote && _ent.world.getServer() != null) {
																		_ent.world.getServer().getCommandManager().handleCommand(
																				_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
																				"replaceitem entity @s weapon.offhand air");
																	}
																}
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, (int) 48);
													}
												}
											}
										}
									}
								}
							}
						}
					}
					if (entity.isBurning()) {
						if (Math.random() < 0.7) {
							if (Math.random() < 0.7) {
								if (Math.random() < 0.7) {
									if (Math.random() < 0.7) {
										if (Math.random() < 0.7) {
											if (Math.random() < 0.7) {
												if (Math.random() < 0.7) {
													if (Math.random() < 0.7) {
														if (!(new Object() {
															boolean check(Entity _entity) {
																if (_entity instanceof LivingEntity) {
																	Collection<EffectInstance> effects = ((LivingEntity) _entity)
																			.getActivePotionEffects();
																	for (EffectInstance effect : effects) {
																		if (effect.getPotion() == Effects.FIRE_RESISTANCE)
																			return true;
																	}
																}
																return false;
															}
														}.check(entity))) {
															entity.getPersistentData().putBoolean("drinking", (true));
															if (entity instanceof LivingEntity)
																((LivingEntity) entity).addPotionEffect(
																		new EffectInstance(Effects.SLOWNESS, (int) 35, (int) 6, (false), (false)));
															{
																Entity _ent = entity;
																if (!_ent.world.isRemote && _ent.world.getServer() != null) {
																	_ent.world.getServer().getCommandManager().handleCommand(
																			_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
																			"replaceitem entity @s weapon.offhand potion{Potion:\"minecraft:fire_resistance\"} 1");
																}
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
																	if (world instanceof World && !world.isRemote()) {
																		((World) world).playSound(null, new BlockPos(x, y, z),
																				(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																						.getValue(new ResourceLocation("entity.generic.drink")),
																				SoundCategory.HOSTILE, (float) 1, (float) 1);
																	} else {
																		((World) world).playSound(x, y, z,
																				(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																						.getValue(new ResourceLocation("entity.generic.drink")),
																				SoundCategory.HOSTILE, (float) 1, (float) 1, false);
																	}
																	MinecraftForge.EVENT_BUS.unregister(this);
																}
															}.start(world, (int) 15);
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
																	if (entity instanceof LivingEntity)
																		((LivingEntity) entity).addPotionEffect(new EffectInstance(
																				Effects.FIRE_RESISTANCE, (int) 1200, (int) 0, (false), (false)));
																	MinecraftForge.EVENT_BUS.unregister(this);
																}
															}.start(world, (int) 35);
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
																	entity.getPersistentData().putBoolean("drinking", (false));
																	{
																		Entity _ent = entity;
																		if (!_ent.world.isRemote && _ent.world.getServer() != null) {
																			_ent.world.getServer().getCommandManager().handleCommand(
																					_ent.getCommandSource().withFeedbackDisabled()
																							.withPermissionLevel(4),
																					"replaceitem entity @s weapon.offhand air");
																		}
																	}
																	MinecraftForge.EVENT_BUS.unregister(this);
																}
															}.start(world, (int) 48);
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
		} else if (entity instanceof SwordsmanEntity.CustomEntity) {
			if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY).getItem() == Blocks.AIR
					.asItem()) {
				if (entity.getPersistentData().getBoolean("drinking") == false) {
					if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) < 12) {
						if (Math.random() < 0.7) {
							if (Math.random() < 0.7) {
								if (Math.random() < 0.7) {
									if (Math.random() < 0.7) {
										if (Math.random() < 0.7) {
											if (Math.random() < 0.7) {
												if (Math.random() < 0.7) {
													if (Math.random() < 0.7) {
														entity.getPersistentData().putBoolean("drinking", (true));
														if (entity instanceof LivingEntity)
															((LivingEntity) entity).addPotionEffect(
																	new EffectInstance(Effects.SLOWNESS, (int) 35, (int) 6, (false), (false)));
														{
															Entity _ent = entity;
															if (!_ent.world.isRemote && _ent.world.getServer() != null) {
																_ent.world.getServer().getCommandManager().handleCommand(
																		_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
																		"replaceitem entity @s weapon.offhand potion{Potion:\"minecraft:healing\"} 1");
															}
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
																if (world instanceof World && !world.isRemote()) {
																	((World) world).playSound(null, new BlockPos(x, y, z),
																			(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																					.getValue(new ResourceLocation("entity.generic.drink")),
																			SoundCategory.HOSTILE, (float) 1, (float) 1);
																} else {
																	((World) world).playSound(x, y, z,
																			(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																					.getValue(new ResourceLocation("entity.generic.drink")),
																			SoundCategory.HOSTILE, (float) 1, (float) 1, false);
																}
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, (int) 15);
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
																if (entity instanceof LivingEntity)
																	((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.INSTANT_HEALTH,
																			(int) 1, (int) 0, (false), (false)));
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, (int) 35);
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
																entity.getPersistentData().putBoolean("drinking", (false));
																{
																	Entity _ent = entity;
																	if (!_ent.world.isRemote && _ent.world.getServer() != null) {
																		_ent.world.getServer().getCommandManager().handleCommand(
																				_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
																				"replaceitem entity @s weapon.offhand air");
																	}
																}
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, (int) 48);
													}
												}
											}
										}
									}
								}
							}
						}
					}
					if (entity.isBurning()) {
						if (Math.random() < 0.7) {
							if (Math.random() < 0.7) {
								if (Math.random() < 0.7) {
									if (Math.random() < 0.7) {
										if (Math.random() < 0.7) {
											if (Math.random() < 0.7) {
												if (Math.random() < 0.7) {
													if (Math.random() < 0.7) {
														if (!(new Object() {
															boolean check(Entity _entity) {
																if (_entity instanceof LivingEntity) {
																	Collection<EffectInstance> effects = ((LivingEntity) _entity)
																			.getActivePotionEffects();
																	for (EffectInstance effect : effects) {
																		if (effect.getPotion() == Effects.FIRE_RESISTANCE)
																			return true;
																	}
																}
																return false;
															}
														}.check(entity))) {
															entity.getPersistentData().putBoolean("drinking", (true));
															if (entity instanceof LivingEntity)
																((LivingEntity) entity).addPotionEffect(
																		new EffectInstance(Effects.SLOWNESS, (int) 35, (int) 6, (false), (false)));
															{
																Entity _ent = entity;
																if (!_ent.world.isRemote && _ent.world.getServer() != null) {
																	_ent.world.getServer().getCommandManager().handleCommand(
																			_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
																			"replaceitem entity @s weapon.offhand potion{Potion:\"minecraft:fire_resistance\"} 1");
																}
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
																	if (world instanceof World && !world.isRemote()) {
																		((World) world).playSound(null, new BlockPos(x, y, z),
																				(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																						.getValue(new ResourceLocation("entity.generic.drink")),
																				SoundCategory.HOSTILE, (float) 1, (float) 1);
																	} else {
																		((World) world).playSound(x, y, z,
																				(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																						.getValue(new ResourceLocation("entity.generic.drink")),
																				SoundCategory.HOSTILE, (float) 1, (float) 1, false);
																	}
																	MinecraftForge.EVENT_BUS.unregister(this);
																}
															}.start(world, (int) 15);
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
																	if (entity instanceof LivingEntity)
																		((LivingEntity) entity).addPotionEffect(new EffectInstance(
																				Effects.FIRE_RESISTANCE, (int) 1200, (int) 0, (false), (false)));
																	MinecraftForge.EVENT_BUS.unregister(this);
																}
															}.start(world, (int) 35);
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
																	entity.getPersistentData().putBoolean("drinking", (false));
																	{
																		Entity _ent = entity;
																		if (!_ent.world.isRemote && _ent.world.getServer() != null) {
																			_ent.world.getServer().getCommandManager().handleCommand(
																					_ent.getCommandSource().withFeedbackDisabled()
																							.withPermissionLevel(4),
																					"replaceitem entity @s weapon.offhand air");
																		}
																	}
																	MinecraftForge.EVENT_BUS.unregister(this);
																}
															}.start(world, (int) 48);
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
