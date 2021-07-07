package com.unicamp.mc322.projeto.utils;

import java.util.EnumMap;

import com.unicamp.mc322.projeto.constants.Effects;
import com.unicamp.mc322.projeto.constants.Spells;

public final class SpellMap {
	
	private static EnumMap<Spells, Effects> mapSpellEffect = new EnumMap<>(Spells.class);
	private static EnumMap<Spells, Integer> mapSpellCost = new EnumMap<>(Spells.class);


	public static void setupSpells() {
		setupEffects();
		setupCosts();
	}
	
	private static void setupEffects() {
		mapSpellEffect.put(Spells.JUGDMENT, Effects.ATTACK_ALL_ENEMIES);
		mapSpellEffect.put(Spells.DOUBLE_VALUE, Effects.CURE_AN_UNIT);
		mapSpellEffect.put(Spells.DIRECT_HIT, Effects.UP_AN_UNIT);
		mapSpellEffect.put(Spells.ONE_X_ONE, Effects.ONE_X_ONE);
	}
	
	private static void setupCosts() {
		mapSpellCost.put(Spells.JUGDMENT, 8);
		mapSpellCost.put(Spells.DOUBLE_VALUE, 6);
		mapSpellCost.put(Spells.DIRECT_HIT, 1);
		mapSpellCost.put(Spells.ONE_X_ONE, 2);
	}
	
	public static Effects getEffect(Spells spellName) {
		return mapSpellEffect.get(spellName);
	}
	
	public static int getCost(Spells spellName) {
		return mapSpellCost.get(spellName);
	}

}
