package net.mcreator.newblocks.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Hand;
import net.minecraft.util.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class BlueScientistOnEntityTickUpdateProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure BlueScientistOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure BlueScientistOnEntityTickUpdate!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		boolean hasReloaded = false;
		boolean grenadeReloaded = false;
		if (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
				entity.getEyePosition(1f).add(entity.getLook(1f).x * 2, entity.getLook(1f).y * 2, entity.getLook(1f).z * 2),
				RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getType() == RayTraceResult.Type.BLOCK) {
			if (BlockTags.getCollection().getTagByID(new ResourceLocation("minecraft:planks"))
					.contains((world.getBlockState(
							new BlockPos(
									entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * 3, entity.getLook(1f).y * 3,
													entity.getLook(1f).z * 3),
											RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getX(),
									entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * 3, entity.getLook(1f).y * 3,
													entity.getLook(1f).z * 3),
											RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getY(),
									entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * 3, entity.getLook(1f).y * 3,
													entity.getLook(1f).z * 3),
											RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ())))
							.getBlock())) {
				if (entity instanceof LivingEntity) {
					ItemStack _setstack = new ItemStack(Items.FLINT_AND_STEEL);
					_setstack.setCount((int) 1);
					((LivingEntity) entity).setHeldItem(Hand.OFF_HAND, _setstack);
					if (entity instanceof ServerPlayerEntity)
						((ServerPlayerEntity) entity).inventory.markDirty();
				}
				if (Math.random() < 0.7) {
					if (Math.random() < 0.7) {
						if (Math.random() < 0.7) {
							if (Math.random() < 0.7) {
								if (Math.random() < 0.7) {
									if (Math.random() < 0.7) {
										if (Math.random() < 0.7) {
											if (Math.random() < 0.7) {
												if (entity instanceof LivingEntity) {
													((LivingEntity) entity).swing(Hand.OFF_HAND, true);
												}
												world.setBlockState(new BlockPos(
														entity.world
																.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																		entity.getEyePosition(1f).add(entity.getLook(1f).x * 4,
																				entity.getLook(1f).y * 4, entity.getLook(1f).z * 4),
																		RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
																.getPos().getX(),
														entity.world
																.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																		entity.getEyePosition(1f).add(entity.getLook(1f).x * 4,
																				entity.getLook(1f).y * 4, entity.getLook(1f).z * 4),
																		RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
																.getPos().getY(),
														entity.world
																.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																		entity.getEyePosition(1f).add(entity.getLook(1f).x * 4,
																				entity.getLook(1f).y * 4, entity.getLook(1f).z * 4),
																		RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
																.getPos().getZ()),
														Blocks.FIRE.getDefaultState(), 3);
												if (entity instanceof PlayerEntity) {
													Entity _ent = entity;
													BlockPos _bp = new BlockPos(
															entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * 4, entity.getLook(1f).y * 4,
																			entity.getLook(1f).z * 4),
																	RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
																	.getPos().getX(),
															entity.world
																	.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																			entity.getEyePosition(1f).add(entity.getLook(1f).x * 4,
																					entity.getLook(1f).y * 4, entity.getLook(1f).z * 4),
																			RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE,
																			entity))
																	.getPos().getY(),
															entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * 4, entity.getLook(1f).y * 4,
																			entity.getLook(1f).z * 4),
																	RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
																	.getPos().getZ());
													_ent.world.getBlockState(_bp).getBlock().onBlockActivated(_ent.world.getBlockState(_bp),
															_ent.world, _bp, (PlayerEntity) entity, Hand.MAIN_HAND, BlockRayTraceResult
																	.createMiss(new Vector3d(_bp.getX(), _bp.getY(), _bp.getZ()), Direction.UP, _bp));
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
				if (entity instanceof LivingEntity) {
					ItemStack _setstack = new ItemStack(Blocks.AIR);
					_setstack.setCount((int) 1);
					((LivingEntity) entity).setHeldItem(Hand.OFF_HAND, _setstack);
					if (entity instanceof ServerPlayerEntity)
						((ServerPlayerEntity) entity).inventory.markDirty();
				}
			}
		}
	}
}
