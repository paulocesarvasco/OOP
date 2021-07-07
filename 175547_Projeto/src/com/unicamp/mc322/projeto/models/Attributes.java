package com.unicamp.mc322.projeto.models;

public class Attributes {
	
	private int cost;
	private int attack;
	private int defense;
	
	public Attributes(int cost, int attack, int defense) {
		this.cost = cost;
		this.attack = attack;
		this.defense = defense;
	}
	
	public int getCost() {
		return cost;
	}
	
	public int getAttack() {
		return attack;
	}
	
	public int getDefense() {
		return defense;
	}

}
