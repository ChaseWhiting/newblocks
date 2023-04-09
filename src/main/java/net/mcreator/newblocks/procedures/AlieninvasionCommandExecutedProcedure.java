package net.mcreator.newblocks.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.entity.UFOEntity;
import net.mcreator.newblocks.entity.AlienEntity;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class AlieninvasionCommandExecutedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure AlieninvasionCommandExecuted!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure AlieninvasionCommandExecuted!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure AlieninvasionCommandExecuted!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		for (int index0 = 0; index0 < (int) (20); index0++) {
			if (world instanceof ServerWorld) {
				Entity entityToSpawn = new AlienEntity.CustomEntity(AlienEntity.entity, (World) world);
				entityToSpawn.setLocationAndAngles((x + 30), (world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, (int) (x + 30), (int) z)), z,
						(float) 0, (float) 0);
				entityToSpawn.setRenderYawOffset((float) 0);
				entityToSpawn.setRotationYawHead((float) 0);
				entityToSpawn.setMotion(0, 0, 0);
				if (entityToSpawn instanceof MobEntity)
					((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
							SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
				world.addEntity(entityToSpawn);
			}
		}
		for (int index1 = 0; index1 < (int) (10); index1++) {
			if (world instanceof ServerWorld) {
				Entity entityToSpawn = new AlienEntity.CustomEntity(AlienEntity.entity, (World) world);
				entityToSpawn.setLocationAndAngles((x + 36), (world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, (int) (x + 36), (int) z)), z,
						(float) 0, (float) 0);
				entityToSpawn.setRenderYawOffset((float) 0);
				entityToSpawn.setRotationYawHead((float) 0);
				entityToSpawn.setMotion(0, 0, 0);
				if (entityToSpawn instanceof MobEntity)
					((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
							SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
				world.addEntity(entityToSpawn);
			}
		}
		for (int index2 = 0; index2 < (int) (6); index2++) {
			if (world instanceof ServerWorld) {
				Entity entityToSpawn = new UFOEntity.CustomEntity(UFOEntity.entity, (World) world);
				entityToSpawn.setLocationAndAngles((x + 18),
						(world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, (int) (x + 18), (int) z) + 12), z, (float) 0, (float) 0);
				entityToSpawn.setRenderYawOffset((float) 0);
				entityToSpawn.setRotationYawHead((float) 0);
				entityToSpawn.setMotion(0, 0, 0);
				if (entityToSpawn instanceof MobEntity)
					((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
							SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
				world.addEntity(entityToSpawn);
			}
		}
	}
}
