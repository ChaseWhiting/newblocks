package net.mcreator.newblocks.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.gen.feature.template.Template;
import net.minecraft.world.gen.feature.template.PlacementSettings;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.Rotation;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Mirror;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.NewBlocksModVariables;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.function.Function;
import java.util.Map;
import java.util.HashMap;
import java.util.Comparator;

public class PlayerFirstJoinedWorldProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
			if (event.phase == TickEvent.Phase.END) {
				Entity entity = event.player;
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
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure PlayerFirstJoinedWorld!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure PlayerFirstJoinedWorld!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		if (((Entity) world
				.getEntitiesWithinAABB(PlayerEntity.class,
						new AxisAlignedBB(0 - (128 / 2d), (world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, (int) 0, (int) 0)) - (128 / 2d),
								0 - (128 / 2d), 0 + (128 / 2d),
								(world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, (int) 0, (int) 0)) + (128 / 2d), 0 + (128 / 2d)),
						null)
				.stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
					}
				}.compareDistOf(0, (world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, (int) 0, (int) 0)), 0)).findFirst()
				.orElse(null)) != null) {
			if ((entity.world.getDimensionKey()) == (World.OVERWORLD)) {
				if (NewBlocksModVariables.WorldVariables.get(world).hasBeenInWorldBefore == false) {
					NewBlocksModVariables.WorldVariables.get(world).hasBeenInWorldBefore = (true);
					NewBlocksModVariables.WorldVariables.get(world).syncData(world);
					if (world instanceof ServerWorld) {
						Template template = ((ServerWorld) world).getStructureTemplateManager()
								.getTemplateDefaulted(new ResourceLocation("new_blocks", "warden_summon_tower"));
						if (template != null) {
							template.func_237144_a_((ServerWorld) world,
									new BlockPos(6, world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, (int) 6, (int) 6), 6),
									new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
									((World) world).rand);
						}
					}
				}
			}
		}
	}
}
