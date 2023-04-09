package net.mcreator.newblocks.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.MathHelper;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.world.DamageTesterTestDamageGameRule;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Random;
import java.util.Map;
import java.util.HashMap;

public class DamageAmountsDamageTesterProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onEntityAttacked(LivingHurtEvent event) {
			if (event != null && event.getEntity() != null) {
				Entity entity = event.getEntity();
				Entity sourceentity = event.getSource().getTrueSource();
				double i = entity.getPosX();
				double j = entity.getPosY();
				double k = entity.getPosZ();
				double amount = event.getAmount();
				World world = entity.world;
				Map<String, Object> dependencies = new HashMap<>();
				dependencies.put("x", i);
				dependencies.put("y", j);
				dependencies.put("z", k);
				dependencies.put("amount", amount);
				dependencies.put("world", world);
				dependencies.put("entity", entity);
				dependencies.put("sourceentity", sourceentity);
				dependencies.put("event", event);
				executeProcedure(dependencies);
			}
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure DamageAmountsDamageTester!");
			return;
		}
		if (dependencies.get("amount") == null) {
			if (!dependencies.containsKey("amount"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency amount for procedure DamageAmountsDamageTester!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double amount = dependencies.get("amount") instanceof Integer ? (int) dependencies.get("amount") : (double) dependencies.get("amount");
		amount = (amount + MathHelper.nextDouble(new Random(), 0,
				world.getWorldInfo().getGameRulesInstance().getInt(DamageTesterTestDamageGameRule.gamerule)));
	}
}
