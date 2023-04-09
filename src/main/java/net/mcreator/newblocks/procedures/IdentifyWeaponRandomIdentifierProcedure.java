package net.mcreator.newblocks.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.HoeItem;
import net.minecraft.item.AxeItem;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;
import java.util.HashMap;

public class IdentifyWeaponRandomIdentifierProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onItemCrafted(PlayerEvent.ItemCraftedEvent event) {
			Entity entity = event.getPlayer();
			World world = entity.world;
			double i = entity.getPosX();
			double j = entity.getPosY();
			double k = entity.getPosZ();
			ItemStack itemStack = event.getCrafting();
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("itemstack", itemStack);
			dependencies.put("event", event);
			executeProcedure(dependencies);
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency itemstack for procedure IdentifyWeaponRandomIdentifier!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if (itemstack.getItem() instanceof SwordItem) {
			(itemstack).setDisplayName(new StringTextComponent(("Common " + itemstack.getDisplayName().getString())));
		}
		if (itemstack.getItem() instanceof PickaxeItem) {
			(itemstack).setDisplayName(new StringTextComponent(("Common " + itemstack.getDisplayName().getString())));
		}
		if (itemstack.getItem() instanceof AxeItem) {
			(itemstack).setDisplayName(new StringTextComponent(("Common " + itemstack.getDisplayName().getString())));
		}
		if (itemstack.getItem() instanceof ShovelItem) {
			(itemstack).setDisplayName(new StringTextComponent(("Common " + itemstack.getDisplayName().getString())));
		}
		if (itemstack.getItem() instanceof HoeItem) {
			(itemstack).setDisplayName(new StringTextComponent(("Common " + itemstack.getDisplayName().getString())));
		}
	}
}
