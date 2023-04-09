package net.mcreator.newblocks.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.newblocks.potion.RadiationPoisoningPotionEffect;
import net.mcreator.newblocks.block.PitchblendeOreBlock;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Random;
import java.util.Map;
import java.util.Collection;

public class GeigarCounterItemInInventoryTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure GeigarCounterItemInInventoryTick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure GeigarCounterItemInInventoryTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure GeigarCounterItemInInventoryTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure GeigarCounterItemInInventoryTick!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure GeigarCounterItemInInventoryTick!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency itemstack for procedure GeigarCounterItemInInventoryTick!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		BlockState wheatBlock = Blocks.AIR.getDefaultState();
		boolean found = false;
		boolean found2 = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double sound = 0;
		double sx2 = 0;
		double sy2 = 0;
		double sz2 = 0;
		sx = (-3);
		found = (false);
		for (int index0 = 0; index0 < (int) (4); index0++) {
			sy = (-3);
			for (int index1 = 0; index1 < (int) (4); index1++) {
				sz = (-3);
				for (int index2 = 0; index2 < (int) (4); index2++) {
					if ((world.getBlockState(new BlockPos(x + sx, y + sy, z + sz))).getBlock() == PitchblendeOreBlock.block) {
						found = (true);
					}
					sz = (sz + 1);
				}
				sy = (sy + 1);
			}
			sx = (sx + 1);
		}
		sx2 = (-16);
		found2 = (false);
		for (int index3 = 0; index3 < (int) (12); index3++) {
			sy2 = (-16);
			for (int index4 = 0; index4 < (int) (12); index4++) {
				sz2 = (-16);
				for (int index5 = 0; index5 < (int) (12); index5++) {
					if ((world.getBlockState(new BlockPos(x + sx2, y + sy2, z + sz2))).getBlock() == PitchblendeOreBlock.block) {
						found2 = (true);
					}
					sz2 = (sz2 + 1);
				}
				sy2 = (sy2 + 1);
			}
			sx2 = (sx2 + 1);
		}
		if (found == true || new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == RadiationPoisoningPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) {
			sound = (MathHelper.nextDouble(new Random(), 1, 4));
			{
				ItemStack _ist = itemstack;
				if (_ist.attemptDamageItem((int) (MathHelper.nextDouble(new Random(), 1, 4)), new Random(), null)) {
					_ist.shrink(1);
					_ist.setDamage(0);
				}
			}
			if (Math.random() < 0.06) {
				if (world instanceof World && !world.isRemote()) {
					((World) world).playSound(null, new BlockPos(x, y, z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("new_blocks:geigar_counter_clicking")),
							SoundCategory.NEUTRAL, (float) 1, (float) (MathHelper.nextDouble(new Random(), 1, 1.07)));
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("new_blocks:geigar_counter_clicking")),
							SoundCategory.NEUTRAL, (float) 1, (float) (MathHelper.nextDouble(new Random(), 1, 1.07)), false);
				}
			}
		}
		if (found2 == true) {
			sound = (MathHelper.nextDouble(new Random(), 1, 4));
			if (Math.random() < 0.01) {
				if (world instanceof World && !world.isRemote()) {
					((World) world).playSound(null, new BlockPos(x, y, z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("new_blocks:geigar_counter_clicking")),
							SoundCategory.NEUTRAL, (float) 1, (float) (MathHelper.nextDouble(new Random(), 1, 1.07)));
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
									.getValue(new ResourceLocation("new_blocks:geigar_counter_clicking")),
							SoundCategory.NEUTRAL, (float) 1, (float) (MathHelper.nextDouble(new Random(), 1, 1.07)), false);
				}
				{
					ItemStack _ist = itemstack;
					if (_ist.attemptDamageItem((int) (MathHelper.nextDouble(new Random(), 1, 12)), new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamage(0);
					}
				}
			}
		}
	}
}
