
package net.mcreator.newblocks.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import net.mcreator.newblocks.NewBlocksModElements;

@NewBlocksModElements.ModElement.Tag
public class MusicDiscCoconutItem extends NewBlocksModElements.ModElement {
	@ObjectHolder("new_blocks:music_disc_coconut")
	public static final Item block = null;

	public MusicDiscCoconutItem(NewBlocksModElements instance) {
		super(instance, 1748);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, NewBlocksModElements.sounds.get(new ResourceLocation("new_blocks:music.disc.coconut")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("music_disc_coconut");
		}
	}
}
