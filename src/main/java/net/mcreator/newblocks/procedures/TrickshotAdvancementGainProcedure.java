package net.mcreator.newblocks.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.projectile.SpectralArrowEntity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.monster.PillagerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;
import java.util.Iterator;
import java.util.HashMap;

public class TrickshotAdvancementGainProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onEntityAttacked(LivingAttackEvent event) {
			if (event != null && event.getEntity() != null) {
				Entity entity = event.getEntity();
				Entity sourceentity = event.getSource().getTrueSource();
				Entity immediatesourceentity = event.getSource().getImmediateSource();
				double i = entity.getPosX();
				double j = entity.getPosY();
				double k = entity.getPosZ();
				double amount = event.getAmount();
				World world = entity.world;
				Map<String, Object> dependencies = new HashMap<>();
				dependencies.put("x", i);
				dependencies.put("y", j);
				dependencies.put("z", k);
				dependencies.put("amount", amount);
				dependencies.put("world", world);
				dependencies.put("entity", entity);
				dependencies.put("sourceentity", sourceentity);
				dependencies.put("immediatesourceentity", immediatesourceentity);
				dependencies.put("event", event);
				executeProcedure(dependencies);
			}
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure TrickshotAdvancementGain!");
			return;
		}
		if (dependencies.get("immediatesourceentity") == null) {
			if (!dependencies.containsKey("immediatesourceentity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency immediatesourceentity for procedure TrickshotAdvancementGain!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency sourceentity for procedure TrickshotAdvancementGain!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity immediatesourceentity = (Entity) dependencies.get("immediatesourceentity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (entity instanceof PillagerEntity) {
			if (sourceentity instanceof PlayerEntity) {
				if (immediatesourceentity instanceof ArrowEntity || immediatesourceentity instanceof SpectralArrowEntity) {
					if (sourceentity.getMotion().getY() < -0.5) {
						if (sourceentity instanceof ServerPlayerEntity) {
							Advancement _adv = ((MinecraftServer) ((ServerPlayerEntity) sourceentity).server).getAdvancementManager()
									.getAdvancement(new ResourceLocation("new_blocks:trickshot"));
							AdvancementProgress _ap = ((ServerPlayerEntity) sourceentity).getAdvancements().getProgress(_adv);
							if (!_ap.isDone()) {
								Iterator _iterator = _ap.getRemaningCriteria().iterator();
								while (_iterator.hasNext()) {
									String _criterion = (String) _iterator.next();
									((ServerPlayerEntity) sourceentity).getAdvancements().grantCriterion(_adv, _criterion);
								}
							}
						}
					}
				}
			}
		}
	}
}
