package net.mcreator.newblocks.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.entity.NukeEntity;
import net.mcreator.newblocks.NewBlocksModVariables;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;

public class NukeCallerRightclickedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure NukeCallerRightclicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure NukeCallerRightclicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure NukeCallerRightclicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure NukeCallerRightclicked!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure NukeCallerRightclicked!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (world instanceof World && !world.isRemote()) {
			((World) world).playSound(null, new BlockPos(x, y, z),
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("new_blocks:nuke_caller_typing")),
					SoundCategory.PLAYERS, (float) 1, (float) 1);
		} else {
			((World) world).playSound(x, y, z,
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("new_blocks:nuke_caller_typing")),
					SoundCategory.PLAYERS, (float) 1, (float) 1, false);
		}
		new Object() {
			private int ticks = 0;
			private float waitTicks;
			private IWorld world;

			public void start(IWorld world, int waitTicks) {
				this.waitTicks = waitTicks;
				MinecraftForge.EVENT_BUS.register(this);
				this.world = world;
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					this.ticks += 1;
					if (this.ticks >= this.waitTicks)
						run();
				}
			}

			private void run() {
				if (world instanceof World && !world.isRemote()) {
					((World) world).playSound(null, new BlockPos(x, y, z),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("new_blocks:nuke_incoming")),
							SoundCategory.PLAYERS, (float) 15, (float) 1);
				} else {
					((World) world).playSound(x, y, z,
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("new_blocks:nuke_incoming")),
							SoundCategory.PLAYERS, (float) 15, (float) 1, false);
				}
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("WARNING: LOOK AT THE PLACE YOU WANT TO BE NUKED"), (false));
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, (int) 60);
		new Object() {
			private int ticks = 0;
			private float waitTicks;
			private IWorld world;

			public void start(IWorld world, int waitTicks) {
				this.waitTicks = waitTicks;
				MinecraftForge.EVENT_BUS.register(this);
				this.world = world;
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					this.ticks += 1;
					if (this.ticks >= this.waitTicks)
						run();
				}
			}

			private void run() {
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new NukeEntity.CustomEntity(NukeEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles(x, (y + 115), z, (float) 0, (float) 0);
					entityToSpawn.setRenderYawOffset((float) 0);
					entityToSpawn.setRotationYawHead((float) 0);
					entityToSpawn.setMotion(0, 0, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
				NewBlocksModVariables.WorldVariables.get(world).PlayerOrignX = (entity.getPosX());
				NewBlocksModVariables.WorldVariables.get(world).syncData(world);
				NewBlocksModVariables.WorldVariables.get(world).PlayerOriginY = (entity.getPosY());
				NewBlocksModVariables.WorldVariables.get(world).syncData(world);
				NewBlocksModVariables.WorldVariables.get(world).PlayerOriginZ = (entity.getPosZ());
				NewBlocksModVariables.WorldVariables.get(world).syncData(world);
				{
					List<Entity> _entfound = world.getEntitiesWithinAABB(Entity.class,
							new AxisAlignedBB(x - (400 / 2d), y - (400 / 2d), z - (400 / 2d), x + (400 / 2d), y + (400 / 2d), z + (400 / 2d)), null)
							.stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
								}
							}.compareDistOf(x, y, z)).collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof NukeEntity.CustomEntity) {
							{
								Entity _ent = entityiterator;
								_ent.setPositionAndUpdate(
										(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f)
														.add(entity.getLook(1f).x * 120, entity.getLook(1f).y * 120, entity.getLook(1f).z * 120),
												RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getX()),
										(entityiterator.getPosY()),
										(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
												entity.getEyePosition(1f).add(entity.getLook(1f).x * 120, entity.getLook(1f).y * 120,
														entity.getLook(1f).z * 120),
												RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos().getZ()));
								if (_ent instanceof ServerPlayerEntity) {
									((ServerPlayerEntity) _ent).connection
											.setPlayerLocation(
													(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
															entity.getEyePosition(1f).add(entity.getLook(1f).x * 120, entity.getLook(1f).y * 120,
																	entity.getLook(1f).z * 120),
															RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getPos()
															.getX()),
													(entityiterator.getPosY()),
													(entity.world
															.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
																	entity.getEyePosition(1f).add(entity.getLook(1f).x * 120,
																			entity.getLook(1f).y * 120, entity.getLook(1f).z * 120),
																	RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity))
															.getPos().getZ()),
													_ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
								}
							}
						}
					}
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, (int) 100);
	}
}
