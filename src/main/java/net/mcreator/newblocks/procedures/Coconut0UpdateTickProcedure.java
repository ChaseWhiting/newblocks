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
import net.minecraft.util.DamageSource;
import net.minecraft.state.Property;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.item.FallingBlockEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.newblocks.item.CoconutSliceItem;
import net.mcreator.newblocks.block.PalmLeavesBlock;
import net.mcreator.newblocks.block.Coconut2Block;
import net.mcreator.newblocks.block.Coconut1Block;
import net.mcreator.newblocks.block.Coconut0Block;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

public class Coconut0UpdateTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure Coconut0UpdateTick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure Coconut0UpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure Coconut0UpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure Coconut0UpdateTick!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (!((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == PalmLeavesBlock.block)) {
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Coconut2Block.block) {
				if (world.getBlockState(new BlockPos(x, y - 1, z)).isSolid()) {
					world.setBlockState(new BlockPos(x, y, z), Blocks.AIR.getDefaultState(), 3);
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos(x, y, z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
										.getValue(new ResourceLocation("new_blocks:block.coconut.hit.ground")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
										.getValue(new ResourceLocation("new_blocks:block.coconut.hit.ground")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
				} else {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(CoconutSliceItem.block));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(CoconutSliceItem.block));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof ServerWorld) {
						FallingBlockEntity blockToSpawn = new FallingBlockEntity((World) world, (x + 0.5), y, (z + 0.5),
								(world.getBlockState(new BlockPos(x, y, z))));
						blockToSpawn.fallTime = 1;
						world.addEntity(blockToSpawn);
					}
					world.setBlockState(new BlockPos(x, y, z), Blocks.AIR.getDefaultState(), 3);
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
							{
								List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(x - (2 / 2d), (y - 2) - (2 / 2d),
										z - (2 / 2d), x + (2 / 2d), (y - 2) + (2 / 2d), z + (2 / 2d)), null).stream().sorted(new Object() {
											Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
												return Comparator
														.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
											}
										}.compareDistOf(x, (y - 2), z)).collect(Collectors.toList());
								for (Entity entityiterator : _entfound) {
									if (entityiterator instanceof FallingBlockEntity) {
										if (!entityiterator.world.isRemote())
											entityiterator.remove();
									} else {
										if (entityiterator instanceof LivingEntity) {
											((LivingEntity) entityiterator).attackEntityFrom(new DamageSource("hit.coconut").setDamageBypassesArmor(),
													(float) 15);
										}
									}
								}
							}
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, (int) 15);
				}
			} else {
				world.setBlockState(new BlockPos(x, y, z), Blocks.AIR.getDefaultState(), 3);
				if (world instanceof World && !world.isRemote()) {
					((World) world).playSound(null, new BlockPos(x, y, z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("new_blocks:block.coconut.hit.ground")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("new_blocks:block.coconut.hit.ground")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
				}
			}
		} else {
			if (world.getBlockState(new BlockPos(x, y - 1, z)).isSolid()) {
				world.destroyBlock(new BlockPos(x, y, z), false);
				if (world instanceof World && !world.isRemote()) {
					((World) world).playSound(null, new BlockPos(x, y, z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("new_blocks:block.coconut.hit.ground")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("new_blocks:block.coconut.hit.ground")),
							SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
				}
			}
		}
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Coconut0Block.block) {
			if (Math.random() < 0.1) {
				if (Math.random() < 0.1) {
					{
						BlockPos _bp = new BlockPos(x, y, z);
						BlockState _bs = Coconut1Block.block.getDefaultState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
							if (_property != null && _bs.get(_property) != null)
								try {
									_bs = _bs.with(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlockState(_bp, _bs, 3);
					}
				}
			}
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Coconut1Block.block) {
			if (Math.random() < 0.1) {
				if (Math.random() < 0.1) {
					{
						BlockPos _bp = new BlockPos(x, y, z);
						BlockState _bs = Coconut2Block.block.getDefaultState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
							if (_property != null && _bs.get(_property) != null)
								try {
									_bs = _bs.with(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						world.setBlockState(_bp, _bs, 3);
					}
				}
			}
		}
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Coconut2Block.block) {
			if (Math.random() < 0.1) {
				if (Math.random() < 0.1) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(CoconutSliceItem.block));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(CoconutSliceItem.block));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof ServerWorld) {
						FallingBlockEntity blockToSpawn = new FallingBlockEntity((World) world, (x + 0.5), y, (z + 0.5),
								(world.getBlockState(new BlockPos(x, y, z))));
						blockToSpawn.fallTime = 1;
						world.addEntity(blockToSpawn);
					}
					world.setBlockState(new BlockPos(x, y, z), Blocks.AIR.getDefaultState(), 3);
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
							{
								List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class, new AxisAlignedBB(x - (2 / 2d), (y - 2) - (2 / 2d),
										z - (2 / 2d), x + (2 / 2d), (y - 2) + (2 / 2d), z + (2 / 2d)), null).stream().sorted(new Object() {
											Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
												return Comparator
														.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
											}
										}.compareDistOf(x, (y - 2), z)).collect(Collectors.toList());
								for (Entity entityiterator : _entfound) {
									if (entityiterator instanceof FallingBlockEntity) {
										if (!entityiterator.world.isRemote())
											entityiterator.remove();
									} else {
										if (entityiterator instanceof LivingEntity) {
											((LivingEntity) entityiterator).attackEntityFrom(new DamageSource("hit.coconut").setDamageBypassesArmor(),
													(float) 15);
										}
									}
								}
							}
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, (int) 15);
				}
			}
		}
	}
}
