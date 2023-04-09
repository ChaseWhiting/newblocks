package net.mcreator.newblocks.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.monster.CreeperEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;
import java.util.HashMap;

public class CreeperExplodeToPlayerProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onEntityTick(LivingEvent.LivingUpdateEvent event) {
			Entity entity = event.getEntityLiving();
			World world = entity.world;
			double i = entity.getPosX();
			double j = entity.getPosY();
			double k = entity.getPosZ();
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("event", event);
			executeProcedure(dependencies);
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure CreeperExplodeToPlayer!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure CreeperExplodeToPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure CreeperExplodeToPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure CreeperExplodeToPlayer!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure CreeperExplodeToPlayer!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof CreeperEntity) {
			if (((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null) instanceof LivingEntity) {
				if (Math.random() < 0.8) {
					if (entity.getPersistentData().getDouble("explodeInAir") == 0) {
						if (Math.random() < 0.7) {
							if (Math.random() < 0.7) {
								if (Math.random() < 0.7) {
									if (Math.random() < 0.7) {
										if (Math.random() < 0.7) {
											if (Math.random() < 0.7) {
												if (Math.random() < 0.7) {
													if (BlockTags.getCollection().getTagByID(new ResourceLocation("forge:common_house_blocks"))
															.contains((world.getBlockState(new BlockPos(
																	entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																			entity.getEyePosition(1f).add(entity.getLook(1f).x * 2,
																					entity.getLook(1f).y * 2, entity.getLook(1f).z * 2),
																			RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE,
																			entity)).getPos().getX(),
																	entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																			entity.getEyePosition(1f).add(entity.getLook(1f).x * 2,
																					entity.getLook(1f).y * 2, entity.getLook(1f).z * 2),
																			RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE,
																			entity)).getPos().getY(),
																	entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																			entity.getEyePosition(1f).add(entity.getLook(1f).x * 2,
																					entity.getLook(1f).y * 2, entity.getLook(1f).z * 2),
																			RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE,
																			entity)).getPos().getZ())))
																	.getBlock())) {
														{
															Entity _ent = entity;
															if (!_ent.world.isRemote && _ent.world.getServer() != null) {
																_ent.world.getServer().getCommandManager().handleCommand(
																		_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
																		"execute as @s run data modify entity @s ignited set value 1");
															}
														}
														{
															Entity _ent = entity;
															if (!_ent.world.isRemote && _ent.world.getServer() != null) {
																_ent.world.getServer().getCommandManager().handleCommand(
																		_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
																		"execute as @s run data modify entity @s ExplosionRadius set value 4");
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
				} else {
					if (Math.random() < 0.7) {
						if (Math.random() < 0.7) {
							if (Math.random() < 0.7) {
								if (Math.random() < 0.7) {
									if (Math.random() < 0.7) {
										if (Math.random() < 0.7) {
											if (Math.random() < 0.7) {
												if (Math.random() < 0.7) {
													if (Math.random() < 0.7) {
														entity.getPersistentData().putDouble("explodeInAir", 1);
														if (world.canBlockSeeSky(new BlockPos(x, y, z))) {
															if (entity.isOnGround()) {
																if (!(((((entity instanceof MobEntity)
																		? ((MobEntity) entity).getAttackTarget()
																		: null) instanceof LivingEntity)
																				? ((LivingEntity) ((entity instanceof MobEntity)
																						? ((MobEntity) entity).getAttackTarget()
																						: null)).getItemStackFromSlot(EquipmentSlotType.HEAD)
																				: ItemStack.EMPTY)
																		.getItem() == Items.CREEPER_HEAD)
																		|| !(((((entity instanceof MobEntity)
																				? ((MobEntity) entity).getAttackTarget()
																				: null) instanceof LivingEntity)
																						? ((LivingEntity) ((entity instanceof MobEntity)
																								? ((MobEntity) entity).getAttackTarget()
																								: null)).getItemStackFromSlot(EquipmentSlotType.HEAD)
																						: ItemStack.EMPTY)
																				.getItem() == Blocks.CREEPER_HEAD.asItem())) {
																	entity.setMotion(
																			(((entity instanceof MobEntity)
																					? ((MobEntity) entity).getAttackTarget()
																					: null).getMotion().getX()),
																			1.27,
																			(((entity instanceof MobEntity)
																					? ((MobEntity) entity).getAttackTarget()
																					: null).getMotion().getZ()));
																	{
																		Entity _ent = entity;
																		if (!_ent.world.isRemote && _ent.world.getServer() != null) {
																			_ent.world.getServer().getCommandManager().handleCommand(
																					_ent.getCommandSource().withFeedbackDisabled()
																							.withPermissionLevel(4),
																					"execute as @s run data modify entity @s ignited set value 1");
																		}
																	}
																	{
																		Entity _ent = entity;
																		if (!_ent.world.isRemote && _ent.world.getServer() != null) {
																			_ent.world.getServer().getCommandManager().handleCommand(
																					_ent.getCommandSource().withFeedbackDisabled()
																							.withPermissionLevel(4),
																					"execute as @s run data modify entity @s ExplosionRadius set value 8");
																		}
																	}
																}
															} else {
																entity.getPersistentData().putDouble("explodeInAir", 0);
															}
														} else {
															entity.getPersistentData().putDouble("explodeInAir", 0);
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
}
