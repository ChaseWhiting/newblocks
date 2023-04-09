
package net.mcreator.newblocks.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.newblocks.NewBlocksModElements;

@NewBlocksModElements.ModElement.Tag
public class CuttingKnifeItem extends NewBlocksModElements.ModElement {
	@ObjectHolder("new_blocks:cutting_knife")
	public static final Item block = null;

	public CuttingKnifeItem(NewBlocksModElements instance) {
		super(instance, 1888);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 64;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return -1f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 1;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -2f, new Item.Properties().group(ItemGroup.TOOLS)) {
			@Override
			public boolean hasContainerItem() {
				return true;
			}

			@Override
			public ItemStack getContainerItem(ItemStack itemstack) {
				ItemStack retval = new ItemStack(this);
				retval.setDamage(itemstack.getDamage() + 1);
				if (retval.getDamage() >= retval.getMaxDamage()) {
					return ItemStack.EMPTY;
				}
				return retval;
			}

			@Override
			public boolean isRepairable(ItemStack itemstack) {
				return false;
			}
		}.setRegistryName("cutting_knife"));
	}
}
