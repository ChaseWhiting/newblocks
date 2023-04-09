package net.mcreator.newblocks.procedures;

import net.minecraftforge.energy.CapabilityEnergy;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntity;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.Map;

public class SmallBatteryUpdateTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure SmallBatteryUpdateTick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure SmallBatteryUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure SmallBatteryUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure SmallBatteryUpdateTick!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (new Object() {
			public int getEnergyStored(IWorld world, BlockPos pos) {
				AtomicInteger _retval = new AtomicInteger(0);
				TileEntity _ent = world.getTileEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
				return _retval.get();
			}
		}.getEnergyStored(world, new BlockPos(x, y, z)) > 20) {
			{
				TileEntity _ent = world.getTileEntity(new BlockPos(x, y - 1, z));
				int _amount = (int) 20;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
			{
				TileEntity _ent = world.getTileEntity(new BlockPos(x, y, z));
				int _amount = (int) 20;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
			}
		}
	}
}
