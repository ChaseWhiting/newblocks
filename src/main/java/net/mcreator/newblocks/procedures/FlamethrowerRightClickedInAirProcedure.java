package net.mcreator.newblocks.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.newblocks.item.GasContainerItem;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Random;
import java.util.Map;

public class FlamethrowerRightClickedInAirProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure FlamethrowerRightClickedInAir!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure FlamethrowerRightClickedInAir!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY).getItem() == GasContainerItem.block
				|| ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
						.getItem() == GasContainerItem.block) {
			{
				ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY);
				if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
					_ist.shrink(1);
					_ist.setDamage(0);
				}
			}
			{
				ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
				if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
					_ist.shrink(1);
					_ist.setDamage(0);
				}
			}
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(ParticleTypes.FLAME,
						(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
								entity.getEyePosition(1f).add(entity.getLook(1f).x * 1, entity.getLook(1f).y * 1, entity.getLook(1f).z * 1),
								RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getX()),
						(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
								entity.getEyePosition(1f).add(entity.getLook(1f).x * 1, entity.getLook(1f).y * 1, entity.getLook(1f).z * 1),
								RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getY()),
						(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
								entity.getEyePosition(1f).add(entity.getLook(1f).x * 1, entity.getLook(1f).y * 1, entity.getLook(1f).z * 1),
								RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()),
						(int) 5, 0.1, 0.1, 0.1, 0.01);
			}
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(ParticleTypes.FLAME,
						(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
								entity.getEyePosition(1f).add(entity.getLook(1f).x * 1.4, entity.getLook(1f).y * 1.4, entity.getLook(1f).z * 1.4),
								RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getX()),
						(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
								entity.getEyePosition(1f).add(entity.getLook(1f).x * 1.4, entity.getLook(1f).y * 1.4, entity.getLook(1f).z * 1.4),
								RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getY()),
						(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
								entity.getEyePosition(1f).add(entity.getLook(1f).x * 1.4, entity.getLook(1f).y * 1.4, entity.getLook(1f).z * 1.4),
								RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()),
						(int) 5, 0.1, 0.1, 0.1, 0.01);
			}
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(ParticleTypes.FLAME,
						(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
								entity.getEyePosition(1f).add(entity.getLook(1f).x * 2, entity.getLook(1f).y * 2, entity.getLook(1f).z * 2),
								RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getX()),
						(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
								entity.getEyePosition(1f).add(entity.getLook(1f).x * 2, entity.getLook(1f).y * 2, entity.getLook(1f).z * 2),
								RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getY()),
						(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
								entity.getEyePosition(1f).add(entity.getLook(1f).x * 2, entity.getLook(1f).y * 2, entity.getLook(1f).z * 2),
								RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()),
						(int) 5, 0.1, 0.1, 0.1, 0.01);
			}
			if (world instanceof ServerWorld) {
				((ServerWorld) world).spawnParticle(ParticleTypes.FLAME,
						(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
								entity.getEyePosition(1f).add(entity.getLook(1f).x * 2.6, entity.getLook(1f).y * 2.6, entity.getLook(1f).z * 2.6),
								RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getX()),
						(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
								entity.getEyePosition(1f).add(entity.getLook(1f).x * 2.6, entity.getLook(1f).y * 2.6, entity.getLook(1f).z * 2.6),
								RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getY()),
						(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
								entity.getEyePosition(1f).add(entity.getLook(1f).x * 2.6, entity.getLook(1f).y * 2.6, entity.getLook(1f).z * 2.6),
								RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()),
						(int) 5, 0.1, 0.1, 0.1, 0.01);
			}
			if (world
					.isAirBlock(
							new BlockPos(
									entity.world.rayTraceBlocks(
											new RayTraceContext(entity.getEyePosition(1f),
													entity.getEyePosition(1f).add(entity.getLook(1f).x * 1.4, entity.getLook(1f).y * 1.4,
															entity.getLook(1f).z * 1.4),
													RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
											.getPos().getX(),
									entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * 1.4, entity.getLook(1f).y * 1.4,
													entity.getLook(1f).z * 1.4),
											RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getY(),
									entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * 1.4, entity.getLook(1f).y * 1.4,
													entity.getLook(1f).z * 1.4),
											RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()))) {
				if (!world.isAirBlock(
						new BlockPos(
								entity.world.rayTraceBlocks(new RayTraceContext(
										entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getLook(1f).x * 1.4, entity.getLook(1f).y * 1.4,
												entity.getLook(1f).z * 1.4),
										RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getX(),
								entity.world
										.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 1.4, entity.getLook(1f).y * 1.4,
														entity.getLook(1f).z * 1.4),
												RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
										.getPos().getY() - 1,
								entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
										entity.getEyePosition(1f).add(entity.getLook(1f).x * 1.4, entity.getLook(1f).y * 1.4,
												entity.getLook(1f).z * 1.4),
										RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()))) {
					world.setBlockState(
							new BlockPos(
									entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * 1.4, entity.getLook(1f).y * 1.4,
													entity.getLook(1f).z * 1.4),
											RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos()
											.getX(),
									entity.world
											.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
													entity.getEyePosition(1f).add(entity.getLook(1f).x * 1.4, entity.getLook(1f).y * 1.4,
															entity.getLook(1f).z * 1.4),
													RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
											.getPos().getY(),
									entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * 1.4, entity.getLook(1f).y * 1.4,
													entity.getLook(1f).z * 1.4),
											RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()),
							Blocks.FIRE.getDefaultState(), 3);
				}
			}
			if (world
					.isAirBlock(
							new BlockPos(
									entity.world.rayTraceBlocks(
											new RayTraceContext(entity.getEyePosition(1f),
													entity.getEyePosition(1f).add(entity.getLook(1f).x * 2, entity.getLook(1f).y * 2,
															entity.getLook(1f).z * 2),
													RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
											.getPos().getX(),
									entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * 2, entity.getLook(1f).y * 2,
													entity.getLook(1f).z * 2),
											RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getY(),
									entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * 2, entity.getLook(1f).y * 2,
													entity.getLook(1f).z * 2),
											RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()))) {
				if (!world
						.isAirBlock(
								new BlockPos(
										entity.world.rayTraceBlocks(
												new RayTraceContext(entity.getEyePosition(1f),
														entity.getEyePosition(1f).add(entity.getLook(1f).x * 2, entity.getLook(1f).y * 2,
																entity.getLook(1f).z * 2),
														RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
												.getPos().getX(),
										entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 2, entity.getLook(1f).y * 2,
														entity.getLook(1f).z * 2),
												RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getY() - 1,
										entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 2, entity.getLook(1f).y * 2,
														entity.getLook(1f).z * 2),
												RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()))) {
					world.setBlockState(
							new BlockPos(
									entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * 2, entity.getLook(1f).y * 2,
													entity.getLook(1f).z * 2),
											RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos()
											.getX(),
									entity.world
											.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
													entity.getEyePosition(1f).add(entity.getLook(1f).x * 2, entity.getLook(1f).y * 2,
															entity.getLook(1f).z * 2),
													RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
											.getPos().getY(),
									entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * 2, entity.getLook(1f).y * 2,
													entity.getLook(1f).z * 2),
											RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()),
							Blocks.FIRE.getDefaultState(), 3);
				}
			}
			if (world
					.isAirBlock(
							new BlockPos(
									entity.world.rayTraceBlocks(
											new RayTraceContext(entity.getEyePosition(1f),
													entity.getEyePosition(1f).add(entity.getLook(1f).x * 3, entity.getLook(1f).y * 3,
															entity.getLook(1f).z * 3),
													RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
											.getPos().getX(),
									entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * 3, entity.getLook(1f).y * 3,
													entity.getLook(1f).z * 3),
											RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getY(),
									entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * 3, entity.getLook(1f).y * 3,
													entity.getLook(1f).z * 3),
											RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()))) {
				if (!world
						.isAirBlock(
								new BlockPos(
										entity.world.rayTraceBlocks(
												new RayTraceContext(entity.getEyePosition(1f),
														entity.getEyePosition(1f).add(entity.getLook(1f).x * 3, entity.getLook(1f).y * 3,
																entity.getLook(1f).z * 3),
														RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
												.getPos().getX(),
										entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 3, entity.getLook(1f).y * 3,
														entity.getLook(1f).z * 3),
												RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getY() - 1,
										entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 3, entity.getLook(1f).y * 3,
														entity.getLook(1f).z * 3),
												RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()))) {
					world.setBlockState(
							new BlockPos(
									entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * 3, entity.getLook(1f).y * 3,
													entity.getLook(1f).z * 3),
											RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos()
											.getX(),
									entity.world
											.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
													entity.getEyePosition(1f).add(entity.getLook(1f).x * 3, entity.getLook(1f).y * 3,
															entity.getLook(1f).z * 3),
													RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
											.getPos().getY(),
									entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * 3, entity.getLook(1f).y * 3,
													entity.getLook(1f).z * 3),
											RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()),
							Blocks.FIRE.getDefaultState(), 3);
				}
			}
			if (world
					.isAirBlock(
							new BlockPos(
									entity.world.rayTraceBlocks(
											new RayTraceContext(entity.getEyePosition(1f),
													entity.getEyePosition(1f).add(entity.getLook(1f).x * 4, entity.getLook(1f).y * 4,
															entity.getLook(1f).z * 4),
													RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
											.getPos().getX(),
									entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * 4, entity.getLook(1f).y * 4,
													entity.getLook(1f).z * 4),
											RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getY(),
									entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * 4, entity.getLook(1f).y * 4,
													entity.getLook(1f).z * 4),
											RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()))) {
				if (!world
						.isAirBlock(
								new BlockPos(
										entity.world.rayTraceBlocks(
												new RayTraceContext(entity.getEyePosition(1f),
														entity.getEyePosition(1f).add(entity.getLook(1f).x * 4, entity.getLook(1f).y * 4,
																entity.getLook(1f).z * 4),
														RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
												.getPos().getX(),
										entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 4, entity.getLook(1f).y * 4,
														entity.getLook(1f).z * 4),
												RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getY() - 1,
										entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 4, entity.getLook(1f).y * 4,
														entity.getLook(1f).z * 4),
												RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()))) {
					world.setBlockState(
							new BlockPos(
									entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * 4, entity.getLook(1f).y * 4,
													entity.getLook(1f).z * 4),
											RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos()
											.getX(),
									entity.world
											.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
													entity.getEyePosition(1f).add(entity.getLook(1f).x * 4, entity.getLook(1f).y * 4,
															entity.getLook(1f).z * 4),
													RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
											.getPos().getY(),
									entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * 4, entity.getLook(1f).y * 4,
													entity.getLook(1f).z * 4),
											RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()),
							Blocks.FIRE.getDefaultState(), 3);
				}
			}
			if (world
					.isAirBlock(
							new BlockPos(
									entity.world.rayTraceBlocks(
											new RayTraceContext(entity.getEyePosition(1f),
													entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
															entity.getLook(1f).z * 5),
													RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
											.getPos().getX(),
									entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
													entity.getLook(1f).z * 5),
											RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getY(),
									entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
													entity.getLook(1f).z * 5),
											RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()))) {
				if (!world
						.isAirBlock(
								new BlockPos(
										entity.world.rayTraceBlocks(
												new RayTraceContext(entity.getEyePosition(1f),
														entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
																entity.getLook(1f).z * 5),
														RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
												.getPos().getX(),
										entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
														entity.getLook(1f).z * 5),
												RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getY() - 1,
										entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
														entity.getLook(1f).z * 5),
												RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()))) {
					world.setBlockState(
							new BlockPos(
									entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
													entity.getLook(1f).z * 5),
											RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos()
											.getX(),
									entity.world
											.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
													entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
															entity.getLook(1f).z * 5),
													RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
											.getPos().getY(),
									entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * 5, entity.getLook(1f).y * 5,
													entity.getLook(1f).z * 5),
											RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()),
							Blocks.FIRE.getDefaultState(), 3);
				}
			}
			if (world
					.isAirBlock(
							new BlockPos(
									entity.world.rayTraceBlocks(
											new RayTraceContext(entity.getEyePosition(1f),
													entity.getEyePosition(1f).add(entity.getLook(1f).x * 6, entity.getLook(1f).y * 6,
															entity.getLook(1f).z * 6),
													RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
											.getPos().getX(),
									entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * 6, entity.getLook(1f).y * 6,
													entity.getLook(1f).z * 6),
											RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getY(),
									entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * 6, entity.getLook(1f).y * 6,
													entity.getLook(1f).z * 6),
											RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()))) {
				if (!world
						.isAirBlock(
								new BlockPos(
										entity.world.rayTraceBlocks(
												new RayTraceContext(entity.getEyePosition(1f),
														entity.getEyePosition(1f).add(entity.getLook(1f).x * 6, entity.getLook(1f).y * 6,
																entity.getLook(1f).z * 6),
														RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
												.getPos().getX(),
										entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 6, entity.getLook(1f).y * 6,
														entity.getLook(1f).z * 6),
												RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getY() - 1,
										entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 6, entity.getLook(1f).y * 6,
														entity.getLook(1f).z * 6),
												RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()))) {
					world.setBlockState(
							new BlockPos(
									entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * 6, entity.getLook(1f).y * 6,
													entity.getLook(1f).z * 6),
											RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos()
											.getX(),
									entity.world
											.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
													entity.getEyePosition(1f).add(entity.getLook(1f).x * 6, entity.getLook(1f).y * 6,
															entity.getLook(1f).z * 6),
													RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity))
											.getPos().getY(),
									entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
											entity.getEyePosition(1f).add(entity.getLook(1f).x * 6, entity.getLook(1f).y * 6,
													entity.getLook(1f).z * 6),
											RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()),
							Blocks.FIRE.getDefaultState(), 3);
				}
			}
		}
	}
}
