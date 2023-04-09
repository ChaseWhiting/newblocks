package net.mcreator.newblocks.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.entity.UFONOTALIVEEntity;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class UFOEntityDiesProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure UFOEntityDies!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure UFOEntityDies!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		if (!entity.world.isRemote())
			entity.remove();
		if (world instanceof ServerWorld) {
			Entity entityToSpawn = new UFONOTALIVEEntity.CustomEntity(UFONOTALIVEEntity.entity, (World) world);
			entityToSpawn.setLocationAndAngles((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()), (float) 0, (float) 0);
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
