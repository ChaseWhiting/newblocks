
package net.mcreator.newblocks.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.newblocks.item.RadiationSymbolItem;
import net.mcreator.newblocks.NewBlocksModElements;

@NewBlocksModElements.ModElement.Tag
public class RadiationItemGroup extends NewBlocksModElements.ModElement {
	public RadiationItemGroup(NewBlocksModElements instance) {
		super(instance, 1934);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabradiation") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RadiationSymbolItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
