
package net.mcreator.newblocks.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.block.BlockState;

import net.mcreator.newblocks.itemgroup.NewblocksItemGroup;
import net.mcreator.newblocks.NewBlocksModElements;

@NewBlocksModElements.ModElement.Tag
public class FriesItem extends NewBlocksModElements.ModElement {
	@ObjectHolder("new_blocks:fries")
	public static final Item block = null;

	public FriesItem(NewBlocksModElements instance) {
		super(instance, 1830);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(NewblocksItemGroup.tab).maxStackSize(64).rarity(Rarity.RARE)
					.food((new Food.Builder()).hunger(5).saturation(0.9f)

							.build()));
			setRegistryName("fries");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 22;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 0F;
		}
	}
}
