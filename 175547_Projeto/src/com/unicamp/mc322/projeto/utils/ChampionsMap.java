package com.unicamp.mc322.projeto.utils;

import java.util.EnumMap;

import com.unicamp.mc322.projeto.constants.Bonus;
import com.unicamp.mc322.projeto.constants.Champions;
import com.unicamp.mc322.projeto.constants.Effects;
import com.unicamp.mc322.projeto.constants.LevelUp;
import com.unicamp.mc322.projeto.constants.Traces;
import com.unicamp.mc322.projeto.models.Attributes;

public final class ChampionsMap {

	private static EnumMap<Champions, Effects> mapChampionEffect = new EnumMap<>(Champions.class);
	private static EnumMap<Champions, Attributes> mapChampionCost = new EnumMap<>(Champions.class);
	private static EnumMap<Champions, Traces> mapChampionTrace = new EnumMap<>(Champions.class);
	private static EnumMap<Champions, LevelUp> mapChampionLevelUp = new EnumMap<>(Champions.class);
	private static EnumMap<Champions, Bonus> mapChampionBonus = new EnumMap<>(Champions.class);
	
	public static void setupChampions() {
		setupEffects();
		setupTraces();
		setupCosts();
		setupLevelUp();
		setupBonus();
	}
	
	private static void setupEffects() {
		mapChampionEffect.put(Champions.GAREN, Effects.CURE_AN_UNIT);
	}
	
	private static void setupTraces() {
		mapChampionTrace.put(Champions.GAREN, Traces.NONE);
	}
	
	private static void setupCosts() {
		mapChampionCost.put(Champions.GAREN, new Attributes(5, 5, 5));
	}
	
	private static void setupLevelUp() {
		mapChampionLevelUp.put(Champions.GAREN, LevelUp.ATTACK_N_TIMES);
	}
	
	private static void setupBonus() {
		mapChampionBonus.put(Champions.GAREN, Bonus.GAIN_TRACE_EFFECT);
	}
	
	public static Effects getEffect(Champions championName) {
		return mapChampionEffect.get(championName);
	}
	
	public static Traces getTrace(Champions championName) {
		return mapChampionTrace.get(championName);
	}
	
	public static Attributes getCost(Champions championName) {
		return mapChampionCost.get(championName);
	}
	
	public static LevelUp getLevelUp(Champions championName) {
		return mapChampionLevelUp.get(championName);
	}
	
	public static Bonus getBonus(Champions championName) {
		return mapChampionBonus.get(championName);
	}
}
