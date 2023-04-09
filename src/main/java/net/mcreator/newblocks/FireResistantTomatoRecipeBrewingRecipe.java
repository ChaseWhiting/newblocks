
package net.mcreator.newblocks;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.potion.Potions;
import net.minecraft.potion.PotionUtils;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;

import net.mcreator.newblocks.item.TomatoItem;
import net.mcreator.newblocks.item.FireResistantTomatoItem;

@NewBlocksModElements.ModElement.Tag
public class FireResistantTomatoRecipeBrewingRecipe extends NewBlocksModElements.ModElement {
	public FireResistantTomatoRecipeBrewingRecipe(NewBlocksModElements instance) {
		super(instance, 1990);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(new CustomBrewingRecipe());
	}

	public static class CustomBrewingRecipe implements IBrewingRecipe {
		@Override
		public boolean isInput(ItemStack input) {
			Item inputItem = input.getItem();
			return (inputItem == Items.POTION || inputItem == Items.SPLASH_POTION || inputItem == Items.LINGERING_POTION)
					&& PotionUtils.getPotionFromItem(input) == Potions.FIRE_RESISTANCE;
		}

		@Override
		public boolean isIngredient(ItemStack ingredient) {
			return ingredient.getItem() == TomatoItem.block;
		}

		@Override
		public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
			if (isInput(input) && isIngredient(ingredient)) {
				return new ItemStack(FireResistantTomatoItem.block);
			}
			return ItemStack.EMPTY;
		}
	}
}
