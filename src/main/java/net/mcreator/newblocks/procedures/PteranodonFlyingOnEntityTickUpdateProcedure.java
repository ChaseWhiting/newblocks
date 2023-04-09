package net.mcreator.newblocks.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.entity.PteranodonEntity;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

public class PteranodonFlyingOnEntityTickUpdateProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure PteranodonFlyingOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure PteranodonFlyingOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure PteranodonFlyingOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure PteranodonFlyingOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure PteranodonFlyingOnEntityTickUpdate!");
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
		sx = (-3);
		found = (false);
		for (int index0 = 0; index0 < (int) (2); index0++) {
			sy = (-3);
			for (int index1 = 0; index1 < (int) (2); index1++) {
				sz = (-3);
				for (int index2 = 0; index2 < (int) (2); index2++) {
					if (world.getBlockState(new BlockPos(x + sx, y + sy, z + sz)).isSolid()) {
						found = (true);
					}
					sz = (sz + 1);
				}
				sy = (sy + 1);
			}
			sx = (sx + 1);
		}
		if (found == true) {
			if (!entity.isOnGround()) {
				if (Math.random() < 0.7) {
					if (Math.random() < 0.7) {
						if (Math.random() < 0.7) {
							if (Math.random() < 0.7) {
								if (Math.random() < 0.7) {
									if (Math.random() < 0.7) {
										if (Math.random() < 0.7) {
											if (Math.random() < 0.7) {
												entity.setMotion(0, (entity.getMotion().getY() + 0.3), 0);
											}
										}
									}
								}
							}
						}
					}
				}
			} else {
				if (Math.random() < 0.7) {
					if (Math.random() < 0.7) {
						if (!entity.world.isRemote())
							entity.remove();
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new PteranodonEntity.CustomEntity(PteranodonEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
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
		if (entity.getPosY() > 105) {
			entity.setMotion(0, (entity.getMotion().getY() - 0.5), 0);
		}
		{
			List<Entity> _entfound = world
					.getEntitiesWithinAABB(Entity.class,
							new AxisAlignedBB(x - (4 / 2d), y - (4 / 2d), z - (4 / 2d), x + (4 / 2d), y + (4 / 2d), z + (4 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entity instanceof ItemEntity) {
					if ((new Object() {
						public ItemStack entityToItem(Entity _ent) {
							if (_ent instanceof ItemEntity) {
								return ((ItemEntity) _ent).getItem();
							}
							return ItemStack.EMPTY;
						}
					}.entityToItem(entityiterator)).getItem().isFood()) {
						if (ItemTags.getCollection().getTagByID(new ResourceLocation("minecraft:fishes")).contains((new Object() {
							public ItemStack entityToItem(Entity _ent) {
								if (_ent instanceof ItemEntity) {
									return ((ItemEntity) _ent).getItem();
								}
								return ItemStack.EMPTY;
							}
						}.entityToItem(entityiterator)).getItem())) {
							if (Math.random() < 0.7) {
								if (Math.random() < 0.7) {
									if (Math.random() < 0.7) {
										if (Math.random() < 0.7) {
											if (Math.random() < 0.7) {
												if (Math.random() < 0.7) {
													if (Math.random() < 0.7) {
														if (Math.random() < 0.7) {
															if (entity instanceof LivingEntity)
																((LivingEntity) entity).setHealth((float) (((entity instanceof LivingEntity)
																		? ((LivingEntity) entity).getHealth()
																		: -1) + 6));
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
