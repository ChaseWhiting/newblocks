package net.mcreator.newblocks.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.NewBlocksModVariables;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;
import java.util.HashMap;

public class GoatJumpModifierCommandExecutedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure GoatJumpModifierCommandExecuted!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure GoatJumpModifierCommandExecuted!");
			return;
		}
		if (dependencies.get("cmdparams") == null) {
			if (!dependencies.containsKey("cmdparams"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency cmdparams for procedure GoatJumpModifierCommandExecuted!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		HashMap cmdparams = (HashMap) dependencies.get("cmdparams");
		if ((new Object() {
			public String getText() {
				String param = (String) cmdparams.get("0");
				if (param != null) {
					return param;
				}
				return "";
			}
		}.getText()).equals("")) {
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(
						new StringTextComponent(("The jump modifier is " + NewBlocksModVariables.WorldVariables.get(world).goatJumpChanceModifier)),
						(false));
			}
		} else {
			NewBlocksModVariables.WorldVariables.get(world).goatJumpChanceModifier = new Object() {
				double convert(String s) {
					try {
						return Double.parseDouble(s.trim());
					} catch (Exception e) {
					}
					return 0;
				}
			}.convert(new Object() {
				public String getText() {
					String param = (String) cmdparams.get("0");
					if (param != null) {
						return param;
					}
					return "";
				}
			}.getText());
			NewBlocksModVariables.WorldVariables.get(world).syncData(world);
			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
				((PlayerEntity) entity).sendStatusMessage(new StringTextComponent(("The new jump modifier is " + new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(new Object() {
					public String getText() {
						String param = (String) cmdparams.get("0");
						if (param != null) {
							return param;
						}
						return "";
					}
				}.getText()))), (false));
			}
		}
	}
}
