package net.mcreator.newblocks.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.IWorld;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class AgeProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure Age!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure Age!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		if (entity.getPersistentData().getBoolean("StartedToAge") == false) {
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
					entity.getPersistentData().putDouble("Age", 24000);
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
							entity.getPersistentData().putBoolean("StartedToAge", (true));
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, (int) 1);
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, (int) 1);
		} else {
			if (entity.getPersistentData().getDouble("Age") > 0) {
				entity.getPersistentData().putDouble("Age", (entity.getPersistentData().getDouble("Age") - 1));
			} else {
				if (!entity.world.isRemote())
					entity.remove();
			}
		}
		if (entity.getPersistentData().getBoolean("EatingGrass") == true) {
			entity.getPersistentData().putBoolean("EatingGrass", (false));
			entity.getPersistentData().putDouble("Age", (entity.getPersistentData().getDouble("Age") - 200));
		}
	}
}
