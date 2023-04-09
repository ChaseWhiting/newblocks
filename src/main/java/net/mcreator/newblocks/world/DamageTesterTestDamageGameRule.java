package net.mcreator.newblocks.world;

import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

import net.minecraft.world.GameRules;

import net.mcreator.newblocks.NewBlocksModElements;

import java.lang.reflect.Method;

@NewBlocksModElements.ModElement.Tag
public class DamageTesterTestDamageGameRule extends NewBlocksModElements.ModElement {
	public static final GameRules.RuleKey<GameRules.IntegerValue> gamerule = GameRules.register("damageTesterTestDamage", GameRules.Category.MOBS,
			create(0));

	public DamageTesterTestDamageGameRule(NewBlocksModElements instance) {
		super(instance, 1869);
	}

	public static GameRules.RuleType<GameRules.IntegerValue> create(int defaultValue) {
		try {
			Method createGameruleMethod = ObfuscationReflectionHelper.findMethod(GameRules.IntegerValue.class, "func_223559_b", int.class);
			createGameruleMethod.setAccessible(true);
			return (GameRules.RuleType<GameRules.IntegerValue>) createGameruleMethod.invoke(null, defaultValue);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
