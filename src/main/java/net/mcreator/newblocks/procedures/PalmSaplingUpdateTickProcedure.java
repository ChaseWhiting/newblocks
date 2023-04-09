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

import net.mcreator.newblocks.block.PalmLeavesBlock;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class PalmSaplingUpdateTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure PalmSaplingUpdateTick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure PalmSaplingUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure PalmSaplingUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure PalmSaplingUpdateTick!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (Math.random() < 0.37) {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("new_blocks", "palm_tree_1"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos(x - 4, y, z - 2),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
			sx = (-6);
			found = (false);
			for (int index0 = 0; index0 < (int) (15); index0++) {
				sy = (-6);
				for (int index1 = 0; index1 < (int) (15); index1++) {
					sz = (-6);
					for (int index2 = 0; index2 < (int) (15); index2++) {
						if ((world.getBlockState(new BlockPos(x + sx, y + sy, z + sz))).getBlock() == PalmLeavesBlock.block) {
							if (world instanceof World)
								((World) world).notifyNeighborsOfStateChange(new BlockPos(x + sx, y + sy, z + sz),
										((World) world).getBlockState(new BlockPos(x + sx, y + sy, z + sz)).getBlock());
						}
						sz = (sz + 1);
					}
					sy = (sy + 1);
				}
				sx = (sx + 1);
			}
		}
	}
}
