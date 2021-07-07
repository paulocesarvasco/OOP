package com.unicamp.mc322.projeto.cards;

import com.unicamp.mc322.projeto.constants.Effects;
import com.unicamp.mc322.projeto.constants.Followers;
import com.unicamp.mc322.projeto.constants.Traces;
import com.unicamp.mc322.projeto.models.Attributes;
import com.unicamp.mc322.projeto.utils.FollowersMap;

public class Follower extends Card {

	private Integer attack;
	private Integer defense;
	private Effects effect;
	private Traces trace;
	
	public Follower() {
		super();
		
		Followers followerName = randomFollower();
		super.name = followerName.toString();
		super.cost = getAttributes(followerName).getCost();
		attack = getAttributes(followerName).getAttack();
		defense = getAttributes(followerName).getDefense();
		effect = getEffect(followerName);
		trace = getTrace(followerName);
	}
	
	private Followers randomFollower() {
		int enumFollowersSize = Followers.values().length;
		int index = (int)Math.floor(Math.random()*(enumFollowersSize));
		
		return Followers.values()[index];
	}
	
	private Effects getEffect(Followers followerName) {
		return FollowersMap.getEffect(followerName);
	}
	
	private Attributes getAttributes(Followers followerName) {
		return FollowersMap.getCost(followerName);
	}
	
	private Traces getTrace(Followers followerName) {
		return FollowersMap.getTrace(followerName);
	}
	
	public String getName() {
		return name;
	}
}
