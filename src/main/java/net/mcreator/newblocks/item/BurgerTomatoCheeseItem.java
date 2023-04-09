
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
public class BurgerTomatoCheeseItem extends NewBlocksModElements.ModElement {
	@ObjectHolder("new_blocks:burger_tomato_cheese")
	public static final Item block = null;

	public BurgerTomatoCheeseItem(NewBlocksModElements instance) {
		super(instance, 1878);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(12).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(12).saturation(0.99f)

							.meat().build()));
			setRegistryName("burger_tomato_cheese");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 40;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
