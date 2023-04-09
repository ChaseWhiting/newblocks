package net.mcreator.newblocks.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.function.Function;
import java.util.Map;
import java.util.Comparator;

public class GoatHornRightClickedInAirProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure GoatHornRightClickedInAir!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure GoatHornRightClickedInAir!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure GoatHornRightClickedInAir!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure GoatHornRightClickedInAir!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure GoatHornRightClickedInAir!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency itemstack for procedure GoatHornRightClickedInAir!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (entity.isSneaking()) {
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos(x, y, z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("new_blocks:horn_2")),
						SoundCategory.MASTER, (float) 60, (float) 0.7);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("new_blocks:horn_2")),
						SoundCategory.MASTER, (float) 60, (float) 0.7, false);
			}
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).getCooldownTracker().setCooldown(itemstack.getItem(), (int) 200);
		} else {
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos(x, y, z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("new_blocks:horn_2")),
						SoundCategory.MASTER, (float) 60, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("new_blocks:horn_2")),
						SoundCategory.MASTER, (float) 60, (float) 1, false);
			}
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).getCooldownTracker().setCooldown(itemstack.getItem(), (int) 200);
		}
		if (((Entity) world
				.getEntitiesWithinAABB(VillagerEntity.class,
						new AxisAlignedBB(x - (40 / 2d), y - (40 / 2d), z - (40 / 2d), x + (40 / 2d), y + (40 / 2d), z + (40 / 2d)), null)
				.stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) != null) {
			sx = (-32);
			found = (false);
			for (int index0 = 0; index0 < (int) (64); index0++) {
				sy = (-32);
				for (int index1 = 0; index1 < (int) (64); index1++) {
					sz = (-32);
					for (int index2 = 0; index2 < (int) (64); index2++) {
						if ((world.getBlockState(new BlockPos(x + sx, y + sy, z + sz))).getBlock() == Blocks.BELL) {
							found = (true);
						}
						sz = (sz + 1);
					}
					sy = (sy + 1);
				}
				sx = (sx + 1);
			}
			if (found == true) {
				(itemstack).shrink((int) 1);
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.BAD_OMEN, (int) 20, (int) 1, (false), (true)));
			}
		}
	}
}
