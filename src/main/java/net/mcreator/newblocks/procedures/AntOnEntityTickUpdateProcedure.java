package net.mcreator.newblocks.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.newblocks.block.AntMoundBlockBlock;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class AntOnEntityTickUpdateProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure AntOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure AntOnEntityTickUpdate!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		if (entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
				entity.getEyePosition(1f).add(entity.getLook(1f).x * 1.5, entity.getLook(1f).y * 1.5, entity.getLook(1f).z * 1.5),
				RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getType() == RayTraceResult.Type.BLOCK) {
			if (Math.random() < 0.1) {
				if (Math.random() < 0.7) {
					if (Math.random() < 0.7) {
						if (Math.random() < 0.1) {
							if (Math.random() < 0.7) {
								if (Math.random() < 0.7) {
									if (Math.random() < 0.7) {
										if (Math.random() < 0.7) {
											if (Math.random() < 0.7) {
												if (Math.random() < 0.1) {
													world.setBlockState(new BlockPos(
															entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * 1.5,
																			entity.getLook(1f).y * 1.5, entity.getLook(1f).z * 1.5),
																	RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
																	.getPos().getX(),
															entity.world
																	.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																			entity.getEyePosition(1f).add(entity.getLook(1f).x * 1.5,
																					entity.getLook(1f).y * 1.5, entity.getLook(1f).z * 1.5),
																			RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE,
																			entity))
																	.getPos().getY(),
															entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * 1.5,
																			entity.getLook(1f).y * 1.5, entity.getLook(1f).z * 1.5),
																	RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
																	.getPos().getZ()),
															AntMoundBlockBlock.block.getDefaultState(), 3);
													world.setBlockState(new BlockPos(
															entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * 1.5,
																			entity.getLook(1f).y * 1.5, entity.getLook(1f).z * 1.5),
																	RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
																	.getPos().getX(),
															entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * 1.5,
																			entity.getLook(1f).y * 1.5, entity.getLook(1f).z * 1.5),
																	RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
																	.getPos().getY() - 1,
															entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * 1.5,
																			entity.getLook(1f).y * 1.5, entity.getLook(1f).z * 1.5),
																	RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
																	.getPos().getZ()),
															Blocks.STONE.getDefaultState(), 3);
													world.setBlockState(new BlockPos(
															entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * 1.5,
																			entity.getLook(1f).y * 1.5, entity.getLook(1f).z * 1.5),
																	RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
																	.getPos().getX(),
															entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * 1.5,
																			entity.getLook(1f).y * 1.5, entity.getLook(1f).z * 1.5),
																	RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
																	.getPos().getY() - 2,
															entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * 1.5,
																			entity.getLook(1f).y * 1.5, entity.getLook(1f).z * 1.5),
																	RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
																	.getPos().getZ()),
															Blocks.STONE.getDefaultState(), 3);
													world.setBlockState(new BlockPos(
															entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * 1.5,
																			entity.getLook(1f).y * 1.5, entity.getLook(1f).z * 1.5),
																	RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
																	.getPos().getX(),
															entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * 1.5,
																			entity.getLook(1f).y * 1.5, entity.getLook(1f).z * 1.5),
																	RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
																	.getPos().getY() - 3,
															entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * 1.5,
																			entity.getLook(1f).y * 1.5, entity.getLook(1f).z * 1.5),
																	RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
																	.getPos().getZ()),
															Blocks.STONE.getDefaultState(), 3);
													world.setBlockState(new BlockPos(
															entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * 1.5,
																			entity.getLook(1f).y * 1.5, entity.getLook(1f).z * 1.5),
																	RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
																	.getPos().getX(),
															entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * 1.5,
																			entity.getLook(1f).y * 1.5, entity.getLook(1f).z * 1.5),
																	RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
																	.getPos().getY() - 4,
															entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * 1.5,
																			entity.getLook(1f).y * 1.5, entity.getLook(1f).z * 1.5),
																	RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
																	.getPos().getZ()),
															Blocks.STONE.getDefaultState(), 3);
													world.setBlockState(new BlockPos(
															entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * 1.5,
																			entity.getLook(1f).y * 1.5, entity.getLook(1f).z * 1.5),
																	RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
																	.getPos().getX(),
															entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * 1.5,
																			entity.getLook(1f).y * 1.5, entity.getLook(1f).z * 1.5),
																	RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
																	.getPos().getY() - 5,
															entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * 1.5,
																			entity.getLook(1f).y * 1.5, entity.getLook(1f).z * 1.5),
																	RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
																	.getPos().getZ()),
															Blocks.STONE.getDefaultState(), 3);
													world.setBlockState(new BlockPos(
															entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * 1.5,
																			entity.getLook(1f).y * 1.5, entity.getLook(1f).z * 1.5),
																	RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
																	.getPos().getX(),
															entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * 1.5,
																			entity.getLook(1f).y * 1.5, entity.getLook(1f).z * 1.5),
																	RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
																	.getPos().getY() - 6,
															entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * 1.5,
																			entity.getLook(1f).y * 1.5, entity.getLook(1f).z * 1.5),
																	RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
																	.getPos().getZ()),
															Blocks.STONE.getDefaultState(), 3);
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
