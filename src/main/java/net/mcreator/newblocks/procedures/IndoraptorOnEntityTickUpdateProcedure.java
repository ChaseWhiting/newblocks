package net.mcreator.newblocks.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

public class IndoraptorOnEntityTickUpdateProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure IndoraptorOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure IndoraptorOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure IndoraptorOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure IndoraptorOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure IndoraptorOnEntityTickUpdate!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		{
			List<Entity> _entfound = world
					.getEntitiesWithinAABB(Entity.class,
							new AxisAlignedBB(x - (4.5 / 2d), y - (4.5 / 2d), z - (4.5 / 2d), x + (4.5 / 2d), y + (4.5 / 2d), z + (4.5 / 2d)), null)
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
					}.entityToItem(entityiterator)).getItem().isFood()) {
						if (Math.random() < 0.7) {
							if (Math.random() < 0.7) {
								if (Math.random() < 0.7) {
									if (Math.random() < 0.7) {
										if (entity instanceof LivingEntity)
											((LivingEntity) entity)
													.setHealth((float) (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1)
															+ ((new Object() {
																public ItemStack entityToItem(Entity _ent) {
																	if (_ent instanceof ItemEntity) {
																		return ((ItemEntity) _ent).getItem();
																	}
																	return ItemStack.EMPTY;
																}
															}.entityToItem(entityiterator)).getItem().isFood() ? (new Object() {
																public ItemStack entityToItem(Entity _ent) {
																	if (_ent instanceof ItemEntity) {
																		return ((ItemEntity) _ent).getItem();
																	}
																	return ItemStack.EMPTY;
																}
															}.entityToItem(entityiterator)).getItem().getFood().getHealing() : 0) + 3));
										if (!entityiterator.world.isRemote())
											entityiterator.remove();
										if (world instanceof World && !world.isRemote()) {
											((World) world).playSound(null, new BlockPos(x, y, z),
													(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
															.getValue(new ResourceLocation("entity.generic.eat")),
													SoundCategory.NEUTRAL, (float) 1, (float) 1);
										} else {
											((World) world).playSound(x, y, z,
													(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
															.getValue(new ResourceLocation("entity.generic.eat")),
													SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
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
			if (((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null).getPosY() - 3 > entity.getPosY()) {
				{
					List<Entity> _entfound = world
							.getEntitiesWithinAABB(Entity.class,
									new AxisAlignedBB(x - (32 / 2d), y - (32 / 2d), z - (32 / 2d), x + (32 / 2d), y + (32 / 2d), z + (32 / 2d)), null)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf(x, y, z)).collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (entityiterator == entity) {
							if (Math.random() < 0.7) {
								if (Math.random() < 0.7) {
									if (Math.random() < 0.7) {
										if (Math.random() < 0.7) {
											if (Math.random() < 0.7) {
												if (Math.random() < 0.7) {
													if (Math.random() < 0.7) {
														if (Math.random() < 0.7) {
															if (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
																			entity.getLook(1f).z * 5),
																	RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
																	.getType() == RayTraceResult.Type.BLOCK) {
																if (entity.isOnGround()) {
																	entity.setMotion(0, (entity.getMotion().getY() + 0.8), 0);
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
