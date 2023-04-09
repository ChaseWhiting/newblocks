package net.mcreator.newblocks.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.potion.RadiationPoisoningPotionEffect;
import net.mcreator.newblocks.NewBlocksModVariables;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

public class PitchblendeOreUpdateTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure PitchblendeOreUpdateTick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure PitchblendeOreUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure PitchblendeOreUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure PitchblendeOreUpdateTick!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double sound = 0;
		{
			List<Entity> _entfound = world
					.getEntitiesWithinAABB(Entity.class,
							new AxisAlignedBB(x - (6 / 2d), y - (6 / 2d), z - (6 / 2d), x + (6 / 2d), y + (6 / 2d), z + (6 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof PlayerEntity) {
					if (Math.random() < 0.1) {
						if (entityiterator instanceof LivingEntity)
							((LivingEntity) entityiterator)
									.addPotionEffect(new EffectInstance(RadiationPoisoningPotionEffect.potion, (int) 100, (int) 0, (false), (false)));
						if ((entityiterator.getCapability(NewBlocksModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new NewBlocksModVariables.PlayerVariables())).rads < 301) {
							{
								double _setval = ((entityiterator.getCapability(NewBlocksModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new NewBlocksModVariables.PlayerVariables())).rads + 1);
								entityiterator.getCapability(NewBlocksModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.rads = _setval;
									capability.syncPlayerVariables(entityiterator);
								});
							}
						}
					}
				}
			}
		}
	}
}
