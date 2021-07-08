package com.unicamp.mc322.projeto.utils;

import java.util.EnumMap;

import com.unicamp.mc322.projeto.constants.Effects;
import com.unicamp.mc322.projeto.constants.Followers;
import com.unicamp.mc322.projeto.constants.Traces;
import com.unicamp.mc322.projeto.models.Attributes;

public final class FollowersMap {

	private static EnumMap<Followers, Effects> mapFollowerEffect = new EnumMap<>(Followers.class);
	private static EnumMap<Followers, Attributes> mapFollowerCost = new EnumMap<>(Followers.class);
	private static EnumMap<Followers, Traces> mapFollowerTrace = new EnumMap<>(Followers.class);
	
	public static void setupFollowers() {
		setupEffects();
		setupTraces();
		setupCosts();
	}
	
	private static void setupEffects() {
		mapFollowerEffect.put(Followers.TIANA, Effects.ATTACK_NEXUS);
		mapFollowerEffect.put(Followers.VANGUARDA, Effects.UP_ALL_UNITS);
		mapFollowerEffect.put(Followers.DUELISTA, Effects.GET_A_CARD);
		mapFollowerEffect.put(Followers.DEFENSOR, Effects.NONE);
		mapFollowerEffect.put(Followers.PORO, Effects.NONE);
		mapFollowerEffect.put(Followers.PORO_DEFENSOR, Effects.NONE);
	}
	
	private static void setupTraces() {
		mapFollowerTrace.put(Followers.TIANA, Traces.NONE);
		mapFollowerTrace.put(Followers.VANGUARDA, Traces.NONE);
		mapFollowerTrace.put(Followers.DUELISTA, Traces.NONE);
		mapFollowerTrace.put(Followers.DEFENSOR, Traces.RAGE);
		mapFollowerTrace.put(Followers.PORO, Traces.NONE);
		mapFollowerTrace.put(Followers.PORO_DEFENSOR, Traces.NONE);
	}
	
	private static void setupCosts() {
		mapFollowerCost.put(Followers.TIANA, new Attributes(8, 7, 7));
		mapFollowerCost.put(Followers.VANGUARDA, new Attributes(4, 3, 3));
		mapFollowerCost.put(Followers.DUELISTA, new Attributes(3, 3, 2));
		mapFollowerCost.put(Followers.DEFENSOR, new Attributes(2, 2, 2));
		mapFollowerCost.put(Followers.PORO, new Attributes(1, 2, 1));
		mapFollowerCost.put(Followers.PORO_DEFENSOR, new Attributes(1, 1, 2));
	}
	
	public static Effects getEffect(Followers followerName) {
		return mapFollowerEffect.get(followerName);
	}
	
	public static Traces getTrace(Followers followerName) {
		return mapFollowerTrace.get(followerName);
	}
	
	public static Attributes getCost(Followers followerName) {
		return mapFollowerCost.get(followerName);
	}
	
}
