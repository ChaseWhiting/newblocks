package net.mcreator.newblocks.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.Enchantments;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;
import java.util.HashMap;

public class EnchantmeCommandExecutedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure EnchantmeCommandExecuted!");
			return;
		}
		if (dependencies.get("cmdparams") == null) {
			if (!dependencies.containsKey("cmdparams"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency cmdparams for procedure EnchantmeCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		HashMap cmdparams = (HashMap) dependencies.get("cmdparams");
		(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)).addEnchantment(Enchantments.SHARPNESS,
				(int) new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(new Object() {
					public String getText() {
						String param = (String) cmdparams.get("0");
						if (param != null) {
							return param;
						}
						return "";
					}
				}.getText()));
	}
}
