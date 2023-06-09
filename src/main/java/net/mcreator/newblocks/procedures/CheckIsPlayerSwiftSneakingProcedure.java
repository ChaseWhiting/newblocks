package net.mcreator.newblocks.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.World;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.EnchantmentHelper;

import net.mcreator.newblocks.enchantment.SwiftSneakEnchantment;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;
import java.util.HashMap;

public class CheckIsPlayerSwiftSneakingProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
			if (event.phase == TickEvent.Phase.END) {
				Entity entity = event.player;
				World world = entity.world;
				double i = entity.getPosX();
				double j = entity.getPosY();
				double k = entity.getPosZ();
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
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure CheckIsPlayerSwiftSneaking!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity.isSneaking()) {
			if ((EnchantmentHelper.getEnchantmentLevel(SwiftSneakEnchantment.enchantment,
					((entity instanceof LivingEntity)
							? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.LEGS)
							: ItemStack.EMPTY)) != 0)) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 8,
							(int) (EnchantmentHelper.getEnchantmentLevel(SwiftSneakEnchantment.enchantment,
									((entity instanceof LivingEntity)
											? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.LEGS)
											: ItemStack.EMPTY))),
							(false), (false)));
			}
		}
	}
}
