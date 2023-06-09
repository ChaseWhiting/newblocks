package net.mcreator.newblocks.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.entity.Entity;

import net.mcreator.newblocks.item.MeowmereRangedItem;
import net.mcreator.newblocks.NewBlocksMod;

import java.util.Map;

public class MeowmereEntitySwingsItemProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency world for procedure MeowmereEntitySwingsItem!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency entity for procedure MeowmereEntitySwingsItem!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				NewBlocksMod.LOGGER.warn("Failed to load dependency itemstack for procedure MeowmereEntitySwingsItem!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if (!(entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
				entity.getEyePosition(1f).add(entity.getLook(1f).x * 0.36, entity.getLook(1f).y * 0.36, entity.getLook(1f).z * 0.36),
				RayTraceContext.BlockMode.OUTLINE, RayTraceContext.FluidMode.NONE, entity)).getType() == RayTraceResult.Type.BLOCK)) {
			{
				Entity _shootFrom = entity;
				World projectileLevel = _shootFrom.world;
				if (!projectileLevel.isRemote()) {
					ProjectileEntity _entityToSpawn = new Object() {
						public ProjectileEntity getArrow(World world, Entity shooter, float damage, int knockback) {
							AbstractArrowEntity entityToSpawn = new MeowmereRangedItem.ArrowCustomEntity(MeowmereRangedItem.arrow, world);
							entityToSpawn.setShooter(shooter);
							entityToSpawn.setDamage(damage);
							entityToSpawn.setKnockbackStrength(knockback);
							entityToSpawn.setSilent(true);

							return entityToSpawn;
						}
					}.getArrow(projectileLevel, entity, (float) 3.8, (int) 0.4);
					_entityToSpawn.setPosition(_shootFrom.getPosX(), _shootFrom.getPosYEye() - 0.1, _shootFrom.getPosZ());
					_entityToSpawn.shoot(_shootFrom.getLookVec().x, _shootFrom.getLookVec().y, _shootFrom.getLookVec().z, 1, 0);
					projectileLevel.addEntity(_entityToSpawn);
				}
			}
			if (itemstack.getOrCreateTag().getDouble("powered") == 1) {
				if (Math.random() < 0.7) {
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
							{
								Entity _shootFrom = entity;
								World projectileLevel = _shootFrom.world;
								if (!projectileLevel.isRemote()) {
									ProjectileEntity _entityToSpawn = new Object() {
										public ProjectileEntity getArrow(World world, Entity shooter, float damage, int knockback) {
											AbstractArrowEntity entityToSpawn = new MeowmereRangedItem.ArrowCustomEntity(MeowmereRangedItem.arrow,
													world);
											entityToSpawn.setShooter(shooter);
											entityToSpawn.setDamage(damage);
											entityToSpawn.setKnockbackStrength(knockback);
											entityToSpawn.setSilent(true);

											return entityToSpawn;
										}
									}.getArrow(projectileLevel, entity, (float) 4.1, (int) 0.8);
									_entityToSpawn.setPosition(_shootFrom.getPosX(), _shootFrom.getPosYEye() - 0.1, _shootFrom.getPosZ());
									_entityToSpawn.shoot(_shootFrom.getLookVec().x, _shootFrom.getLookVec().y, _shootFrom.getLookVec().z, 1, 0);
									projectileLevel.addEntity(_entityToSpawn);
								}
							}
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, (int) 14);
				}
			}
			if (Math.random() < 0.1) {
				itemstack.getOrCreateTag().putDouble("powered", 1);
				if (world instanceof World && !world.isRemote()) {
					((World) world).playSound(null, new BlockPos(entity.getPosX(), entity.getPosY(), entity.getPosZ()),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purr")),
							SoundCategory.PLAYERS, (float) 3, (float) 1);
				} else {
					((World) world).playSound((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()),
							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purr")),
							SoundCategory.PLAYERS, (float) 3, (float) 1, false);
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
						itemstack.getOrCreateTag().putDouble("powered", 0);
						if (world instanceof World && !world.isRemote()) {
							((World) world).playSound(null, new BlockPos(entity.getPosX(), entity.getPosY(), entity.getPosZ()),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")),
									SoundCategory.PLAYERS, (float) 2, (float) 1);
						} else {
							((World) world).playSound((entity.getPosX()), (entity.getPosY()), (entity.getPosZ()),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.cat.purreow")),
									SoundCategory.PLAYERS, (float) 2, (float) 1, false);
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, (int) 165);
			}
		}
	}
}
