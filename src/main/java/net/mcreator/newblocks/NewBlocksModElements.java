/*
 *    MCreator note:
 *
 *    This file is autogenerated to connect all MCreator mod elements together.
 *
 */
package net.mcreator.newblocks;

import net.minecraftforge.forgespi.language.ModFileScanData;
import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.tags.Tag;
import net.minecraft.network.PacketBuffer;
import net.minecraft.item.Item;
import net.minecraft.entity.EntityType;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.block.Block;

import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiConsumer;
import java.util.Set;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

public class NewBlocksModElements {
	public final List<ModElement> elements = new ArrayList<>();
	public final List<Supplier<Block>> blocks = new ArrayList<>();
	public final List<Supplier<Item>> items = new ArrayList<>();
	public final List<Supplier<EntityType<?>>> entities = new ArrayList<>();
	public final List<Supplier<Enchantment>> enchantments = new ArrayList<>();
	public static Map<ResourceLocation, net.minecraft.util.SoundEvent> sounds = new HashMap<>();

	public NewBlocksModElements() {
		sounds.put(new ResourceLocation("new_blocks", "herobrinehurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "herobrinehurt")));
		sounds.put(new ResourceLocation("new_blocks", "reaper_ambient"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "reaper_ambient")));
		sounds.put(new ResourceLocation("new_blocks", "reaper_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "reaper_hurt")));
		sounds.put(new ResourceLocation("new_blocks", "tommyinnithurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "tommyinnithurt")));
		sounds.put(new ResourceLocation("new_blocks", "tommyinnitbazinga"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "tommyinnitbazinga")));
		sounds.put(new ResourceLocation("new_blocks", "knifestab"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "knifestab")));
		sounds.put(new ResourceLocation("new_blocks", "electric_spider_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "electric_spider_hurt")));
		sounds.put(new ResourceLocation("new_blocks", "electric_spider_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "electric_spider_death")));
		sounds.put(new ResourceLocation("new_blocks", "electric_spider_step"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "electric_spider_step")));
		sounds.put(new ResourceLocation("new_blocks", "electric_spider_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "electric_spider_idle")));
		sounds.put(new ResourceLocation("new_blocks", "electric_spider_health_low"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "electric_spider_health_low")));
		sounds.put(new ResourceLocation("new_blocks", "electric_spider_disc"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "electric_spider_disc")));
		sounds.put(new ResourceLocation("new_blocks", "shulk_disc"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "shulk_disc")));
		sounds.put(new ResourceLocation("new_blocks", "poison_plant_spit"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "poison_plant_spit")));
		sounds.put(new ResourceLocation("new_blocks", "poison_plant_roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "poison_plant_roar")));
		sounds.put(new ResourceLocation("new_blocks", "poison_plant_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "poison_plant_hurt")));
		sounds.put(new ResourceLocation("new_blocks", "poison_plant_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "poison_plant_death")));
		sounds.put(new ResourceLocation("new_blocks", "iron_man_bullet_shoot"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "iron_man_bullet_shoot")));
		sounds.put(new ResourceLocation("new_blocks", "squirrel_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "squirrel_hurt")));
		sounds.put(new ResourceLocation("new_blocks", "squirrel_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "squirrel_idle")));
		sounds.put(new ResourceLocation("new_blocks", "imposter"), new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "imposter")));
		sounds.put(new ResourceLocation("new_blocks", "cidada_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "cidada_idle")));
		sounds.put(new ResourceLocation("new_blocks", "cicada_step"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "cicada_step")));
		sounds.put(new ResourceLocation("new_blocks", "shark_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "shark_hurt")));
		sounds.put(new ResourceLocation("new_blocks", "balloon_pop"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "balloon_pop")));
		sounds.put(new ResourceLocation("new_blocks", "hammood"), new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "hammood")));
		sounds.put(new ResourceLocation("new_blocks", "hamoodstep"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "hamoodstep")));
		sounds.put(new ResourceLocation("new_blocks", "hamood"), new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "hamood")));
		sounds.put(new ResourceLocation("new_blocks", "ham"), new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "ham")));
		sounds.put(new ResourceLocation("new_blocks", "cave"), new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "cave")));
		sounds.put(new ResourceLocation("new_blocks", "axolotl_bubbles_1"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "axolotl_bubbles_1")));
		sounds.put(new ResourceLocation("new_blocks", "axolotl_bubbles_2"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "axolotl_bubbles_2")));
		sounds.put(new ResourceLocation("new_blocks", "axolotl_idle_air"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "axolotl_idle_air")));
		sounds.put(new ResourceLocation("new_blocks", "axolotl_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "axolotl_hurt")));
		sounds.put(new ResourceLocation("new_blocks", "deep_dark"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "deep_dark")));
		sounds.put(new ResourceLocation("new_blocks", "warden_distant"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "warden_distant")));
		sounds.put(new ResourceLocation("new_blocks", "deep_dark_ambient"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "deep_dark_ambient")));
		sounds.put(new ResourceLocation("new_blocks", "squirrel_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "squirrel_death")));
		sounds.put(new ResourceLocation("new_blocks", "wardenstep"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "wardenstep")));
		sounds.put(new ResourceLocation("new_blocks", "sculker_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "sculker_idle")));
		sounds.put(new ResourceLocation("new_blocks", "wardenidle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "wardenidle")));
		sounds.put(new ResourceLocation("new_blocks", "sculker_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "sculker_hurt")));
		sounds.put(new ResourceLocation("new_blocks", "skulk_clicking_1"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "skulk_clicking_1")));
		sounds.put(new ResourceLocation("new_blocks", "sculk_step_1"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "sculk_step_1")));
		sounds.put(new ResourceLocation("new_blocks", "sculk_step_6"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "sculk_step_6")));
		sounds.put(new ResourceLocation("new_blocks", "sculk_place"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "sculk_place")));
		sounds.put(new ResourceLocation("new_blocks", "sculk_break"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "sculk_break")));
		sounds.put(new ResourceLocation("new_blocks", "sculk_hit"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "sculk_hit")));
		sounds.put(new ResourceLocation("new_blocks", "sculk_step_block"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "sculk_step_block")));
		sounds.put(new ResourceLocation("new_blocks", "warden_hurt_2"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "warden_hurt_2")));
		sounds.put(new ResourceLocation("new_blocks", "ice_cube_summon"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "ice_cube_summon")));
		sounds.put(new ResourceLocation("new_blocks", "iceologer_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "iceologer_death")));
		sounds.put(new ResourceLocation("new_blocks", "iceologer_grunt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "iceologer_grunt")));
		sounds.put(new ResourceLocation("new_blocks", "iceologer_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "iceologer_hurt")));
		sounds.put(new ResourceLocation("new_blocks", "sculk_shrieker_shriek"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "sculk_shrieker_shriek")));
		sounds.put(new ResourceLocation("new_blocks", "allay_ambient"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "allay_ambient")));
		sounds.put(new ResourceLocation("new_blocks", "allay_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "allay_death")));
		sounds.put(new ResourceLocation("new_blocks", "allay_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "allay_hurt")));
		sounds.put(new ResourceLocation("new_blocks", "glare_angry"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "glare_angry")));
		sounds.put(new ResourceLocation("new_blocks", "tall"), new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "tall")));
		sounds.put(new ResourceLocation("new_blocks", "wardenhurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "wardenhurt")));
		sounds.put(new ResourceLocation("new_blocks", "warden_angry"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "warden_angry")));
		sounds.put(new ResourceLocation("new_blocks", "zombiehurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "zombiehurt")));
		sounds.put(new ResourceLocation("new_blocks", "zombiedeath"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "zombiedeath")));
		sounds.put(new ResourceLocation("new_blocks", "footsteps"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "footsteps")));
		sounds.put(new ResourceLocation("new_blocks", "sculk_crystal"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "sculk_crystal")));
		sounds.put(new ResourceLocation("new_blocks", "sculk_crystal_summon"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "sculk_crystal_summon")));
		sounds.put(new ResourceLocation("new_blocks", "otherside"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "otherside")));
		sounds.put(new ResourceLocation("new_blocks", "music.ancestry"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "music.ancestry")));
		sounds.put(new ResourceLocation("new_blocks", "birds_screaming_loop"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "birds_screaming_loop")));
		sounds.put(new ResourceLocation("new_blocks", "music.deep_dark_additions"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "music.deep_dark_additions")));
		sounds.put(new ResourceLocation("new_blocks", "warden_hit"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "warden_hit")));
		sounds.put(new ResourceLocation("new_blocks", "sniper_shoot"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "sniper_shoot")));
		sounds.put(new ResourceLocation("new_blocks", "sniper_reload"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "sniper_reload")));
		sounds.put(new ResourceLocation("new_blocks", "horn_blow1"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "horn_blow1")));
		sounds.put(new ResourceLocation("new_blocks", "horn_2"), new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "horn_2")));
		sounds.put(new ResourceLocation("new_blocks", "minigun_shoot"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "minigun_shoot")));
		sounds.put(new ResourceLocation("new_blocks", "pistol_shoot"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "pistol_shoot")));
		sounds.put(new ResourceLocation("new_blocks", "grenade_throw"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "grenade_throw")));
		sounds.put(new ResourceLocation("new_blocks", "drone_fly1"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "drone_fly1")));
		sounds.put(new ResourceLocation("new_blocks", "drone_fly2"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "drone_fly2")));
		sounds.put(new ResourceLocation("new_blocks", "drone_fly3"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "drone_fly3")));
		sounds.put(new ResourceLocation("new_blocks", "drone_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "drone_hurt")));
		sounds.put(new ResourceLocation("new_blocks", "drone_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "drone_death")));
		sounds.put(new ResourceLocation("new_blocks", "wrench_turn"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "wrench_turn")));
		sounds.put(new ResourceLocation("new_blocks", "recall_potion_teleport"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "recall_potion_teleport")));
		sounds.put(new ResourceLocation("new_blocks", "meowmere_meow"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "meowmere_meow")));
		sounds.put(new ResourceLocation("new_blocks", "weak_magic_shoot"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "weak_magic_shoot")));
		sounds.put(new ResourceLocation("new_blocks", "aaaa"), new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "aaaa")));
		sounds.put(new ResourceLocation("new_blocks", "breakingtheconditoning"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "breakingtheconditoning")));
		sounds.put(new ResourceLocation("new_blocks", "pixie_"), new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "pixie_")));
		sounds.put(new ResourceLocation("new_blocks", "amethyst.break"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "amethyst.break")));
		sounds.put(new ResourceLocation("new_blocks", "amethyst.step"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "amethyst.step")));
		sounds.put(new ResourceLocation("new_blocks", "amethyst.footsteps"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "amethyst.footsteps")));
		sounds.put(new ResourceLocation("new_blocks", "amethyst.fall"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "amethyst.fall")));
		sounds.put(new ResourceLocation("new_blocks", "peashooter.shoot"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "peashooter.shoot")));
		sounds.put(new ResourceLocation("new_blocks", "chomper.eat"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "chomper.eat")));
		sounds.put(new ResourceLocation("new_blocks", "zombie.hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "zombie.hurt")));
		sounds.put(new ResourceLocation("new_blocks", "zombie.eat"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "zombie.eat")));
		sounds.put(new ResourceLocation("new_blocks", "tin.hit"), new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "tin.hit")));
		sounds.put(new ResourceLocation("new_blocks", "melon_pult.shoot"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "melon_pult.shoot")));
		sounds.put(new ResourceLocation("new_blocks", "say1"), new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "say1")));
		sounds.put(new ResourceLocation("new_blocks", "zombie.groan"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "zombie.groan")));
		sounds.put(new ResourceLocation("new_blocks", "indominus.rex.idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "indominus.rex.idle")));
		sounds.put(new ResourceLocation("new_blocks", "indominus.rex.roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "indominus.rex.roar")));
		sounds.put(new ResourceLocation("new_blocks", "indo.hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "indo.hurt")));
		sounds.put(new ResourceLocation("new_blocks", "indo.death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "indo.death")));
		sounds.put(new ResourceLocation("new_blocks", "indo.attack"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "indo.attack")));
		sounds.put(new ResourceLocation("new_blocks", "indoraptor.idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "indoraptor.idle")));
		sounds.put(new ResourceLocation("new_blocks", "indoraptor.attack"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "indoraptor.attack")));
		sounds.put(new ResourceLocation("new_blocks", "indoraptor.hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "indoraptor.hurt")));
		sounds.put(new ResourceLocation("new_blocks", "indoraptor.roar"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "indoraptor.roar")));
		sounds.put(new ResourceLocation("new_blocks", "indoraptor.death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "indoraptor.death")));
		sounds.put(new ResourceLocation("new_blocks", "pteranodon.attack"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "pteranodon.attack")));
		sounds.put(new ResourceLocation("new_blocks", "pteranodon.hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "pteranodon.hurt")));
		sounds.put(new ResourceLocation("new_blocks", "pteranodon.idlke"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "pteranodon.idlke")));
		sounds.put(new ResourceLocation("new_blocks", "pteranodon.death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "pteranodon.death")));
		sounds.put(new ResourceLocation("new_blocks", "spinosaurus.idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "spinosaurus.idle")));
		sounds.put(new ResourceLocation("new_blocks", "spinosaurus.hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "spinosaurus.hurt")));
		sounds.put(new ResourceLocation("new_blocks", "spinosaurus.attck"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "spinosaurus.attck")));
		sounds.put(new ResourceLocation("new_blocks", "spinosaurus.death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "spinosaurus.death")));
		sounds.put(new ResourceLocation("new_blocks", "tyrannosaurus_rex.step"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "tyrannosaurus_rex.step")));
		sounds.put(new ResourceLocation("new_blocks", "tyrannosaurus_rex.attack"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "tyrannosaurus_rex.attack")));
		sounds.put(new ResourceLocation("new_blocks", "tyrannosaurus_rex.death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "tyrannosaurus_rex.death")));
		sounds.put(new ResourceLocation("new_blocks", "tyrannosaurus_rex.hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "tyrannosaurus_rex.hurt")));
		sounds.put(new ResourceLocation("new_blocks", "tyrannosaurus_rex.idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "tyrannosaurus_rex.idle")));
		sounds.put(new ResourceLocation("new_blocks", "wraith.idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "wraith.idle")));
		sounds.put(new ResourceLocation("new_blocks", "wraith.leave"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "wraith.leave")));
		sounds.put(new ResourceLocation("new_blocks", "wraith.come"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "wraith.come")));
		sounds.put(new ResourceLocation("new_blocks", "wraith.hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "wraith.hurt")));
		sounds.put(new ResourceLocation("new_blocks", "wraith.death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "wraith.death")));
		sounds.put(new ResourceLocation("new_blocks", "nothing.nothing"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "nothing.nothing")));
		sounds.put(new ResourceLocation("new_blocks", "thompsonshoot"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "thompsonshoot")));
		sounds.put(new ResourceLocation("new_blocks", "better_zombie_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "better_zombie_hurt")));
		sounds.put(new ResourceLocation("new_blocks", "better_zombie_groan"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "better_zombie_groan")));
		sounds.put(new ResourceLocation("new_blocks", "frog_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "frog_idle")));
		sounds.put(new ResourceLocation("new_blocks", "frog_step"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "frog_step")));
		sounds.put(new ResourceLocation("new_blocks", "frog_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "frog_hurt")));
		sounds.put(new ResourceLocation("new_blocks", "frog_jump"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "frog_jump")));
		sounds.put(new ResourceLocation("new_blocks", "seal_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "seal_idle")));
		sounds.put(new ResourceLocation("new_blocks", "seal_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "seal_hurt")));
		sounds.put(new ResourceLocation("new_blocks", "entity.warden.heartbeat"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "entity.warden.heartbeat")));
		sounds.put(new ResourceLocation("new_blocks", "entity.warden.sniff"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "entity.warden.sniff")));
		sounds.put(new ResourceLocation("new_blocks", "warden.groan"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "warden.groan")));
		sounds.put(new ResourceLocation("new_blocks", "entity.warden.listen.angry"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "entity.warden.listen.angry")));
		sounds.put(new ResourceLocation("new_blocks", "warden.rage"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "warden.rage")));
		sounds.put(new ResourceLocation("new_blocks", "entity.warden.emerge"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "entity.warden.emerge")));
		sounds.put(new ResourceLocation("new_blocks", "warden.whine.sleep.sit"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "warden.whine.sleep.sit")));
		sounds.put(new ResourceLocation("new_blocks", "entity.ufo.beam.shoots"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "entity.ufo.beam.shoots")));
		sounds.put(new ResourceLocation("new_blocks", "block.dripstone.break"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "block.dripstone.break")));
		sounds.put(new ResourceLocation("new_blocks", "block.dripstone.step"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "block.dripstone.step")));
		sounds.put(new ResourceLocation("new_blocks", "block.dripstone.hit"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "block.dripstone.hit")));
		sounds.put(new ResourceLocation("new_blocks", "block.dripstone.place"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "block.dripstone.place")));
		sounds.put(new ResourceLocation("new_blocks", "allay_ambient2"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "allay_ambient2")));
		sounds.put(new ResourceLocation("new_blocks", "allay_hurt2"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "allay_hurt2")));
		sounds.put(new ResourceLocation("new_blocks", "allay_death2"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "allay_death2")));
		sounds.put(new ResourceLocation("new_blocks", "sculpture_scrape2"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "sculpture_scrape2")));
		sounds.put(new ResourceLocation("new_blocks", "sculpture_scrape1"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "sculpture_scrape1")));
		sounds.put(new ResourceLocation("new_blocks", "sculpture_hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "sculpture_hurt")));
		sounds.put(new ResourceLocation("new_blocks", "sculpture_death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "sculpture_death")));
		sounds.put(new ResourceLocation("new_blocks", "entity.goat.ambient"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "entity.goat.ambient")));
		sounds.put(new ResourceLocation("new_blocks", "entity.goat.death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "entity.goat.death")));
		sounds.put(new ResourceLocation("new_blocks", "entity.goat.hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "entity.goat.hurt")));
		sounds.put(new ResourceLocation("new_blocks", "entity.goat.step"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "entity.goat.step")));
		sounds.put(new ResourceLocation("new_blocks", "entity.goat.baby.ambient"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "entity.goat.baby.ambient")));
		sounds.put(new ResourceLocation("new_blocks", "item.brush.brush"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "item.brush.brush")));
		sounds.put(new ResourceLocation("new_blocks", "block.coconut.hit.ground"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "block.coconut.hit.ground")));
		sounds.put(new ResourceLocation("new_blocks", "music.disc.coconut"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "music.disc.coconut")));
		sounds.put(new ResourceLocation("new_blocks", "entity.crab.ambient"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "entity.crab.ambient")));
		sounds.put(new ResourceLocation("new_blocks", "entity.crab.death"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "entity.crab.death")));
		sounds.put(new ResourceLocation("new_blocks", "entity.crab.hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "entity.crab.hurt")));
		sounds.put(new ResourceLocation("new_blocks", "allay.noitem"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "allay.noitem")));
		sounds.put(new ResourceLocation("new_blocks", "allay.dies"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "allay.dies")));
		sounds.put(new ResourceLocation("new_blocks", "allay.hurts"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "allay.hurts")));
		sounds.put(new ResourceLocation("new_blocks", "mud_break"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "mud_break")));
		sounds.put(new ResourceLocation("new_blocks", "mud_breaking"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "mud_breaking")));
		sounds.put(new ResourceLocation("new_blocks", "mud_step"), new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "mud_step")));
		sounds.put(new ResourceLocation("new_blocks", "mud_place"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "mud_place")));
		sounds.put(new ResourceLocation("new_blocks", "entity.raccoon.hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "entity.raccoon.hurt")));
		sounds.put(new ResourceLocation("new_blocks", "entity.raccoon.idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "entity.raccoon.idle")));
		sounds.put(new ResourceLocation("new_blocks", "elephant.idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "elephant.idle")));
		sounds.put(new ResourceLocation("new_blocks", "elephant.die"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "elephant.die")));
		sounds.put(new ResourceLocation("new_blocks", "elephant.walk"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "elephant.walk")));
		sounds.put(new ResourceLocation("new_blocks", "elephant.hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "elephant.hurt")));
		sounds.put(new ResourceLocation("new_blocks", "elephant.trumpet"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "elephant.trumpet")));
		sounds.put(new ResourceLocation("new_blocks", "nuke_caller_typing"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "nuke_caller_typing")));
		sounds.put(new ResourceLocation("new_blocks", "nuke_incoming"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "nuke_incoming")));
		sounds.put(new ResourceLocation("new_blocks", "geigar_counter_clicking"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "geigar_counter_clicking")));
		sounds.put(new ResourceLocation("new_blocks", "portal_gun"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "portal_gun")));
		sounds.put(new ResourceLocation("new_blocks", "snowmobile_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "snowmobile_idle")));
		sounds.put(new ResourceLocation("new_blocks", "snowmobile_moving"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "snowmobile_moving")));
		sounds.put(new ResourceLocation("new_blocks", "cart_roll"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "cart_roll")));
		sounds.put(new ResourceLocation("new_blocks", "scientist_idle"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "scientist_idle")));
		sounds.put(new ResourceLocation("new_blocks", "peashooter.hurt"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "peashooter.hurt")));
		sounds.put(new ResourceLocation("new_blocks", "amethyst.place"),
				new net.minecraft.util.SoundEvent(new ResourceLocation("new_blocks", "amethyst.place")));
		try {
			ModFileScanData modFileInfo = ModList.get().getModFileById("new_blocks").getFile().getScanResult();
			Set<ModFileScanData.AnnotationData> annotations = modFileInfo.getAnnotations();
			for (ModFileScanData.AnnotationData annotationData : annotations) {
				if (annotationData.getAnnotationType().getClassName().equals(ModElement.Tag.class.getName())) {
					Class<?> clazz = Class.forName(annotationData.getClassType().getClassName());
					if (clazz.getSuperclass() == NewBlocksModElements.ModElement.class)
						elements.add((NewBlocksModElements.ModElement) clazz.getConstructor(this.getClass()).newInstance(this));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Collections.sort(elements);
		elements.forEach(NewBlocksModElements.ModElement::initElements);
		MinecraftForge.EVENT_BUS.register(new NewBlocksModVariables(this));
	}

	public void registerSounds(RegistryEvent.Register<net.minecraft.util.SoundEvent> event) {
		for (Map.Entry<ResourceLocation, net.minecraft.util.SoundEvent> sound : sounds.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}

	private int messageID = 0;

	public <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, PacketBuffer> encoder, Function<PacketBuffer, T> decoder,
			BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
		NewBlocksMod.PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
		messageID++;
	}

	public List<ModElement> getElements() {
		return elements;
	}

	public List<Supplier<Block>> getBlocks() {
		return blocks;
	}

	public List<Supplier<Item>> getItems() {
		return items;
	}

	public List<Supplier<EntityType<?>>> getEntities() {
		return entities;
	}

	public List<Supplier<Enchantment>> getEnchantments() {
		return enchantments;
	}

	public static class ModElement implements Comparable<ModElement> {
		@Retention(RetentionPolicy.RUNTIME)
		public @interface Tag {
		}

		protected final NewBlocksModElements elements;
		protected final int sortid;

		public ModElement(NewBlocksModElements elements, int sortid) {
			this.elements = elements;
			this.sortid = sortid;
		}

		public void initElements() {
		}

		public void init(FMLCommonSetupEvent event) {
		}

		public void serverLoad(FMLServerStartingEvent event) {
		}

		@OnlyIn(Dist.CLIENT)
		public void clientLoad(FMLClientSetupEvent event) {
		}

		@Override
		public int compareTo(ModElement other) {
			return this.sortid - other.sortid;
		}
	}
}