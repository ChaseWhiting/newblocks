package net.mcreator.newblocks.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.gen.feature.template.Template;
import net.minecraft.world.gen.feature.template.PlacementSettings;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Rotation;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Mirror;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.NewBlocksModVariables;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class TestGenerateOnKeyPressedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure TestGenerateOnKeyPressed!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure TestGenerateOnKeyPressed!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure TestGenerateOnKeyPressed!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure TestGenerateOnKeyPressed!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure TestGenerateOnKeyPressed!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).abilities.isCreativeMode : false) {
			NewBlocksModVariables.WorldVariables.get(world).PlayerSubway = 0;
			NewBlocksModVariables.WorldVariables.get(world).syncData(world);
			for (int index0 = 0; index0 < (int) (50); index0++) {
				NewBlocksModVariables.WorldVariables.get(world).PlayerSubway = (NewBlocksModVariables.WorldVariables.get(world).PlayerSubway + 4);
				NewBlocksModVariables.WorldVariables.get(world).syncData(world);
				if (Math.random() < 0.56) {
					if (world instanceof ServerWorld) {
						Template template = ((ServerWorld) world).getStructureTemplateManager()
								.getTemplateDefaulted(new ResourceLocation("new_blocks", "abandoned_tunnel_normal"));
						if (template != null) {
							template.func_237144_a_((ServerWorld) world,
									new BlockPos(x + NewBlocksModVariables.WorldVariables.get(world).PlayerSubway, y, z),
									new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
									((World) world).rand);
						}
					}
				} else if (Math.random() < 0.3) {
					if (world instanceof ServerWorld) {
						Template template = ((ServerWorld) world).getStructureTemplateManager()
								.getTemplateDefaulted(new ResourceLocation("new_blocks", "abandoned_tunnel_powered"));
						if (template != null) {
							template.func_237144_a_((ServerWorld) world,
									new BlockPos(x + NewBlocksModVariables.WorldVariables.get(world).PlayerSubway, y, z),
									new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
									((World) world).rand);
						}
					}
				} else if (Math.random() < 0.11) {
					if (world instanceof ServerWorld) {
						Template template = ((ServerWorld) world).getStructureTemplateManager()
								.getTemplateDefaulted(new ResourceLocation("new_blocks", "abandoned_tunnel_cobweb"));
						if (template != null) {
							template.func_237144_a_((ServerWorld) world,
									new BlockPos(x + NewBlocksModVariables.WorldVariables.get(world).PlayerSubway, y, z),
									new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
									((World) world).rand);
						}
					}
				} else if (Math.random() < 0.06) {
					if (world instanceof ServerWorld) {
						Template template = ((ServerWorld) world).getStructureTemplateManager()
								.getTemplateDefaulted(new ResourceLocation("new_blocks", "abandoned_tunnel_loot"));
						if (template != null) {
							template.func_237144_a_((ServerWorld) world,
									new BlockPos(x + NewBlocksModVariables.WorldVariables.get(world).PlayerSubway, y, z),
									new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
									((World) world).rand);
						}
					}
				} else {
					if (world instanceof ServerWorld) {
						Template template = ((ServerWorld) world).getStructureTemplateManager()
								.getTemplateDefaulted(new ResourceLocation("new_blocks", "abandoned_tunnel_normal"));
						if (template != null) {
							template.func_237144_a_((ServerWorld) world,
									new BlockPos(x + NewBlocksModVariables.WorldVariables.get(world).PlayerSubway, y, z),
									new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
									((World) world).rand);
						}
					}
				}
			}
		}
	}
}
