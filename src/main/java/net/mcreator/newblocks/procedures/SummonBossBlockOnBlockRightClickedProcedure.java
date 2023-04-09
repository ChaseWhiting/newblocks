package net.mcreator.newblocks.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;
import net.minecraft.block.Blocks;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class SummonBossBlockOnBlockRightClickedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure SummonBossBlockOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure SummonBossBlockOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure SummonBossBlockOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure SummonBossBlockOnBlockRightClicked!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		world.setBlockState(new BlockPos(x, y, z), Blocks.AIR.getDefaultState(), 3);
		if (world instanceof World && !world.isRemote()) {
			((World) world).playSound(null, new BlockPos(x, y, z),
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.ambient")),
					SoundCategory.MASTER, (float) 1, (float) 1);
		} else {
			((World) world).playSound(x, y, z,
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.ambient")),
					SoundCategory.MASTER, (float) 1, (float) 1, false);
		}
		if (world instanceof ServerWorld) {
			((World) world).getServer().getCommandManager().handleCommand(
					new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
							new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
					"summon skeleton ~ ~-7 ~ {Health:45f,HandItems:[{id:\"minecraft:bow\",Count:1b,tag:{Enchantments:[{id:\"minecraft:unbreaking\",lvl:3s},{id:\"minecraft:power\",lvl:2s},{id:\"minecraft:flame\",lvl:1s},{id:\"minecraft:mending\",lvl:1s}]}},{id:\"minecraft:wither_skeleton_skull\",Count:1b}],HandDropChances:[0.085F,1.000F],ArmorItems:[{id:\"minecraft:iron_boots\",Count:1b},{id:\"minecraft:iron_leggings\",Count:1b},{id:\"minecraft:iron_chestplate\",Count:1b},{id:\"minecraft:iron_helmet\",Count:1b}],Attributes:[{Name:generic.max_health,Base:45}]}");
		}
	}
}
