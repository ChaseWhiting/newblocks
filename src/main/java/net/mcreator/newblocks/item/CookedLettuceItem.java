
package net.mcreator.newblocks.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.block.BlockState;

import net.mcreator.newblocks.NewBlocksModElements;

@NewBlocksModElements.ModElement.Tag
public class CookedLettuceItem extends NewBlocksModElements.ModElement {
	@ObjectHolder("new_blocks:cooked_lettuce")
	public static final Item block = null;

	public CookedLettuceItem(NewBlocksModElements instance) {
		super(instance, 1849);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(4).saturation(0.6f)

							.build()));
			setRegistryName("cooked_lettuce");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 28;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 0F;
		}
	}
}
