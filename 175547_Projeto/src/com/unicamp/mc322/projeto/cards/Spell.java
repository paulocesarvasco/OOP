package com.unicamp.mc322.projeto.cards;

import com.unicamp.mc322.projeto.cards.Card;
import com.unicamp.mc322.projeto.constants.*;
import com.unicamp.mc322.projeto.utils.SpellMap;

public class Spell extends Card {
	
	private Effects effect;
	
	public Spell() {
		super();
		
		Spells effectName = randomSpell();
		super.name = effectName.toString();
		super.cost = getCost(effectName);
		effect = getEffect(effectName);
	}
	
	private Effects getEffect(Spells spellName) {
		return SpellMap.getEffect(spellName);
	}
	
	private int getCost(Spells spellName) {
		return SpellMap.getCost(spellName);
	}
	
	private Spells randomSpell() {
		int enumSpellsSize = Traces.values().length;
		int index = (int)Math.floor(Math.random()*(enumSpellsSize));
		
		return Spells.values()[index];
	}
	
	public String getName() {
		return name;
	}
	
	public Effects getEffect() {
		return effect;
	}
	
}
