package net.mcreator.newblocks.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.newblocks.block.SkulkBlockBlock;
import net.mcreator.newblocks.block.SculkChuteBlock;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;
import java.util.Iterator;
import java.util.HashMap;

public class ItSpreadsAdvancementGrantToThePlayerProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onEntityDeath(LivingDeathEvent event) {
			if (event != null && event.getEntity() != null) {
				Entity entity = event.getEntity();
				Entity sourceentity = event.getSource().getTrueSource();
				double i = entity.getPosX();
				double j = entity.getPosY();
				double k = entity.getPosZ();
				World world = entity.world;
				Map<String, Object> dependencies = new HashMap<>();
				dependencies.put("x", i);
				dependencies.put("y", j);
				dependencies.put("z", k);
				dependencies.put("world", world);
				dependencies.put("entity", entity);
				dependencies.put("sourceentity", sourceentity);
				dependencies.put("event", event);
				executeProcedure(dependencies);
			}
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure ItSpreadsAdvancementGrantToThePlayer!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure ItSpreadsAdvancementGrantToThePlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure ItSpreadsAdvancementGrantToThePlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure ItSpreadsAdvancementGrantToThePlayer!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure ItSpreadsAdvancementGrantToThePlayer!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency sourceentity for procedure ItSpreadsAdvancementGrantToThePlayer!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		sx = (-3);
		found = (false);
		for (int index0 = 0; index0 < (int) (12); index0++) {
			sy = (-6);
			for (int index1 = 0; index1 < (int) (12); index1++) {
				sz = (-6);
				for (int index2 = 0; index2 < (int) (12); index2++) {
					if ((world.getBlockState(new BlockPos(x + sx, y + sy, z + sz))).getBlock() == SculkChuteBlock.block) {
						found = (true);
					}
					sz = (sz + 1);
				}
				sy = (sy + 1);
			}
			sx = (sx + 1);
		}
		if (found == true) {
			if (BlockTags.getCollection().getTagByID(new ResourceLocation("new_blocks:sculk_replaceable"))
					.contains((world.getBlockState(new BlockPos(entity.getPosX(), entity.getPosY() - 1, entity.getPosZ()))).getBlock())) {
				world.setBlockState(new BlockPos(entity.getPosX(), entity.getPosY() - 1, entity.getPosZ()), SkulkBlockBlock.block.getDefaultState(),
						3);
			}
			if (BlockTags.getCollection().getTagByID(new ResourceLocation("new_blocks:sculk_replaceable"))
					.contains((world.getBlockState(new BlockPos(entity.getPosX() + 1, entity.getPosY() - 1, entity.getPosZ()))).getBlock())) {
				world.setBlockState(new BlockPos(entity.getPosX() + 1, entity.getPosY() - 1, entity.getPosZ()),
						SkulkBlockBlock.block.getDefaultState(), 3);
			}
			if (BlockTags.getCollection().getTagByID(new ResourceLocation("new_blocks:sculk_replaceable"))
					.contains((world.getBlockState(new BlockPos(entity.getPosX() - 1, entity.getPosY() - 1, entity.getPosZ()))).getBlock())) {
				world.setBlockState(new BlockPos(entity.getPosX() - 1, entity.getPosY() - 1, entity.getPosZ()),
						SkulkBlockBlock.block.getDefaultState(), 3);
			}
			if (BlockTags.getCollection().getTagByID(new ResourceLocation("new_blocks:sculk_replaceable"))
					.contains((world.getBlockState(new BlockPos(entity.getPosX(), entity.getPosY() - 1, entity.getPosZ() + 1))).getBlock())) {
				world.setBlockState(new BlockPos(entity.getPosX(), entity.getPosY() - 1, entity.getPosZ() + 1),
						SkulkBlockBlock.block.getDefaultState(), 3);
			}
			if (BlockTags.getCollection().getTagByID(new ResourceLocation("new_blocks:sculk_replaceable"))
					.contains((world.getBlockState(new BlockPos(entity.getPosX(), entity.getPosY() - 1, entity.getPosZ() - 1))).getBlock())) {
				world.setBlockState(new BlockPos(entity.getPosX(), entity.getPosY() - 1, entity.getPosZ() - 1),
						SkulkBlockBlock.block.getDefaultState(), 3);
			}
			if (sourceentity instanceof PlayerEntity) {
				if (sourceentity instanceof ServerPlayerEntity) {
					Advancement _adv = ((MinecraftServer) ((ServerPlayerEntity) sourceentity).server).getAdvancementManager()
							.getAdvancement(new ResourceLocation("new_blocks:it_spreads"));
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
