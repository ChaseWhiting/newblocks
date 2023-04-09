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
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.potion.DarknessPotionEffect;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

public class SculkingArmorHelmetTickEventProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure SculkingArmorHelmetTickEvent!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure SculkingArmorHelmetTickEvent!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure SculkingArmorHelmetTickEvent!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure SculkingArmorHelmetTickEvent!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure SculkingArmorHelmetTickEvent!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		{
			List<Entity> _entfound = world
					.getEntitiesWithinAABB(Entity.class,
							new AxisAlignedBB(x - (32 / 2d), y - (32 / 2d), z - (32 / 2d), x + (32 / 2d), y + (32 / 2d), z + (32 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator.getMotion().getZ() > 0 || entityiterator.getMotion().getY() > 0 || entityiterator.getMotion().getX() > 0) {
					if (!(entityiterator == entity)) {
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.GLOWING, (int) 60, (int) 1, (false), (false)));
						if (Math.random() < 0.7) {
							if (Math.random() < 0.7) {
								if (Math.random() < 0.7) {
									if (Math.random() < 0.7) {
										if (Math.random() < 0.7) {
											if (Math.random() < 0.7) {
												if (Math.random() < 0.7) {
													if (Math.random() < 0.7) {
														if (Math.random() < 0.7) {
															if (world instanceof World && !world.isRemote()) {
																((World) world).playSound(null, new BlockPos(x, y, z),
																		(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																				.getValue(new ResourceLocation("new_blocks:skulk_clicking_1")),
																		SoundCategory.NEUTRAL, (float) 3.5, (float) 1);
															} else {
																((World) world).playSound(x, y, z,
																		(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																				.getValue(new ResourceLocation("new_blocks:skulk_clicking_1")),
																		SoundCategory.NEUTRAL, (float) 3.5, (float) 1, false);
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(DarknessPotionEffect.potion, (int) 60, (int) 1, (false), (false)));
	}
}
