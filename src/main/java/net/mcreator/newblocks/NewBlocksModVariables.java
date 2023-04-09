package net.mcreator.newblocks;

import net.minecraftforge.fml.network.PacketDistributor;
import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.storage.WorldSavedData;
import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.IServerWorld;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Direction;
import net.minecraft.network.PacketBuffer;
import net.minecraft.nbt.INBT;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.Minecraft;

import java.util.function.Supplier;

public class NewBlocksModVariables {
	public NewBlocksModVariables(NewBlocksModElements elements) {
		elements.addNetworkMessage(WorldSavedDataSyncMessage.class, WorldSavedDataSyncMessage::buffer, WorldSavedDataSyncMessage::new,
				WorldSavedDataSyncMessage::handler);
		elements.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new,
				PlayerVariablesSyncMessage::handler);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::init);
	}

	private void init(FMLCommonSetupEvent event) {
		CapabilityManager.INSTANCE.register(PlayerVariables.class, new PlayerVariablesStorage(), PlayerVariables::new);
	}

	public static String passwordONE = "\"\"";
	public static String passwordTWO = "\"\"";

	@SubscribeEvent
	public void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		if (!event.getPlayer().world.isRemote()) {
			WorldSavedData mapdata = MapVariables.get(event.getPlayer().world);
			WorldSavedData worlddata = WorldVariables.get(event.getPlayer().world);
			if (mapdata != null)
				NewBlocksMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) event.getPlayer()),
						new WorldSavedDataSyncMessage(0, mapdata));
			if (worlddata != null)
				NewBlocksMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) event.getPlayer()),
						new WorldSavedDataSyncMessage(1, worlddata));
		}
	}

	@SubscribeEvent
	public void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
		if (!event.getPlayer().world.isRemote()) {
			WorldSavedData worlddata = WorldVariables.get(event.getPlayer().world);
			if (worlddata != null)
				NewBlocksMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) event.getPlayer()),
						new WorldSavedDataSyncMessage(1, worlddata));
		}
	}

	public static class WorldVariables extends WorldSavedData {
		public static final String DATA_NAME = "new_blocks_worldvars";
		public boolean attackAmount = false;
		public boolean pushing = false;
		public double varX = 0;
		public double varZ = 0;
		public double ReturnXValue = 0.0;
		public double ReturnYValue = 0.0;
		public double ReturnZValue = 0.0;
		public boolean IsBattleEffectOn = false;
		public String lock = "\"\"";
		public double playerdeath1 = 0;
		public double playerdeath2 = 0;
		public double player3 = 0;
		public String UUIDOFBREEDER = "\"\"";
		public double levely = 0;
		public double amethyststate = 0;
		public double creeper_time = 0;
		public double ThreepeaterBallShoots = 0;
		public double blockstateofwood = 0;
		public double WaystoneOneX = 0.0;
		public double WaystoneOneY = 0.0;
		public double WaystoneOneZ = 0.0;
		public double WaystoneTwoX = 0.0;
		public double WaystoneTwoY = 0.0;
		public double WaystoneTwoZ = 0.0;
		public double cowuplevel = 0;
		public double numberx = 0;
		public double numbery = 0;
		public double numberz = 0;
		public boolean found = false;
		public double goatJumpChanceModifier = 0;
		public double vultureHealth = 0;
		public boolean hasBeenInWorldBefore = false;
		public double PlayerSubway = 0;
		public boolean isElephantHungry = false;
		public double PlayerOrignX = 0.0;
		public double PlayerOriginY = 0;
		public double PlayerOriginZ = 0;

		public WorldVariables() {
			super(DATA_NAME);
		}

		public WorldVariables(String s) {
			super(s);
		}

		@Override
		public void read(CompoundNBT nbt) {
			attackAmount = nbt.getBoolean("attackAmount");
			pushing = nbt.getBoolean("pushing");
			varX = nbt.getDouble("varX");
			varZ = nbt.getDouble("varZ");
			ReturnXValue = nbt.getDouble("ReturnXValue");
			ReturnYValue = nbt.getDouble("ReturnYValue");
			ReturnZValue = nbt.getDouble("ReturnZValue");
			IsBattleEffectOn = nbt.getBoolean("IsBattleEffectOn");
			lock = nbt.getString("lock");
			playerdeath1 = nbt.getDouble("playerdeath1");
			playerdeath2 = nbt.getDouble("playerdeath2");
			player3 = nbt.getDouble("player3");
			UUIDOFBREEDER = nbt.getString("UUIDOFBREEDER");
			levely = nbt.getDouble("levely");
			amethyststate = nbt.getDouble("amethyststate");
			creeper_time = nbt.getDouble("creeper_time");
			ThreepeaterBallShoots = nbt.getDouble("ThreepeaterBallShoots");
			blockstateofwood = nbt.getDouble("blockstateofwood");
			WaystoneOneX = nbt.getDouble("WaystoneOneX");
			WaystoneOneY = nbt.getDouble("WaystoneOneY");
			WaystoneOneZ = nbt.getDouble("WaystoneOneZ");
			WaystoneTwoX = nbt.getDouble("WaystoneTwoX");
			WaystoneTwoY = nbt.getDouble("WaystoneTwoY");
			WaystoneTwoZ = nbt.getDouble("WaystoneTwoZ");
			cowuplevel = nbt.getDouble("cowuplevel");
			numberx = nbt.getDouble("numberx");
			numbery = nbt.getDouble("numbery");
			numberz = nbt.getDouble("numberz");
			found = nbt.getBoolean("found");
			goatJumpChanceModifier = nbt.getDouble("goatJumpChanceModifier");
			vultureHealth = nbt.getDouble("vultureHealth");
			hasBeenInWorldBefore = nbt.getBoolean("hasBeenInWorldBefore");
			PlayerSubway = nbt.getDouble("PlayerSubway");
			isElephantHungry = nbt.getBoolean("isElephantHungry");
			PlayerOrignX = nbt.getDouble("PlayerOrignX");
			PlayerOriginY = nbt.getDouble("PlayerOriginY");
			PlayerOriginZ = nbt.getDouble("PlayerOriginZ");
		}

		@Override
		public CompoundNBT write(CompoundNBT nbt) {
			nbt.putBoolean("attackAmount", attackAmount);
			nbt.putBoolean("pushing", pushing);
			nbt.putDouble("varX", varX);
			nbt.putDouble("varZ", varZ);
			nbt.putDouble("ReturnXValue", ReturnXValue);
			nbt.putDouble("ReturnYValue", ReturnYValue);
			nbt.putDouble("ReturnZValue", ReturnZValue);
			nbt.putBoolean("IsBattleEffectOn", IsBattleEffectOn);
			nbt.putString("lock", lock);
			nbt.putDouble("playerdeath1", playerdeath1);
			nbt.putDouble("playerdeath2", playerdeath2);
			nbt.putDouble("player3", player3);
			nbt.putString("UUIDOFBREEDER", UUIDOFBREEDER);
			nbt.putDouble("levely", levely);
			nbt.putDouble("amethyststate", amethyststate);
			nbt.putDouble("creeper_time", creeper_time);
			nbt.putDouble("ThreepeaterBallShoots", ThreepeaterBallShoots);
			nbt.putDouble("blockstateofwood", blockstateofwood);
			nbt.putDouble("WaystoneOneX", WaystoneOneX);
			nbt.putDouble("WaystoneOneY", WaystoneOneY);
			nbt.putDouble("WaystoneOneZ", WaystoneOneZ);
			nbt.putDouble("WaystoneTwoX", WaystoneTwoX);
			nbt.putDouble("WaystoneTwoY", WaystoneTwoY);
			nbt.putDouble("WaystoneTwoZ", WaystoneTwoZ);
			nbt.putDouble("cowuplevel", cowuplevel);
			nbt.putDouble("numberx", numberx);
			nbt.putDouble("numbery", numbery);
			nbt.putDouble("numberz", numberz);
			nbt.putBoolean("found", found);
			nbt.putDouble("goatJumpChanceModifier", goatJumpChanceModifier);
			nbt.putDouble("vultureHealth", vultureHealth);
			nbt.putBoolean("hasBeenInWorldBefore", hasBeenInWorldBefore);
			nbt.putDouble("PlayerSubway", PlayerSubway);
			nbt.putBoolean("isElephantHungry", isElephantHungry);
			nbt.putDouble("PlayerOrignX", PlayerOrignX);
			nbt.putDouble("PlayerOriginY", PlayerOriginY);
			nbt.putDouble("PlayerOriginZ", PlayerOriginZ);
			return nbt;
		}

		public void syncData(IWorld world) {
			this.markDirty();
			if (world instanceof World && !world.isRemote())
				NewBlocksMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(((World) world)::getDimensionKey),
						new WorldSavedDataSyncMessage(1, this));
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(IWorld world) {
			if (world instanceof ServerWorld) {
				return ((ServerWorld) world).getSavedData().getOrCreate(WorldVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends WorldSavedData {
		public static final String DATA_NAME = "new_blocks_mapvars";

		public MapVariables() {
			super(DATA_NAME);
		}

		public MapVariables(String s) {
			super(s);
		}

		@Override
		public void read(CompoundNBT nbt) {
		}

		@Override
		public CompoundNBT write(CompoundNBT nbt) {
			return nbt;
		}

		public void syncData(IWorld world) {
			this.markDirty();
			if (world instanceof World && !world.isRemote())
				NewBlocksMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new WorldSavedDataSyncMessage(0, this));
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(IWorld world) {
			if (world instanceof IServerWorld) {
				return ((IServerWorld) world).getWorld().getServer().getWorld(World.OVERWORLD).getSavedData().getOrCreate(MapVariables::new,
						DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class WorldSavedDataSyncMessage {
		public int type;
		public WorldSavedData data;

		public WorldSavedDataSyncMessage(PacketBuffer buffer) {
			this.type = buffer.readInt();
			this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
			this.data.read(buffer.readCompoundTag());
		}

		public WorldSavedDataSyncMessage(int type, WorldSavedData data) {
			this.type = type;
			this.data = data;
		}

		public static void buffer(WorldSavedDataSyncMessage message, PacketBuffer buffer) {
			buffer.writeInt(message.type);
			buffer.writeCompoundTag(message.data.write(new CompoundNBT()));
		}

		public static void handler(WorldSavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					if (message.type == 0)
						MapVariables.clientSide = (MapVariables) message.data;
					else
						WorldVariables.clientSide = (WorldVariables) message.data;
				}
			});
			context.setPacketHandled(true);
		}
	}

	@CapabilityInject(PlayerVariables.class)
	public static Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = null;

	@SubscribeEvent
	public void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
		if (event.getObject() instanceof PlayerEntity && !(event.getObject() instanceof FakePlayer))
			event.addCapability(new ResourceLocation("new_blocks", "player_variables"), new PlayerVariablesProvider());
	}

	private static class PlayerVariablesProvider implements ICapabilitySerializable<INBT> {
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(PLAYER_VARIABLES_CAPABILITY::getDefaultInstance);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public INBT serializeNBT() {
			return PLAYER_VARIABLES_CAPABILITY.getStorage().writeNBT(PLAYER_VARIABLES_CAPABILITY, this.instance.orElseThrow(RuntimeException::new),
					null);
		}

		@Override
		public void deserializeNBT(INBT nbt) {
			PLAYER_VARIABLES_CAPABILITY.getStorage().readNBT(PLAYER_VARIABLES_CAPABILITY, this.instance.orElseThrow(RuntimeException::new), null,
					nbt);
		}
	}

	private static class PlayerVariablesStorage implements Capability.IStorage<PlayerVariables> {
		@Override
		public INBT writeNBT(Capability<PlayerVariables> capability, PlayerVariables instance, Direction side) {
			CompoundNBT nbt = new CompoundNBT();
			nbt.putDouble("lavawalking", instance.lavawalking);
			nbt.putBoolean("Detecting", instance.Detecting);
			nbt.putDouble("mana", instance.mana);
			nbt.putDouble("blood", instance.blood);
			nbt.putDouble("rads", instance.rads);
			return nbt;
		}

		@Override
		public void readNBT(Capability<PlayerVariables> capability, PlayerVariables instance, Direction side, INBT inbt) {
			CompoundNBT nbt = (CompoundNBT) inbt;
			instance.lavawalking = nbt.getDouble("lavawalking");
			instance.Detecting = nbt.getBoolean("Detecting");
			instance.mana = nbt.getDouble("mana");
			instance.blood = nbt.getDouble("blood");
			instance.rads = nbt.getDouble("rads");
		}
	}

	public static class PlayerVariables {
		public double lavawalking = 0;
		public boolean Detecting = false;
		public double mana = 0.0;
		public double blood = 0;
		public double rads = 0;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayerEntity)
				NewBlocksMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) entity),
						new PlayerVariablesSyncMessage(this));
		}
	}

	@SubscribeEvent
	public void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
		if (!event.getPlayer().world.isRemote())
			((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
					.syncPlayerVariables(event.getPlayer());
	}

	@SubscribeEvent
	public void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
		if (!event.getPlayer().world.isRemote())
			((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
					.syncPlayerVariables(event.getPlayer());
	}

	@SubscribeEvent
	public void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
		if (!event.getPlayer().world.isRemote())
			((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
					.syncPlayerVariables(event.getPlayer());
	}

	@SubscribeEvent
	public void clonePlayer(PlayerEvent.Clone event) {
		PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PlayerVariables()));
		PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
		clone.lavawalking = original.lavawalking;
		clone.Detecting = original.Detecting;
		clone.blood = original.blood;
		clone.rads = original.rads;
		if (!event.isWasDeath()) {
			clone.mana = original.mana;
		}
	}

	public static class PlayerVariablesSyncMessage {
		public PlayerVariables data;

		public PlayerVariablesSyncMessage(PacketBuffer buffer) {
			this.data = new PlayerVariables();
			new PlayerVariablesStorage().readNBT(null, this.data, null, buffer.readCompoundTag());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, PacketBuffer buffer) {
			buffer.writeCompoundTag((CompoundNBT) new PlayerVariablesStorage().writeNBT(null, message.data, null));
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new PlayerVariables()));
					variables.lavawalking = message.data.lavawalking;
					variables.Detecting = message.data.Detecting;
					variables.mana = message.data.mana;
					variables.blood = message.data.blood;
					variables.rads = message.data.rads;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
