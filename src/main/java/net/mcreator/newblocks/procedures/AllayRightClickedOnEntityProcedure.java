package net.mcreator.newblocks.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.util.Hand;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class AllayRightClickedOnEntityProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure AllayRightClickedOnEntity!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency sourceentity for procedure AllayRightClickedOnEntity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		System.out.println("A allay was just right clicked! The item it is trying to be given is "
				+ ((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
				+ " and the UUID of the Allay is " + entity.getUniqueID().toString());
		if (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == Blocks.AIR
				.asItem()) {
			if (sourceentity instanceof PlayerEntity) {
				ItemStack _setstack = (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).copy());
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) sourceentity), _setstack);
			}
			if (entity instanceof LivingEntity) {
				ItemStack _setstack = new ItemStack(Blocks.AIR);
				_setstack.setCount((int) 1);
				((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
				if (entity instanceof ServerPlayerEntity)
					((ServerPlayerEntity) entity).inventory.markDirty();
			}
		} else {
			if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == Blocks.AIR
					.asItem()) {
				if (entity instanceof LivingEntity) {
					ItemStack _setstack = (((sourceentity instanceof LivingEntity)
							? ((LivingEntity) sourceentity).getHeldItemMainhand()
							: ItemStack.EMPTY).copy());
					_setstack.setCount((int) 1);
					((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
					if (entity instanceof ServerPlayerEntity)
						((ServerPlayerEntity) entity).inventory.markDirty();
				}
				(((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)).shrink((int) 1);
			}
		}
	}
}
