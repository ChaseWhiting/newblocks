package net.mcreator.newblocks.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Random;
import java.util.Map;

public class PteranodonFlyingEntityDiesProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure PteranodonFlyingEntityDies!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure PteranodonFlyingEntityDies!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure PteranodonFlyingEntityDies!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure PteranodonFlyingEntityDies!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (Math.random() < 0.7) {
			for (int index0 = 0; index0 < (int) (new Random().nextInt(3 + 1)); index0++) {
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.COD));
					entityToSpawn.setPickupDelay((int) 8);
					world.addEntity(entityToSpawn);
				}
			}
			if (Math.random() < 0.4) {
				for (int index1 = 0; index1 < (int) (new Random().nextInt(3 + 1)); index1++) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.SALMON));
						entityToSpawn.setPickupDelay((int) 8);
						world.addEntity(entityToSpawn);
					}
				}
			}
			if (Math.random() < 0.6) {
				for (int index2 = 0; index2 < (int) (new Random().nextInt(3 + 1)); index2++) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.TROPICAL_FISH));
						entityToSpawn.setPickupDelay((int) 8);
						world.addEntity(entityToSpawn);
					}
				}
			}
		} else if (Math.random() < 0.7) {
			for (int index3 = 0; index3 < (int) (new Random().nextInt(6 + 1)); index3++) {
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.INK_SAC));
					entityToSpawn.setPickupDelay((int) 8);
					world.addEntity(entityToSpawn);
				}
			}
		}
		if (Math.random() < 0.4) {
			for (int index4 = 0; index4 < (int) (new Random().nextInt(2 + 1)); index4++) {
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Items.PUFFERFISH));
					entityToSpawn.setPickupDelay((int) 8);
					world.addEntity(entityToSpawn);
				}
			}
		}
	}
}
