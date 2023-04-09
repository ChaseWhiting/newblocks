package net.mcreator.newblocks.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.util.math.MathHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.item.TomatoItem;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Random;
import java.util.Map;

public class TomatoCanPlayerFinishesUsingItemProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure TomatoCanPlayerFinishesUsingItem!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency itemstack for procedure TomatoCanPlayerFinishesUsingItem!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		(itemstack).shrink((int) 1);
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(TomatoItem.block);
			_setstack.setCount((int) (MathHelper.nextDouble(new Random(), 8, 16)));
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).getCooldownTracker().setCooldown(itemstack.getItem(), (int) 300);
	}
}
