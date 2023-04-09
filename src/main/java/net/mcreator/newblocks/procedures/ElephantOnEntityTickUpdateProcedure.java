package net.mcreator.newblocks.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

public class ElephantOnEntityTickUpdateProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure ElephantOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure ElephantOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure ElephantOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure ElephantOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure ElephantOnEntityTickUpdate!");
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
		if (((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null) instanceof LivingEntity) {
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
														if (entity.isOnGround()) {
															if (world instanceof World && !world.isRemote()) {
																((World) world).playSound(null, new BlockPos(x, y, z),
																		(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																				.getValue(new ResourceLocation("new_blocks:elephant.trumpet")),
																		SoundCategory.NEUTRAL, (float) 2.5, (float) 1);
															} else {
																((World) world).playSound(x, y, z,
																		(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																				.getValue(new ResourceLocation("new_blocks:elephant.trumpet")),
																		SoundCategory.NEUTRAL, (float) 2.5, (float) 1, false);
															}
															entity.setMotion((0 - Math.sin(entity.rotationYaw * Math.PI / 180)), 0.3,
																	Math.cos(entity.rotationYaw * Math.PI / 180));
															{
																List<Entity> _entfound = world
																		.getEntitiesWithinAABB(Entity.class,
																				new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d),
																						x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)),
																				null)
																		.stream().sorted(new Object() {
																			Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
																				return Comparator
																						.comparing((Function<Entity, Double>) (_entcnd -> _entcnd
																								.getDistanceSq(_x, _y, _z)));
																			}
																		}.compareDistOf(x, y, z)).collect(Collectors.toList());
																for (Entity entityiterator : _entfound) {
																	if (entityiterator == ((entity instanceof MobEntity)
																			? ((MobEntity) entity).getAttackTarget()
																			: null)) {
																		if (entityiterator instanceof LivingEntity) {
																			((LivingEntity) entityiterator).attackEntityFrom(
																					new DamageSource("charged_at"),
																					(float) 10);
																		}
																	}
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
																	entity.setMotion((0 - Math.sin(entity.rotationYaw * Math.PI / 180)), 0,
																			Math.cos(entity.rotationYaw * Math.PI / 180));
																	MinecraftForge.EVENT_BUS.unregister(this);
																}
															}.start(world, (int) 10);
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
