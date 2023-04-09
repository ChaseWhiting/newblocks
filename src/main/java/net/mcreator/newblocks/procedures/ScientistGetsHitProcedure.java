package net.mcreator.newblocks.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;
import java.util.HashMap;

public class ScientistGetsHitProcedure {
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
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure ScientistGetsHit!");
			return;
		}
		if (dependencies.get("immediatesourceentity") == null) {
			if (!dependencies.containsKey("immediatesourceentity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency immediatesourceentity for procedure ScientistGetsHit!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity immediatesourceentity = (Entity) dependencies.get("immediatesourceentity");
		if (EntityTypeTags.getCollection().getTagByID(new ResourceLocation("new_blocks:scientists")).contains(entity.getType()) && EntityTypeTags
				.getCollection().getTagByID(new ResourceLocation("new_blocks:scientists")).contains(immediatesourceentity.getType())) {
			if (dependencies.get("event") != null) {
				Object _obj = dependencies.get("event");
				if (_obj instanceof Event) {
					Event _evt = (Event) _obj;
					if (_evt.isCancelable())
						_evt.setCanceled(true);
				}
			}
		}
	}
}
