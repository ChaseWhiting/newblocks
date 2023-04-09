
package net.mcreator.newblocks.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.network.NetworkHooks;
import net.minecraftforge.fml.network.FMLPlayMessages;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.DamageSource;
import net.minecraft.network.IPacket;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.ai.goal.RandomWalkingGoal;
import net.minecraft.entity.ai.goal.NearestAttackableTargetGoal;
import net.minecraft.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.entity.ai.goal.LookRandomlyGoal;
import net.minecraft.entity.ai.goal.HurtByTargetGoal;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.CreatureAttribute;

import net.mcreator.newblocks.entity.renderer.NormalZombieRenderer;
import net.mcreator.newblocks.NewBlocksModElements;

@NewBlocksModElements.ModElement.Tag
public class NormalZombieEntity extends NewBlocksModElements.ModElement {
	public static EntityType entity = (EntityType.Builder.<CustomEntity>create(CustomEntity::new, EntityClassification.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CustomEntity::new)
			.size(0.6f, 1.9000000000000001f)).build("normal_zombie").setRegistryName("normal_zombie");

	public NormalZombieEntity(NewBlocksModElements instance) {
		super(instance, 1437);
		FMLJavaModLoadingContext.get().getModEventBus().register(new NormalZombieRenderer.ModelRegisterHandler());
		FMLJavaModLoadingContext.get().getModEventBus().register(new EntityAttributesRegisterHandler());
	}

	@Override
	public void initElements() {
		elements.entities.add(() -> entity);
		elements.items.add(() -> new SpawnEggItem(entity, -13490411, -12772850, new Item.Properties().group(ItemGroup.MISC))
				.setRegistryName("normal_zombie_spawn_egg"));
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
	}

	private static class EntityAttributesRegisterHandler {
		@SubscribeEvent
		public void onEntityAttributeCreation(EntityAttributeCreationEvent event) {
			AttributeModifierMap.MutableAttribute ammma = MobEntity.func_233666_p_();
			ammma = ammma.createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.23);
			ammma = ammma.createMutableAttribute(Attributes.MAX_HEALTH, 14);
			ammma = ammma.createMutableAttribute(Attributes.ARMOR, 0.3);
			ammma = ammma.createMutableAttribute(Attributes.ATTACK_DAMAGE, 2);
			ammma = ammma.createMutableAttribute(Attributes.FOLLOW_RANGE, 16);
			ammma = ammma.createMutableAttribute(Attributes.KNOCKBACK_RESISTANCE, 0.39);
			event.put(entity, ammma.create());
		}
	}

	public static class CustomEntity extends MonsterEntity {
		public CustomEntity(FMLPlayMessages.SpawnEntity packet, World world) {
			this(entity, world);
		}

		public CustomEntity(EntityType<CustomEntity> type, World world) {
			super(type, world);
			experienceValue = 0;
			setNoAI(false);
		}

		@Override
		public IPacket<?> createSpawnPacket() {
			return NetworkHooks.getEntitySpawningPacket(this);
		}

		@Override
		protected void registerGoals() {
			super.registerGoals();
			this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 0.8, false) {
				@Override
				protected double getAttackReachSqr(LivingEntity entity) {
					return (double) (4.0 + entity.getWidth() * entity.getWidth());
				}
			});
			this.targetSelector.addGoal(2, new HurtByTargetGoal(this));
			this.goalSelector.addGoal(3, new RandomWalkingGoal(this, 0.8));
			this.goalSelector.addGoal(4, new LookRandomlyGoal(this));
			this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, PlayerEntity.class, false, false));
			this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, ChomperEntity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, ChomperFullEntity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, PeashooterEntity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, SnowPeashooterEntity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, GatlingPeashooterEntity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, BonkChoyEntity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, ThreepeaterEntity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(13, new NearestAttackableTargetGoal(this, MelonPultEntity.CustomEntity.class, false, false));
			this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, WallnutEntity.CustomEntity.class, false, false));
		}

		@Override
		public CreatureAttribute getCreatureAttribute() {
			return CreatureAttribute.UNDEFINED;
		}

		@Override
		public net.minecraft.util.SoundEvent getAmbientSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("new_blocks:zombie.groan"));
		}

		@Override
		public net.minecraft.util.SoundEvent getHurtSound(DamageSource ds) {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("new_blocks:zombie.hurt"));
		}

		@Override
		public net.minecraft.util.SoundEvent getDeathSound() {
			return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("new_blocks:zombie.hurt"));
		}
	}
}
