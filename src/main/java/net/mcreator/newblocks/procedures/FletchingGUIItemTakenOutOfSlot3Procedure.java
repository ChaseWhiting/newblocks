package net.mcreator.newblocks.procedures;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.function.Supplier;
import java.util.Map;

public class FletchingGUIItemTakenOutOfSlot3Procedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure FletchingGUIItemTakenOutOfSlot3!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((new Object() {
			public ItemStack getItemStack(int sltid) {
				Entity _ent = entity;
				if (_ent instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) _ent).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (0))).getItem() == Items.ARROW) {
			{
				Entity _ent = entity;
				if (_ent instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) _ent).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (0))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
			}
			{
				Entity _ent = entity;
				if (_ent instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) _ent).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (1))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
			}
			{
				Entity _ent = entity;
				if (_ent instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) _ent).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (2))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
			}
		}
	}
}
