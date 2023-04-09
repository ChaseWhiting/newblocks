package net.mcreator.newblocks.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Random;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

public class SnowmobileOnEntityTickUpdateProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure SnowmobileOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure SnowmobileOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure SnowmobileOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure SnowmobileOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure SnowmobileOnEntityTickUpdate!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.SAND
				|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.SNOW_BLOCK
				|| (world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.SNOW) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 5, (int) 2, (false), (false)));
		} else {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 20, (int) 0, (false), (false)));
		}
		{
			List<Entity> _entfound = world
					.getEntitiesWithinAABB(Entity.class,
							new AxisAlignedBB(x - (1 / 2d), y - (1 / 2d), z - (1 / 2d), x + (1 / 2d), y + (1 / 2d), z + (1 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if ((entityiterator instanceof PlayerEntity)
						? ((PlayerEntity) entityiterator).inventory.hasItemStack(new ItemStack(Items.BLAZE_POWDER))
						: false) {
					if (Math.random() < 0.2) {
						if (Math.random() < 0.2) {
							if (MathHelper.nextDouble(new Random(), 0, 5) == 1) {
								if (entityiterator instanceof PlayerEntity) {
									ItemStack _stktoremove = new ItemStack(Items.BLAZE_POWDER);
									((PlayerEntity) entityiterator).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
											((PlayerEntity) entityiterator).container.func_234641_j_());
								}
							}
						}
					}
					if (Math.random() < 0.2) {
						if (Math.random() < 0.2) {
							if (Math.random() < 0.2) {
								if (world instanceof World && !world.isRemote()) {
									((World) world).playSound(null, new BlockPos(x, y, z),
											(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
													.getValue(new ResourceLocation("new_blocks:snowmobile_moving")),
											SoundCategory.MASTER, (float) 1, (float) 1);
								} else {
									((World) world).playSound(x, y, z,
											(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
													.getValue(new ResourceLocation("new_blocks:snowmobile_moving")),
											SoundCategory.MASTER, (float) 1, (float) 1, false);
								}
							}
						}
					}
				} else {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 40, (int) 3, (false), (false)));
				}
			}
		}
	}
}
