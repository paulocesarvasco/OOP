package com.unicamp.mc322.projeto.players;

import java.util.List;

import com.unicamp.mc322.projeto.cards.Card;
import com.unicamp.mc322.projeto.cards.Deck;
import com.unicamp.mc322.projeto.constants.TypeCards;

public class User {

	private int maxMana = 10;
	private int maxSpellMana = 3;
	private int maxUnitsEvoked = 6;
	
	private Deck deck;
	private List<Card> hand;
	private List<Card> unitsEvoked;
	
	private Integer nexus;
	private Integer mana;
	private Integer spellMana;
	
	public User() {
		deck = new Deck();
		hand = deck.getHand();
		nexus = 20;
		mana = 0;
		spellMana = 0;
	}
	
	public boolean hitNexus(int hit) {
		boolean isAlive = true;
		nexus -= hit;
		if(nexus <= 0) {
			isAlive = false;
		}
		return isAlive;
	}
	
	public void increaseMana() {
		if(mana < maxMana) {
			mana++;
		}
	}
	
	public void increaseSpellMana() {
		if(mana < maxSpellMana) {
			spellMana = mana;
		} else {
			spellMana = maxSpellMana;
		}
	}
	
	public void evokeUnit(Card card) {
		if(card.getType() == TypeCards.CREATURE) {
			if(unitsEvoked.size() < maxUnitsEvoked) {
				if(mana >= card.getCost()) {
					unitsEvoked.add(card);
					hand.remove(card);
					mana -= card.getCost();
				}
			}
		}
	}
	
	public void changeCard(int numCard) {
		if (numCard < hand.size()) {
			Card newCard = deck.switchCards(hand.get(numCard));
			hand.remove(numCard);
			hand.add(numCard, newCard);
		}
	}
	
	public void printCards() {
		System.out.println("===========");
		for(Card card : hand) {
			System.out.println(card.getName());
		}
		System.out.println("===========");
	}
}
