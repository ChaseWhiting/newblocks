
package net.mcreator.newblocks.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.common.ToolType;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.newblocks.itemgroup.NewblocksItemGroup;
import net.mcreator.newblocks.NewBlocksModElements;

import java.util.List;
import java.util.Collections;

@NewBlocksModElements.ModElement.Tag
public class AmethystBlockBlock extends NewBlocksModElements.ModElement {
	@ObjectHolder("new_blocks:amethyst_block")
	public static final Block block = null;

	public AmethystBlockBlock(NewBlocksModElements instance) {
		super(instance, 1425);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(NewblocksItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK)
					.sound(new ForgeSoundType(1.0f, 1.0f, () -> new SoundEvent(new ResourceLocation("new_blocks:amethyst.break")),
							() -> new SoundEvent(new ResourceLocation("new_blocks:amethyst.footsteps")),
							() -> new SoundEvent(new ResourceLocation("new_blocks:amethyst.place")),
							() -> new SoundEvent(new ResourceLocation("new_blocks:amethyst.break")),
							() -> new SoundEvent(new ResourceLocation("new_blocks:amethyst.fall"))))
					.hardnessAndResistance(1.5f, 10f).setLightLevel(s -> 0).harvestLevel(0).harvestTool(ToolType.PICKAXE).setRequiresTool());
			setRegistryName("amethyst_block");
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 15;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
