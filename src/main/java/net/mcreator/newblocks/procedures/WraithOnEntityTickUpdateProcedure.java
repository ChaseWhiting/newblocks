package net.mcreator.newblocks.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantment;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class WraithOnEntityTickUpdateProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure WraithOnEntityTickUpdate!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof MobEntity) ? ((MobEntity) entity).getAttackTarget() : null) instanceof LivingEntity) {
			if (Math.random() < 0.7) {
				if (Math.random() < 0.7) {
					if (Math.random() < 0.7) {
						if (Math.random() < 0.7) {
							if (Math.random() < 0.7) {
								if (Math.random() < 0.7) {
									if (Math.random() < 0.7) {
										if (Math.random() < 0.7) {
											if (Math.random() < 0.7) {
												if (Math.random() < 0.7) {
													if (Math.random() < 0.7) {
														if ((EnchantmentHelper.getEnchantmentLevel(Enchantments.SOUL_SPEED,
																((((entity instanceof MobEntity)
																		? ((MobEntity) entity).getAttackTarget()
																		: null) instanceof LivingEntity)
																				? ((LivingEntity) ((entity instanceof MobEntity)
																						? ((MobEntity) entity).getAttackTarget()
																						: null)).getItemStackFromSlot(EquipmentSlotType.FEET)
																				: ItemStack.EMPTY)) != 0)) {
															if (entity instanceof LivingEntity) {
																if (entity instanceof PlayerEntity)
																	((PlayerEntity) entity).inventory.armorInventory.set((int) 0,
																			(((((entity instanceof MobEntity)
																					? ((MobEntity) entity).getAttackTarget()
																					: null) instanceof LivingEntity)
																							? ((LivingEntity) ((entity instanceof MobEntity)
																									? ((MobEntity) entity).getAttackTarget()
																									: null))
																									.getItemStackFromSlot(EquipmentSlotType.FEET)
																							: ItemStack.EMPTY)
																					.copy()));
																else
																	((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.FEET,
																			(((((entity instanceof MobEntity)
																					? ((MobEntity) entity).getAttackTarget()
																					: null) instanceof LivingEntity)
																							? ((LivingEntity) ((entity instanceof MobEntity)
																									? ((MobEntity) entity).getAttackTarget()
																									: null))
																									.getItemStackFromSlot(EquipmentSlotType.FEET)
																							: ItemStack.EMPTY)
																					.copy()));
																if (entity instanceof ServerPlayerEntity)
																	((ServerPlayerEntity) entity).inventory.markDirty();
															}
															{
																Map<Enchantment, Integer> _enchantments = EnchantmentHelper
																		.getEnchantments(((((entity instanceof MobEntity)
																				? ((MobEntity) entity).getAttackTarget()
																				: null) instanceof LivingEntity)
																						? ((LivingEntity) ((entity instanceof MobEntity)
																								? ((MobEntity) entity).getAttackTarget()
																								: null)).getItemStackFromSlot(EquipmentSlotType.FEET)
																						: ItemStack.EMPTY));
																if (_enchantments.containsKey(Enchantments.SOUL_SPEED)) {
																	_enchantments.remove(Enchantments.SOUL_SPEED);
																	EnchantmentHelper.setEnchantments(_enchantments,
																			((((entity instanceof MobEntity)
																					? ((MobEntity) entity).getAttackTarget()
																					: null) instanceof LivingEntity)
																							? ((LivingEntity) ((entity instanceof MobEntity)
																									? ((MobEntity) entity).getAttackTarget()
																									: null))
																									.getItemStackFromSlot(EquipmentSlotType.FEET)
																							: ItemStack.EMPTY));
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
	}
}
