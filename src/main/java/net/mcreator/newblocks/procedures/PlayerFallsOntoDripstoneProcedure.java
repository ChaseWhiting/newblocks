package net.mcreator.newblocks.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.block.DripstoneUpTipBlock;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;
import java.util.HashMap;

public class PlayerFallsOntoDripstoneProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onEntityFall(LivingFallEvent event) {
			if (event != null && event.getEntity() != null) {
				Entity entity = event.getEntity();
				double i = entity.getPosX();
				double j = entity.getPosY();
				double k = entity.getPosZ();
				double damagemultiplier = event.getDamageMultiplier();
				double distance = event.getDistance();
				World world = entity.world;
				Map<String, Object> dependencies = new HashMap<>();
				dependencies.put("x", i);
				dependencies.put("y", j);
				dependencies.put("z", k);
				dependencies.put("damagemultiplier", damagemultiplier);
				dependencies.put("distance", distance);
				dependencies.put("world", world);
				dependencies.put("entity", entity);
				dependencies.put("event", event);
				executeProcedure(dependencies);
			}
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure PlayerFallsOntoDripstone!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure PlayerFallsOntoDripstone!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure PlayerFallsOntoDripstone!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure PlayerFallsOntoDripstone!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure PlayerFallsOntoDripstone!");
			return;
		}
		if (dependencies.get("damagemultiplier") == null) {
			if (!dependencies.containsKey("damagemultiplier"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency damagemultiplier for procedure PlayerFallsOntoDripstone!");
			return;
		}
		if (dependencies.get("distance") == null) {
			if (!dependencies.containsKey("distance"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency distance for procedure PlayerFallsOntoDripstone!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		double damagemultiplier = dependencies.get("damagemultiplier") instanceof Integer
				? (int) dependencies.get("damagemultiplier")
				: (double) dependencies.get("damagemultiplier");
		double distance = dependencies.get("distance") instanceof Integer
				? (int) dependencies.get("distance")
				: (double) dependencies.get("distance");
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == DripstoneUpTipBlock.block) {
			entity.fallDistance = (float) (((entity.getMotion().getY() + distance) * damagemultiplier));
		}
	}
}
