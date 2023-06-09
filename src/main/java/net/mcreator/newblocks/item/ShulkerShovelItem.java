
package net.mcreator.newblocks.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.newblocks.NewBlocksModElements;

@NewBlocksModElements.ModElement.Tag
public class ShulkerShovelItem extends NewBlocksModElements.ModElement {
	@ObjectHolder("new_blocks:shulker_shovel")
	public static final Item block = null;

	public ShulkerShovelItem(NewBlocksModElements instance) {
		super(instance, 421);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 2450;
			}

			public float getEfficiency() {
				return 9.5f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 16;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Items.SHULKER_SHELL));
			}
		}, 1, -2.8f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("shulker_shovel"));
	}
}
