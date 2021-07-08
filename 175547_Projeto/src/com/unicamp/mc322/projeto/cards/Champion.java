package com.unicamp.mc322.projeto.cards;

import com.unicamp.mc322.projeto.constants.Bonus;
import com.unicamp.mc322.projeto.constants.Champions;
import com.unicamp.mc322.projeto.constants.Effects;
import com.unicamp.mc322.projeto.constants.LevelUp;
import com.unicamp.mc322.projeto.constants.Traces;
import com.unicamp.mc322.projeto.constants.TypeCards;
import com.unicamp.mc322.projeto.models.Attributes;
import com.unicamp.mc322.projeto.utils.ChampionsMap;

public class Champion extends Follower {
	
	private LevelUp levelUpCondition;
	private Bonus bonus;

	public Champion() {
		super();
		
		Champions championName = randomChampion();
		super.name = championName.toString();
		super.cost = getAttributes(championName).getCost();
		super.attack = getAttributes(championName).getAttack();
		super.defense = getAttributes(championName).getDefense();
		super.effect = getEffect(championName);
		super.trace = getTrace(championName);
		super.type = TypeCards.CREATURE;
		levelUpCondition = getLevelUp(championName);
		bonus = getBonus(championName);
	}
	
	private Champions randomChampion() {
		int enumChampionsSize = Champions.values().length;
		int index = (int)Math.floor(Math.random()*(enumChampionsSize));
		
		return Champions.values()[index];
	}
	
	private Effects getEffect(Champions championName) {
		return ChampionsMap.getEffect(championName);
	}
	
	private Attributes getAttributes(Champions championName) {
		return ChampionsMap.getCost(championName);
	}
	
	private Traces getTrace(Champions championName) {
		return ChampionsMap.getTrace(championName);
	}
	
	private LevelUp getLevelUp(Champions championName) {
		return ChampionsMap.getLevelUp(championName);
	}
	
	private Bonus getBonus(Champions championName) {
		return ChampionsMap.getBonus(championName);
	}
	
	public String getName() {
		return name;
	}
}
