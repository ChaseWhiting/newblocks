package net.mcreator.newblocks.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.entity.WardenRage1Entity;
import net.mcreator.newblocks.entity.WardenEntity;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

public class WardenOnEntityTickUpdateProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure WardenOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure WardenOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure WardenOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure WardenOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure WardenOnEntityTickUpdate!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 60, (int) 1, (false), (false)));
		if (entity.getPersistentData().getDouble("wardenAnger") > 2) {
			entity.getPersistentData().putDouble("wardenAnger", 0);
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
				if (entityiterator instanceof PlayerEntity) {
					if (Math.random() < 0.7) {
						if (Math.random() < 0.5) {
							if (Math.random() < 0.7) {
								if (Math.random() < 0.5) {
									if (Math.random() < 0.6) {
										if (Math.random() < 0.3) {
											if (Math.random() < 0.7) {
												if (Math.random() < 0.2) {
													if (entity instanceof WardenEntity.CustomEntity) {
														if (world instanceof World && !world.isRemote()) {
															((World) world).playSound(null, new BlockPos(x, y, z),
																	(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																			.getValue(new ResourceLocation("new_blocks:entity.warden.sniff")),
																	SoundCategory.AMBIENT, (float) 4, (float) 1);
														} else {
															((World) world).playSound(x, y, z,
																	(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																			.getValue(new ResourceLocation("new_blocks:entity.warden.sniff")),
																	SoundCategory.AMBIENT, (float) 4, (float) 1, false);
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
																if (entityiterator.getPersistentData().getBoolean("SuspiciousOf") == true) {
																	if (Math.random() < 0.4) {
																		if (!entity.world.isRemote())
																			entity.remove();
																		if (world instanceof ServerWorld) {
																			Entity entityToSpawn = new WardenRage1Entity.CustomEntity(
																					WardenRage1Entity.entity, (World) world);
																			entityToSpawn.setLocationAndAngles(x, y, z, (float) 0, (float) 0);
																			entityToSpawn.setRenderYawOffset((float) 0);
																			entityToSpawn.setRotationYawHead((float) 0);
																			entityToSpawn.setMotion(0, 0, 0);
																			if (entityToSpawn instanceof MobEntity)
																				((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
																						world.getDifficultyForLocation(entityToSpawn.getPosition()),
																						SpawnReason.MOB_SUMMONED, (ILivingEntityData) null,
																						(CompoundNBT) null);
																			world.addEntity(entityToSpawn);
																		}
																	}
																}
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, (int) 40);
													}
												}
												if (Math.random() < 0.7) {
													if (Math.random() < 0.7) {
														if (Math.random() < 0.7) {
															if (Math.random() < 0.7) {
																entityiterator.getPersistentData().putBoolean("SuspiciousOf", (true));
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
			List<Entity> _entfound = world
					.getEntitiesWithinAABB(Entity.class,
							new AxisAlignedBB(x - (18 / 2d), y - (18 / 2d), z - (18 / 2d), x + (18 / 2d), y + (18 / 2d), z + (18 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!EntityTypeTags.getCollection().getTagByID(new ResourceLocation("new_blocks:sculk_mobs")).contains(entityiterator.getType())) {
					if ((entityiterator.getMotion().getX() > 0 || entityiterator.getMotion().getZ() > 0) && !entityiterator.isSneaking()) {
						entityiterator.getPersistentData().putBoolean("beingDetected", (true));
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
								entityiterator.getPersistentData().putBoolean("beingDetected", (false));
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, (int) 700);
					}
				}
			}
		}
		if (entity.getPersistentData().getBoolean("isAngry") == true) {
			if (entity.getPersistentData().getDouble("wardenHeartbeat") < 3) {
				if (world instanceof World && !world.isRemote()) {
					((World) world).playSound(null, new BlockPos(x, y, z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("new_blocks:entity.warden.heartbeat")),
							SoundCategory.NEUTRAL, (float) 9.5, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("new_blocks:entity.warden.heartbeat")),
							SoundCategory.NEUTRAL, (float) 9.5, (float) 1, false);
				}
				entity.getPersistentData().putDouble("wardenHeartbeat", 15);
			} else {
				if (entity.getPersistentData().getDouble("wardenHeartbeat") > 0) {
					entity.getPersistentData().putDouble("wardenHeartbeat", (entity.getPersistentData().getDouble("wardenHeartbeat") - 1));
				}
			}
		} else {
			if (entity.getPersistentData().getDouble("wardenHeartbeat") < 3) {
				if (world instanceof World && !world.isRemote()) {
					((World) world).playSound(null, new BlockPos(x, y, z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("new_blocks:entity.warden.heartbeat")),
							SoundCategory.NEUTRAL, (float) 5, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("new_blocks:entity.warden.heartbeat")),
							SoundCategory.NEUTRAL, (float) 5, (float) 1, false);
				}
				entity.getPersistentData().putDouble("wardenHeartbeat", 39);
			} else {
				if (entity.getPersistentData().getDouble("wardenHeartbeat") > 0) {
					entity.getPersistentData().putDouble("wardenHeartbeat", (entity.getPersistentData().getDouble("wardenHeartbeat") - 1));
				}
			}
		}
	}
}
