package net.mcreator.newblocks.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.projectile.SpectralArrowEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.EnchantmentHelper;

import net.mcreator.newblocks.enchantment.DodgingEnchantment;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;
import java.util.HashMap;

public class DodgingEntityArrowHitsProcedure {
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
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure DodgingEntityArrowHits!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity instanceof ArrowEntity || entity instanceof SpectralArrowEntity) && (EnchantmentHelper.getEnchantmentLevel(
				DodgingEnchantment.enchantment,
				((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.FEET) : ItemStack.EMPTY)) != 0)) {
			if (dependencies.get("event") != null) {
				Object _obj = dependencies.get("event");
				if (_obj instanceof Event) {
					Event _evt = (Event) _obj;
					if (_evt.isCancelable())
						_evt.setCanceled(true);
				}
			}
			if (Math.random() < 0.5) {
				entity.setMotion((0 - Math.sin(entity.rotationYaw * (Math.PI / 180))), 0.02, (0.2 - Math.sin(entity.rotationYaw * (Math.PI / 180))));
			} else {
				entity.setMotion((0.2 - Math.sin(entity.rotationYaw * (Math.PI / 180))), 0.02, Math.cos(entity.rotationYaw * (Math.PI / 180)));
			}
		}
	}
}
