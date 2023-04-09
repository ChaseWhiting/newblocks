package net.mcreator.newblocks.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Explosion;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.newblocks.world.UFOLightDespawnTicksGameRule;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Random;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

public class UFOLIGHTOnInitialEntitySpawnProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure UFOLIGHTOnInitialEntitySpawn!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency x for procedure UFOLIGHTOnInitialEntitySpawn!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency y for procedure UFOLIGHTOnInitialEntitySpawn!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency z for procedure UFOLIGHTOnInitialEntitySpawn!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure UFOLIGHTOnInitialEntitySpawn!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (world instanceof World && !world.isRemote()) {
			((World) world).playSound(null, new BlockPos(x, y, z),
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("new_blocks:entity.ufo.beam.shoots")),
					SoundCategory.NEUTRAL, (float) 2.6, (float) 1);
		} else {
			((World) world).playSound(x, y, z,
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("new_blocks:entity.ufo.beam.shoots")),
					SoundCategory.NEUTRAL, (float) 2.6, (float) 1, false);
		}
		if (world instanceof World && !((World) world).isRemote) {
			((World) world).createExplosion(null, (int) x, (int) y, (int) z,
					(float) (new Random().nextInt(3 + 1) + new Random().nextInt(3 + 1) + new Random().nextInt(3 + 1)), Explosion.Mode.BREAK);
		}
		{
			List<Entity> _entfound = world
					.getEntitiesWithinAABB(Entity.class,
							new AxisAlignedBB(x - (5 / 2d), y - (5 / 2d), z - (5 / 2d), x + (5 / 2d), y + (5 / 2d), z + (5 / 2d)), null)
					.stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparing((Function<Entity, Double>) (_entcnd -> _entcnd.getDistanceSq(_x, _y, _z)));
						}
					}.compareDistOf(x, y, z)).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entityiterator == entity)) {
					entityiterator.setFire((int) 6);
				}
			}
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
				if (!entity.world.isRemote())
					entity.remove();
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, (int) (world.getWorldInfo().getGameRulesInstance().getInt(UFOLightDespawnTicksGameRule.gamerule)));
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
				world.setBlockState(new BlockPos(x + 2, world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, (int) (x + 2), (int) z), z),
						Blocks.FIRE.getDefaultState(), 3);
				world.setBlockState(new BlockPos(x - 2, world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, (int) (x + 2), (int) z), z),
						Blocks.FIRE.getDefaultState(), 3);
				world.setBlockState(new BlockPos(x - 4, world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, (int) (x - 4), (int) z), z),
						Blocks.FIRE.getDefaultState(), 3);
				world.setBlockState(new BlockPos(x + 4, world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, (int) (x - 4), (int) z), z),
						Blocks.FIRE.getDefaultState(), 3);
				world.setBlockState(new BlockPos(x + 3, world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, (int) (x + 3), (int) z), z),
						Blocks.FIRE.getDefaultState(), 3);
				world.setBlockState(new BlockPos(x - 3, world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, (int) (x - 3), (int) z), z),
						Blocks.FIRE.getDefaultState(), 3);
				world.setBlockState(new BlockPos(x, world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 2)), z + 2),
						Blocks.FIRE.getDefaultState(), 3);
				world.setBlockState(new BlockPos(x, world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 3)), z + 3),
						Blocks.FIRE.getDefaultState(), 3);
				world.setBlockState(new BlockPos(x, world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z - 3)), z - 3),
						Blocks.FIRE.getDefaultState(), 3);
				world.setBlockState(new BlockPos(x, world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z - 2)), z - 2),
						Blocks.FIRE.getDefaultState(), 3);
				world.setBlockState(new BlockPos(x, world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 4)), z + 4),
						Blocks.FIRE.getDefaultState(), 3);
				world.setBlockState(new BlockPos(x, world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z - 4)), z - 4),
						Blocks.FIRE.getDefaultState(), 3);
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, (int) 3);
	}
}
