package net.mcreator.newblocks.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Hand;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.state.Property;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.BlockState;

import net.mcreator.newblocks.block.BrushDirt9Block;
import net.mcreator.newblocks.block.BrushDirt8Block;
import net.mcreator.newblocks.block.BrushDirt7Block;
import net.mcreator.newblocks.block.BrushDirt6Block;
import net.mcreator.newblocks.block.BrushDirt5Block;
import net.mcreator.newblocks.block.BrushDirt4Block;
import net.mcreator.newblocks.block.BrushDirt3Block;
import net.mcreator.newblocks.block.BrushDirt2Block;
import net.mcreator.newblocks.block.BrushDirt1Block;
import net.mcreator.newblocks.block.BrushDirt15Block;
import net.mcreator.newblocks.block.BrushDirt14Block;
import net.mcreator.newblocks.block.BrushDirt13Block;
import net.mcreator.newblocks.block.BrushDirt12Block;
import net.mcreator.newblocks.block.BrushDirt11Block;
import net.mcreator.newblocks.block.BrushDirt10Block;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Random;
import java.util.Map;

public class CopperBrushRightClickedOnBlockProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure CopperBrushRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure CopperBrushRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure CopperBrushRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure CopperBrushRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure CopperBrushRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency itemstack for procedure CopperBrushRightClickedOnBlock!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if (itemstack.getOrCreateTag().getDouble("ticksToUse") == 0) {
			itemstack.getOrCreateTag().putDouble("ticksToUse", 1);
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).swing(Hand.MAIN_HAND, true);
			}
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).getCooldownTracker().setCooldown(itemstack.getItem(), (int) 15);
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos(x, y, z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("new_blocks:item.brush.brush")),
						SoundCategory.BLOCKS, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("new_blocks:item.brush.brush")),
						SoundCategory.BLOCKS, (float) 1, (float) 1, false);
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
					itemstack.getOrCreateTag().putDouble("ticksToUse", 0);
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, (int) 15);
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == BrushDirt1Block.block) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).getCooldownTracker().setCooldown(itemstack.getItem(), (int) 15);
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = BrushDirt2Block.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bso, _bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == BrushDirt2Block.block) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).getCooldownTracker().setCooldown(itemstack.getItem(), (int) 15);
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = BrushDirt3Block.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bso, _bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == BrushDirt3Block.block) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).getCooldownTracker().setCooldown(itemstack.getItem(), (int) 15);
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = BrushDirt4Block.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bso, _bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == BrushDirt4Block.block) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).getCooldownTracker().setCooldown(itemstack.getItem(), (int) 15);
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = BrushDirt5Block.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bso, _bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == BrushDirt5Block.block) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).getCooldownTracker().setCooldown(itemstack.getItem(), (int) 15);
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = BrushDirt6Block.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bso, _bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == BrushDirt6Block.block) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).getCooldownTracker().setCooldown(itemstack.getItem(), (int) 15);
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = BrushDirt7Block.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bso, _bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == BrushDirt7Block.block) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).getCooldownTracker().setCooldown(itemstack.getItem(), (int) 15);
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = BrushDirt8Block.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bso, _bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == BrushDirt8Block.block) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).getCooldownTracker().setCooldown(itemstack.getItem(), (int) 15);
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = BrushDirt9Block.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bso, _bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == BrushDirt9Block.block) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).getCooldownTracker().setCooldown(itemstack.getItem(), (int) 15);
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = BrushDirt10Block.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bso, _bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == BrushDirt10Block.block) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).getCooldownTracker().setCooldown(itemstack.getItem(), (int) 15);
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = BrushDirt11Block.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bso, _bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == BrushDirt11Block.block) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).getCooldownTracker().setCooldown(itemstack.getItem(), (int) 15);
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = BrushDirt12Block.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bso, _bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == BrushDirt12Block.block) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).getCooldownTracker().setCooldown(itemstack.getItem(), (int) 15);
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = BrushDirt13Block.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bso, _bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == BrushDirt13Block.block) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).getCooldownTracker().setCooldown(itemstack.getItem(), (int) 15);
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = BrushDirt14Block.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bso, _bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == BrushDirt14Block.block) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).getCooldownTracker().setCooldown(itemstack.getItem(), (int) 15);
				{
					BlockPos _bp = new BlockPos(x, y, z);
					BlockState _bs = BrushDirt15Block.block.getDefaultState();
					BlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
						Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
						if (_property != null && _bs.get(_property) != null)
							try {
								_bs = _bs.with(_property, (Comparable) entry.getValue());
							} catch (Exception e) {
							}
					}
					TileEntity _te = world.getTileEntity(_bp);
					CompoundNBT _bnbt = null;
					if (_te != null) {
						_bnbt = _te.write(new CompoundNBT());
						_te.remove();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.read(_bso, _bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
			} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == BrushDirt15Block.block) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).getCooldownTracker().setCooldown(itemstack.getItem(), (int) 15);
				{
					ItemStack _ist = itemstack;
					if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
				if (Math.random() < 0.1) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.DIAMOND));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				} else if (Math.random() < 0.2) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.EMERALD));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				} else if (Math.random() < 0.3) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.IRON_INGOT));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				} else if (Math.random() < 0.26) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.GOLD_INGOT));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				} else if (Math.random() < 0.3) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.FLINT));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				} else if (Math.random() < 0.3) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.BONE));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				} else if (Math.random() < 0.27) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.BONE));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.BONE));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.BONE));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
				}
			}
		}
	}
}
