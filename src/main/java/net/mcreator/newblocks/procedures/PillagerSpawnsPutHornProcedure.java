package net.mcreator.newblocks.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

import net.minecraft.world.World;
import net.minecraft.util.Hand;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.monster.PillagerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.item.GoatHornItem;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;
import java.util.HashMap;

public class PillagerSpawnsPutHornProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onEntitySpawned(EntityJoinWorldEvent event) {
			Entity entity = event.getEntity();
			double i = entity.getPosX();
			double j = entity.getPosY();
			double k = entity.getPosZ();
			World world = event.getWorld();
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("event", event);
			executeProcedure(dependencies);
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure PillagerSpawnsPutHorn!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PillagerEntity) {
			if (Math.random() < 0.2) {
				if (Math.random() < 0.34) {
					if (entity instanceof LivingEntity) {
						ItemStack _setstack = new ItemStack(GoatHornItem.block);
						_setstack.setCount((int) 1);
						((LivingEntity) entity).setHeldItem(Hand.OFF_HAND, _setstack);
						if (entity instanceof ServerPlayerEntity)
							((ServerPlayerEntity) entity).inventory.markDirty();
					}
				} else {
					if (Math.random() < 0.1) {
						if (Math.random() < 0.2) {
							if (entity instanceof LivingEntity) {
								ItemStack _setstack = new ItemStack(Items.ENDER_PEARL);
								_setstack.setCount((int) 1);
								((LivingEntity) entity).setHeldItem(Hand.OFF_HAND, _setstack);
								if (entity instanceof ServerPlayerEntity)
									((ServerPlayerEntity) entity).inventory.markDirty();
							}
						}
					}
				}
			}
		}
	}
}
