package net.mcreator.newblocks.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.util.math.BlockPos;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class AllayCageOnStructureInstanceGeneratedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure AllayCageOnStructureInstanceGenerated!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure AllayCageOnStructureInstanceGenerated!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure AllayCageOnStructureInstanceGenerated!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure AllayCageOnStructureInstanceGenerated!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (world.isAirBlock(new BlockPos(x + 5, y, z))) {
			if (Math.random() < 0.7) {
				if (world instanceof ServerWorld) {
					((World) world).getServer().getCommandManager().handleCommand(
							new CommandSource(ICommandSource.DUMMY, new Vector3d((x + 5), y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
									new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
							"/summon pillager ~ ~ ~ {PersistenceRequired:1b,Patrolling:1b,CanJoinRaid:1b,HandItems:[{id:\"minecraft:crossbow\",Count:1b,tag:{ChargedProjectiles:[{id:\"minecraft:arrow\",Count:1b},{},{}],Charged:1b}},{}]}");
				}
			}
			if (Math.random() < 0.7) {
				if (world instanceof ServerWorld) {
					((World) world).getServer().getCommandManager().handleCommand(
							new CommandSource(ICommandSource.DUMMY, new Vector3d((x + 5), y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
									new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
							"/summon pillager ~ ~ ~ {PersistenceRequired:1b,Patrolling:1b,CanJoinRaid:1b,HandItems:[{id:\"minecraft:crossbow\",Count:1b,tag:{ChargedProjectiles:[{id:\"minecraft:arrow\",Count:1b},{},{}],Charged:1b}},{}]}");
				}
			}
			if (Math.random() < 0.7) {
				if (world instanceof ServerWorld) {
					((World) world).getServer().getCommandManager().handleCommand(
							new CommandSource(ICommandSource.DUMMY, new Vector3d((x + 5), y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
									new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
							"/summon pillager ~ ~ ~ {PersistenceRequired:1b,Patrolling:1b,CanJoinRaid:1b,HandItems:[{id:\"minecraft:crossbow\",Count:1b,tag:{ChargedProjectiles:[{id:\"minecraft:arrow\",Count:1b},{},{}],Charged:1b}},{}]}");
				}
			}
			if (Math.random() < 0.7) {
				if (world instanceof ServerWorld) {
					((World) world).getServer().getCommandManager().handleCommand(
							new CommandSource(ICommandSource.DUMMY, new Vector3d((x + 5), y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
									new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
							"/summon pillager ~ ~ ~ {PersistenceRequired:1b,Patrolling:1b,CanJoinRaid:1b,HandItems:[{id:\"minecraft:crossbow\",Count:1b,tag:{ChargedProjectiles:[{id:\"minecraft:arrow\",Count:1b},{},{}],Charged:1b}},{}]}");
				}
			}
		} else if (world.isAirBlock(new BlockPos(x, y, z + 5))) {
			if (Math.random() < 0.7) {
				if (world instanceof ServerWorld) {
					((World) world).getServer().getCommandManager().handleCommand(
							new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, (z + 5)), Vector2f.ZERO, (ServerWorld) world, 4, "",
									new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
							"/summon pillager ~ ~ ~ {PersistenceRequired:1b,Patrolling:1b,CanJoinRaid:1b,HandItems:[{id:\"minecraft:crossbow\",Count:1b,tag:{ChargedProjectiles:[{id:\"minecraft:arrow\",Count:1b},{},{}],Charged:1b}},{}]}");
				}
			}
			if (Math.random() < 0.7) {
				if (world instanceof ServerWorld) {
					((World) world).getServer().getCommandManager().handleCommand(
							new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, (z + 5)), Vector2f.ZERO, (ServerWorld) world, 4, "",
									new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
							"/summon pillager ~ ~ ~ {PersistenceRequired:1b,Patrolling:1b,CanJoinRaid:1b,HandItems:[{id:\"minecraft:crossbow\",Count:1b,tag:{ChargedProjectiles:[{id:\"minecraft:arrow\",Count:1b},{},{}],Charged:1b}},{}]}");
				}
			}
			if (Math.random() < 0.7) {
				if (world instanceof ServerWorld) {
					((World) world).getServer().getCommandManager().handleCommand(
							new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, (z + 5)), Vector2f.ZERO, (ServerWorld) world, 4, "",
									new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
							"/summon pillager ~ ~ ~ {PersistenceRequired:1b,Patrolling:1b,CanJoinRaid:1b,HandItems:[{id:\"minecraft:crossbow\",Count:1b,tag:{ChargedProjectiles:[{id:\"minecraft:arrow\",Count:1b},{},{}],Charged:1b}},{}]}");
				}
			}
			if (Math.random() < 0.7) {
				if (world instanceof ServerWorld) {
					((World) world).getServer().getCommandManager().handleCommand(
							new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, (z + 5)), Vector2f.ZERO, (ServerWorld) world, 4, "",
									new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
							"/summon pillager ~ ~ ~ {PersistenceRequired:1b,Patrolling:1b,CanJoinRaid:1b,HandItems:[{id:\"minecraft:crossbow\",Count:1b,tag:{ChargedProjectiles:[{id:\"minecraft:arrow\",Count:1b},{},{}],Charged:1b}},{}]}");
				}
			}
		}
	}
}
