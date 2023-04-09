
package net.mcreator.newblocks.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.common.IPlantable;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Direction;
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
public class MudBlock extends NewBlocksModElements.ModElement {
	@ObjectHolder("new_blocks:mud")
	public static final Block block = null;

	public MudBlock(NewBlocksModElements instance) {
		super(instance, 1813);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(NewblocksItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.EARTH)
					.sound(new ForgeSoundType(1.0f, 1.0f, () -> new SoundEvent(new ResourceLocation("new_blocks:mud_break")),
							() -> new SoundEvent(new ResourceLocation("new_blocks:mud_step")),
							() -> new SoundEvent(new ResourceLocation("new_blocks:mud_place")),
							() -> new SoundEvent(new ResourceLocation("new_blocks:mud_breaking")),
							() -> new SoundEvent(new ResourceLocation("new_blocks:mud_step"))))
					.hardnessAndResistance(0.5f, 5f).setLightLevel(s -> 0).speedFactor(0.9f).jumpFactor(0.9f));
			setRegistryName("mud");
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 15;
		}

		@Override
		public boolean canSustainPlant(BlockState state, IBlockReader world, BlockPos pos, Direction direction, IPlantable plantable) {
			return true;
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
