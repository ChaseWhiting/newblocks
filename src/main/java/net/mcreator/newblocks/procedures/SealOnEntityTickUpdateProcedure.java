package net.mcreator.newblocks.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.newblocks.entity.JumpSealEntity;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;

public class SealOnEntityTickUpdateProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure SealOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure SealOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure SealOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure SealOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure SealOnEntityTickUpdate!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
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
																if (world.isAirBlock(new BlockPos(x, y + 7, z))) {
																	if (Math.random() < 0.7) {
																		if (Math.random() < 0.7) {
																			if (entity.getPersistentData().getBoolean("lookingForItems") == false) {
																				entity.setMotion((entity.getMotion().getX()),
																						(entity.getMotion().getY() + 0.4),
																						(entity.getMotion().getZ()));
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
																						if (entity.isAlive()) {
																							if (!entity.world.isRemote())
																								entity.remove();
																							if (world instanceof ServerWorld) {
																								Entity entityToSpawn = new JumpSealEntity.CustomEntity(
																										JumpSealEntity.entity, (World) world);
																								entityToSpawn.setLocationAndAngles((entity.getPosX()),
																										(entity.getPosY()), (entity.getPosZ()),
																										(float) (entity.rotationYaw),
																										(float) (entity.rotationPitch));
																								entityToSpawn.setRenderYawOffset(
																										(float) (entity.rotationYaw));
																								entityToSpawn.setRotationYawHead(
																										(float) (entity.rotationYaw));
																								entityToSpawn.setMotion(
																										(0 - Math.sin(entity.rotationYaw
																												* (Math.PI / 180))),
																										0.8, Math.cos(entity.rotationYaw
																												* (Math.PI / 180)));
																								if (entityToSpawn instanceof MobEntity)
																									((MobEntity) entityToSpawn).onInitialSpawn(
																											(ServerWorld) world,
																											world.getDifficultyForLocation(
																													entityToSpawn.getPosition()),
																											SpawnReason.MOB_SUMMONED,
																											(ILivingEntityData) null,
																											(CompoundNBT) null);
																								world.addEntity(entityToSpawn);
																							}
																						}
																						MinecraftForge.EVENT_BUS.unregister(this);
																					}
																				}.start(world, (int) 22);
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
		if (entity.isInWater()) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.DOLPHINS_GRACE, (int) 60, (int) 4, (false), (false)));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 60, (int) 4, (false), (false)));
		}
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.SEAGRASS) {
			world.destroyBlock(new BlockPos(x, y, z), false);
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.TALL_SEAGRASS) {
			world.destroyBlock(new BlockPos(x, y, z), false);
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.SEA_PICKLE) {
			world.destroyBlock(new BlockPos(x, y, z), false);
		}
		{
			List<Entity> _entfound = world
					.getEntitiesWithinAABB(Entity.class,
							new AxisAlignedBB(x - (1.5 / 2d), y - (1.5 / 2d), z - (1.5 / 2d), x + (1.5 / 2d), y + (1.5 / 2d), z + (1.5 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if ((new Object() {
					public ItemStack entityToItem(Entity _ent) {
						if (_ent instanceof ItemEntity) {
							return ((ItemEntity) _ent).getItem();
						}
						return ItemStack.EMPTY;
					}
				}.entityToItem(entityiterator)).getItem() == Items.COD || (new Object() {
					public ItemStack entityToItem(Entity _ent) {
						if (_ent instanceof ItemEntity) {
							return ((ItemEntity) _ent).getItem();
						}
						return ItemStack.EMPTY;
					}
				}.entityToItem(entityiterator)).getItem() == Items.SALMON || (new Object() {
					public ItemStack entityToItem(Entity _ent) {
						if (_ent instanceof ItemEntity) {
							return ((ItemEntity) _ent).getItem();
						}
						return ItemStack.EMPTY;
					}
				}.entityToItem(entityiterator)).getItem() == Blocks.SAND.asItem() || (new Object() {
					public ItemStack entityToItem(Entity _ent) {
						if (_ent instanceof ItemEntity) {
							return ((ItemEntity) _ent).getItem();
						}
						return ItemStack.EMPTY;
					}
				}.entityToItem(entityiterator)).getItem() == Items.HEART_OF_THE_SEA || (new Object() {
					public ItemStack entityToItem(Entity _ent) {
						if (_ent instanceof ItemEntity) {
							return ((ItemEntity) _ent).getItem();
						}
						return ItemStack.EMPTY;
					}
				}.entityToItem(entityiterator)).getItem() == Items.PRISMARINE_SHARD || (new Object() {
					public ItemStack entityToItem(Entity _ent) {
						if (_ent instanceof ItemEntity) {
							return ((ItemEntity) _ent).getItem();
						}
						return ItemStack.EMPTY;
					}
				}.entityToItem(entityiterator)).getItem() == Items.DIAMOND || (new Object() {
					public ItemStack entityToItem(Entity _ent) {
						if (_ent instanceof ItemEntity) {
							return ((ItemEntity) _ent).getItem();
						}
						return ItemStack.EMPTY;
					}
				}.entityToItem(entityiterator)).getItem() == Blocks.DIRT.asItem() || (new Object() {
					public ItemStack entityToItem(Entity _ent) {
						if (_ent instanceof ItemEntity) {
							return ((ItemEntity) _ent).getItem();
						}
						return ItemStack.EMPTY;
					}
				}.entityToItem(entityiterator)).getItem() == Items.TRIDENT || (new Object() {
					public ItemStack entityToItem(Entity _ent) {
						if (_ent instanceof ItemEntity) {
							return ((ItemEntity) _ent).getItem();
						}
						return ItemStack.EMPTY;
					}
				}.entityToItem(entityiterator)).getItem() == Items.WATER_BUCKET || (new Object() {
					public ItemStack entityToItem(Entity _ent) {
						if (_ent instanceof ItemEntity) {
							return ((ItemEntity) _ent).getItem();
						}
						return ItemStack.EMPTY;
					}
				}.entityToItem(entityiterator)).getItem() == Blocks.GRAVEL.asItem() || (new Object() {
					public ItemStack entityToItem(Entity _ent) {
						if (_ent instanceof ItemEntity) {
							return ((ItemEntity) _ent).getItem();
						}
						return ItemStack.EMPTY;
					}
				}.entityToItem(entityiterator)).getItem() == Items.LEATHER || (new Object() {
					public ItemStack entityToItem(Entity _ent) {
						if (_ent instanceof ItemEntity) {
							return ((ItemEntity) _ent).getItem();
						}
						return ItemStack.EMPTY;
					}
				}.entityToItem(entityiterator)).getItem() == Items.STICK || (new Object() {
					public ItemStack entityToItem(Entity _ent) {
						if (_ent instanceof ItemEntity) {
							return ((ItemEntity) _ent).getItem();
						}
						return ItemStack.EMPTY;
					}
				}.entityToItem(entityiterator)).getItem() == Items.STRING || (new Object() {
					public ItemStack entityToItem(Entity _ent) {
						if (_ent instanceof ItemEntity) {
							return ((ItemEntity) _ent).getItem();
						}
						return ItemStack.EMPTY;
					}
				}.entityToItem(entityiterator)).getItem() == Blocks.KELP.asItem() || (new Object() {
					public ItemStack entityToItem(Entity _ent) {
						if (_ent instanceof ItemEntity) {
							return ((ItemEntity) _ent).getItem();
						}
						return ItemStack.EMPTY;
					}
				}.entityToItem(entityiterator)).getItem() == Items.FISHING_ROD) {
					{
						Entity _ent = entityiterator;
						_ent.setPositionAndUpdate((entity.getPosX()), (entity.getPosY() + 0.2), (entity.getPosZ()));
						if (_ent instanceof ServerPlayerEntity) {
							((ServerPlayerEntity) _ent).connection.setPlayerLocation((entity.getPosX()), (entity.getPosY() + 0.2), (entity.getPosZ()),
									_ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
						}
					}
					if ((new Object() {
						public ItemStack entityToItem(Entity _ent) {
							if (_ent instanceof ItemEntity) {
								return ((ItemEntity) _ent).getItem();
							}
							return ItemStack.EMPTY;
						}
					}.entityToItem(entityiterator)).getItem() == Items.COD) {
						if (!entityiterator.world.isRemote())
							entityiterator.remove();
						entity.getPersistentData().putBoolean("lookingForItems", (true));
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(ParticleTypes.HEART, x, y, z, (int) 5, 0.2, 0.2, 0.2, 0.2);
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
								entity.getPersistentData().putBoolean("lookingForItems", (false));
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, (int) 540);
					}
					if ((new Object() {
						public ItemStack entityToItem(Entity _ent) {
							if (_ent instanceof ItemEntity) {
								return ((ItemEntity) _ent).getItem();
							}
							return ItemStack.EMPTY;
						}
					}.entityToItem(entityiterator)).getItem() == Items.SALMON) {
						if (!entityiterator.world.isRemote())
							entityiterator.remove();
						entity.getPersistentData().putBoolean("lookingForItems", (true));
						if (world instanceof ServerWorld) {
							((ServerWorld) world).spawnParticle(ParticleTypes.HEART, x, y, z, (int) 5, 0.2, 0.2, 0.2, 0.2);
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
								entity.getPersistentData().putBoolean("lookingForItems", (false));
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, (int) 630);
					}
				}
			}
		}
		if (entity.getPersistentData().getBoolean("lookingForItems") == true) {
			if (entity.isInWater()) {
				if (Math.random() < 0.7) {
					if (Math.random() < 0.7) {
						if (Math.random() < 0.7) {
							if (Math.random() < 0.7) {
								if (Math.random() < 0.7) {
									entity.setMotion((entity.getMotion().getX()), (-0.56), (entity.getMotion().getZ()));
									if (Math.random() < 0.7) {
										if (Math.random() < 0.7) {
											if (Math.random() < 0.7) {
												if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.SAND
														|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.GRAVEL) {
													if (Math.random() < 0.7) {
														if (Math.random() < 0.7) {
															if (Math.random() < 0.7) {
																if (Math.random() < 0.7) {
																	if (Math.random() < 0.7) {
																		if (world instanceof World && !world.isRemote()) {
																			ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 0.3), z,
																					new ItemStack(Blocks.DIRT));
																			entityToSpawn.setPickupDelay((int) 10);
																			world.addEntity(entityToSpawn);
																		}
																	}
																}
															}
														}
													}
													if (Math.random() < 0.7) {
														if (Math.random() < 0.7) {
															if (Math.random() < 0.7) {
																if (Math.random() < 0.7) {
																	if (Math.random() < 0.7) {
																		if (Math.random() < 0.7) {
																			if (world instanceof World && !world.isRemote()) {
																				ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 0.3),
																						z, new ItemStack(Blocks.SAND));
																				entityToSpawn.setPickupDelay((int) 10);
																				world.addEntity(entityToSpawn);
																			}
																		}
																	}
																}
															}
														}
													}
													if (Math.random() < 0.7) {
														if (Math.random() < 0.7) {
															if (Math.random() < 0.7) {
																if (Math.random() < 0.7) {
																	if (Math.random() < 0.7) {
																		if (Math.random() < 0.7) {
																			if (Math.random() < 0.7) {
																				if (Math.random() < 0.7) {
																					if (world instanceof World && !world.isRemote()) {
																						ItemEntity entityToSpawn = new ItemEntity((World) world, x,
																								(y + 0.3), z, new ItemStack(Items.PRISMARINE_SHARD));
																						entityToSpawn.setPickupDelay((int) 10);
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
																									if (world instanceof World && !world.isRemote()) {
																										ItemEntity entityToSpawn = new ItemEntity(
																												(World) world, x, (y + 0.3), z,
																												new ItemStack(Items.DIAMOND));
																										entityToSpawn.setPickupDelay((int) 10);
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
																											if (Math.random() < 0.7) {
																												if (Math.random() < 0.7) {
																													if (Math.random() < 0.7) {
																														if (Math.random() < 0.7) {
																															if (Math.random() < 0.7) {
																																if (Math.random() < 0.7) {
																																	if (Math.random() < 0.2) {
																																		if (Math.random() < 0.7) {
																																			if (world instanceof World
																																					&& !world
																																							.isRemote()) {
																																				ItemEntity entityToSpawn = new ItemEntity(
																																						(World) world,
																																						x,
																																						(y + 0.3),
																																						z,
																																						new ItemStack(
																																								Items.TRIDENT));
																																				entityToSpawn
																																						.setPickupDelay(
																																								(int) 10);
																																				world.addEntity(
																																						entityToSpawn);
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
														}
													}
													if (Math.random() < 0.7) {
														if (Math.random() < 0.7) {
															if (Math.random() < 0.7) {
																if (Math.random() < 0.7) {
																	if (Math.random() < 0.7) {
																		if (Math.random() < 0.7) {
																			if (Math.random() < 0.7) {
																				if (world instanceof World && !world.isRemote()) {
																					ItemEntity entityToSpawn = new ItemEntity((World) world, x,
																							(y + 0.3), z, new ItemStack(Items.LEATHER));
																					entityToSpawn.setPickupDelay((int) 10);
																					world.addEntity(entityToSpawn);
																				}
																			}
																		}
																	}
																}
															}
														}
													}
													if (Math.random() < 0.7) {
														if (Math.random() < 0.7) {
															if (Math.random() < 0.7) {
																if (Math.random() < 0.7) {
																	if (Math.random() < 0.7) {
																		if (Math.random() < 0.7) {
																			if (Math.random() < 0.7) {
																				if (world instanceof World && !world.isRemote()) {
																					ItemEntity entityToSpawn = new ItemEntity((World) world, x,
																							(y + 0.3), z, new ItemStack(Blocks.GRAVEL));
																					entityToSpawn.setPickupDelay((int) 10);
																					world.addEntity(entityToSpawn);
																				}
																			}
																		}
																	}
																}
															}
														}
													}
													if (Math.random() < 0.7) {
														if (Math.random() < 0.7) {
															if (Math.random() < 0.7) {
																if (Math.random() < 0.7) {
																	if (Math.random() < 0.7) {
																		if (Math.random() < 0.7) {
																			if (Math.random() < 0.7) {
																				if (Math.random() < 0.7) {
																					if (Math.random() < 0.7) {
																						if (world instanceof World && !world.isRemote()) {
																							ItemEntity entityToSpawn = new ItemEntity((World) world,
																									x, (y + 0.3), z, new ItemStack(Items.STICK));
																							entityToSpawn.setPickupDelay((int) 10);
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
													if (Math.random() < 0.7) {
														if (Math.random() < 0.7) {
															if (Math.random() < 0.7) {
																if (Math.random() < 0.7) {
																	if (Math.random() < 0.7) {
																		if (Math.random() < 0.7) {
																			if (Math.random() < 0.7) {
																				if (Math.random() < 0.7) {
																					if (world instanceof World && !world.isRemote()) {
																						ItemEntity entityToSpawn = new ItemEntity((World) world, x,
																								(y + 0.3), z, new ItemStack(Items.STRING));
																						entityToSpawn.setPickupDelay((int) 10);
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
																										if (world instanceof World
																												&& !world.isRemote()) {
																											ItemEntity entityToSpawn = new ItemEntity(
																													(World) world, x, (y + 0.3), z,
																													new ItemStack(Items.FISHING_ROD));
																											entityToSpawn.setPickupDelay((int) 10);
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
													}
													if (Math.random() < 0.7) {
														if (Math.random() < 0.7) {
															if (Math.random() < 0.7) {
																if (Math.random() < 0.7) {
																	if (Math.random() < 0.7) {
																		if (Math.random() < 0.7) {
																			if (Math.random() < 0.7) {
																				if (Math.random() < 0.7) {
																					if (world instanceof World && !world.isRemote()) {
																						ItemEntity entityToSpawn = new ItemEntity((World) world, x,
																								(y + 0.3), z, new ItemStack(Blocks.KELP));
																						entityToSpawn.setPickupDelay((int) 10);
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
								}
							}
						}
					}
				}
			}
		}
		sx = (-6);
		found = (false);
		for (int index0 = 0; index0 < (int) (12); index0++) {
			sy = (-6);
			for (int index1 = 0; index1 < (int) (12); index1++) {
				sz = (-6);
				for (int index2 = 0; index2 < (int) (12); index2++) {
					if ((world.getBlockState(new BlockPos(x + sx, y + sy, z + sz))).getBlock() == Blocks.SEA_PICKLE) {
						found = (true);
					}
					sz = (sz + 1);
				}
				sy = (sy + 1);
			}
			sx = (sx + 1);
		}
		if (found == true) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 1);
		}
	}
}
