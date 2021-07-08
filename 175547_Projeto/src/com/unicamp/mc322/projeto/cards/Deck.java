package com.unicamp.mc322.projeto.cards;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
	
	private List<Card> deck = new ArrayList<Card>();
	private Integer maxCards = 40;
	private Integer handSize = 5;
	
	public Deck() {
		createRandomDeck();
	}
	
	private void createRandomDeck() {
		Random rand = new Random();
		Spell spell;
		Follower follower;
		Champion champion;
		
		for(int i = 0; i < maxCards; i++) {
			switch(rand.nextInt(3)) {
			case 0:
				spell = new Spell();
				deck.add(spell);
				break;
			case 1:
				follower = new Follower();
				deck.add(follower);
				break;
			case 2:
				champion = new Champion();
				deck.add(champion);
			}
		}
	}
	
	public Card getCard() {
		Card card = deck.get(0);
		deck.remove(0);
		return card;
	}
	
	public List<Card> getHand(){
		List<Card> hand = new ArrayList<Card>();
		for(int i = 0; i < handSize; i++) {
			hand.add(getCard());
		}
		return hand;
	}
	
	public Card switchCards(Card card) {
		Random rand = new Random();
		int index = rand.nextInt(deck.size());
		Card newCard = deck.get(index);
		deck.add(index, card);
		return newCard;
	}
	
}
