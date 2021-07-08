package com.unicamp.mc322.projeto.cards;

import com.unicamp.mc322.projeto.constants.TypeCards;

public abstract class Card {
	
	protected String name;
	protected Integer cost;
	protected Integer life;
	protected TypeCards type;
	
	public TypeCards getType() {
		return type;
	}
	
	public int getCost() {
		return cost;
	}
	
	public String getName() {
		return name;
	}
}
