package net.mcreator.newblocks.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.monster.VexEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.entity.AllayEntity;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;

public class AllayOnEntityTickUpdateProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure AllayOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure AllayOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure AllayOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure AllayOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure AllayOnEntityTickUpdate!");
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
		{
			List<Entity> _entfound = world
					.getEntitiesWithinAABB(Entity.class,
							new AxisAlignedBB(x - (2.8 / 2d), y - (2.8 / 2d), z - (2.8 / 2d), x + (2.8 / 2d), y + (2.8 / 2d), z + (2.8 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof ItemEntity) {
					if ((new Object() {
						public ItemStack entityToItem(Entity _ent) {
							if (_ent instanceof ItemEntity) {
								return ((ItemEntity) _ent).getItem();
							}
							return ItemStack.EMPTY;
						}
					}.entityToItem(entityiterator))
							.getItem() == ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
									.getItem()) {
						entityiterator.setMotion(0, 0, 0);
						{
							Entity _ent = entityiterator;
							_ent.setPositionAndUpdate((entity.getPosX()), (entity.getPosY() + 0.4), (entity.getPosZ()));
							if (_ent instanceof ServerPlayerEntity) {
								((ServerPlayerEntity) _ent).connection.setPlayerLocation((entity.getPosX()), (entity.getPosY() + 0.4),
										(entity.getPosZ()), _ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
							}
						}
					}
				}
			}
		}
		if (world.canBlockSeeSky(new BlockPos(x, y, z))) {
			if (entity.getPosY() > world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) + 4) {
				entity.setMotion((entity.getMotion().getX()), (-0.21), (entity.getMotion().getZ()));
				if (Math.random() < 0.7) {
					if (Math.random() < 0.7) {
						if (Math.random() < 0.7) {
							if (Math.random() < 0.7) {
								if (Math.random() < 0.7) {
									if (Math.random() < 0.7) {
										if (Math.random() < 0.7) {
											if (Math.random() < 0.7) {
												if (world instanceof ServerWorld) {
													((ServerWorld) world).spawnParticle(ParticleTypes.FIREWORK, x, y, z, (int) 3, 0.2, 0.1, 0.2, 0.1);
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
		if (entity.isOnGround()) {
			entity.setMotion((entity.getMotion().getX()), 0.1, (entity.getMotion().getZ()));
		}
		if (entity instanceof AllayEntity.CustomEntity) {
			{
				List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
						new AxisAlignedBB(x - (4.5 / 2d), y - (4.5 / 2d), z - (4.5 / 2d), x + (4.5 / 2d), y + (4.5 / 2d), z + (4.5 / 2d)), null)
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
					}.entityToItem(entityiterator)).getItem() == Items.IRON_SWORD) {
						if (!entity.world.isRemote())
							entity.remove();
						if (!entityiterator.world.isRemote())
							entityiterator.remove();
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new VexEntity(EntityType.VEX, (World) world);
							entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
							entityToSpawn.setRenderYawOffset((float) 0);
							entityToSpawn.setRotationYawHead((float) 0);
							entityToSpawn.setMotion(0, 0, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
					}
				}
			}
		}
		{
			List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
					new AxisAlignedBB((x + 7) - (5.5 / 2d), y - (5.5 / 2d), z - (5.5 / 2d), (x + 7) + (5.5 / 2d), y + (5.5 / 2d), z + (5.5 / 2d)),
					null).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf((x + 7), y, z)).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entity.getPersistentData().getDouble("priority") == 1) {
					if (entityiterator instanceof ItemEntity) {
						if ((new Object() {
							public ItemStack entityToItem(Entity _ent) {
								if (_ent instanceof ItemEntity) {
									return ((ItemEntity) _ent).getItem();
								}
								return ItemStack.EMPTY;
							}
						}.entityToItem(entityiterator))
								.getItem() == ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
										.getItem()) {
							if (Math.random() < 0.7) {
								if (Math.random() < 0.7) {
									entity.setMotion(0.4, (entity.getMotion().getY()), (entity.getMotion().getZ()));
									if (entity.getPosY() > entityiterator.getPosY()) {
										entity.setMotion((entity.getMotion().getX()), (-0.3), (entity.getMotion().getZ()));
									} else {
										entity.setMotion((entity.getMotion().getX()), 0.3, (entity.getMotion().getZ()));
									}
								}
							}
						}
					}
				} else {
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
																entity.getPersistentData().putDouble("priority", 1);
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
		{
			List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
					new AxisAlignedBB((x - 7) - (5.5 / 2d), y - (5.5 / 2d), z - (5.5 / 2d), (x - 7) + (5.5 / 2d), y + (5.5 / 2d), z + (5.5 / 2d)),
					null).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf((x - 7), y, z)).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entity.getPersistentData().getDouble("priority") == 2) {
					if (entityiterator instanceof ItemEntity) {
						if ((new Object() {
							public ItemStack entityToItem(Entity _ent) {
								if (_ent instanceof ItemEntity) {
									return ((ItemEntity) _ent).getItem();
								}
								return ItemStack.EMPTY;
							}
						}.entityToItem(entityiterator))
								.getItem() == ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
										.getItem()) {
							if (Math.random() < 0.7) {
								if (Math.random() < 0.7) {
									entity.setMotion((-0.4), (entity.getMotion().getY()), (entity.getMotion().getZ()));
									if (entity.getPosY() > entityiterator.getPosY()) {
										entity.setMotion((entity.getMotion().getX()), (-0.3), (entity.getMotion().getZ()));
									} else {
										entity.setMotion((entity.getMotion().getX()), 0.3, (entity.getMotion().getZ()));
									}
								}
							}
						}
					}
				} else {
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
																entity.getPersistentData().putDouble("priority", 2);
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
		{
			List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
					new AxisAlignedBB(x - (5.5 / 2d), y - (5.5 / 2d), (z + 7) - (5.5 / 2d), x + (5.5 / 2d), y + (5.5 / 2d), (z + 7) + (5.5 / 2d)),
					null).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, (z + 7))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entity.getPersistentData().getDouble("priority") == 3) {
					if (entityiterator instanceof ItemEntity) {
						if ((new Object() {
							public ItemStack entityToItem(Entity _ent) {
								if (_ent instanceof ItemEntity) {
									return ((ItemEntity) _ent).getItem();
								}
								return ItemStack.EMPTY;
							}
						}.entityToItem(entityiterator))
								.getItem() == ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
										.getItem()) {
							if (Math.random() < 0.7) {
								if (Math.random() < 0.7) {
									entity.setMotion((entity.getMotion().getX()), (entity.getMotion().getY()), 0.4);
									if (entity.getPosY() > entityiterator.getPosY()) {
										entity.setMotion((entity.getMotion().getX()), (-0.3), (entity.getMotion().getZ()));
									} else {
										entity.setMotion((entity.getMotion().getX()), 0.3, (entity.getMotion().getZ()));
									}
								}
							}
						}
					}
				} else {
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
																entity.getPersistentData().putDouble("priority", 3);
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
		{
			List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
					new AxisAlignedBB(x - (5.5 / 2d), y - (5.5 / 2d), (z - 7) - (5.5 / 2d), x + (5.5 / 2d), y + (5.5 / 2d), (z - 7) + (5.5 / 2d)),
					null).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, (z - 7))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entity.getPersistentData().getDouble("priority") == 4) {
					if (entityiterator instanceof ItemEntity) {
						if ((new Object() {
							public ItemStack entityToItem(Entity _ent) {
								if (_ent instanceof ItemEntity) {
									return ((ItemEntity) _ent).getItem();
								}
								return ItemStack.EMPTY;
							}
						}.entityToItem(entityiterator))
								.getItem() == ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
										.getItem()) {
							if (Math.random() < 0.7) {
								if (Math.random() < 0.7) {
									entity.setMotion((entity.getMotion().getX()), (entity.getMotion().getY()), (-0.4));
									if (entity.getPosY() > entityiterator.getPosY()) {
										entity.setMotion((entity.getMotion().getX()), (-0.3), (entity.getMotion().getZ()));
									} else {
										entity.setMotion((entity.getMotion().getX()), 0.3, (entity.getMotion().getZ()));
									}
								}
							}
						}
					}
				} else {
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
																entity.getPersistentData().putDouble("priority", 4);
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
